package com.swandiggy.poe4j.ggpkg.factory;

import com.swandiggy.poe4j.ggpkg.record.DirectoryRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory for {@link DirectoryRecord}s.
 *
 * @author Jacob Swanson
 * @since 9/2/2015
 */
@Slf4j
@Service
public class DirectoryRecordFactory implements RecordFactory<DirectoryRecord> {

    @Override
    public DirectoryRecord read(BinaryReader br, long recordOffset, int recordLength) {
        Assert.notNull(br);
        log.debug("Parsing a directory record");

        int nameLength = br.readInt();
        int totalEntries = br.readInt();

        byte[] hash = br.readBytes(HASH_SIZE);
        String name = nameLength == 1 ? "" : br.readString(2 * (nameLength - 1), "UTF-16LE");
        br.skipBytes(2);

        List<DirectoryRecord.DirectoryEntry> entries = new ArrayList<>(totalEntries);
        for (int i = 0; i < totalEntries; i++) {
            entries.add(new DirectoryRecord.DirectoryEntry(br.readInt(), br.readLong()));
        }

        return new DirectoryRecord(recordOffset, recordLength, name, hash, entries);
    }

    @Override
    public boolean supports(String tag) {
        Assert.notNull(tag);

        return "PDIR".equalsIgnoreCase(tag);
    }
}
