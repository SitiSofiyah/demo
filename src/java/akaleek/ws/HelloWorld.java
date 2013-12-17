/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akaleek.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author webdev
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {
    @WebMethod
    int getArea(int width,int hieght);
    
}
