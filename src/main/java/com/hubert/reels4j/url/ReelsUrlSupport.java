package com.hubert.reels4j.url;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubert.reels4j.exceptions.CannotGetContentConnection;
import com.hubert.reels4j.exceptions.CannotGetReelsUrlException;
import com.hubert.reels4j.http.HttpConnectionHelper;
import com.hubert.reels4j.models.ReelsContentRoot;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URL;
import java.util.List;

public class ReelsUrlSupport {

    public static ReelsContentRoot getReelsSourceUrl(URL url) throws CannotGetReelsUrlException {
        return getReelsSourceUrl(url.toString());
    }

    public static ReelsContentRoot getReelsSourceUrl(String urlToReels) throws CannotGetReelsUrlException {
        try {
            String content = HttpConnectionHelper.getSiteSource(urlToReels);

            Document document = Jsoup.parse(content);

            List<Element> elements = document.select("script[type=\"application/ld+json\"]");

            if (elements.isEmpty()) {
                throw new CannotGetReelsUrlException("Content json node is empty");
            }

            ObjectMapper mapper = new ObjectMapper();
            String jsonContent = elements.get(0).html();

            return mapper.readValue(jsonContent, ReelsContentRoot.class);
        } catch (CannotGetContentConnection | JsonProcessingException e) {
            throw new CannotGetReelsUrlException(e);
        }
    }

}
