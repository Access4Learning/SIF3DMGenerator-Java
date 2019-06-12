
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiepReferenceObjectsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiepReferenceObjectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="student" type="{http://www.sifassociation.org/datamodel/na/4.x}xStudentType" minOccurs="0"/>
 *         &lt;element name="leaList" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepReferenceObjectLeaListType" minOccurs="0"/>
 *         &lt;element name="contactList" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepReferenceObjectContactListType" minOccurs="0"/>
 *         &lt;element name="staffList" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepReferenceObjectStaffListType" minOccurs="0"/>
 *         &lt;element name="organizationList" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepReferenceObjectOrganizationListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiepReferenceObjectsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "student",
    "leaList",
    "contactList",
    "staffList",
    "organizationList"
})
public class TiepReferenceObjectsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XStudentType student;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepReferenceObjectLeaListType leaList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepReferenceObjectContactListType contactList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepReferenceObjectStaffListType staffList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepReferenceObjectOrganizationListType organizationList;

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link XStudentType }
     *     
     */
    public XStudentType getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStudentType }
     *     
     */
    public void setStudent(XStudentType value) {
        this.student = value;
    }

    /**
     * Gets the value of the leaList property.
     * 
     * @return
     *     possible object is
     *     {@link TiepReferenceObjectLeaListType }
     *     
     */
    public TiepReferenceObjectLeaListType getLeaList() {
        return leaList;
    }

    /**
     * Sets the value of the leaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepReferenceObjectLeaListType }
     *     
     */
    public void setLeaList(TiepReferenceObjectLeaListType value) {
        this.leaList = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link TiepReferenceObjectContactListType }
     *     
     */
    public TiepReferenceObjectContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepReferenceObjectContactListType }
     *     
     */
    public void setContactList(TiepReferenceObjectContactListType value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the staffList property.
     * 
     * @return
     *     possible object is
     *     {@link TiepReferenceObjectStaffListType }
     *     
     */
    public TiepReferenceObjectStaffListType getStaffList() {
        return staffList;
    }

    /**
     * Sets the value of the staffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepReferenceObjectStaffListType }
     *     
     */
    public void setStaffList(TiepReferenceObjectStaffListType value) {
        this.staffList = value;
    }

    /**
     * Gets the value of the organizationList property.
     * 
     * @return
     *     possible object is
     *     {@link TiepReferenceObjectOrganizationListType }
     *     
     */
    public TiepReferenceObjectOrganizationListType getOrganizationList() {
        return organizationList;
    }

    /**
     * Sets the value of the organizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepReferenceObjectOrganizationListType }
     *     
     */
    public void setOrganizationList(TiepReferenceObjectOrganizationListType value) {
        this.organizationList = value;
    }

}
