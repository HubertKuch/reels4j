package com.hubert.reels4j;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.fail;

public class ReelsDownloaderTest {

    @Test
    public void givenValidReelsUrl_thenDownload() throws IOException {
        try {
            String url = "https://www.instagram.com/reel/Crp7jeHAN_F/?utm_source=ig_web_copy_linkhttps%3A%2F%2Fwww.instagram.com%2Freel%2FCrp7jeHAN_F%2F%3Futm_source%3Dig_web_copy_link";

            File target = new File(System.currentTimeMillis() + "_reels.mp4");
            ReelsDownloader.downloadByReelsUrl(url, target);

            target.deleteOnExit();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            fail();
        }
    }

}