/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author webdev
 */
public class JaxBdemoContext {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(JaxBDemo.class);
        Marshaller m = context.createMarshaller();
        JaxBDemo d = new JaxBDemo();
        d.setAuthor("akaleek");
        d.setName("Hello java world");
        d.setPubDate(new Date() );
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(d, System.out);
    }
}
