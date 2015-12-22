
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xFoodServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xFoodServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilityStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}xFoodServiceEligibilityType" minOccurs="0"/>
 *         &lt;element name="enrollmentStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}xFoodServiceEnrollmentType" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xFoodServiceType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "eligibilityStatus",
    "enrollmentStatus",
    "any"
})
public class XFoodServiceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XFoodServiceEligibilityType eligibilityStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XFoodServiceEnrollmentType enrollmentStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XFoodServiceEligibilityType }
     *     
     */
    public XFoodServiceEligibilityType getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFoodServiceEligibilityType }
     *     
     */
    public void setEligibilityStatus(XFoodServiceEligibilityType value) {
        this.eligibilityStatus = value;
    }

    /**
     * Gets the value of the enrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XFoodServiceEnrollmentType }
     *     
     */
    public XFoodServiceEnrollmentType getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Sets the value of the enrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFoodServiceEnrollmentType }
     *     
     */
    public void setEnrollmentStatus(XFoodServiceEnrollmentType value) {
        this.enrollmentStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
