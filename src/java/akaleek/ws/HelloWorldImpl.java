/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akaleek.ws;

import javax.jws.WebService;

/**
 *
 * @author webdev
 */
@WebService(endpointInterface = "akaleek.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public int getArea(int width, int hieght) {
        return width * hieght ;
    }
    
}
