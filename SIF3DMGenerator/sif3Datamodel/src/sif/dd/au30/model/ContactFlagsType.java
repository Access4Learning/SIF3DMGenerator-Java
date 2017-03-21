
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactFlagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactFlagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentLegalGuardian" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="PickupRights" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="LivesWith" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="AccessToRecords" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ReceivesAssessmentReport" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="EmergencyContact" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="HasCustody" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="DisciplinaryContact" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="AttendanceContact" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="PrimaryCareProvider" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="FeesBilling" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="FamilyMail" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="InterventionOrder" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactFlagsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "parentLegalGuardian",
    "pickupRights",
    "livesWith",
    "accessToRecords",
    "receivesAssessmentReport",
    "emergencyContact",
    "hasCustody",
    "disciplinaryContact",
    "attendanceContact",
    "primaryCareProvider",
    "feesBilling",
    "familyMail",
    "interventionOrder"
})
public class ContactFlagsType {

    @XmlElementRef(name = "ParentLegalGuardian", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> parentLegalGuardian;
    @XmlElementRef(name = "PickupRights", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> pickupRights;
    @XmlElementRef(name = "LivesWith", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> livesWith;
    @XmlElementRef(name = "AccessToRecords", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> accessToRecords;
    @XmlElementRef(name = "ReceivesAssessmentReport", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> receivesAssessmentReport;
    @XmlElementRef(name = "EmergencyContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> emergencyContact;
    @XmlElementRef(name = "HasCustody", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> hasCustody;
    @XmlElementRef(name = "DisciplinaryContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> disciplinaryContact;
    @XmlElementRef(name = "AttendanceContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> attendanceContact;
    @XmlElementRef(name = "PrimaryCareProvider", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> primaryCareProvider;
    @XmlElementRef(name = "FeesBilling", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> feesBilling;
    @XmlElementRef(name = "FamilyMail", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> familyMail;
    @XmlElementRef(name = "InterventionOrder", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> interventionOrder;

    /**
     * Gets the value of the parentLegalGuardian property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getParentLegalGuardian() {
        return parentLegalGuardian;
    }

    /**
     * Sets the value of the parentLegalGuardian property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setParentLegalGuardian(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.parentLegalGuardian = value;
    }

    /**
     * Gets the value of the pickupRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getPickupRights() {
        return pickupRights;
    }

    /**
     * Sets the value of the pickupRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setPickupRights(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.pickupRights = value;
    }

    /**
     * Gets the value of the livesWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getLivesWith() {
        return livesWith;
    }

    /**
     * Sets the value of the livesWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setLivesWith(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.livesWith = value;
    }

    /**
     * Gets the value of the accessToRecords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getAccessToRecords() {
        return accessToRecords;
    }

    /**
     * Sets the value of the accessToRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setAccessToRecords(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.accessToRecords = value;
    }

    /**
     * Gets the value of the receivesAssessmentReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getReceivesAssessmentReport() {
        return receivesAssessmentReport;
    }

    /**
     * Sets the value of the receivesAssessmentReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setReceivesAssessmentReport(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.receivesAssessmentReport = value;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setEmergencyContact(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the hasCustody property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getHasCustody() {
        return hasCustody;
    }

    /**
     * Sets the value of the hasCustody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setHasCustody(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.hasCustody = value;
    }

    /**
     * Gets the value of the disciplinaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getDisciplinaryContact() {
        return disciplinaryContact;
    }

    /**
     * Sets the value of the disciplinaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setDisciplinaryContact(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.disciplinaryContact = value;
    }

    /**
     * Gets the value of the attendanceContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getAttendanceContact() {
        return attendanceContact;
    }

    /**
     * Sets the value of the attendanceContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setAttendanceContact(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.attendanceContact = value;
    }

    /**
     * Gets the value of the primaryCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getPrimaryCareProvider() {
        return primaryCareProvider;
    }

    /**
     * Sets the value of the primaryCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setPrimaryCareProvider(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.primaryCareProvider = value;
    }

    /**
     * Gets the value of the feesBilling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getFeesBilling() {
        return feesBilling;
    }

    /**
     * Sets the value of the feesBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setFeesBilling(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.feesBilling = value;
    }

    /**
     * Gets the value of the familyMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getFamilyMail() {
        return familyMail;
    }

    /**
     * Sets the value of the familyMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setFamilyMail(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.familyMail = value;
    }

    /**
     * Gets the value of the interventionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getInterventionOrder() {
        return interventionOrder;
    }

    /**
     * Sets the value of the interventionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setInterventionOrder(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.interventionOrder = value;
    }

}
