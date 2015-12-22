
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gOrganizationUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gOrganizationUserType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOrganizationAssociationType">
 *       &lt;sequence>
 *         &lt;element name="associationType" type="{http://www.sifassociation.org/datamodel/na/3.3}gAssociationTypeType"/>
 *         &lt;element name="associatedRole" type="{http://www.sifassociation.org/datamodel/na/3.3}gRoleTypeType"/>
 *         &lt;element name="originalAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType"/>
 *         &lt;element name="personRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="educationalOrgRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gOrganizationUserType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "associationType",
    "associatedRole",
    "originalAssociationRefId",
    "personRefId",
    "educationalOrgRefId",
    "startDate",
    "endDate"
})
public class GOrganizationUserType
    extends GOrganizationAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String associationType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String associatedRole;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GGenericRefIdPointerType originalAssociationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GGenericRefIdPointerType personRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GGenericRefIdPointerType educationalOrgRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationType(String value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the associatedRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedRole() {
        return associatedRole;
    }

    /**
     * Sets the value of the associatedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedRole(String value) {
        this.associatedRole = value;
    }

    /**
     * Gets the value of the originalAssociationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getOriginalAssociationRefId() {
        return originalAssociationRefId;
    }

    /**
     * Sets the value of the originalAssociationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setOriginalAssociationRefId(GGenericRefIdPointerType value) {
        this.originalAssociationRefId = value;
    }

    /**
     * Gets the value of the personRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getPersonRefId() {
        return personRefId;
    }

    /**
     * Sets the value of the personRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setPersonRefId(GGenericRefIdPointerType value) {
        this.personRefId = value;
    }

    /**
     * Gets the value of the educationalOrgRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getEducationalOrgRefId() {
        return educationalOrgRefId;
    }

    /**
     * Sets the value of the educationalOrgRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setEducationalOrgRefId(GGenericRefIdPointerType value) {
        this.educationalOrgRefId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
