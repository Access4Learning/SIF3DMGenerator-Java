
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The FQItem being reported on.
 * 
 * <p>Java class for FQItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TuitionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BoardingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SystemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DioceseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FQComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqItemCode",
    "tuitionAmount",
    "boardingAmount",
    "systemAmount",
    "dioceseAmount",
    "fqComments"
})
public class FQItemType {

    @XmlElement(name = "FQItemCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String fqItemCode;
    @XmlElementRef(name = "TuitionAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tuitionAmount;
    @XmlElementRef(name = "BoardingAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> boardingAmount;
    @XmlElementRef(name = "SystemAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> systemAmount;
    @XmlElementRef(name = "DioceseAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dioceseAmount;
    @XmlElement(name = "FQComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String fqComments;

    /**
     * Gets the value of the fqItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQItemCode() {
        return fqItemCode;
    }

    /**
     * Sets the value of the fqItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQItemCode(String value) {
        this.fqItemCode = value;
    }

    /**
     * Gets the value of the tuitionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTuitionAmount() {
        return tuitionAmount;
    }

    /**
     * Sets the value of the tuitionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTuitionAmount(JAXBElement<BigDecimal> value) {
        this.tuitionAmount = value;
    }

    /**
     * Gets the value of the boardingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBoardingAmount() {
        return boardingAmount;
    }

    /**
     * Sets the value of the boardingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBoardingAmount(JAXBElement<BigDecimal> value) {
        this.boardingAmount = value;
    }

    /**
     * Gets the value of the systemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSystemAmount() {
        return systemAmount;
    }

    /**
     * Sets the value of the systemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSystemAmount(JAXBElement<BigDecimal> value) {
        this.systemAmount = value;
    }

    /**
     * Gets the value of the dioceseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDioceseAmount() {
        return dioceseAmount;
    }

    /**
     * Sets the value of the dioceseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDioceseAmount(JAXBElement<BigDecimal> value) {
        this.dioceseAmount = value;
    }

    /**
     * Gets the value of the fqComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQComments() {
        return fqComments;
    }

    /**
     * Sets the value of the fqComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQComments(String value) {
        this.fqComments = value;
    }

}
