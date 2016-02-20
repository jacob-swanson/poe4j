package com.swandiggy.poe4j.test;

import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.ggpkg.factory.FileRecordFactory;
import com.swandiggy.poe4j.ggpkg.factory.RecordFactory;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.RafBinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.MessageDigest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
@Ignore // Remove this to run
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class LoadAllRowsTest {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Test
    public void testRead() throws Exception {
        for (Class rowClass : DatFileLookup.ROW_CLASSES.values()) {
            DatFileReader<BaseRow> reader = datFileReaderFactory.createUnsafe(rowClass);
            log.info("Read {} rows for {}", reader.read().count(), rowClass.getSimpleName());
        }
    }
}
