/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement ;
/**
 *
 * @author webdev
 */
@XmlRootElement(namespace = "aabu.book",name = "book")
public class JaxBDemo {
        private Date pubDate ;
        private String name ;
        private String author ;

    /**
     * @return the pubDate
     */
        @XmlElement(name = "publication_date")
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * @param pubDate the pubDate to set
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * @return the name
     */
    @XmlElement(defaultValue = "no title provided",name = "title")
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
