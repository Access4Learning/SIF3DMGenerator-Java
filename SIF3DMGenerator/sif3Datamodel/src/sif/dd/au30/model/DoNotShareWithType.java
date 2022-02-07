
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DoNotShareWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoNotShareWithType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DoNotShareWithParty" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithRelationship" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoNotShareWithType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "doNotShareWithParty",
    "doNotShareWithRefId",
    "doNotShareWithObjectTypeName",
    "doNotShareWithLocalId",
    "doNotShareWithName",
    "doNotShareWithRelationship",
    "doNotShareWithPurpose",
    "doNotShareWithRole",
    "doNotShareWithComments",
    "doNotShareWithURL"
})
public class DoNotShareWithType {

    @XmlElement(name = "DoNotShareWithParty", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String doNotShareWithParty;
    @XmlElementRef(name = "DoNotShareWithRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithRefId;
    @XmlElementRef(name = "DoNotShareWithObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithObjectTypeName;
    @XmlElementRef(name = "DoNotShareWithLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithLocalId;
    @XmlElementRef(name = "DoNotShareWithName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithName;
    @XmlElementRef(name = "DoNotShareWithRelationship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithRelationship;
    @XmlElement(name = "DoNotShareWithPurpose", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String doNotShareWithPurpose;
    @XmlElement(name = "DoNotShareWithRole", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String doNotShareWithRole;
    @XmlElementRef(name = "DoNotShareWithComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithComments;
    @XmlElementRef(name = "DoNotShareWithURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotShareWithURL;

    /**
     * Gets the value of the doNotShareWithParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotShareWithParty() {
        return doNotShareWithParty;
    }

    /**
     * Sets the value of the doNotShareWithParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotShareWithParty(String value) {
        this.doNotShareWithParty = value;
    }

    /**
     * Gets the value of the doNotShareWithRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithRefId() {
        return doNotShareWithRefId;
    }

    /**
     * Sets the value of the doNotShareWithRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithRefId(JAXBElement<String> value) {
        this.doNotShareWithRefId = value;
    }

    /**
     * Gets the value of the doNotShareWithObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithObjectTypeName() {
        return doNotShareWithObjectTypeName;
    }

    /**
     * Sets the value of the doNotShareWithObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithObjectTypeName(JAXBElement<String> value) {
        this.doNotShareWithObjectTypeName = value;
    }

    /**
     * Gets the value of the doNotShareWithLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithLocalId() {
        return doNotShareWithLocalId;
    }

    /**
     * Sets the value of the doNotShareWithLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithLocalId(JAXBElement<String> value) {
        this.doNotShareWithLocalId = value;
    }

    /**
     * Gets the value of the doNotShareWithName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithName() {
        return doNotShareWithName;
    }

    /**
     * Sets the value of the doNotShareWithName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithName(JAXBElement<String> value) {
        this.doNotShareWithName = value;
    }

    /**
     * Gets the value of the doNotShareWithRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithRelationship() {
        return doNotShareWithRelationship;
    }

    /**
     * Sets the value of the doNotShareWithRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithRelationship(JAXBElement<String> value) {
        this.doNotShareWithRelationship = value;
    }

    /**
     * Gets the value of the doNotShareWithPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotShareWithPurpose() {
        return doNotShareWithPurpose;
    }

    /**
     * Sets the value of the doNotShareWithPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotShareWithPurpose(String value) {
        this.doNotShareWithPurpose = value;
    }

    /**
     * Gets the value of the doNotShareWithRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotShareWithRole() {
        return doNotShareWithRole;
    }

    /**
     * Sets the value of the doNotShareWithRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotShareWithRole(String value) {
        this.doNotShareWithRole = value;
    }

    /**
     * Gets the value of the doNotShareWithComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithComments() {
        return doNotShareWithComments;
    }

    /**
     * Sets the value of the doNotShareWithComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithComments(JAXBElement<String> value) {
        this.doNotShareWithComments = value;
    }

    /**
     * Gets the value of the doNotShareWithURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotShareWithURL() {
        return doNotShareWithURL;
    }

    /**
     * Sets the value of the doNotShareWithURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotShareWithURL(JAXBElement<String> value) {
        this.doNotShareWithURL = value;
    }

}
