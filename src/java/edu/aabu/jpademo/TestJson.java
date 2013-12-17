/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author webdev
 */
public class TestJson {

    public static void main(String[] args) {
        Book book = new Book();
        book.setId((long) 1523);
        book.setDescription("best book ever seen");
        book.setIsbn("345-988777");
        book.setNumOfPages(340);
        book.setIllustration(true);
        book.setPrice((float) 20.9);
        book.setTitle("Java EE 6 ");
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.defaultPrettyPrintingWriter()
                                     .writeValueAsString(book));
        } catch (JsonGenerationException ex) {
            Logger.getLogger(TestJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JsonMappingException ex) {
            Logger.getLogger(TestJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
