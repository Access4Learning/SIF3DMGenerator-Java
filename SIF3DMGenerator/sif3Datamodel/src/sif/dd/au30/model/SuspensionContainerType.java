
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SuspensionContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuspensionContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuspensionCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSuspensionCategoryType" minOccurs="0"/>
 *         &lt;element name="WithdrawalTimeList" type="{http://www.sifassociation.org/datamodel/au/3.4}WithdrawalTimeListType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdvisementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResolutionMeetingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ResolutionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarlyReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuspensionContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "suspensionCategory",
    "withdrawalTimeList",
    "duration",
    "advisementDate",
    "resolutionMeetingTime",
    "resolutionNotes",
    "earlyReturnDate",
    "status"
})
public class SuspensionContainerType {

    @XmlElement(name = "SuspensionCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsSuspensionCategoryType suspensionCategory;
    @XmlElementRef(name = "WithdrawalTimeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WithdrawalTimeListType> withdrawalTimeList;
    @XmlElementRef(name = "Duration", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> duration;
    @XmlElementRef(name = "AdvisementDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> advisementDate;
    @XmlElementRef(name = "ResolutionMeetingTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Calendar> resolutionMeetingTime;
    @XmlElementRef(name = "ResolutionNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolutionNotes;
    @XmlElementRef(name = "EarlyReturnDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> earlyReturnDate;
    @XmlElementRef(name = "Status", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingStatusType> status;

    /**
     * Gets the value of the suspensionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsSuspensionCategoryType }
     *     
     */
    public AUCodeSetsSuspensionCategoryType getSuspensionCategory() {
        return suspensionCategory;
    }

    /**
     * Sets the value of the suspensionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsSuspensionCategoryType }
     *     
     */
    public void setSuspensionCategory(AUCodeSetsSuspensionCategoryType value) {
        this.suspensionCategory = value;
    }

    /**
     * Gets the value of the withdrawalTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WithdrawalTimeListType }{@code >}
     *     
     */
    public JAXBElement<WithdrawalTimeListType> getWithdrawalTimeList() {
        return withdrawalTimeList;
    }

    /**
     * Sets the value of the withdrawalTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WithdrawalTimeListType }{@code >}
     *     
     */
    public void setWithdrawalTimeList(JAXBElement<WithdrawalTimeListType> value) {
        this.withdrawalTimeList = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDuration(JAXBElement<BigDecimal> value) {
        this.duration = value;
    }

    /**
     * Gets the value of the advisementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdvisementDate() {
        return advisementDate;
    }

    /**
     * Sets the value of the advisementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdvisementDate(JAXBElement<XMLGregorianCalendar> value) {
        this.advisementDate = value;
    }

    /**
     * Gets the value of the resolutionMeetingTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     *     
     */
    public JAXBElement<Calendar> getResolutionMeetingTime() {
        return resolutionMeetingTime;
    }

    /**
     * Sets the value of the resolutionMeetingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     *     
     */
    public void setResolutionMeetingTime(JAXBElement<Calendar> value) {
        this.resolutionMeetingTime = value;
    }

    /**
     * Gets the value of the resolutionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolutionNotes() {
        return resolutionNotes;
    }

    /**
     * Sets the value of the resolutionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolutionNotes(JAXBElement<String> value) {
        this.resolutionNotes = value;
    }

    /**
     * Gets the value of the earlyReturnDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEarlyReturnDate() {
        return earlyReturnDate;
    }

    /**
     * Sets the value of the earlyReturnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEarlyReturnDate(JAXBElement<XMLGregorianCalendar> value) {
        this.earlyReturnDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingStatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<AUCodeSetsWellbeingStatusType> value) {
        this.status = value;
    }

}
