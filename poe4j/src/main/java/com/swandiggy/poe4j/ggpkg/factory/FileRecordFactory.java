package com.swandiggy.poe4j.ggpkg.factory;

import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Factory for {@link FileRecord}s.
 *
 * @author Jacob Swanson
 * @since 9/2/2015
 */
@Slf4j
@Service
public class FileRecordFactory implements RecordFactory<FileRecord> {

    @Override
    public FileRecord read(BinaryReader br, long recordOffset, int recordLength) {
        Assert.notNull(br);

        log.debug("Parsing a file record");

        int nameLength = br.readInt();

        byte[] hash = br.readBytes(HASH_SIZE);

        String name = br.readString(2 * (nameLength - 1), "UTF-16LE");
        br.skipBytes(2);

        long dataOffset = br.getPosition();
        int dataLength = recordLength - (PREAMBLE_SIZE + (nameLength * 2) + HASH_SIZE + Integer.BYTES);

        br.skipBytes(dataLength);

        return new FileRecord(recordOffset, recordLength, dataOffset, dataLength, name, hash);
    }

    @Override
    public boolean supports(String tag) {
        Assert.notNull(tag);

        return "FILE".equalsIgnoreCase(tag);
    }
}
