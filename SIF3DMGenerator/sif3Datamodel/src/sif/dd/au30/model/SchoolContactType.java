
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublishInDirectory" type="{http://www.sifassociation.org/datamodel/au/3.4.1}PublishInDirectoryType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.sifassociation.org/datamodel/au/3.4.1}ContactInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolContactType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "publishInDirectory",
    "contactInfo"
})
public class SchoolContactType {

    @XmlElementRef(name = "PublishInDirectory", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> publishInDirectory;
    @XmlElement(name = "ContactInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected ContactInfoType contactInfo;

    /**
     * Gets the value of the publishInDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getPublishInDirectory() {
        return publishInDirectory;
    }

    /**
     * Sets the value of the publishInDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setPublishInDirectory(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.publishInDirectory = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

}
