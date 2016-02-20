package com.swandiggy.poe4j.row.gen;

import com.sun.codemodel.*;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Slf4j
@Service
public class RowClassGenerator implements ApplicationRunner, ExitCodeGenerator {

    public static final String pattern = "^\\s*\\[(?<datfile>[\\w\\.]+)?\\]\\s*$" +
            "|^\\s*\\[\\[(?<fields>[\\w+]+)?\\]\\]\\s*$" +
            "|^\\s*\\[\\[\\[(?<property>[\\w]+)?\\]\\]\\]\\s*$" +
            "|^\\s*(?<propattribute>\\w+)\\s=\\s+(?:|(?<propattributevalue>.*?))\\s*?$" +
            "|^\\s*(?<comment>\\#.*)$";


    private String getSpecification() throws IOException {
        ClassPathResource recordFile = new ClassPathResource("/dat.specification.ini");
        return new String(Files.readAllBytes(Paths.get(recordFile.getURI())));
    }

    private Map<String, JDefinedClass> classCache = new LinkedHashMap<>();

    private JCodeModel cm = new JCodeModel();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Pattern p = Pattern.compile(pattern, Pattern.MULTILINE);
        String text = getSpecification();
        Matcher m = p.matcher(text);

        Map<String, Map<String, Map<String, Map<String, String>>>> datFiles = new LinkedHashMap<>();

        Map<String, Map<String, Map<String, String>>> currentDatFileValue = null;
        Map<String, Map<String, String>> currentFieldsValue = null;
        Map<String, String> currentPropertyValue = null;
        while (m.find()) {
            log.info("Match Group(datfile): {}", m.group("datfile"));
            log.info("Match Group(fields): {}", m.group("fields"));
            log.info("Match Group(property): {}", m.group("property"));
            log.info("Match Group(propattribute): {}", m.group("propattribute"));
            log.info("Match Group(propattributevalue): {}", m.group("propattributevalue"));
            log.info("Match Group(comment): {}", m.group("comment"));
            log.info("----------------------------------------------");

            if (m.group("datfile") != null) {
                currentDatFileValue = new LinkedHashMap<>();
                datFiles.put(m.group("datfile"), currentDatFileValue);
            } else if (m.group("fields") != null) {
                currentFieldsValue = new LinkedHashMap<>();
                currentDatFileValue.put(m.group("fields"), currentFieldsValue);
            } else if (m.group("property") != null) {
                currentPropertyValue = new LinkedHashMap<>();
                currentFieldsValue.put(m.group("property"), currentPropertyValue);
            } else if (m.group("propattribute") != null) {
                currentPropertyValue.put(m.group("propattribute"), m.group("propattributevalue"));
            }
        }


