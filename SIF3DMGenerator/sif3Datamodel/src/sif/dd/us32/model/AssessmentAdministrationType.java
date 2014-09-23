
package sif.dd.us32.model;

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
 * This object represents an assessment event. It includes information related to the time of administration, place of administration, and unusual events related to the administration.
 * 
 * <p>Java class for assessmentAdministrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentAdministrationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEventType">
 *       &lt;sequence>
 *         &lt;element name="administrationName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="administrationCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="finishDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asessmentRefIdList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="organizationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentAdministrationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "administrationName",
    "administrationCode",
    "startDateTime",
    "finishDateTime",
    "asessmentRefIdList",
    "organizationList"
})
public class AssessmentAdministrationType
    extends GEventType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String administrationName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String administrationCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected AssessmentAdministrationType.AsessmentRefIdList asessmentRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentAdministrationType.OrganizationList organizationList;

    /**
     * Gets the value of the administrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationName() {
        return administrationName;
    }

    /**
     * Sets the value of the administrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationName(String value) {
        this.administrationName = value;
    }

    /**
     * Gets the value of the administrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationCode() {
        return administrationCode;
    }

    /**
     * Sets the value of the administrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationCode(String value) {
        this.administrationCode = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the finishDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDateTime() {
        return finishDateTime;
    }

    /**
     * Sets the value of the finishDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDateTime(XMLGregorianCalendar value) {
        this.finishDateTime = value;
    }

    /**
     * Gets the value of the asessmentRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAdministrationType.AsessmentRefIdList }
     *     
     */
    public AssessmentAdministrationType.AsessmentRefIdList getAsessmentRefIdList() {
        return asessmentRefIdList;
    }

    /**
     * Sets the value of the asessmentRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAdministrationType.AsessmentRefIdList }
     *     
     */
    public void setAsessmentRefIdList(AssessmentAdministrationType.AsessmentRefIdList value) {
        this.asessmentRefIdList = value;
    }

    /**
     * Gets the value of the organizationList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAdministrationType.OrganizationList }
     *     
     */
    public AssessmentAdministrationType.OrganizationList getOrganizationList() {
        return organizationList;
    }

    /**
     * Sets the value of the organizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAdministrationType.OrganizationList }
     *     
     */
    public void setOrganizationList(AssessmentAdministrationType.OrganizationList value) {
        this.organizationList = value;
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
     *         &lt;element name="assessmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentRefId"
    })
    public static class AsessmentRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assessmentRefId;

        /**
         * Gets the value of the assessmentRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentRefId() {
            if (assessmentRefId == null) {
                assessmentRefId = new ArrayList<String>();
            }
            return this.assessmentRefId;
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
     *         &lt;element name="organization" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
        "organization"
    })
    public static class OrganizationList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentAdministrationType.OrganizationList.Organization> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentAdministrationType.OrganizationList.Organization }
         * 
         * 
         */
        public List<AssessmentAdministrationType.OrganizationList.Organization> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<AssessmentAdministrationType.OrganizationList.Organization>();
            }
            return this.organization;
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
         *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
            "leaRefId",
            "schoolRefId"
        })
        public static class Organization {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String leaRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String schoolRefId;

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
             * Gets the value of the schoolRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolRefId() {
                return schoolRefId;
            }

            /**
             * Sets the value of the schoolRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolRefId(String value) {
                this.schoolRefId = value;
            }

        }

    }

}
