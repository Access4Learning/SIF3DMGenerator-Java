
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
 * <p>Java class for CensusReportingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusReportingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityContact" type="{http://www.sifassociation.org/datamodel/au/3.4}EntityContactInfoType" minOccurs="0"/>
 *         &lt;element name="CensusStaffList" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusStaffListType" minOccurs="0"/>
 *         &lt;element name="CensusStudentList" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusStudentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusReportingType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "entityLevel",
    "commonwealthId",
    "entityName",
    "entityContact",
    "censusStaffList",
    "censusStudentList"
})
public class CensusReportingType {

    @XmlElementRef(name = "EntityLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityLevel;
    @XmlElement(name = "CommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String commonwealthId;
    @XmlElementRef(name = "EntityName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElement(name = "EntityContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected EntityContactInfoType entityContact;
    @XmlElementRef(name = "CensusStaffList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CensusStaffListType> censusStaffList;
    @XmlElementRef(name = "CensusStudentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CensusStudentListType> censusStudentList;

    /**
     * Gets the value of the entityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityLevel() {
        return entityLevel;
    }

    /**
     * Sets the value of the entityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityLevel(JAXBElement<String> value) {
        this.entityLevel = value;
    }

    /**
     * Gets the value of the commonwealthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonwealthId() {
        return commonwealthId;
    }

    /**
     * Sets the value of the commonwealthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonwealthId(String value) {
        this.commonwealthId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityContact property.
     * 
     * @return
     *     possible object is
     *     {@link EntityContactInfoType }
     *     
     */
    public EntityContactInfoType getEntityContact() {
        return entityContact;
    }

    /**
     * Sets the value of the entityContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityContactInfoType }
     *     
     */
    public void setEntityContact(EntityContactInfoType value) {
        this.entityContact = value;
    }

    /**
     * Gets the value of the censusStaffList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CensusStaffListType }{@code >}
     *     
     */
    public JAXBElement<CensusStaffListType> getCensusStaffList() {
        return censusStaffList;
    }

    /**
     * Sets the value of the censusStaffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CensusStaffListType }{@code >}
     *     
     */
    public void setCensusStaffList(JAXBElement<CensusStaffListType> value) {
        this.censusStaffList = value;
    }

    /**
     * Gets the value of the censusStudentList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CensusStudentListType }{@code >}
     *     
     */
    public JAXBElement<CensusStudentListType> getCensusStudentList() {
        return censusStudentList;
    }

    /**
     * Sets the value of the censusStudentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CensusStudentListType }{@code >}
     *     
     */
    public void setCensusStudentList(JAXBElement<CensusStudentListType> value) {
        this.censusStudentList = value;
    }

}
