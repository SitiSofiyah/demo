/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akaleek.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author webdev
 */
public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/hello") ;
        QName qname = new QName("{http://ws.akaleek/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
         System.out.println(hello.getArea(12, 40));
    }
    
}
