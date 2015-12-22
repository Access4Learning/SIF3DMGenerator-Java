
package sif.dd.us33.model;

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
 * Type of enrollment.
 * 
 * <p>Java class for xEnrollmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xEnrollmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="studentSchoolAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="responsibleSchoolType" type="{http://www.sifassociation.org/datamodel/na/3.3}xResponsibleSchoolTypeType" minOccurs="0"/>
 *         &lt;element name="membershipType" type="{http://www.sifassociation.org/datamodel/na/3.3}xMembershipTypeType" minOccurs="0"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="homeRoomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="homeRoomTeacher" type="{http://www.sifassociation.org/datamodel/na/3.3}xPersonReferenceType" minOccurs="0"/>
 *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.3}xGradeLevelType" minOccurs="0"/>
 *         &lt;element name="projectedGraduationYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="counselor" type="{http://www.sifassociation.org/datamodel/na/3.3}xPersonReferenceType" minOccurs="0"/>
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
@XmlType(name = "xEnrollmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "leaRefId",
    "schoolRefId",
    "studentSchoolAssociationRefId",
    "responsibleSchoolType",
    "membershipType",
    "entryDate",
    "exitDate",
    "homeRoomNumber",
    "homeRoomTeacher",
    "gradeLevel",
    "projectedGraduationYear",
    "counselor",
    "any"
})
public class XEnrollmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentSchoolAssociationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XResponsibleSchoolTypeType responsibleSchoolType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XMembershipTypeType membershipType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String homeRoomNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XPersonReferenceType homeRoomTeacher;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar projectedGraduationYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XPersonReferenceType counselor;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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

    /**
     * Gets the value of the studentSchoolAssociationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSchoolAssociationRefId() {
        return studentSchoolAssociationRefId;
    }

    /**
     * Sets the value of the studentSchoolAssociationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSchoolAssociationRefId(String value) {
        this.studentSchoolAssociationRefId = value;
    }

    /**
     * Gets the value of the responsibleSchoolType property.
     * 
     * @return
     *     possible object is
     *     {@link XResponsibleSchoolTypeType }
     *     
     */
    public XResponsibleSchoolTypeType getResponsibleSchoolType() {
        return responsibleSchoolType;
    }

    /**
     * Sets the value of the responsibleSchoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XResponsibleSchoolTypeType }
     *     
     */
    public void setResponsibleSchoolType(XResponsibleSchoolTypeType value) {
        this.responsibleSchoolType = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link XMembershipTypeType }
     *     
     */
    public XMembershipTypeType getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMembershipTypeType }
     *     
     */
    public void setMembershipType(XMembershipTypeType value) {
        this.membershipType = value;
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
     * Gets the value of the homeRoomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeRoomNumber() {
        return homeRoomNumber;
    }

    /**
     * Sets the value of the homeRoomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeRoomNumber(String value) {
        this.homeRoomNumber = value;
    }

    /**
     * Gets the value of the homeRoomTeacher property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonReferenceType }
     *     
     */
    public XPersonReferenceType getHomeRoomTeacher() {
        return homeRoomTeacher;
    }

    /**
     * Sets the value of the homeRoomTeacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonReferenceType }
     *     
     */
    public void setHomeRoomTeacher(XPersonReferenceType value) {
        this.homeRoomTeacher = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeLevel(String value) {
        this.gradeLevel = value;
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
     * Gets the value of the counselor property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonReferenceType }
     *     
     */
    public XPersonReferenceType getCounselor() {
        return counselor;
    }

    /**
     * Sets the value of the counselor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonReferenceType }
     *     
     */
    public void setCounselor(XPersonReferenceType value) {
        this.counselor = value;
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

}
