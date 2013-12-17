package edu.aabu.jpademo.controller;

import edu.aabu.jpademo.Book;
import edu.aabu.jpademo.jsf.BookFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "bookController")
@ViewScoped
public class BookController extends AbstractController<Book> implements Serializable {

    @EJB
    private BookFacade ejbFacade;

    public BookController() {
        super(Book.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
