/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akaleek.ws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author webdev
 */
public class HelloWorldPublisher {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
}
