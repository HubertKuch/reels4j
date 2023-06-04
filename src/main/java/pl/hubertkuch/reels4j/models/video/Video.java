package pl.hubertkuch.reels4j.models.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Video(
        String uploadDate,
        String description,
        String name,
        String caption,
        String height,
        String width,
        String contentUrl,
        String thumbnailUrl,
        List<String> keywords

) {}
