/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import edu.aabu.jpademo.GroupTbl;
import edu.aabu.jpademo.GroupTblPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author webdev
 */
@Stateless
@Path("edu.aabu.jpademo.grouptbl")
public class GroupTblFacadeREST extends AbstractFacade<GroupTbl> {
    @PersistenceContext(unitName = "json-demoPU")
    private EntityManager em;

    private GroupTblPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;groupNo=groupNoValue;groupSubNo1=groupSubNo1Value;groupSubNo=groupSubNoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        edu.aabu.jpademo.GroupTblPK key = new edu.aabu.jpademo.GroupTblPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> groupNo = map.get("groupNo");
        if (groupNo != null && !groupNo.isEmpty()) {
            key.setGroupNo(new java.lang.Short(groupNo.get(0)));
        }
        java.util.List<String> groupSubNo1 = map.get("groupSubNo1");
        if (groupSubNo1 != null && !groupSubNo1.isEmpty()) {
            key.setGroupSubNo1(new java.lang.Short(groupSubNo1.get(0)));
        }
        java.util.List<String> groupSubNo = map.get("groupSubNo");
        if (groupSubNo != null && !groupSubNo.isEmpty()) {
            key.setGroupSubNo(new java.lang.Short(groupSubNo.get(0)));
        }
        return key;
    }

    public GroupTblFacadeREST() {
        super(GroupTbl.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(GroupTbl entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(GroupTbl entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        edu.aabu.jpademo.GroupTblPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public GroupTbl find(@PathParam("id") PathSegment id) {
        edu.aabu.jpademo.GroupTblPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<GroupTbl> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<GroupTbl> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
