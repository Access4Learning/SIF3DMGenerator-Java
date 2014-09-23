
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object defines information related to a student's enrollment. StudentSchoolAssociation instances must not span multiple school years. Formerly called StudentSchoolEnrollment.
 * 
 * <p>Java class for studentSchoolAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentSchoolAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gStudentSchoolEnrollmentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentSchoolAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class StudentSchoolAssociationType
    extends GStudentSchoolEnrollmentType
{


}
