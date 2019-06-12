
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SchoolCourseInfoOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolCourseInfoOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseCodeType" minOccurs="0"/>
 *         &lt;element name="StateCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}StateCourseCodeType" minOccurs="0"/>
 *         &lt;element name="DistrictCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}DistrictCourseCodeType" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseTitleType" minOccurs="0"/>
 *         &lt;element name="InstructionalLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}InstructionalLevelType" minOccurs="0"/>
 *         &lt;element name="CourseCredits" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseCreditsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Override" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="OverrideCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolCourseInfoOverrideType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "courseCode",
    "stateCourseCode",
    "districtCourseCode",
    "subjectArea",
    "courseTitle",
    "instructionalLevel",
    "courseCredits"
})
public class SchoolCourseInfoOverrideType {

    @XmlElement(name = "CourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseCode;
    @XmlElement(name = "StateCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateCourseCode;
    @XmlElement(name = "DistrictCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String districtCourseCode;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "CourseTitle", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseTitle;
    @XmlElement(name = "InstructionalLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InstructionalLevelType instructionalLevel;
    @XmlElement(name = "CourseCredits", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseCreditsType courseCredits;
    @XmlAttribute(name = "Override", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String override;
    @XmlAttribute(name = "OverrideCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String overrideCodeset;

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCode(String value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the stateCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCourseCode() {
        return stateCourseCode;
    }

    /**
     * Sets the value of the stateCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCourseCode(String value) {
        this.stateCourseCode = value;
    }

    /**
     * Gets the value of the districtCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCourseCode() {
        return districtCourseCode;
    }

    /**
     * Sets the value of the districtCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCourseCode(String value) {
        this.districtCourseCode = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaType }
     *     
     */
    public SubjectAreaType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaType }
     *     
     */
    public void setSubjectArea(SubjectAreaType value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the instructionalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionalLevelType }
     *     
     */
    public InstructionalLevelType getInstructionalLevel() {
        return instructionalLevel;
    }

    /**
     * Sets the value of the instructionalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionalLevelType }
     *     
     */
    public void setInstructionalLevel(InstructionalLevelType value) {
        this.instructionalLevel = value;
    }

    /**
     * Gets the value of the courseCredits property.
     * 
     * @return
     *     possible object is
     *     {@link CourseCreditsType }
     *     
     */
    public CourseCreditsType getCourseCredits() {
        return courseCredits;
    }

    /**
     * Sets the value of the courseCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseCreditsType }
     *     
     */
    public void setCourseCredits(CourseCreditsType value) {
        this.courseCredits = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride(String value) {
        this.override = value;
    }

    /**
     * Gets the value of the overrideCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCodeset() {
        return overrideCodeset;
    }

    /**
     * Sets the value of the overrideCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCodeset(String value) {
        this.overrideCodeset = value;
    }

}
