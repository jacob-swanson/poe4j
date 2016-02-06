package com.swandiggy.poe4j.row.gen;

import com.sun.codemodel.*;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
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
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Slf4j
@Service
public class DataExtractor implements ApplicationRunner, ExitCodeGenerator {

    public static final String pattern = "^\\s*\\[(?<datfile>[a-zA-Z0-9\\.]+)?\\]\\s*$" +
            "|^\\s*\\[\\[(?<fields>[a-zA-Z0-9]+)?\\]\\]\\s*$" +
            "|^\\s*\\[\\[\\[(?<property>[a-zA-Z0-9]+)?\\]\\]\\]\\s*$" +
            "|^\\s*(?<propattribute>\\w+)\\s=\\s+(?:|(?<propattributevalue>.*?))\\s*?$" +
            "|^\\s*(?<comment>\\#.*)$";


    private String getSpecification() throws IOException {
        ClassPathResource recordFile = new ClassPathResource("/dat.specification.ini");
        return new String(Files.readAllBytes(Paths.get(recordFile.getURI())));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Pattern p = Pattern.compile(pattern, Pattern.MULTILINE);
        String text = getSpecification();
        Matcher m = p.matcher(text);

        Map<String, Map<String, Map<String, Map<String, String>>>> datFiles = new HashMap<>();

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
                currentDatFileValue = new HashMap<>();
                datFiles.put(m.group("datfile"), currentDatFileValue);
            } else if (m.group("fields") != null) {
                currentFieldsValue = new HashMap<>();
                currentDatFileValue.put(m.group("fields"), currentFieldsValue);
            } else if (m.group("property") != null) {
                currentPropertyValue = new HashMap<>();
                currentFieldsValue.put(m.group("property"), currentPropertyValue);
            } else if (m.group("propattribute") != null) {
                currentPropertyValue.put(m.group("propattribute"), m.group("propattributevalue"));
            }
        }

        JCodeModel cm = new JCodeModel();
        JDefinedClass clazz = cm._class("com.swandiggy.poe4j.row.gen.TestClass");
        clazz._extends(BaseRow.class);
        clazz.annotate(Data.class);
        JAnnotationUse annotation = clazz.annotate(EqualsAndHashCode.class);
        annotation.param("callSuper", true);
        clazz.annotate(DatFile.class);

        JFieldVar field = clazz.field(JMod.PRIVATE, String.class, "id");
        JAnnotationUse fieldAn = field.annotate(Order.class);
        fieldAn.param("value", 1);

        cm.build(new File("."));
    }

    @Override
    public int getExitCode() {
        return 0;
    }
}
