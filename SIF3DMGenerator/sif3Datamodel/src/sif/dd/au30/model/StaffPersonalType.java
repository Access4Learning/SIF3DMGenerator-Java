
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StaffPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}OtherIdListType" minOccurs="0"/>
 *         &lt;element name="PersonInfo" type="{http://www.sifassociation.org/datamodel/au/3.4.1}PersonInfoType"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsStaffStatusType" minOccurs="0"/>
 *         &lt;element name="MostRecent" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StaffMostRecentContainerType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffPersonalType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "localId",
    "stateProvinceId",
    "electronicIdList",
    "otherIdList",
    "personInfo",
    "title",
    "employmentStatus",
    "mostRecent",
    "sifMetadata",
    "sifExtendedElements"
})
public class StaffPersonalType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElementRef(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectronicIdListType> electronicIdList;
    @XmlElementRef(name = "OtherIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OtherIdListType> otherIdList;
    @XmlElement(name = "PersonInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected PersonInfoType personInfo;
    @XmlElementRef(name = "Title", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsStaffStatusType> employmentStatus;
    @XmlElementRef(name = "MostRecent", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffMostRecentContainerType> mostRecent;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceId(JAXBElement<String> value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public JAXBElement<ElectronicIdListType> getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public void setElectronicIdList(JAXBElement<ElectronicIdListType> value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}
     *     
     */
    public JAXBElement<OtherIdListType> getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}
     *     
     */
    public void setOtherIdList(JAXBElement<OtherIdListType> value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsStaffStatusType> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}
     *     
     */
    public void setEmploymentStatus(JAXBElement<AUCodeSetsStaffStatusType> value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the mostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StaffMostRecentContainerType }{@code >}
     *     
     */
    public JAXBElement<StaffMostRecentContainerType> getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffMostRecentContainerType }{@code >}
     *     
     */
    public void setMostRecent(JAXBElement<StaffMostRecentContainerType> value) {
        this.mostRecent = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
