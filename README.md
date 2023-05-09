# Reels4j
Java library to download Instagram reels.

## Usage
### Get reels content url
```java
ReelsContentRoot reelsContentRoot = ReelsUrlSupport.getReelsSourceUrl("REPLACE_WITH_VALID_REELS_SHARE_LINK");
Video video = reelsContentRoot.video().get(0);

String reelsContent = video.contentUrl();
```

### Download reels into file

```java
String url = "REPLACE_WITH_VALID_REELS_SHARE_LINK";

File target = new File("my_reels.mp4");
ReelsDownloader.downloadByReelsUrl(url, target);
```
