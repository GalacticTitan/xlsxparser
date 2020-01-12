package com.kbj.androxlsxparser.mxlsxparser.impl;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TempFileUtil {
    public static File writeInputStreamToFile(Context context, InputStream is, int bufferSize) throws IOException {
        File f = File.createTempFile("tmp-", ".xlsx", context.getCacheDir());
        try(FileOutputStream fos = new FileOutputStream(f)) {
            int read;
            byte[] bytes = new byte[bufferSize];
            while((read = is.read(bytes)) != -1) {
                fos.write(bytes, 0, read);
            }
            return f;
        } finally {
            is.close();
        }
    }
}