
package sif.dd.us32.model.composite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A specific plan for student learning.
 * 
 * <p>Java class for gAcademicPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gAcademicPlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gPlanType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gAcademicPlanType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlSeeAlso({
    GCourseType.class
})
public class GAcademicPlanType
    extends GPlanType
{


}
