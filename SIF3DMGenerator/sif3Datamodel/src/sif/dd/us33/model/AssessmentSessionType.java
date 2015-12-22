
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object represents a specific assessment event that occurs in a specific location at a specific time for a group of students all taking the same test. It also includes information related to unusual events that occur during the session.
 * 
 * <p>Java class for assessmentSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSessionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gEventType">
 *       &lt;sequence>
 *         &lt;element name="sessionName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="unusualEventList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unusualEvent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="sif_Action" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scheduledStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scheduledEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.3}gAddressType" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentFormRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolInfoRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="staffPersonalRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="staffPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentSessionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "sessionName",
    "sessionType",
    "unusualEventList",
    "scheduledStartDateTime",
    "scheduledEndDateTime",
    "actualStartDateTime",
    "actualEndDateTime",
    "address",
    "assessmentAdministrationRefId",
    "assessmentRefId",
    "assessmentFormRefId",
    "leaRefId",
    "schoolInfoRefId",
    "staffPersonalRefIdList"
})
public class AssessmentSessionType
    extends GEventType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sessionName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sessionType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentSessionType.UnusualEventList unusualEventList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentAdministrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentFormRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentSessionType.StaffPersonalRefIdList staffPersonalRefIdList;

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(String value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the unusualEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSessionType.UnusualEventList }
     *     
     */
    public AssessmentSessionType.UnusualEventList getUnusualEventList() {
        return unusualEventList;
    }

    /**
     * Sets the value of the unusualEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSessionType.UnusualEventList }
     *     
     */
    public void setUnusualEventList(AssessmentSessionType.UnusualEventList value) {
        this.unusualEventList = value;
    }

    /**
     * Gets the value of the scheduledStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledStartDateTime() {
        return scheduledStartDateTime;
    }

    /**
     * Sets the value of the scheduledStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledStartDateTime(XMLGregorianCalendar value) {
        this.scheduledStartDateTime = value;
    }

    /**
     * Gets the value of the scheduledEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledEndDateTime() {
        return scheduledEndDateTime;
    }

    /**
     * Sets the value of the scheduledEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledEndDateTime(XMLGregorianCalendar value) {
        this.scheduledEndDateTime = value;
    }

    /**
     * Gets the value of the actualStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartDateTime() {
        return actualStartDateTime;
    }

    /**
     * Sets the value of the actualStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartDateTime(XMLGregorianCalendar value) {
        this.actualStartDateTime = value;
    }

    /**
     * Gets the value of the actualEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndDateTime() {
        return actualEndDateTime;
    }

    /**
     * Sets the value of the actualEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndDateTime(XMLGregorianCalendar value) {
        this.actualEndDateTime = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GAddressType }
     *     
     */
    public GAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GAddressType }
     *     
     */
    public void setAddress(GAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the assessmentAdministrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationRefId() {
        return assessmentAdministrationRefId;
    }

    /**
     * Sets the value of the assessmentAdministrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationRefId(String value) {
        this.assessmentAdministrationRefId = value;
    }

    /**
     * Gets the value of the assessmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRefId() {
        return assessmentRefId;
    }

    /**
     * Sets the value of the assessmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRefId(String value) {
        this.assessmentRefId = value;
    }

    /**
     * Gets the value of the assessmentFormRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormRefId() {
        return assessmentFormRefId;
    }

    /**
     * Sets the value of the assessmentFormRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormRefId(String value) {
        this.assessmentFormRefId = value;
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
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the staffPersonalRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSessionType.StaffPersonalRefIdList }
     *     
     */
    public AssessmentSessionType.StaffPersonalRefIdList getStaffPersonalRefIdList() {
        return staffPersonalRefIdList;
    }

    /**
     * Sets the value of the staffPersonalRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSessionType.StaffPersonalRefIdList }
     *     
     */
    public void setStaffPersonalRefIdList(AssessmentSessionType.StaffPersonalRefIdList value) {
        this.staffPersonalRefIdList = value;
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
     *         &lt;element name="staffPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "staffPersonalRefId"
    })
    public static class StaffPersonalRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> staffPersonalRefId;

        /**
         * Gets the value of the staffPersonalRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the staffPersonalRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStaffPersonalRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStaffPersonalRefId() {
            if (staffPersonalRefId == null) {
                staffPersonalRefId = new ArrayList<String>();
            }
            return this.staffPersonalRefId;
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
     *         &lt;element name="unusualEvent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="sif_Action" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "unusualEvent"
    })
    public static class UnusualEventList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentSessionType.UnusualEventList.UnusualEvent> unusualEvent;

        /**
         * Gets the value of the unusualEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unusualEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnusualEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSessionType.UnusualEventList.UnusualEvent }
         * 
         * 
         */
        public List<AssessmentSessionType.UnusualEventList.UnusualEvent> getUnusualEvent() {
            if (unusualEvent == null) {
                unusualEvent = new ArrayList<AssessmentSessionType.UnusualEventList.UnusualEvent>();
            }
            return this.unusualEvent;
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
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="sif_Action" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "code",
            "sifAction"
        })
        public static class UnusualEvent {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String code;
            @XmlElement(name = "sif_Action", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String sifAction;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the sifAction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSifAction() {
                return sifAction;
            }

            /**
             * Sets the value of the sifAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSifAction(String value) {
                this.sifAction = value;
            }

        }

    }

}
