package hack.tober.fest.parser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

/**
 * Created by Camilo on 10/04/2017.
 */
public class GetAll {

    /**
     * Return object from class Document with the hmtl content
     * allow parse with jsoup methods
     * @param url
     * @return Document with HTML
     */
    public static Document getHtmlDocument(String url) throws IOException {
        Document doc = null;
        doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).get();
        return doc;
    }

    /**
     * Check satus code of the response when request is active
     * 		200 OK			        300 Multiple Choices
     * 		301 Moved Permanently	305 Use Proxy
     * 		400 Bad Request		    403 Forbidden
     * 		404 Not Found		    500 Internal Server Error
     * 		502 Bad Gateway		    503 Service Unavailable
     * @param url
     * @return Status Code
     */
    public static int getStatusConnectionCode(String url) throws IOException {
        Connection.Response response = null;
        response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
        return response.statusCode();
    }

}
