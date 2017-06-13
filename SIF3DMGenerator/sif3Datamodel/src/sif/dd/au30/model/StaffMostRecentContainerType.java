
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for elements reflecting the most recent assignment of a staff member. If the staff member is currently assigned, the elements contain current information.
 *       
 * 
 * <p>Java class for StaffMostRecentContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffMostRecentContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="LocalCampusId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="NAPLANClassList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPLANClassListType" minOccurs="0"/>
 *         &lt;element name="HomeGroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffMostRecentContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolLocalId",
    "schoolACARAId",
    "localCampusId",
    "naplanClassList",
    "homeGroup"
})
public class StaffMostRecentContainerType {

    @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolLocalId;
    @XmlElementRef(name = "SchoolACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolACARAId;
    @XmlElementRef(name = "LocalCampusId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localCampusId;
    @XmlElementRef(name = "NAPLANClassList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<NAPLANClassListType> naplanClassList;
    @XmlElementRef(name = "HomeGroup", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeGroup;

    /**
     * Gets the value of the schoolLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolLocalId() {
        return schoolLocalId;
    }

    /**
     * Sets the value of the schoolLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolLocalId(JAXBElement<String> value) {
        this.schoolLocalId = value;
    }

    /**
     * Gets the value of the schoolACARAId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolACARAId() {
        return schoolACARAId;
    }

    /**
     * Sets the value of the schoolACARAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolACARAId(JAXBElement<String> value) {
        this.schoolACARAId = value;
    }

    /**
     * Gets the value of the localCampusId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalCampusId() {
        return localCampusId;
    }

    /**
     * Sets the value of the localCampusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalCampusId(JAXBElement<String> value) {
        this.localCampusId = value;
    }

    /**
     * Gets the value of the naplanClassList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NAPLANClassListType }{@code >}
     *     
     */
    public JAXBElement<NAPLANClassListType> getNAPLANClassList() {
        return naplanClassList;
    }

    /**
     * Sets the value of the naplanClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NAPLANClassListType }{@code >}
     *     
     */
    public void setNAPLANClassList(JAXBElement<NAPLANClassListType> value) {
        this.naplanClassList = value;
    }

    /**
     * Gets the value of the homeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeGroup() {
        return homeGroup;
    }

    /**
     * Sets the value of the homeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeGroup(JAXBElement<String> value) {
        this.homeGroup = value;
    }

}
