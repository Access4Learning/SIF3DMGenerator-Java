
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Connects a person to an education group.
 * 
 * <p>Java class for personGroupAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personGroupAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gPersonGroupAssociationType">
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
@XmlType(name = "personGroupAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "schoolYear"
})
public class PersonGroupAssociationType
    extends GPersonGroupAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
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
