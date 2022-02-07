
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
 * <p>Java class for ShareWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareWithType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareWithParty" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ShareWithRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ShareWithObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ShareWithLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="ShareWithName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ShareWithRelationship" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ShareWithPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareWithRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareWithComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionToOnShare" type="{http://www.sifassociation.org/datamodel/au/3.4}GenericYesNoType" minOccurs="0"/>
 *         &lt;element name="ShareWithURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareWithType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "shareWithParty",
    "shareWithRefId",
    "shareWithObjectTypeName",
    "shareWithLocalId",
    "shareWithName",
    "shareWithRelationship",
    "shareWithPurpose",
    "shareWithRole",
    "shareWithComments",
    "permissionToOnShare",
    "shareWithURL"
})
public class ShareWithType {

    @XmlElement(name = "ShareWithParty", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shareWithParty;
    @XmlElementRef(name = "ShareWithRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithRefId;
    @XmlElementRef(name = "ShareWithObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithObjectTypeName;
    @XmlElementRef(name = "ShareWithLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithLocalId;
    @XmlElementRef(name = "ShareWithName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithName;
    @XmlElementRef(name = "ShareWithRelationship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithRelationship;
    @XmlElement(name = "ShareWithPurpose", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String shareWithPurpose;
    @XmlElement(name = "ShareWithRole", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String shareWithRole;
    @XmlElementRef(name = "ShareWithComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithComments;
    @XmlElement(name = "PermissionToOnShare", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected GenericYesNoType permissionToOnShare;
    @XmlElementRef(name = "ShareWithURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareWithURL;

    /**
     * Gets the value of the shareWithParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithParty() {
        return shareWithParty;
    }

    /**
     * Sets the value of the shareWithParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithParty(String value) {
        this.shareWithParty = value;
    }

    /**
     * Gets the value of the shareWithRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithRefId() {
        return shareWithRefId;
    }

    /**
     * Sets the value of the shareWithRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithRefId(JAXBElement<String> value) {
        this.shareWithRefId = value;
    }

    /**
     * Gets the value of the shareWithObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithObjectTypeName() {
        return shareWithObjectTypeName;
    }

    /**
     * Sets the value of the shareWithObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithObjectTypeName(JAXBElement<String> value) {
        this.shareWithObjectTypeName = value;
    }

    /**
     * Gets the value of the shareWithLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithLocalId() {
        return shareWithLocalId;
    }

    /**
     * Sets the value of the shareWithLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithLocalId(JAXBElement<String> value) {
        this.shareWithLocalId = value;
    }

    /**
     * Gets the value of the shareWithName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithName() {
        return shareWithName;
    }

    /**
     * Sets the value of the shareWithName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithName(JAXBElement<String> value) {
        this.shareWithName = value;
    }

    /**
     * Gets the value of the shareWithRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithRelationship() {
        return shareWithRelationship;
    }

    /**
     * Sets the value of the shareWithRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithRelationship(JAXBElement<String> value) {
        this.shareWithRelationship = value;
    }

    /**
     * Gets the value of the shareWithPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithPurpose() {
        return shareWithPurpose;
    }

    /**
     * Sets the value of the shareWithPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithPurpose(String value) {
        this.shareWithPurpose = value;
    }

    /**
     * Gets the value of the shareWithRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithRole() {
        return shareWithRole;
    }

    /**
     * Sets the value of the shareWithRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithRole(String value) {
        this.shareWithRole = value;
    }

    /**
     * Gets the value of the shareWithComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithComments() {
        return shareWithComments;
    }

    /**
     * Sets the value of the shareWithComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithComments(JAXBElement<String> value) {
        this.shareWithComments = value;
    }

    /**
     * Gets the value of the permissionToOnShare property.
     * 
     * @return
     *     possible object is
     *     {@link GenericYesNoType }
     *     
     */
    public GenericYesNoType getPermissionToOnShare() {
        return permissionToOnShare;
    }

    /**
     * Sets the value of the permissionToOnShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericYesNoType }
     *     
     */
    public void setPermissionToOnShare(GenericYesNoType value) {
        this.permissionToOnShare = value;
    }

    /**
     * Gets the value of the shareWithURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareWithURL() {
        return shareWithURL;
    }

    /**
     * Sets the value of the shareWithURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareWithURL(JAXBElement<String> value) {
        this.shareWithURL = value;
    }

}
