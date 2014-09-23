
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A organization associated with another organization. This enables the creation of organization heirarchies or networks such as schools within a state. 
 * 
 * <p>Java class for organizationOrganizationAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationOrganizationAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOrganizationOrganizationAssociationType">
 *       &lt;sequence>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationOrganizationAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolYear"
})
public class OrganizationOrganizationAssociationType
    extends GOrganizationOrganizationAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Object schoolYear;

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSchoolYear(Object value) {
        this.schoolYear = value;
    }

}
