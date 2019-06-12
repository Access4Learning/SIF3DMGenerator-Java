
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourseHistoryTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseHistoryTermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}CurrentCourseActivityTermInfoDataType"/>
 *         &lt;element name="Courses" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseHistoryCourseListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseHistoryTermType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "termInfoData",
    "courses"
})
public class CourseHistoryTermType {

    @XmlElement(name = "TermInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected CurrentCourseActivityTermInfoDataType termInfoData;
    @XmlElement(name = "Courses", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseHistoryCourseListType courses;

    /**
     * Gets the value of the termInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentCourseActivityTermInfoDataType }
     *     
     */
    public CurrentCourseActivityTermInfoDataType getTermInfoData() {
        return termInfoData;
    }

    /**
     * Sets the value of the termInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentCourseActivityTermInfoDataType }
     *     
     */
    public void setTermInfoData(CurrentCourseActivityTermInfoDataType value) {
        this.termInfoData = value;
    }

    /**
     * Gets the value of the courses property.
     * 
     * @return
     *     possible object is
     *     {@link CourseHistoryCourseListType }
     *     
     */
    public CourseHistoryCourseListType getCourses() {
        return courses;
    }

    /**
     * Sets the value of the courses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseHistoryCourseListType }
     *     
     */
    public void setCourses(CourseHistoryCourseListType value) {
        this.courses = value;
    }

}
