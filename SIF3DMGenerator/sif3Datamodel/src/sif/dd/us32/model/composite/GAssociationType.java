
package sif.dd.us32.model.composite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents functional associations among individuals, organizations, events, programs, etc. These associations include things such as student enrollment in a school, a contact person for an organization, or a sponsor for an event.
 * 
 * <p>Java class for gAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_EntityType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlSeeAlso({
    GOrganizationOrganizationAssociationType.class,
    GPartyAddressRelationType.class,
    GOrganizationAssociationType.class,
    GPersonAssociationType.class
})
public class GAssociationType
    extends GSIFEntityType
{


}
