package com.swandiggy.poe4j.vorici.calc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swandiggy.poe4j.config.Poe4jProperties;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseItemType;
import com.swandiggy.poe4j.data.rows.ComponentAttributeRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Service
public class VoriciDataExtractor implements ApplicationRunner, ExitCodeGenerator {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Autowired
    private Poe4jProperties properties;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        properties.setGgpkDirectory(args.getNonOptionArgs().get(0));
        DatFileReader<BaseItemType> baseItemTypeReader = datFileReaderFactory.create(BaseItemType.class);
        DatFileReader<ComponentAttributeRequirement> attrReqReader = datFileReaderFactory.create(ComponentAttributeRequirement.class);

        List<ItemData> items = baseItemTypeReader.read()
                .filter(row -> row.getInheritsFrom().equals("Metadata/Items/Armours/BodyArmours/AbstractBodyArmour"))
                .flatMap(baseItemType -> {
                    return attrReqReader.read()
                            .filter(componentAttributeRequirement -> componentAttributeRequirement.getBaseItemType().equals(baseItemType));
                }).map(ItemData::new)
                .collect(toList());

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("item-data.json").toFile(), items);
    }

    @Override
    public int getExitCode() {
        return 0;
    }
}
