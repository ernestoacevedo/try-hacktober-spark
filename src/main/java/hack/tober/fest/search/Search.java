package hack.tober.fest.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by Camilo on 10/06/2017.
 */
public class Search {

    private static Search search;
    private ArrayList<String> simpleData = new ArrayList<>();

    public static Search getSingletonInstance() {
        if (search == null){
            search = new Search();
        }
        return search;
    }

    public List<String> getSomeEntries() throws IOException {
        Document doc = Jsoup.connect("https://techcrunch.com/popular/").userAgent("Mozilla").get();
        Elements newsHeadlines = doc.select("#river1 li.river-block div div h2");//
        for (Element link : newsHeadlines) {
            simpleData.add(link.text());
        }
        return simpleData;
    }
}