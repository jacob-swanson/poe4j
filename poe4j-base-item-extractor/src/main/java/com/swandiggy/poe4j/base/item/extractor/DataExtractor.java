package com.swandiggy.poe4j.base.item.extractor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.DataFileReaderFactory;
import com.swandiggy.poe4j.data.rows.gen.BaseItemTypes;
import com.swandiggy.poe4j.data.rows.gen.ComponentAttributeRequirement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Slf4j
@Service
public class DataExtractor implements ApplicationRunner, ExitCodeGenerator {

    @Autowired
    private DataFileReaderFactory dataFileReaderFactory;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DataFileReader<BaseItemTypes> baseItemTypeReader = dataFileReaderFactory.create(BaseItemTypes.class);
        DataFileReader<ComponentAttributeRequirement> attrReqReader = dataFileReaderFactory.create(ComponentAttributeRequirement.class);

        List<ItemData> items = baseItemTypeReader.read()
                .filter(row -> row.getInheritsFrom().contains("Abstract"))
                .flatMap(baseItemType -> {
                    return attrReqReader.read()
                            .filter(componentAttributeRequirement -> componentAttributeRequirement.getBaseItemTypesKey().equals(baseItemType));
                }).map(ItemData::new)
                .collect(toList());

        File outFile = Paths.get("item-data.json").toFile();
        log.info("Writing to {}", outFile.getAbsolutePath());
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(outFile, items);
    }

    @Override
    public int getExitCode() {
        return 0;
    }
}
