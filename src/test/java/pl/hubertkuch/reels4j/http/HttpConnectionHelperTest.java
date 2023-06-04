package pl.hubertkuch.reels4j.http;

import pl.hubertkuch.reels4j.exceptions.CannotGetContentConnection;
import org.jsoup.Jsoup;
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