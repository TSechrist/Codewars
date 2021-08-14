import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LogParser {
    public static Collection<Long> getTimestampsByDescription(String xml, String description) throws Exception {

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource src = new InputSource();
        src.setCharacterStream(new StringReader(xml));

        Document doc = builder.parse(src);

        Collection<Long> timest = new LinkedList<Long>();
        int length = doc.getElementsByTagName("description").getLength();

        for (int i = 0; i < length; i++){
            if (description.equals(doc.getElementsByTagName("description").item(i).getTextContent())){
                String str = doc.getElementsByTagName("event").item(i).getAttributes().item(0).toString().replaceAll("\\D+","");
                timest.add(Long.valueOf(str));
            }

        }

        return timest;

//        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<log>\n" +
                        "    <event timestamp=\"1614285589\">\n" +
                        "        <description>Intrusion detected</description>\n" +
                        "    </event>\n" +
                        "    <event timestamp=\"1614286432\">\n" +
                        "        <description>Intrusion ended</description>\n" +
                        "    </event>\n" +
                        "</log>";

        Collection<Long> timestamps = getTimestampsByDescription(xml, "Intrusion ended");
        for(long timestamp: timestamps)
            System.out.println(timestamp);
    }
}