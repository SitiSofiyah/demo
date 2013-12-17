/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author webdev
 */
@Entity
@XmlRootElement
@NamedQuery(name="Book.findAll",query = "select b from Book b")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title ;
    private Float price ;
    private String description ;
    private String isbn ;
    private Integer numOfPages ;
    private Boolean illustration ;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.aabu.jpademo.Book[ id=" + getId() + " ]";
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the numOfPages
     */
    public Integer getNumOfPages() {
        return numOfPages;
    }

    /**
     * @param numOfPages the numOfPages to set
     */
    public void setNumOfPages(Integer numOfPages) {
        this.numOfPages = numOfPages;
    }

    /**
     * @return the illustration
     */
    public Boolean getIllustration() {
        return illustration;
    }

    /**
     * @param illustration the illustration to set
     */
    public void setIllustration(Boolean illustration) {
        this.illustration = illustration;
    }
    
}
