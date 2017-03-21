
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/au/3.4.1}BaseNameType">
 *       &lt;attribute name="Type" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsNameUsageTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
public class NameType
    extends BaseNameType
{

    @XmlAttribute(name = "Type", required = true)
    protected AUCodeSetsNameUsageTypeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNameUsageTypeType }
     *     
     */
    public AUCodeSetsNameUsageTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNameUsageTypeType }
     *     
     */
    public void setType(AUCodeSetsNameUsageTypeType value) {
        this.type = value;
    }

}
