
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PermissionToParticipateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionToParticipateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionCategory" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Permission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PermissionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PermissionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PermissionGranteeRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PermissionGranteeObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PermissionGranteeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PermissionGranteeRelationship" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PermissionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionToParticipateType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "permissionCategory",
    "permission",
    "permissionValue",
    "permissionStartDate",
    "permissionEndDate",
    "permissionGranteeRefId",
    "permissionGranteeObjectTypeName",
    "permissionGranteeName",
    "permissionGranteeRelationship",
    "permissionComments"
})
public class PermissionToParticipateType {

    @XmlElement(name = "PermissionCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String permissionCategory;
    @XmlElement(name = "Permission", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String permission;
    @XmlElementRef(name = "PermissionValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionValue;
    @XmlElementRef(name = "PermissionStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> permissionStartDate;
    @XmlElementRef(name = "PermissionEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> permissionEndDate;
    @XmlElementRef(name = "PermissionGranteeRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionGranteeRefId;
    @XmlElementRef(name = "PermissionGranteeObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionGranteeObjectTypeName;
    @XmlElementRef(name = "PermissionGranteeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionGranteeName;
    @XmlElementRef(name = "PermissionGranteeRelationship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionGranteeRelationship;
    @XmlElementRef(name = "PermissionComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionComments;

    /**
     * Gets the value of the permissionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionCategory() {
        return permissionCategory;
    }

    /**
     * Sets the value of the permissionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionCategory(String value) {
        this.permissionCategory = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission(String value) {
        this.permission = value;
    }

    /**
     * Gets the value of the permissionValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionValue() {
        return permissionValue;
    }

    /**
     * Sets the value of the permissionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionValue(JAXBElement<String> value) {
        this.permissionValue = value;
    }

    /**
     * Gets the value of the permissionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPermissionStartDate() {
        return permissionStartDate;
    }

    /**
     * Sets the value of the permissionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPermissionStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.permissionStartDate = value;
    }

    /**
     * Gets the value of the permissionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPermissionEndDate() {
        return permissionEndDate;
    }

    /**
     * Sets the value of the permissionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPermissionEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.permissionEndDate = value;
    }

    /**
     * Gets the value of the permissionGranteeRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionGranteeRefId() {
        return permissionGranteeRefId;
    }

    /**
     * Sets the value of the permissionGranteeRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionGranteeRefId(JAXBElement<String> value) {
        this.permissionGranteeRefId = value;
    }

    /**
     * Gets the value of the permissionGranteeObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionGranteeObjectTypeName() {
        return permissionGranteeObjectTypeName;
    }

    /**
     * Sets the value of the permissionGranteeObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionGranteeObjectTypeName(JAXBElement<String> value) {
        this.permissionGranteeObjectTypeName = value;
    }

    /**
     * Gets the value of the permissionGranteeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionGranteeName() {
        return permissionGranteeName;
    }

    /**
     * Sets the value of the permissionGranteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionGranteeName(JAXBElement<String> value) {
        this.permissionGranteeName = value;
    }

    /**
     * Gets the value of the permissionGranteeRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionGranteeRelationship() {
        return permissionGranteeRelationship;
    }

    /**
     * Sets the value of the permissionGranteeRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionGranteeRelationship(JAXBElement<String> value) {
        this.permissionGranteeRelationship = value;
    }

    /**
     * Gets the value of the permissionComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionComments() {
        return permissionComments;
    }

    /**
     * Sets the value of the permissionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionComments(JAXBElement<String> value) {
        this.permissionComments = value;
    }

}
