
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentContactsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentContactsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentGuardian1" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentContactSummaryType"/>
 *         &lt;element name="ParentGuardian2" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentContactSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentContactsSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "parentGuardian1",
    "parentGuardian2"
})
public class StudentContactsSummaryType {

    @XmlElement(name = "ParentGuardian1", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentContactSummaryType parentGuardian1;
    @XmlElement(name = "ParentGuardian2", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentContactSummaryType parentGuardian2;

    /**
     * Gets the value of the parentGuardian1 property.
     * 
     * @return
     *     possible object is
     *     {@link StudentContactSummaryType }
     *     
     */
    public StudentContactSummaryType getParentGuardian1() {
        return parentGuardian1;
    }

    /**
     * Sets the value of the parentGuardian1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentContactSummaryType }
     *     
     */
    public void setParentGuardian1(StudentContactSummaryType value) {
        this.parentGuardian1 = value;
    }

    /**
     * Gets the value of the parentGuardian2 property.
     * 
     * @return
     *     possible object is
     *     {@link StudentContactSummaryType }
     *     
     */
    public StudentContactSummaryType getParentGuardian2() {
        return parentGuardian2;
    }

    /**
     * Sets the value of the parentGuardian2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentContactSummaryType }
     *     
     */
    public void setParentGuardian2(StudentContactSummaryType value) {
        this.parentGuardian2 = value;
    }

}
