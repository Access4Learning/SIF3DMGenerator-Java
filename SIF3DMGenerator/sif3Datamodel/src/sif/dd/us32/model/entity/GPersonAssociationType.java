
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gPersonAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gPersonAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gAssociationType">
 *       &lt;sequence>
 *         &lt;element name="personRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gPersonAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "personRefId"
})
@XmlSeeAlso({
    GPersonGroupAssociationType.class,
    GPersonRoleAssociationType.class,
    GPersonOrganizationAssociationType.class,
    GContactPersonAssociationType.class
})
public class GPersonAssociationType
    extends GAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GGenericRefIdPointerType personRefId;

    /**
     * Gets the value of the personRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getPersonRefId() {
        return personRefId;
    }

    /**
     * Sets the value of the personRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setPersonRefId(GGenericRefIdPointerType value) {
        this.personRefId = value;
    }

}
