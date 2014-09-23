
package sif.dd.us32.model;

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
 * Links a student to participation in a program.
 * 
 * <p>Java class for studentProgramAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentProgramAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOrganizationAssociationType">
 *       &lt;sequence>
 *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="programRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entryType" type="{http://www.sifassociation.org/datamodel/na/3.2}gEntryTypeType" minOccurs="0"/>
 *         &lt;element name="yearGroup" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
 *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="exitStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gExitStatusType" minOccurs="0"/>
 *         &lt;element name="exitType" type="{http://www.sifassociation.org/datamodel/na/3.2}gExitTypeType" minOccurs="0"/>
 *         &lt;element name="fte" type="{http://www.sifassociation.org/datamodel/na/3.2}gFractionDecimal" minOccurs="0"/>
 *         &lt;element name="ftptStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gFullTimeStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentProgramAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentRefId",
    "programRefId",
    "schoolYear",
    "entryDate",
    "entryType",
    "yearGroup",
    "exitDate",
    "exitStatus",
    "exitType",
    "fte",
    "ftptStatus"
})
public class StudentProgramAssociationType
    extends GOrganizationAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String programRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GEntryTypeType entryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYearGroupType yearGroup;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExitStatusType exitStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExitTypeType exitType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal fte;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ftptStatus;

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
     * Gets the value of the programRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramRefId() {
        return programRefId;
    }

    /**
     * Sets the value of the programRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramRefId(String value) {
        this.programRefId = value;
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

}
