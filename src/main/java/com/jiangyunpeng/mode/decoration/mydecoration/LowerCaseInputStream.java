package com.jiangyunpeng.mode.decoration.mydecoration;

import java.io.*;

/**
 * Created by jyp on 2017/10/10.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1? c :Character.toLowerCase((char)c);
    }

    public int read(byte[] b,int offset,int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset;i<offset+result;i++){
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(new byte[]{'A','B','C'})));

        while((c=in.read()) >0){
            System.out.println((char)c);
        }
        in.close();
    }

}
