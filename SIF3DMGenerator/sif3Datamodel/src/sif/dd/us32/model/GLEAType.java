
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
 * This object contains information about a school district, region, or other Local, State or Jurisdiction Educational Authority.
 * 
 * <p>Java class for gLEAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLEAType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEducationOrganizationType">
 *       &lt;sequence>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="externalIdList" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdList" minOccurs="0"/>
 *         &lt;element name="leaName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="leaURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="educationAgencyType" type="{http://www.sifassociation.org/datamodel/na/3.2}gLeaTypeType" minOccurs="0"/>
 *         &lt;element name="leaContactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leaContact" type="{http://www.sifassociation.org/datamodel/na/3.2}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLEAType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "localId",
    "externalIdList",
    "leaName",
    "leaURL",
    "educationAgencyType",
    "leaContactList",
    "phoneNumberList",
    "emailList",
    "yearGroupList",
    "operationalStatus",
    "electoralDistrict"
})
@XmlSeeAlso({
    LeaType.class
})
public class GLEAType
    extends GEducationOrganizationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExternalIdList externalIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String leaName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String leaURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String educationAgencyType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLEAType.LeaContactList leaContactList;
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
     * Gets the value of the leaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaName() {
        return leaName;
    }

    /**
     * Sets the value of the leaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaName(String value) {
        this.leaName = value;
    }

    /**
     * Gets the value of the leaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaURL() {
        return leaURL;
    }

    /**
     * Sets the value of the leaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaURL(String value) {
        this.leaURL = value;
    }

    /**
     * Gets the value of the educationAgencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationAgencyType() {
        return educationAgencyType;
    }

    /**
     * Sets the value of the educationAgencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationAgencyType(String value) {
        this.educationAgencyType = value;
    }

    /**
     * Gets the value of the leaContactList property.
     * 
     * @return
     *     possible object is
     *     {@link GLEAType.LeaContactList }
     *     
     */
    public GLEAType.LeaContactList getLeaContactList() {
        return leaContactList;
    }

    /**
     * Sets the value of the leaContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLEAType.LeaContactList }
     *     
     */
    public void setLeaContactList(GLEAType.LeaContactList value) {
        this.leaContactList = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="leaContact" type="{http://www.sifassociation.org/datamodel/na/3.2}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "leaContact"
    })
    public static class LeaContactList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GContactPersonType> leaContact;

        /**
         * Gets the value of the leaContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leaContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeaContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GContactPersonType }
         * 
         * 
         */
        public List<GContactPersonType> getLeaContact() {
            if (leaContact == null) {
                leaContact = new ArrayList<GContactPersonType>();
            }
            return this.leaContact;
        }

    }

}
