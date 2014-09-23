
package sif.dd.us32.model.composite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains all the personal information related to the student.
 * 
 * <p>Java class for gStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gStudentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gLearnerType">
 *       &lt;sequence>
 *         &lt;element name="alertMessageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alertMessage" type="{http://www.sifassociation.org/datamodel/na/3.2}gAlertMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="medicalAlertMessageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="medicalAlertMessage" type="{http://www.sifassociation.org/datamodel/na/3.2}gMedicalAlertMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="projectedGraduationYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="onTimeGraduationYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="graduationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="giftedTalented" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="economicDisadvantage" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="firstNationalEnrollment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gStudentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "alertMessageList",
    "medicalAlertMessageList",
    "projectedGraduationYear",
    "onTimeGraduationYear",
    "graduationDate",
    "giftedTalented",
    "economicDisadvantage",
    "firstNationalEnrollment"
})
public class GStudentType
    extends GLearnerType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GStudentType.AlertMessageList alertMessageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GStudentType.MedicalAlertMessageList medicalAlertMessageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar projectedGraduationYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar onTimeGraduationYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graduationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType giftedTalented;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType economicDisadvantage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstNationalEnrollment;

    /**
     * Gets the value of the alertMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link GStudentType.AlertMessageList }
     *     
     */
    public GStudentType.AlertMessageList getAlertMessageList() {
        return alertMessageList;
    }

    /**
     * Sets the value of the alertMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStudentType.AlertMessageList }
     *     
     */
    public void setAlertMessageList(GStudentType.AlertMessageList value) {
        this.alertMessageList = value;
    }

    /**
     * Gets the value of the medicalAlertMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link GStudentType.MedicalAlertMessageList }
     *     
     */
    public GStudentType.MedicalAlertMessageList getMedicalAlertMessageList() {
        return medicalAlertMessageList;
    }

    /**
     * Sets the value of the medicalAlertMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStudentType.MedicalAlertMessageList }
     *     
     */
    public void setMedicalAlertMessageList(GStudentType.MedicalAlertMessageList value) {
        this.medicalAlertMessageList = value;
    }

    /**
     * Gets the value of the projectedGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    /**
     * Sets the value of the projectedGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedGraduationYear(XMLGregorianCalendar value) {
        this.projectedGraduationYear = value;
    }

    /**
     * Gets the value of the onTimeGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnTimeGraduationYear() {
        return onTimeGraduationYear;
    }

    /**
     * Sets the value of the onTimeGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnTimeGraduationYear(XMLGregorianCalendar value) {
        this.onTimeGraduationYear = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduationDate(XMLGregorianCalendar value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the giftedTalented property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getGiftedTalented() {
        return giftedTalented;
    }

    /**
     * Sets the value of the giftedTalented property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setGiftedTalented(GYesNoUnknownType value) {
        this.giftedTalented = value;
    }

    /**
     * Gets the value of the economicDisadvantage property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getEconomicDisadvantage() {
        return economicDisadvantage;
    }

    /**
     * Sets the value of the economicDisadvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setEconomicDisadvantage(GYesNoUnknownType value) {
        this.economicDisadvantage = value;
    }

    /**
     * Gets the value of the firstNationalEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstNationalEnrollment() {
        return firstNationalEnrollment;
    }

    /**
     * Sets the value of the firstNationalEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstNationalEnrollment(XMLGregorianCalendar value) {
        this.firstNationalEnrollment = value;
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
     *         &lt;element name="alertMessage" type="{http://www.sifassociation.org/datamodel/na/3.2}gAlertMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
        "alertMessage"
    })
    public static class AlertMessageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GAlertMessageType> alertMessage;

        /**
         * Gets the value of the alertMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alertMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlertMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GAlertMessageType }
         * 
         * 
         */
        public List<GAlertMessageType> getAlertMessage() {
            if (alertMessage == null) {
                alertMessage = new ArrayList<GAlertMessageType>();
            }
            return this.alertMessage;
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
     *         &lt;element name="medicalAlertMessage" type="{http://www.sifassociation.org/datamodel/na/3.2}gMedicalAlertMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
        "medicalAlertMessage"
    })
    public static class MedicalAlertMessageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GMedicalAlertMessageType> medicalAlertMessage;

        /**
         * Gets the value of the medicalAlertMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medicalAlertMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedicalAlertMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GMedicalAlertMessageType }
         * 
         * 
         */
        public List<GMedicalAlertMessageType> getMedicalAlertMessage() {
            if (medicalAlertMessage == null) {
                medicalAlertMessage = new ArrayList<GMedicalAlertMessageType>();
            }
            return this.medicalAlertMessage;
        }

    }

}
