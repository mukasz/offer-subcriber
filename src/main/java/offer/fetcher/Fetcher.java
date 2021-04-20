package offer.fetcher;

import offer.fetcher.olx.OlxOffer;

import java.io.IOException;
import java.util.Collection;

public interface Fetcher {

    Collection<OlxOffer> fetch(String request) throws IOException; //TODO add custom Exception

}
