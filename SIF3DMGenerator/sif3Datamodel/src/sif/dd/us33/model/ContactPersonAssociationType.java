
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The association of a contact person to another person, for example, a student (person) to a parent or guardian (contact person).
 * 
 * <p>Java class for contactPersonAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPersonAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gContactPersonAssociationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPersonAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
public class ContactPersonAssociationType
    extends GContactPersonAssociationType
{


}
