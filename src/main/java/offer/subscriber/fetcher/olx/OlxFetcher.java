package offer.subscriber.fetcher.olx;

import offer.subscriber.fetcher.Fetcher;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

public class OlxFetcher implements Fetcher {

    private final String OFFER_LIST_SELECTOR = "#offers_table > tbody > tr.wrap > td.offer > div.offer-wrapper > table.fixed.breakword:not(.promoted-list)";
    private final String OFFER_TITLE_SELECTOR = "td.title-cell > div.space.rel > h3 > a";

    @Override
    public Collection<OlxOffer> fetch(String request) throws IOException {
        Document doc = Jsoup.connect(request).get();
        Elements offerList = doc.select(OFFER_LIST_SELECTOR);
        return offerList.stream().map(this::mapHTMLElementToOffer).collect(Collectors.toList());
    }

    private OlxOffer mapHTMLElementToOffer(Element element) {
        Element titleElem = element.select(OFFER_TITLE_SELECTOR).first();
        String link = titleElem.attributes().get("href");
        String title = titleElem.child(0).html();
        return new OlxOffer(title, link);
    }

}
