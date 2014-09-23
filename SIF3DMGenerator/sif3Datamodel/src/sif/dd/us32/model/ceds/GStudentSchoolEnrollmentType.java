
package sif.dd.us32.model.ceds;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object defines information related to a student's enrollment. StudentSchoolEnrollment instances must not span multiple school years.
 * 
 * <p>Java class for gStudentSchoolEnrollmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gStudentSchoolEnrollmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOrganizationAssociationType">
 *       &lt;sequence>
 *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="membershipType" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entryType" type="{http://www.sifassociation.org/datamodel/na/3.2}gEntryTypeType"/>
 *         &lt;element name="yearGroup" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
 *         &lt;element name="homeRoomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="advisor" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="counselor" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolCalendarRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="exitStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gExitStatusType" minOccurs="0"/>
 *         &lt;element name="exitType" type="{http://www.sifassociation.org/datamodel/na/3.2}gExitTypeType" minOccurs="0"/>
 *         &lt;element name="recordClosureReason" type="{http://www.sifassociation.org/datamodel/na/3.2}gRecordClosureReasonType" minOccurs="0"/>
 *         &lt;element name="destinationSchool" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="promotionStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gPromotionStatusType" minOccurs="0"/>
 *         &lt;element name="fte" type="{http://www.sifassociation.org/datamodel/na/3.2}gFractionDecimal" minOccurs="0"/>
 *         &lt;element name="ftptStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gFullTimeStatusType" minOccurs="0"/>
 *         &lt;element name="residencyStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gResidencyStatusType" minOccurs="0"/>
 *         &lt;element name="acceptableUsePolicy" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gStudentSchoolEnrollmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentRefId",
    "schoolRefId",
    "membershipType",
    "schoolYear",
    "entryDate",
    "entryType",
    "yearGroup",
    "homeRoomRefId",
    "advisor",
    "counselor",
    "schoolCalendarRefId",
    "exitDate",
    "exitStatus",
    "exitType",
    "recordClosureReason",
    "destinationSchool",
    "promotionStatus",
    "fte",
    "ftptStatus",
    "residencyStatus",
    "acceptableUsePolicy"
})
public class GStudentSchoolEnrollmentType
    extends GOrganizationAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType membershipType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GEntryTypeType entryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYearGroupType yearGroup;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String homeRoomRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GGenericRefIdPointerType advisor;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GGenericRefIdPointerType counselor;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolCalendarRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExitStatusType exitStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExitTypeType exitType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GRecordClosureReasonType recordClosureReason;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType destinationSchool;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String promotionStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal fte;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ftptStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String residencyStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType acceptableUsePolicy;

    /**
     * Gets the value of the studentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentRefId() {
        return studentRefId;
    }

    /**
     * Sets the value of the studentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentRefId(String value) {
        this.studentRefId = value;
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

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setMembershipType(GLaxCodedElementType value) {
        this.membershipType = value;
    }

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
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link GEntryTypeType }
     *     
     */
    public GEntryTypeType getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEntryTypeType }
     *     
     */
    public void setEntryType(GEntryTypeType value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the yearGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupType }
     *     
     */
    public GYearGroupType getYearGroup() {
        return yearGroup;
    }

    /**
     * Sets the value of the yearGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupType }
     *     
     */
    public void setYearGroup(GYearGroupType value) {
        this.yearGroup = value;
    }

    /**
     * Gets the value of the homeRoomRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeRoomRefId() {
        return homeRoomRefId;
    }

    /**
     * Sets the value of the homeRoomRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeRoomRefId(String value) {
        this.homeRoomRefId = value;
    }

    /**
     * Gets the value of the advisor property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getAdvisor() {
        return advisor;
    }

    /**
     * Sets the value of the advisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setAdvisor(GGenericRefIdPointerType value) {
        this.advisor = value;
    }

    /**
     * Gets the value of the counselor property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getCounselor() {
        return counselor;
    }

    /**
     * Sets the value of the counselor property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setCounselor(GGenericRefIdPointerType value) {
        this.counselor = value;
    }

    /**
     * Gets the value of the schoolCalendarRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCalendarRefId() {
        return schoolCalendarRefId;
    }

    /**
     * Sets the value of the schoolCalendarRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCalendarRefId(String value) {
        this.schoolCalendarRefId = value;
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
     * Gets the value of the exitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GExitStatusType }
     *     
     */
    public GExitStatusType getExitStatus() {
        return exitStatus;
    }

    /**
     * Sets the value of the exitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExitStatusType }
     *     
     */
    public void setExitStatus(GExitStatusType value) {
        this.exitStatus = value;
    }

    /**
     * Gets the value of the exitType property.
     * 
     * @return
     *     possible object is
     *     {@link GExitTypeType }
     *     
     */
    public GExitTypeType getExitType() {
        return exitType;
    }

    /**
     * Sets the value of the exitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExitTypeType }
     *     
     */
    public void setExitType(GExitTypeType value) {
        this.exitType = value;
    }

    /**
     * Gets the value of the recordClosureReason property.
     * 
     * @return
     *     possible object is
     *     {@link GRecordClosureReasonType }
     *     
     */
    public GRecordClosureReasonType getRecordClosureReason() {
        return recordClosureReason;
    }

    /**
     * Sets the value of the recordClosureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRecordClosureReasonType }
     *     
     */
    public void setRecordClosureReason(GRecordClosureReasonType value) {
        this.recordClosureReason = value;
    }

    /**
     * Gets the value of the destinationSchool property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getDestinationSchool() {
        return destinationSchool;
    }

    /**
     * Sets the value of the destinationSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setDestinationSchool(GLocalIdType value) {
        this.destinationSchool = value;
    }

    /**
     * Gets the value of the promotionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionStatus() {
        return promotionStatus;
    }

    /**
     * Sets the value of the promotionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionStatus(String value) {
        this.promotionStatus = value;
    }

    /**
     * Gets the value of the fte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFte() {
        return fte;
    }

    /**
     * Sets the value of the fte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFte(BigDecimal value) {
        this.fte = value;
    }

    /**
     * Gets the value of the ftptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtptStatus() {
        return ftptStatus;
    }

    /**
     * Sets the value of the ftptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtptStatus(String value) {
        this.ftptStatus = value;
    }

    /**
     * Gets the value of the residencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencyStatus() {
        return residencyStatus;
    }

    /**
     * Sets the value of the residencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencyStatus(String value) {
        this.residencyStatus = value;
    }

    /**
     * Gets the value of the acceptableUsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getAcceptableUsePolicy() {
        return acceptableUsePolicy;
    }

    /**
     * Sets the value of the acceptableUsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setAcceptableUsePolicy(GYesNoUnknownType value) {
        this.acceptableUsePolicy = value;
    }

}
