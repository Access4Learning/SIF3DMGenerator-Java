
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
 * Optional campus details.
 * 
 * <p>Java class for CampusContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampusContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentSchoolId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SchoolCampusId" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="CampusType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolLevelType" minOccurs="0"/>
 *         &lt;element name="AdminStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampusContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "parentSchoolId",
    "schoolCampusId",
    "campusType",
    "adminStatus"
})
public class CampusContainerType {

    @XmlElementRef(name = "ParentSchoolId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentSchoolId;
    @XmlElement(name = "SchoolCampusId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schoolCampusId;
    @XmlElementRef(name = "CampusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsSchoolLevelType> campusType;
    @XmlElement(name = "AdminStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AUCodeSetsYesOrNoCategoryType adminStatus;

    /**
     * Gets the value of the parentSchoolId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentSchoolId() {
        return parentSchoolId;
    }

    /**
     * Sets the value of the parentSchoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentSchoolId(JAXBElement<String> value) {
        this.parentSchoolId = value;
    }

    /**
     * Gets the value of the schoolCampusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCampusId() {
        return schoolCampusId;
    }

    /**
     * Sets the value of the schoolCampusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCampusId(String value) {
        this.schoolCampusId = value;
    }

    /**
     * Gets the value of the campusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsSchoolLevelType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsSchoolLevelType> getCampusType() {
        return campusType;
    }

    /**
     * Sets the value of the campusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsSchoolLevelType }{@code >}
     *     
     */
    public void setCampusType(JAXBElement<AUCodeSetsSchoolLevelType> value) {
        this.campusType = value;
    }

    /**
     * Gets the value of the adminStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public AUCodeSetsYesOrNoCategoryType getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets the value of the adminStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public void setAdminStatus(AUCodeSetsYesOrNoCategoryType value) {
        this.adminStatus = value;
    }

}
