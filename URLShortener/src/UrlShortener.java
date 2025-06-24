public interface UrlShortener {
    String shortenUrl(String longUrl);
    String getOriginalUrl(String shortUrl);
}
