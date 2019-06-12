
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalCoursesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalCoursesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="course" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalCoursesListCourseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalCoursesListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "course"
})
public class IepPlanAnnualGoalCoursesListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalCoursesListCourseType course;

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalCoursesListCourseType }
     *     
     */
    public IepPlanAnnualGoalCoursesListCourseType getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalCoursesListCourseType }
     *     
     */
    public void setCourse(IepPlanAnnualGoalCoursesListCourseType value) {
        this.course = value;
    }

}
