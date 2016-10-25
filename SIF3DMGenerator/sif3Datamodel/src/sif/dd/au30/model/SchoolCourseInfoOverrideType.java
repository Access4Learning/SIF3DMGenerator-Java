
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element name="CourseCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StateCourseCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DistrictCourseCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="InstructionalLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CourseCredits" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Override" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolCourseInfoOverrideType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "courseCode",
    "stateCourseCode",
    "districtCourseCode",
    "subjectArea",
    "courseTitle",
    "instructionalLevel",
    "courseCredits"
})
public class SchoolCourseInfoOverrideType {

    @XmlElementRef(name = "CourseCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> courseCode;
    @XmlElementRef(name = "StateCourseCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCourseCode;
    @XmlElementRef(name = "DistrictCourseCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> districtCourseCode;
    @XmlElementRef(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectAreaType> subjectArea;
    @XmlElementRef(name = "CourseTitle", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> courseTitle;
    @XmlElementRef(name = "InstructionalLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instructionalLevel;
    @XmlElementRef(name = "CourseCredits", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> courseCredits;
    @XmlAttribute(name = "Override", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String override;

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourseCode(JAXBElement<String> value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the stateCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCourseCode() {
        return stateCourseCode;
    }

    /**
     * Sets the value of the stateCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCourseCode(JAXBElement<String> value) {
        this.stateCourseCode = value;
    }

    /**
     * Gets the value of the districtCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrictCourseCode() {
        return districtCourseCode;
    }

    /**
     * Sets the value of the districtCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrictCourseCode(JAXBElement<String> value) {
        this.districtCourseCode = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public JAXBElement<SubjectAreaType> getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public void setSubjectArea(JAXBElement<SubjectAreaType> value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourseTitle(JAXBElement<String> value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the instructionalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstructionalLevel() {
        return instructionalLevel;
    }

    /**
     * Sets the value of the instructionalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstructionalLevel(JAXBElement<String> value) {
        this.instructionalLevel = value;
    }

    /**
     * Gets the value of the courseCredits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourseCredits() {
        return courseCredits;
    }

    /**
     * Sets the value of the courseCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourseCredits(JAXBElement<String> value) {
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

}
