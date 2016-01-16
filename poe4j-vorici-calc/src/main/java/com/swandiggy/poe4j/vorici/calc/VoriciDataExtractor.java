package com.swandiggy.poe4j.vorici.calc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseItemType;
import com.swandiggy.poe4j.data.rows.BaseRow;
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

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DatFileReader<BaseRow> baseItemTypeReader = datFileReaderFactory.create("C:\\Users\\Jacob\\Downloads\\content\\Data\\BaseItemTypes.dat");
        DatFileReader<BaseRow> attrReqReader = datFileReaderFactory.create("C:\\Users\\Jacob\\Downloads\\content\\Data\\ComponentAttributeRequirements.dat");

        List<ItemData> items = baseItemTypeReader.read()
                .map(row -> (BaseItemType) row)
                .filter(row -> row.getInheritsFrom().equals("Metadata/Items/Armours/BodyArmours/AbstractBodyArmour"))
                .flatMap(baseItemType -> {
                    return attrReqReader.read()
                            .map(row -> (ComponentAttributeRequirement) row)
                            .filter(componentAttributeRequirement -> componentAttributeRequirement.getBaseItemType().equals(baseItemType));
                }).map(ItemData::new)
                .collect(toList());

        objectMapper.writeValue(Paths.get("C:\\Users\\Jacob\\Downloads\\item-data.json").toFile(), items);
    }

    @Override
    public int getExitCode() {
        return 0;
    }
}
