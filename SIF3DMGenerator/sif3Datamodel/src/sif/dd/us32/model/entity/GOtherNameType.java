
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for gOtherNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gOtherNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherName" type="{http://www.sifassociation.org/datamodel/na/3.2}gBaseNameType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameRole" type="{http://www.sifassociation.org/datamodel/na/3.2}gNameRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gOtherNameType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "otherName"
})
public class GOtherNameType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GBaseNameType otherName;
    @XmlAttribute(name = "nameRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameRole;

    /**
     * Gets the value of the otherName property.
     * 
     * @return
     *     possible object is
     *     {@link GBaseNameType }
     *     
     */
    public GBaseNameType getOtherName() {
        return otherName;
    }

    /**
     * Sets the value of the otherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBaseNameType }
     *     
     */
    public void setOtherName(GBaseNameType value) {
        this.otherName = value;
    }

    /**
     * Gets the value of the nameRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRole() {
        return nameRole;
    }

    /**
     * Sets the value of the nameRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRole(String value) {
        this.nameRole = value;
    }

}
