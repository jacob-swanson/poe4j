package com.swandiggy.poe4j.test;

import com.swandiggy.poe4j.data.DataFileRegistry;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.DataFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
//@Ignore // Remove this to run
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class LoadAllRowsTest {

    @Autowired
    private DataFileReaderFactory dataFileReaderFactory;

    @Test
    public void testRead() throws Exception {
        for (Class rowClass : DataFileRegistry.getRegisteredTypes()) {
            DataFileReader<BaseRow> reader = dataFileReaderFactory.createUnsafe(rowClass);
            log.info("Read {} rows for {}", reader.read().count(), rowClass.getSimpleName());
        }
    }
}
