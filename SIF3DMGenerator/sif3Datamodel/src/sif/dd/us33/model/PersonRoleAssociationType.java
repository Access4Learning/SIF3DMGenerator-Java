
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to connect an instances of a person at different education levels. For example connects a person instance to a student instance and connects the same person instance to a post secondary student instance.
 * 
 * <p>Java class for personRoleAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personRoleAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gPersonRoleAssociationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personRoleAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
public class PersonRoleAssociationType
    extends GPersonRoleAssociationType
{


}
