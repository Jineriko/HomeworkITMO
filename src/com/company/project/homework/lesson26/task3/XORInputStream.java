package com.company.project.homework.lesson26.task3;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XORInputStream extends FilterInputStream {
    private InputStream input;
    private byte key;

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public XORInputStream(InputStream in, byte key) {
        super(in);
        input = in;
        this.key = key;
    }

    public int read() throws IOException {
        return input.read() ^ key;
    }
//    public void close() throws IOException {
//        input.close();
//    }

}