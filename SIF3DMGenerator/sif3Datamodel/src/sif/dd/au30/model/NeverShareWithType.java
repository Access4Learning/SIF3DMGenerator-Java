
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
 * <p>Java class for NeverShareWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeverShareWithType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeverShareWithParty" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="NeverShareWithRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NeverShareWithObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="NeverShareWithLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="NeverShareWithName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="NeverShareWithRelationship" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="NeverShareWithPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeverShareWithRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeverShareWithComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeverShareWithURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeverShareWithType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "neverShareWithParty",
    "neverShareWithRefId",
    "neverShareWithObjectTypeName",
    "neverShareWithLocalId",
    "neverShareWithName",
    "neverShareWithRelationship",
    "neverShareWithPurpose",
    "neverShareWithRole",
    "neverShareWithComments",
    "neverShareWithURL"
})
public class NeverShareWithType {

    @XmlElement(name = "NeverShareWithParty", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String neverShareWithParty;
    @XmlElementRef(name = "NeverShareWithRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithRefId;
    @XmlElementRef(name = "NeverShareWithObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithObjectTypeName;
    @XmlElementRef(name = "NeverShareWithLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithLocalId;
    @XmlElementRef(name = "NeverShareWithName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithName;
    @XmlElementRef(name = "NeverShareWithRelationship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithRelationship;
    @XmlElement(name = "NeverShareWithPurpose", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String neverShareWithPurpose;
    @XmlElement(name = "NeverShareWithRole", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String neverShareWithRole;
    @XmlElementRef(name = "NeverShareWithComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithComments;
    @XmlElementRef(name = "NeverShareWithURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neverShareWithURL;

    /**
     * Gets the value of the neverShareWithParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeverShareWithParty() {
        return neverShareWithParty;
    }

    /**
     * Sets the value of the neverShareWithParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeverShareWithParty(String value) {
        this.neverShareWithParty = value;
    }

    /**
     * Gets the value of the neverShareWithRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithRefId() {
        return neverShareWithRefId;
    }

    /**
     * Sets the value of the neverShareWithRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithRefId(JAXBElement<String> value) {
        this.neverShareWithRefId = value;
    }

    /**
     * Gets the value of the neverShareWithObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithObjectTypeName() {
        return neverShareWithObjectTypeName;
    }

    /**
     * Sets the value of the neverShareWithObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithObjectTypeName(JAXBElement<String> value) {
        this.neverShareWithObjectTypeName = value;
    }

    /**
     * Gets the value of the neverShareWithLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithLocalId() {
        return neverShareWithLocalId;
    }

    /**
     * Sets the value of the neverShareWithLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithLocalId(JAXBElement<String> value) {
        this.neverShareWithLocalId = value;
    }

    /**
     * Gets the value of the neverShareWithName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithName() {
        return neverShareWithName;
    }

    /**
     * Sets the value of the neverShareWithName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithName(JAXBElement<String> value) {
        this.neverShareWithName = value;
    }

    /**
     * Gets the value of the neverShareWithRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithRelationship() {
        return neverShareWithRelationship;
    }

    /**
     * Sets the value of the neverShareWithRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithRelationship(JAXBElement<String> value) {
        this.neverShareWithRelationship = value;
    }

    /**
     * Gets the value of the neverShareWithPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeverShareWithPurpose() {
        return neverShareWithPurpose;
    }

    /**
     * Sets the value of the neverShareWithPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeverShareWithPurpose(String value) {
        this.neverShareWithPurpose = value;
    }

    /**
     * Gets the value of the neverShareWithRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeverShareWithRole() {
        return neverShareWithRole;
    }

    /**
     * Sets the value of the neverShareWithRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeverShareWithRole(String value) {
        this.neverShareWithRole = value;
    }

    /**
     * Gets the value of the neverShareWithComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithComments() {
        return neverShareWithComments;
    }

    /**
     * Sets the value of the neverShareWithComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithComments(JAXBElement<String> value) {
        this.neverShareWithComments = value;
    }

    /**
     * Gets the value of the neverShareWithURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeverShareWithURL() {
        return neverShareWithURL;
    }

    /**
     * Sets the value of the neverShareWithURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeverShareWithURL(JAXBElement<String> value) {
        this.neverShareWithURL = value;
    }

}
