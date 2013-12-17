/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author webdev
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCard {

    @XmlAttribute(required = true)
    private String number;
    @XmlElement(name = "expiry-date", defaultValue = "01/10")
    private String expiryDate;
    private String type;
    @XmlElement(name = "control-number")
    private Integer controlNumber;

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the controlNumber
     */
    public Integer getControlNumber() {
        return controlNumber;
    }

    /**
     * @param controlNumber the controlNumber to set
     */
    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }
}
