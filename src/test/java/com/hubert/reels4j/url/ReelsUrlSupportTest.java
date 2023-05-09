package com.hubert.reels4j.url;

import com.hubert.reels4j.exceptions.CannotGetReelsUrlException;
import com.hubert.reels4j.models.ReelsContentRoot;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.fail;

public class ReelsUrlSupportTest {

    @Test
    public void givenValidReelsUrl_thenReturnReelsSourceUrl() throws CannotGetReelsUrlException {
        try {
            ReelsContentRoot reelsContentRoot = ReelsUrlSupport.getReelsSourceUrl("https://www.instagram.com/reel/Crp7jeHAN_F/?utm_source=ig_web_copy_link");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            fail();
        }
    }
}