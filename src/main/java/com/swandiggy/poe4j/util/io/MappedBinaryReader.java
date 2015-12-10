package com.swandiggy.poe4j.util.io;

import com.swandiggy.poe4j.Poe4jException;
import org.springframework.util.Assert;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * {@link BinaryReader} backed by a {@link MappedByteBuffer}
 *
 * @author Jacob Swanson
 * @since 11/17/2015
 */
public class MappedBinaryReader implements BinaryReader {
    private final MappedByteBuffer buf;
    private final RandomAccessFile raf;
    private final FileChannel channel;
    private ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;

    public MappedBinaryReader(File file, String mode) {
        Assert.notNull(file);
        Assert.notNull(mode);

        try {
            raf = new RandomAccessFile(file, mode);
            channel = raf.getChannel();
            buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, raf.length());
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public void setOrder(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    @Override
    public byte[] readBytes(int length) {
        byte[] bytes = new byte[length];
        buf.get(bytes);

        return bytes;
    }

    @Override
    public long getPosition() {
        return buf.position();
    }

    @Override
    public void skipBytes(int length) {
        buf.position(buf.position() + length);
    }

    @Override
    public long length() {
        return buf.position();
    }

    @Override
    public void setPosition(long offset) {
        buf.position((int) offset);
    }

    @Override
    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    @Override
    public void close() throws IOException {
        channel.close();
        raf.close();
    }
}
