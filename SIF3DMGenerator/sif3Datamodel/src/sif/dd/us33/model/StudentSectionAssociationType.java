
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a student enrollment in a class section. Formerly called Student Section Enrollment.
 * 
 * <p>Java class for studentSectionAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentSectionAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gStudentSectionEnrollmentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentSectionAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
public class StudentSectionAssociationType
    extends GStudentSectionEnrollmentType
{


}
