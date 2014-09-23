
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains information about the school.
 * 
 * <p>Java class for gSchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSchoolType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEducationOrganizationType">
 *       &lt;sequence>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="externalIdList" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdList" minOccurs="0"/>
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="otherLEA" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolType" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="schoolFocusList" type="{http://www.sifassociation.org/datamodel/na/3.2}gSchoolFocusList" minOccurs="0"/>
 *         &lt;element name="schoolURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="schoolContactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schoolContact" type="{http://www.sifassociation.org/datamodel/na/3.2}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberList" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberList" minOccurs="0"/>
 *         &lt;element name="emailList" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailList" minOccurs="0"/>
 *         &lt;element name="yearGroupList" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gOperationalStatusType" minOccurs="0"/>
 *         &lt;element name="electoralDistrict" type="{http://www.sifassociation.org/datamodel/na/3.2}gElectoralDistrictType" minOccurs="0"/>
 *         &lt;element name="schoolSector" type="{http://www.sifassociation.org/datamodel/na/3.2}gSchoolSectorType" minOccurs="0"/>
 *         &lt;element name="genderOfEntry" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenderOfEntryType" minOccurs="0"/>
 *         &lt;element name="boardingSchoolStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSchoolType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "localId",
    "externalIdList",
    "schoolName",
    "leaRefId",
    "otherLEA",
    "schoolType",
    "schoolFocusList",
    "schoolURL",
    "schoolContactList",
    "phoneNumberList",
    "emailList",
    "yearGroupList",
    "operationalStatus",
    "electoralDistrict",
    "schoolSector",
    "genderOfEntry",
    "boardingSchoolStatus"
})
@XmlSeeAlso({
    SchoolType.class
})
public class GSchoolType
    extends GEducationOrganizationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExternalIdList externalIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schoolName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String otherLEA;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType schoolType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSchoolFocusList schoolFocusList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String schoolURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSchoolType.SchoolContactList schoolContactList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GPhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GEmailList emailList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYearGroupList yearGroupList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GOperationalStatusType operationalStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GElectoralDistrictType electoralDistrict;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolSector;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String genderOfEntry;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType boardingSchoolStatus;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setLocalId(GLocalIdType value) {
        this.localId = value;
    }

    /**
     * Gets the value of the externalIdList property.
     * 
     * @return
     *     possible object is
     *     {@link GExternalIdList }
     *     
     */
    public GExternalIdList getExternalIdList() {
        return externalIdList;
    }

    /**
     * Sets the value of the externalIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExternalIdList }
     *     
     */
    public void setExternalIdList(GExternalIdList value) {
        this.externalIdList = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the leaRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * Sets the value of the leaRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaRefId(String value) {
        this.leaRefId = value;
    }

    /**
     * Gets the value of the otherLEA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLEA() {
        return otherLEA;
    }

    /**
     * Sets the value of the otherLEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLEA(String value) {
        this.otherLEA = value;
    }

    /**
     * Gets the value of the schoolType property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getSchoolType() {
        return schoolType;
    }

    /**
     * Sets the value of the schoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setSchoolType(GLaxCodedElementType value) {
        this.schoolType = value;
    }

    /**
     * Gets the value of the schoolFocusList property.
     * 
     * @return
     *     possible object is
     *     {@link GSchoolFocusList }
     *     
     */
    public GSchoolFocusList getSchoolFocusList() {
        return schoolFocusList;
    }

    /**
     * Sets the value of the schoolFocusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSchoolFocusList }
     *     
     */
    public void setSchoolFocusList(GSchoolFocusList value) {
        this.schoolFocusList = value;
    }

    /**
     * Gets the value of the schoolURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolURL() {
        return schoolURL;
    }

    /**
     * Sets the value of the schoolURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolURL(String value) {
        this.schoolURL = value;
    }

    /**
     * Gets the value of the schoolContactList property.
     * 
     * @return
     *     possible object is
     *     {@link GSchoolType.SchoolContactList }
     *     
     */
    public GSchoolType.SchoolContactList getSchoolContactList() {
        return schoolContactList;
    }

    /**
     * Sets the value of the schoolContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSchoolType.SchoolContactList }
     *     
     */
    public void setSchoolContactList(GSchoolType.SchoolContactList value) {
        this.schoolContactList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link GPhoneNumberList }
     *     
     */
    public GPhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPhoneNumberList }
     *     
     */
    public void setPhoneNumberList(GPhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link GEmailList }
     *     
     */
    public GEmailList getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEmailList }
     *     
     */
    public void setEmailList(GEmailList value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the yearGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupList }
     *     
     */
    public GYearGroupList getYearGroupList() {
        return yearGroupList;
    }

    /**
     * Sets the value of the yearGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupList }
     *     
     */
    public void setYearGroupList(GYearGroupList value) {
        this.yearGroupList = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GOperationalStatusType }
     *     
     */
    public GOperationalStatusType getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOperationalStatusType }
     *     
     */
    public void setOperationalStatus(GOperationalStatusType value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the electoralDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link GElectoralDistrictType }
     *     
     */
    public GElectoralDistrictType getElectoralDistrict() {
        return electoralDistrict;
    }

    /**
     * Sets the value of the electoralDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link GElectoralDistrictType }
     *     
     */
    public void setElectoralDistrict(GElectoralDistrictType value) {
        this.electoralDistrict = value;
    }

    /**
     * Gets the value of the schoolSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolSector() {
        return schoolSector;
    }

    /**
     * Sets the value of the schoolSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolSector(String value) {
        this.schoolSector = value;
    }

    /**
     * Gets the value of the genderOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderOfEntry() {
        return genderOfEntry;
    }

    /**
     * Sets the value of the genderOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderOfEntry(String value) {
        this.genderOfEntry = value;
    }

    /**
     * Gets the value of the boardingSchoolStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getBoardingSchoolStatus() {
        return boardingSchoolStatus;
    }

    /**
     * Sets the value of the boardingSchoolStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setBoardingSchoolStatus(GYesNoUnknownType value) {
        this.boardingSchoolStatus = value;
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
     *         &lt;element name="schoolContact" type="{http://www.sifassociation.org/datamodel/na/3.2}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "schoolContact"
    })
    public static class SchoolContactList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GContactPersonType> schoolContact;

        /**
         * Gets the value of the schoolContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schoolContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchoolContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GContactPersonType }
         * 
         * 
         */
        public List<GContactPersonType> getSchoolContact() {
            if (schoolContact == null) {
                schoolContact = new ArrayList<GContactPersonType>();
            }
            return this.schoolContact;
        }

    }

}
