
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xSpecialEducationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSpecialEducationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="schoolAttended" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="residentSchool" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="iepCompletionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="eligibilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="exitReason" type="{http://www.sifassociation.org/datamodel/na/3.3}xSpecialEducationExitReasonType" minOccurs="0"/>
 *         &lt;element name="placementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="placementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="section504Status" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="awaitingInitialIdeaEvaluation" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="disabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="disability" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fteRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="service" type="{http://www.sifassociation.org/datamodel/na/3.3}xSpecialEducationServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSpecialEducationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "schoolYear",
    "schoolAttended",
    "residentSchool",
    "iepCompletionDate",
    "eligibilityDate",
    "startDate",
    "exitDate",
    "exitReason",
    "placementType",
    "placementDescription",
    "disabilityStatus",
    "section504Status",
    "awaitingInitialIdeaEvaluation",
    "disabilities",
    "fteRatio",
    "services",
    "any"
})
public class XSpecialEducationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType schoolAttended;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType residentSchool;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar iepCompletionDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eligibilityDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSpecialEducationExitReasonType exitReason;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placementType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String placementDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType disabilityStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType section504Status;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType awaitingInitialIdeaEvaluation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSpecialEducationType.Disabilities disabilities;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal fteRatio;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSpecialEducationType.Services services;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the schoolAttended property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchoolAttended() {
        return schoolAttended;
    }

    /**
     * Sets the value of the schoolAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchoolAttended(XSchoolType value) {
        this.schoolAttended = value;
    }

    /**
     * Gets the value of the residentSchool property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getResidentSchool() {
        return residentSchool;
    }

    /**
     * Sets the value of the residentSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setResidentSchool(XSchoolType value) {
        this.residentSchool = value;
    }

    /**
     * Gets the value of the iepCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIepCompletionDate() {
        return iepCompletionDate;
    }

    /**
     * Sets the value of the iepCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIepCompletionDate(XMLGregorianCalendar value) {
        this.iepCompletionDate = value;
    }

    /**
     * Gets the value of the eligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEligibilityDate() {
        return eligibilityDate;
    }

    /**
     * Sets the value of the eligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEligibilityDate(XMLGregorianCalendar value) {
        this.eligibilityDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitDate(XMLGregorianCalendar value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the exitReason property.
     * 
     * @return
     *     possible object is
     *     {@link XSpecialEducationExitReasonType }
     *     
     */
    public XSpecialEducationExitReasonType getExitReason() {
        return exitReason;
    }

    /**
     * Sets the value of the exitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSpecialEducationExitReasonType }
     *     
     */
    public void setExitReason(XSpecialEducationExitReasonType value) {
        this.exitReason = value;
    }

    /**
     * Gets the value of the placementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementType() {
        return placementType;
    }

    /**
     * Sets the value of the placementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementType(String value) {
        this.placementType = value;
    }

    /**
     * Gets the value of the placementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementDescription() {
        return placementDescription;
    }

    /**
     * Sets the value of the placementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementDescription(String value) {
        this.placementDescription = value;
    }

    /**
     * Gets the value of the disabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getDisabilityStatus() {
        return disabilityStatus;
    }

    /**
     * Sets the value of the disabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setDisabilityStatus(GYesNoUnknownType value) {
        this.disabilityStatus = value;
    }

    /**
     * Gets the value of the section504Status property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSection504Status() {
        return section504Status;
    }

    /**
     * Sets the value of the section504Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSection504Status(GYesNoUnknownType value) {
        this.section504Status = value;
    }

    /**
     * Gets the value of the awaitingInitialIdeaEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getAwaitingInitialIdeaEvaluation() {
        return awaitingInitialIdeaEvaluation;
    }

    /**
     * Sets the value of the awaitingInitialIdeaEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setAwaitingInitialIdeaEvaluation(GYesNoUnknownType value) {
        this.awaitingInitialIdeaEvaluation = value;
    }

    /**
     * Gets the value of the disabilities property.
     * 
     * @return
     *     possible object is
     *     {@link XSpecialEducationType.Disabilities }
     *     
     */
    public XSpecialEducationType.Disabilities getDisabilities() {
        return disabilities;
    }

    /**
     * Sets the value of the disabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSpecialEducationType.Disabilities }
     *     
     */
    public void setDisabilities(XSpecialEducationType.Disabilities value) {
        this.disabilities = value;
    }

    /**
     * Gets the value of the fteRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFteRatio() {
        return fteRatio;
    }

    /**
     * Sets the value of the fteRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFteRatio(BigDecimal value) {
        this.fteRatio = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link XSpecialEducationType.Services }
     *     
     */
    public XSpecialEducationType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSpecialEducationType.Services }
     *     
     */
    public void setServices(XSpecialEducationType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     *         &lt;element name="disability" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisabilityType" maxOccurs="unbounded" minOccurs="0"/>
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
        "disability"
    })
    public static class Disabilities {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XDisabilityType> disability;

        /**
         * Gets the value of the disability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDisabilityType }
         * 
         * 
         */
        public List<XDisabilityType> getDisability() {
            if (disability == null) {
                disability = new ArrayList<XDisabilityType>();
            }
            return this.disability;
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
     *         &lt;element name="service" type="{http://www.sifassociation.org/datamodel/na/3.3}xSpecialEducationServiceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "service"
    })
    public static class Services {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XSpecialEducationServiceType> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSpecialEducationServiceType }
         * 
         * 
         */
        public List<XSpecialEducationServiceType> getService() {
            if (service == null) {
                service = new ArrayList<XSpecialEducationServiceType>();
            }
            return this.service;
        }

    }

}
