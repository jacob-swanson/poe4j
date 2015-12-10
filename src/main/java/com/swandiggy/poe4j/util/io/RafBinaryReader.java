package com.swandiggy.poe4j.util.io;

import com.swandiggy.poe4j.Poe4jException;
import org.springframework.util.Assert;

import java.io.*;
import java.nio.ByteOrder;

/**
 * {@link BinaryReader} backed by a {@link RandomAccessFile}
 *
 * @author Jacob Swanson
 * @since 9/1/2015
 */
public class RafBinaryReader implements BinaryReader {

    private RandomAccessFile raf;
    private ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;

    public RafBinaryReader(File file, String mode) {
        Assert.notNull(file);
        Assert.hasText(mode);

        try {
            raf = new RandomAccessFile(file, mode);
        } catch (FileNotFoundException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public void setOrder(ByteOrder byteOrder) {
        Assert.notNull(byteOrder);

        this.byteOrder = byteOrder;
    }

    @Override
    public byte[] readBytes(int length) {
        Assert.isTrue(length > 0, "length must be positive");

        byte[] bytes = new byte[length];
        try {
            raf.readFully(bytes);
        } catch (IOException e) {
            throw new Poe4jException(e);
        }

        return bytes;
    }

    @Override
    public long getPosition() {
        try {
            return raf.getFilePointer();
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public void close() {
        try {
            raf.close();
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public void skipBytes(int length) {
        Assert.isTrue(length > 0, "length must be positive");

        int n = 0;
        do {
            int count;
            try {
                count = raf.skipBytes(length - n);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
            if (count < 0)
                try {
                    throw new EOFException();
                } catch (EOFException e) {
                    throw new Poe4jException(e);
                }
            n += count;
        } while (n < length);
    }

    @Override
    public long length() {
        try {
            return raf.length();
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public void setPosition(long offset) {
        Assert.isTrue(offset > 0, "length must be positive");

        try {
            raf.seek(offset);
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }
}
