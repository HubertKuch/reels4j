package com.hubert.reels4j.http;

import com.hubert.reels4j.exceptions.CannotGetContentConnection;
import junit.framework.TestCase;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class HttpConnectionHelperTest {

    @Test
    public void givenValidSiteUrl_thenReturnHtmlContent() throws CannotGetContentConnection {
        try {
            String content = HttpConnectionHelper.getSiteSource("https://www.instagram.com/reel/Crp7jeHAN_F/?utm_source=ig_web_copy_link");

            Jsoup.parse(content);
        } catch (Throwable throwable) {
            fail();
        }
    }
}