package pl.hubertkuch.reels4j.http;

import pl.hubertkuch.reels4j.exceptions.CannotGetContentConnection;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HttpConnectionHelper {
    public static String getSiteSource(String url) throws CannotGetContentConnection {
        try {
            URLConnection connection = new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());

            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            scanner.close();

            return content;
        } catch (SecurityException | IOException ex) {
            throw new CannotGetContentConnection(ex);
        }
    }
}
