package xml_train;

import com.sun.org.apache.xerces.internal.impl.xs.XMLSchemaLoader;
import javafx.scene.text.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class Doc {

    public static void main(String[] args) {
        Doc d = new Doc();

        User mo = new User();
        User mo2 = new User();
        Role r = new Role();
        mo.setLogged(true);
        mo.setFirstName("NAME");
        mo.setId(444);
        mo.setRole(r);
        mo.setPassword("rtyui");
        mo2.setLogged(true);
        mo2.setFirstName("fgh");
        mo2.setId(447774);
        mo2.setRole(r);
        mo2.setPassword("rtyui");


        r.setRole("adm");
        r.setGrade("weryadmin");


        d.buildDoc(mo);
        d.buildDoc(mo2);

    }

    Document doc;

    void buildDoc(User mo) {

        try {


            File mf = new File("mynewfile.xml");
            JAXBContext jc = JAXBContext.newInstance(User.class);
            Marshaller marsh = jc.createMarshaller();

            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marsh.marshal(mo, mf);
            marsh.marshal(mo, System.out);
            Doc d = new Doc();
            //d.editDoc(mf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void editDoc(File edFile) {

        try {
            DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = fac.newDocumentBuilder();
            doc = db.parse("mynewfile.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element root = doc.getDocumentElement();
        System.out.println(root.getTagName());
        Element nname = doc.createElement("nname");
        nname.appendChild(doc.createTextNode("uuu"));


        root.appendChild(nname);

        try {


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            t.transform(new DOMSource(doc), new StreamResult(new File("myfile.xml")));
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    /*void parse(){

            try {

                File file = new File("pom.xml");
                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
                System.out.println(customer);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }*/


}
