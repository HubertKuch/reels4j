package com.hubert.reels4j;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class ReelsDownloaderTest {

    @Test
    public void givenValidReelsUrl_thenReturnValidVideoBytes() throws IOException {
        try {
            URL url = new URL(
                    "https://www.instagram.com/reel/Crp7jeHAN_F/?utm_source=ig_web_copy_linkhttps%3A%2F%2Fwww.instagram.com%2Freel%2FCrp7jeHAN_F%2F%3Futm_source%3Dig_web_copy_link");
            byte[] bytes = ReelsDownloader.getReelsBytes(url);

            assertNotEquals(0, bytes.length);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            fail();
        }
    }

}