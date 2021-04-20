package offer.subscriber.fetcher;

import offer.subscriber.fetcher.olx.OlxOffer;

import java.io.IOException;
import java.util.Collection;

public interface Fetcher {

    Collection<OlxOffer> fetch(String request) throws IOException; //TODO add custom Exception

}
