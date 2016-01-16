package com.swandiggy.poe4j.data;

import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class DatFileReaderFactory {

    @Autowired
    private FieldReaders fieldReaders;

    public DatFileReader<BaseRow> create(File file) {
        return new DatFileReader<>(file, fieldReaders);
    }

    public DatFileReader<BaseRow> create(String fileName) {
        return new DatFileReader<>(new File(fileName), fieldReaders);
    }

}
