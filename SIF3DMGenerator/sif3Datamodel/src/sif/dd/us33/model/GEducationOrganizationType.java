
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * EducationOrganization is an extension of Organization
 * 
 * <p>Java class for gEducationOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gEducationOrganizationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOrganizationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gEducationOrganizationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlSeeAlso({
    SeaType.class,
    GSchoolType.class,
    GLEAType.class
})
public class GEducationOrganizationType
    extends GOrganizationType
{


}