        for (Map.Entry<String, Map<String, Map<String, Map<String, String>>>> entry : datFiles.entrySet()) {
            String filename = entry.getKey();
            String simpleClassName = filename.replace(".dat", "");
            if (simpleClassName.charAt(simpleClassName.length() - 1) == 's') {
                simpleClassName = simpleClassName.substring(0, simpleClassName.length() - 1);
            }
            Map<String, Map<String, Map<String, String>>> value = entry.getValue();

            JDefinedClass clazz;
            if (classCache.containsKey(filename)) {
                clazz = classCache.get(filename);
            } else {
                clazz = cm._class("com.swandiggy.poe4j.row.gen." + simpleClassName);
                classCache.put(filename, clazz);
            }

            clazz._extends(BaseRow.class);
            clazz.annotate(Data.class);
            JAnnotationUse annotation = clazz.annotate(EqualsAndHashCode.class);
            annotation.param("callSuper", true);
            JAnnotationUse datFileAnnotation = clazz.annotate(DatFile.class);
            datFileAnnotation.param("value", filename.replace(".dat", ""));

            Map<String, Map<String, String>> fields = value.get("fields");
            if (fields == null) {
                log.warn("No fields found for: {}", entry);
                continue;
            }
            int count = 0;
            for (Map.Entry<String, Map<String, String>> fieldEntry : fields.entrySet()) {
                String fieldName = fieldEntry.getKey();
                fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1, fieldName.length());
                if (fieldName.endsWith("Key") && fieldName.length() > 3) {
                    fieldName = fieldName.substring(0, fieldName.length() - 3);
                }
                if (fieldName.endsWith("Keys") && fieldName.length() > 4) {
                    fieldName = fieldName.substring(0, fieldName.length() - 4) + "s";
                }

                if (fieldName.charAt(fieldName.length() - 1) == 's') {
                    fieldName = fieldName.substring(0, fieldName.length() - 1);
                }

                Object fieldType = getFieldType(fieldEntry.getValue());
                JFieldVar field;
                if (fieldType instanceof Class) {
                    field = clazz.field(JMod.PRIVATE, (Class) fieldType, fieldName);
                } else if (fieldType instanceof JType) {
                    field = clazz.field(JMod.PRIVATE, (JType) fieldType, fieldName);
                } else {
                    throw new Poe4jException("fieldType was not a Class or JType");
                }
                JAnnotationUse fieldAn = field.annotate(Order.class);
                fieldAn.param("value", count++);

                if (fieldEntry.getValue().containsKey("key_id")) {
                    JAnnotationUse refOne = field.annotate(ReferenceOne.class);
                    refOne.param("value", fieldEntry.getValue().get("key_id"));
                    if (fieldEntry.getValue().containsKey("key_offset")) {
                        refOne.param("offset", Long.valueOf(fieldEntry.getValue().get("key_offset")));
                    }
                }

                if (fieldEntry.getValue().containsKey("key") &&
                        fieldEntry.getValue().get("type").equalsIgnoreCase("int")
                        && !fieldEntry.getValue().containsKey("key_id")) {
                    JAnnotationUse ref = field.annotate(Reference.class);
                    ref.param("value", Integer.class);
                    if (fieldEntry.getValue().containsKey("key_offset")) {
                        ref.param("offset", Long.valueOf(fieldEntry.getValue().get("key_offset")));
                    }
                }
            }

        }

        cm.build(new File("."));
    }

    private Object getFieldType(Map<String, String> type) throws JClassAlreadyExistsException {
        if (type.containsKey("key") && type.get("key").contains(".dat")) {
            if (!type.get("type").contains("list")) {
                if (classCache.containsKey(type.get("key"))) {
                    return classCache.get(type.get("key"));
                } else {
                    String simpleClassName = type.get("key").replace(".dat", "");
                    if (simpleClassName.charAt(simpleClassName.length() - 1) == 's') {
                        simpleClassName = simpleClassName.substring(0, simpleClassName.length() - 1);
                    }
                    JDefinedClass clazz = cm._class("com.swandiggy.poe4j.row.gen." + simpleClassName);
                    classCache.put(type.get("key"), clazz);
                    return clazz;
                }
            } else {
                if (classCache.containsKey(type.get("key"))) {
                    return cm.ref(List.class).narrow(classCache.get(type.get("key")));
                } else {
                    JDefinedClass clazz = cm._class("com.swandiggy.poe4j.row.gen." + type.get("key").replace(".dat", ""));
                    classCache.put(type.get("key"), clazz);
                    return cm.ref(List.class).narrow(clazz);
                }
            }
        } else if (Objects.equals(type.get("type"), "int")) {
            return int.class;
        } else if (Objects.equals(type.get("type"), "ref|string")) {
            return String.class;
        } else if (Objects.equals(type.get("type"), "ref|list|uint")) {
            return cm.ref(List.class).narrow(Integer.class);
        } else if (Objects.equals(type.get("type"), "bool")) {
            return Boolean.class;
        } else if (Objects.equals(type.get("type"), "ulong")) {
            return Long.class;
        } else if (Objects.equals(type.get("type"), "ref|list|int")) {
            return cm.ref(List.class).narrow(Integer.class);
        } else if (Objects.equals(type.get("type"), "ref|list|ref|string")) {
            return cm.ref(List.class).narrow(String.class);
        } else if (Objects.equals(type.get("type"), "ref|list|ref|string")) {
            return cm.ref(List.class).narrow(String.class);
        } else if (Objects.equals(type.get("type"), "ref|list|ulong")) {
            return cm.ref(List.class).narrow(Long.class);
        } else if (Objects.equals(type.get("type"), "short")) {
            return Short.class;
        } else if (Objects.equals(type.get("type"), "byte")) {
            return Byte.class;
        } else if (Objects.equals(type.get("type"), "uint")) {
            return Integer.class;
        } else if (Objects.equals(type.get("type"), "ref|int")) {
            return Integer.class;
        } else if (Objects.equals(type.get("type"), "long")) {
            return Long.class;
        } else if (Objects.equals(type.get("type"), "ref|list|long")) {
            return cm.ref(List.class).narrow(Long.class);
        } else if (Objects.equals(type.get("type"), "ubyte")) {
            return Byte.class;
        }

        throw new Poe4jException(MessageFormat.format("Could not determine field type for {0}", type));
    }

    @Override
    public int getExitCode() {
        return 0;
    }
}
