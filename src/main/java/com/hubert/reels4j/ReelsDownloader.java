package com.hubert.reels4j;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class ReelsDownloader {

    public static byte[] getReelsBytes(URL url) throws IOException {
        try (
                BufferedInputStream in = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(System.currentTimeMillis() + "_reels");
        ) {
            byte[] buffer = new byte[1024];
            int readBytes;

            while ((readBytes = in.read(buffer, 0, 1024)) != -1) {
                fileOutputStream.write(buffer, 0, readBytes);
            }

            return buffer;
        }
    }
}
