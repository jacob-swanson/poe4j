package com.swandiggy.poe4j.ggpkg.factory;

import com.swandiggy.poe4j.ggpkg.record.FreeRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Factory for {@link FreeRecord}s.
 *
 * @author Jacob Swanson
 * @since 9/2/2015
 */
@Slf4j
@Service
public class FreeRecordFactory implements RecordFactory<FreeRecord> {

    @Override
    public FreeRecord read(BinaryReader br, long recordOffset, int recordLength) {
        Assert.notNull(br);

        log.debug("Parsing a free record");

        long nextFreeOffset = br.readLong();

        long dataOffset = br.getPosition();
        int dataLength = recordLength - PREAMBLE_SIZE - Long.BYTES;

        br.skipBytes(dataLength);

        return new FreeRecord(recordOffset, recordLength, dataOffset, dataLength, nextFreeOffset);
    }

    @Override
    public boolean supports(String tag) {
        Assert.notNull(tag);

        return "FREE".equalsIgnoreCase(tag);
    }
}
