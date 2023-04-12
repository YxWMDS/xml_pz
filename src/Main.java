import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Main {
    public static void main(String[] args) throws TransformerException {
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer(new StreamSource(new File("src/Planes.xsl")));

        StreamSource ss = new StreamSource(new File("src/Planes.xml"));
        StreamResult sr = new StreamResult(new File("src/PlanesHTML.html"));

        tf.transform(ss, sr);
        System.out.println("DONE");
    }
}