import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GrowUpFrame extends JFrame {
    Document page = getPage();
    Element tableInformation = page.select("table[class=returns-table]").first();
    Elements tableFirstTD = tableInformation.select("span[class=returns-table-cell-title]");

    String dateString = tableFirstTD.text();

    public GrowUpFrame() throws Exception {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 700, 500);
        setTitle("Взлёты дня");
        //setContentPane(new Fon());

        Container cont = getContentPane();

        JLabel label = new JLabel(dateString);
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        cont.add(label);
    }

    private Document getPage() throws Exception {
        String url = "http://www.dohod.ru/ik/analytics/stockmap/#t1";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }




}
