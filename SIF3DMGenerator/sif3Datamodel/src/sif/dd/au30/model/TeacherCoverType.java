
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TeacherCoverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeacherCoverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="StaffLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Credit" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsTeacherCoverCreditType" minOccurs="0"/>
 *         &lt;element name="Supervision" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsTeacherCoverSupervisionType" minOccurs="0"/>
 *         &lt;element name="Weighting" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeacherCoverType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "staffPersonalRefId",
    "staffLocalId",
    "startTime",
    "finishTime",
    "credit",
    "supervision",
    "weighting"
})
public class TeacherCoverType {

    @XmlElement(name = "StaffPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonalRefId;
    @XmlElementRef(name = "StaffLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> staffLocalId;
    @XmlElementRef(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "FinishTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishTime;
    @XmlElementRef(name = "Credit", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsTeacherCoverCreditType> credit;
    @XmlElementRef(name = "Supervision", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsTeacherCoverSupervisionType> supervision;
    @XmlElementRef(name = "Weighting", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> weighting;

    /**
     * Gets the value of the staffPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonalRefId() {
        return staffPersonalRefId;
    }

    /**
     * Sets the value of the staffPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonalRefId(String value) {
        this.staffPersonalRefId = value;
    }

    /**
     * Gets the value of the staffLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaffLocalId() {
        return staffLocalId;
    }

    /**
     * Sets the value of the staffLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaffLocalId(JAXBElement<String> value) {
        this.staffLocalId = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishTime(JAXBElement<XMLGregorianCalendar> value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverCreditType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsTeacherCoverCreditType> getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverCreditType }{@code >}
     *     
     */
    public void setCredit(JAXBElement<AUCodeSetsTeacherCoverCreditType> value) {
        this.credit = value;
    }

    /**
     * Gets the value of the supervision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverSupervisionType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsTeacherCoverSupervisionType> getSupervision() {
        return supervision;
    }

    /**
     * Sets the value of the supervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverSupervisionType }{@code >}
     *     
     */
    public void setSupervision(JAXBElement<AUCodeSetsTeacherCoverSupervisionType> value) {
        this.supervision = value;
    }

    /**
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWeighting(JAXBElement<BigDecimal> value) {
        this.weighting = value;
    }

}
