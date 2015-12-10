package com.swandiggy.poe4j.ggpkg.factory;

import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.io.BinaryReader;

import java.io.IOException;

/**
 * Interface for record factories.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
public interface RecordFactory<T extends Record> {
    int LENGTH_SIZE = 4;
    int TAG_SIZE = 4;
    int PREAMBLE_SIZE = LENGTH_SIZE + TAG_SIZE;
    int HASH_SIZE = 32;

    /**
     * Read in a record from a {@link BinaryReader}. The reader's position is right after the tag. Upon returning,
     * the reader should be positioned at the beginning of the next record.
     *
     * @param br           Stream to read from.
     * @param recordOffset Location where the rows starts.
     * @param recordLength Length of the rows.
     * @return Constructed {@link Record}
     * @throws IOException
     */
    T read(BinaryReader br, long recordOffset, int recordLength);

    /**
     * Check if a factory supports reading a record with the given tag.
     *
     * @param tag Four byte tag after the record's size.
     * @return true if the factory supports tag, false otherwise.
     */
    boolean supports(String tag);
}
