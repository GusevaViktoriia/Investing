import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Investing {
    private static Document getPage() throws Exception {
        String url = "http://www.dohod.ru/ik/analytics/stockmap/#t1";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
}
