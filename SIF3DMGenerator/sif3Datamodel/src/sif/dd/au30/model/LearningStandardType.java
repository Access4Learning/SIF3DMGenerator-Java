
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LearningStandardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningStandardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="LearningStandardURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="LearningStandardLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningStandardType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "learningStandardItemRefId",
    "learningStandardURL",
    "learningStandardLocalId"
})
public class LearningStandardType {

    @XmlElementRef(name = "LearningStandardItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> learningStandardItemRefId;
    @XmlElementRef(name = "LearningStandardURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> learningStandardURL;
    @XmlElementRef(name = "LearningStandardLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> learningStandardLocalId;

    /**
     * Gets the value of the learningStandardItemRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLearningStandardItemRefId() {
        return learningStandardItemRefId;
    }

    /**
     * Sets the value of the learningStandardItemRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLearningStandardItemRefId(JAXBElement<String> value) {
        this.learningStandardItemRefId = value;
    }

    /**
     * Gets the value of the learningStandardURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLearningStandardURL() {
        return learningStandardURL;
    }

    /**
     * Sets the value of the learningStandardURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLearningStandardURL(JAXBElement<String> value) {
        this.learningStandardURL = value;
    }

    /**
     * Gets the value of the learningStandardLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLearningStandardLocalId() {
        return learningStandardLocalId;
    }

    /**
     * Sets the value of the learningStandardLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLearningStandardLocalId(JAXBElement<String> value) {
        this.learningStandardLocalId = value;
    }

}
