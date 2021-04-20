package offer.fetcher.olx;

public class OlxOffer {

    private String title;
    private String link;

    OlxOffer(String title, String link) {
        this.title = title;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
