package com.swandiggy.poe4j.test;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class ExtractAllTest {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Test
    public void testRead() throws Exception {
        List<Class> failureClasses = new ArrayList<>();
        DatFileLookup.rowClasses.values().forEach(clazz -> {
            try {
                DatFileReader reader = datFileReaderFactory.createUnsafe(clazz);
                log.info("Read {} rows for {}", reader.read().count(), clazz.getSimpleName());
            } catch (Poe4jException ex) {
                failureClasses.add(clazz);
                log.warn("Could not parse dat file {}", clazz, ex);
            }
        });

        if (!failureClasses.isEmpty()) {
            log.error("FAiled: {}", failureClasses.stream().map(Class::getSimpleName).collect(toList()));
            Assert.fail(MessageFormat.format("{0} classes failed", failureClasses.size()));
        }
    }

}
