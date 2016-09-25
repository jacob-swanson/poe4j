package com.swandiggy.poe4j.util.io;

import com.swandiggy.poe4j.Poe4jException;
import org.mozilla.universalchardet.UniversalDetector;
import org.springframework.util.Assert;

import java.io.Closeable;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author Jacob Swanson
 * @since 11/16/2015
 */
public interface BinaryReader extends Closeable {
    String DEFAULT_ENCODING = "UTF-8";

    void setOrder(ByteOrder byteOrder);

    default int readInt() {
        return ByteBuffer.wrap(this.readBytes(4))
                .order(getByteOrder())
                .getInt();
    }

    default float readFloat() {
        return ByteBuffer.wrap(this.readBytes(4))
                .order(getByteOrder())
                .getFloat();
    }

    default double readDouble() {
        return ByteBuffer.wrap(this.readBytes(8))
                .order(getByteOrder())
                .getDouble();
    }

    default long readUInt() {
        return readInt() & 0xFFFFFFFFL;
    }

    default short readShort() {
        return ByteBuffer.wrap(this.readBytes(2))
                .order(getByteOrder())
                .getShort();
    }

    default int readUShort() {
        return this.readShort() & 0xFFFF;
    }

    default long readLong() {
        return ByteBuffer.wrap(this.readBytes(8))
                .order(getByteOrder())
                .getLong();
    }

    default byte readByte() {
        return this.readBytes(1)[0];
    }

    /**
     * Read a string and attempt to guess the character encoding.
     *
     * @param length Number of bytes to read.
     * @return Read bytes as a String.
     */
    default String readString(int length) {
        Assert.isTrue(length > 0, "length must be positive");

        byte[] bytes = readBytes(length);

        try {
            return new String(bytes, guessEncoding(bytes));
        } catch (UnsupportedEncodingException e) {
            throw new Poe4jException(e);
        }
    }

    /**
     * Read a string with the given encoding.
     *
     * @param length   Number of bytes to read.
     * @param encoding Encoding to use.
     * @return Read bytes as a String.
     */
    default String readString(int length, String encoding) {
        Assert.isTrue(length > 0, "length must be positive");
        Assert.hasText(encoding);

        byte[] bytes = readBytes(length);

        try {
            return new String(bytes, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new Poe4jException(e);
        }
    }

    /**
     * Read a null terminated string. Assumes characters a 16-bit.
     *
     * @param encoding Encoding to use
     * @return Read string
     */
    default String readString(String encoding) {
        Assert.hasText(encoding);

        byte[] bytes = readBytes(2);
        String value = "";

        while (!((bytes[1] == 0) && (bytes[0] == 0))) {
            try {
                value += new String(bytes, encoding);
            } catch (UnsupportedEncodingException e) {
                throw new Poe4jException(e);
            }
            bytes = readBytes(2);
        }

        return value;
    }

    byte[] readBytes(int length);

    long getPosition();

    void skipBytes(int length);

    long length();

    void setPosition(long offset);

    ByteOrder getByteOrder();

    default String guessEncoding(byte[] bytes) {
        UniversalDetector detector = new UniversalDetector(null);

        detector.handleData(bytes, 0, bytes.length);
        detector.dataEnd();
        String encoding = detector.getDetectedCharset();
        detector.reset();
        if (encoding == null) {
            encoding = DEFAULT_ENCODING;
        }

        return encoding;
    }

    File getFile();
}
