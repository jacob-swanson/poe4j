package com.swandiggy.poe4j.ggpkg.factory;

import com.swandiggy.poe4j.ggpkg.record.GgpkgRecord;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Factory for {@link GgpkgRecord}s.
 *
 * @author Jacob Swanson
 * @since 9/2/2015
 */
@Slf4j
public class GgpkgRecordFactory implements RecordFactory<GgpkgRecord> {

    public GgpkgRecordFactory() {
    }

    @Override
    public GgpkgRecord read(BinaryReader br, long recordOffset, int recordLength) {
        Assert.notNull(br);

        log.debug("Parsing a GGPKG record");

        int totalRecordOffsets = br.readInt();
        Assert.isTrue(totalRecordOffsets == 2, "should have 2 records");

        long[] recordOffsets = new long[totalRecordOffsets];
        for (int i = 0; i < totalRecordOffsets; i++) {
            recordOffsets[i] = br.readLong();
        }

        return new GgpkgRecord(recordOffset, recordLength, recordOffsets);
    }

    @Override
    public boolean supports(String tag) {
        Assert.notNull(tag);

        return "GGPK".equalsIgnoreCase(tag);
    }

}
