
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xTranscriptTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xTranscriptTermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolYearType" minOccurs="0"/>
 *         &lt;element name="session" type="{http://www.sifassociation.org/datamodel/na/3.3}xSessionType" minOccurs="0"/>
 *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.3}xGradeLevelType" minOccurs="0"/>
 *         &lt;element name="courses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="course" type="{http://www.sifassociation.org/datamodel/na/3.3}xSreCourseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="academicSummary" type="{http://www.sifassociation.org/datamodel/na/3.3}xSreAcademicSummaryType" minOccurs="0"/>
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
@XmlType(name = "xTranscriptTermType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "school",
    "schoolYear",
    "session",
    "gradeLevel",
    "courses",
    "academicSummary",
    "any"
})
public class XTranscriptTermType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSessionType session;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTranscriptTermType.Courses courses;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreAcademicSummaryType academicSummary;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchool(XSchoolType value) {
        this.school = value;
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
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link XSessionType }
     *     
     */
    public XSessionType getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSessionType }
     *     
     */
    public void setSession(XSessionType value) {
        this.session = value;
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
     * Gets the value of the courses property.
     * 
     * @return
     *     possible object is
     *     {@link XTranscriptTermType.Courses }
     *     
     */
    public XTranscriptTermType.Courses getCourses() {
        return courses;
    }

    /**
     * Sets the value of the courses property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTranscriptTermType.Courses }
     *     
     */
    public void setCourses(XTranscriptTermType.Courses value) {
        this.courses = value;
    }

    /**
     * Gets the value of the academicSummary property.
     * 
     * @return
     *     possible object is
     *     {@link XSreAcademicSummaryType }
     *     
     */
    public XSreAcademicSummaryType getAcademicSummary() {
        return academicSummary;
    }

    /**
     * Sets the value of the academicSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreAcademicSummaryType }
     *     
     */
    public void setAcademicSummary(XSreAcademicSummaryType value) {
        this.academicSummary = value;
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
     *         &lt;element name="course" type="{http://www.sifassociation.org/datamodel/na/3.3}xSreCourseType" maxOccurs="unbounded" minOccurs="0"/>
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
        "course"
    })
    public static class Courses {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XSreCourseType> course;

        /**
         * Gets the value of the course property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the course property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCourse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSreCourseType }
         * 
         * 
         */
        public List<XSreCourseType> getCourse() {
            if (course == null) {
                course = new ArrayList<XSreCourseType>();
            }
            return this.course;
        }

    }

}
