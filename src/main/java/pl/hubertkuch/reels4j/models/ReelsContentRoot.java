package pl.hubertkuch.reels4j.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import pl.hubertkuch.reels4j.models.video.Video;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ReelsContentRoot(List<Video> video) {}
