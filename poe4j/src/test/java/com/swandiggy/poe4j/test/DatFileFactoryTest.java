package com.swandiggy.poe4j.test;

import com.swandiggy.poe4j.ggpkg.factory.FileRecordFactory;
import com.swandiggy.poe4j.ggpkg.factory.RecordFactory;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.RafBinaryReader;
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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class DatFileFactoryTest {

    @Autowired
    private FileRecordFactory fileRecordFactory;

    @Test
    public void testRead() throws Exception {
        ClassPathResource recordFile = new ClassPathResource("/file-record.dat");
        assertThat(recordFile.exists(), is(true));

        try (BinaryReader br = new RafBinaryReader(recordFile.getFile(), "r")) {
            int recordLength = br.readInt();
            String tag = br.readString(RecordFactory.TAG_SIZE);
            assertThat(tag, equalTo("FILE"));

            FileRecord fileRecord = fileRecordFactory.read(br, 0, recordLength);

            assertThat(fileRecord.getDataStart(), is(84L));
            assertThat(fileRecord.getDataLength(), is(21440));
            assertThat(fileRecord.getRecordStart(), is(0L));
            assertThat(fileRecord.getRecordLength(), is(21524));

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            br.setPosition(fileRecord.getDataStart());
            md.update(br.readBytes(fileRecord.getDataLength()));
            byte[] hash = md.digest();
            assertThat(fileRecord.getSha256Digest(), equalTo(hash));

            assertThat(fileRecord.getName(), equalTo("Frog_09.ambient.ogg"));
        }
    }

    @Test
    public void testSupports() throws Exception {
        assertThat(fileRecordFactory.supports("FILE"), is(true));
        assertThat(fileRecordFactory.supports("PDIR"), is(false));
    }
}
