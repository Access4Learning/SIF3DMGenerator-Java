
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A person associated with an organization.  An organization includes instructional organizations such as class.
 * 
 * <p>Java class for gOrganizationAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gOrganizationAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gAssociationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gOrganizationAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlSeeAlso({
    GStudentSchoolEnrollmentType.class,
    GStaffSectionAssociationType.class,
    GOrganizationUserType.class,
    GOrganizationSubtypeType.class,
    GStudentSectionEnrollmentType.class,
    GPartyOrganizationAssociationType.class,
    GStaffPersonAssignmentType.class
})
public class GOrganizationAssociationType
    extends GAssociationType
{


}
