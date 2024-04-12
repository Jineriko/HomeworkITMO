package com.company.project.homework.lesson26.task3;

import javax.crypto.CipherOutputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XOROutputStream extends FilterOutputStream {
    private OutputStream output;
    private byte key;
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public XOROutputStream(OutputStream out, byte key) {
        super(out);
        this.output = out;
        this.key = key;
    }
    public void write(int b) throws IOException {
        output.write(b ^ key);
    }

//    public void close() throws IOException {
//        output.close();
//    }

}