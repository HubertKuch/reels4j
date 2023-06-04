package pl.hubertkuch.reels4j;

import pl.hubertkuch.reels4j.exceptions.CannotDownloadReelsException;
import pl.hubertkuch.reels4j.exceptions.CannotGetReelsUrlException;
import pl.hubertkuch.reels4j.url.ReelsUrlSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ReelsDownloader {

    public static void downloadByReelsUrl(URL url, File target) throws IOException, CannotGetReelsUrlException {
        String contentUrl = ReelsUrlSupport.getReelsSourceUrl(url).video().get(0).contentUrl();

        FileUtils.copyURLToFile(new URL(contentUrl), target);
    }

    public static void downloadByReelsUrl(String url, File target) throws
            CannotGetReelsUrlException,
            CannotDownloadReelsException {
        try {
            downloadByReelsUrl(new URL(url), target);
        } catch (IOException e) {
            throw new CannotGetReelsUrlException("Invalid url", e);
        }
    }

}
