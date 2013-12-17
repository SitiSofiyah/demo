/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import edu.aabu.jpademo.Book;
import java.net.URI;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Application;
/**
 *
 * @author webdev
 */
@Path("bookbook")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class BookRestService {

    @PersistenceContext(unitName = "json-demoPU")
    private EntityManager em;
    @Context
    private UriInfo uriInfo;

    @POST
    public Response createBook(Book book) throws Exception {
        if (book == null) {
            throw new Exception();
        }
        em.persist(book);
        URI bookUri = uriInfo.getAbsolutePathBuilder().path(""+book.getId()).build();
        return Response.created(bookUri).build();
    }
}