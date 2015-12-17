
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         This object contains all the personal information relating to a staff member, who might be a teacher or other employee of the school or district.
 *       
 * 
 * <p>Java class for StaffPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/3.4}LocalId" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/au/datamodel/3.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/au/datamodel/3.4}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherId" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/3.4}PersonInfo" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsStaffStatusType" minOccurs="0"/>
 *         &lt;element name="MostRecent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *                   &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *                   &lt;element name="LocalCampusId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *                   &lt;element name="NAPLANClassList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HomeGroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffPersonalType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
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

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElementRef(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectronicIdListType> electronicIdList;
    @XmlElementRef(name = "OtherIdList", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffPersonalType.OtherIdList> otherIdList;
    @XmlElement(name = "PersonInfo", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected PersonInfoType personInfo;
    @XmlElementRef(name = "Title", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsStaffStatusType> employmentStatus;
    @XmlElementRef(name = "MostRecent", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffPersonalType.MostRecent> mostRecent;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
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
     *     {@link JAXBElement }{@code <}{@link StaffPersonalType.OtherIdList }{@code >}
     *     
     */
    public JAXBElement<StaffPersonalType.OtherIdList> getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffPersonalType.OtherIdList }{@code >}
     *     
     */
    public void setOtherIdList(JAXBElement<StaffPersonalType.OtherIdList> value) {
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
     *     {@link JAXBElement }{@code <}{@link StaffPersonalType.MostRecent }{@code >}
     *     
     */
    public JAXBElement<StaffPersonalType.MostRecent> getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffPersonalType.MostRecent }{@code >}
     *     
     */
    public void setMostRecent(JAXBElement<StaffPersonalType.MostRecent> value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
     *         &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
     *         &lt;element name="LocalCampusId" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
     *         &lt;element name="NAPLANClassList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "schoolLocalId",
        "schoolACARAId",
        "localCampusId",
        "naplanClassList",
        "homeGroup"
    })
    public static class MostRecent {

        @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> schoolLocalId;
        @XmlElementRef(name = "SchoolACARAId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> schoolACARAId;
        @XmlElementRef(name = "LocalCampusId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> localCampusId;
        @XmlElementRef(name = "NAPLANClassList", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<StaffPersonalType.MostRecent.NAPLANClassList> naplanClassList;
        @XmlElementRef(name = "HomeGroup", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
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
         *     {@link JAXBElement }{@code <}{@link StaffPersonalType.MostRecent.NAPLANClassList }{@code >}
         *     
         */
        public JAXBElement<StaffPersonalType.MostRecent.NAPLANClassList> getNAPLANClassList() {
            return naplanClassList;
        }

        /**
         * Sets the value of the naplanClassList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link StaffPersonalType.MostRecent.NAPLANClassList }{@code >}
         *     
         */
        public void setNAPLANClassList(JAXBElement<StaffPersonalType.MostRecent.NAPLANClassList> value) {
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "classCode"
        })
        public static class NAPLANClassList {

            @XmlElement(name = "ClassCode", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected List<String> classCode;

            /**
             * Gets the value of the classCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the classCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClassCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getClassCode() {
                if (classCode == null) {
                    classCode = new ArrayList<String>();
                }
                return this.classCode;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherId" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
     *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherId"
    })
    public static class OtherIdList {

        @XmlElement(name = "OtherId", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
        protected List<StaffPersonalType.OtherIdList.OtherId> otherId;

        /**
         * Gets the value of the otherId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaffPersonalType.OtherIdList.OtherId }
         * 
         * 
         */
        public List<StaffPersonalType.OtherIdList.OtherId> getOtherId() {
            if (otherId == null) {
                otherId = new ArrayList<StaffPersonalType.OtherIdList.OtherId>();
            }
            return this.otherId;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
         *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OtherId {

            @XmlValue
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String value;
            @XmlAttribute(name = "Type", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
