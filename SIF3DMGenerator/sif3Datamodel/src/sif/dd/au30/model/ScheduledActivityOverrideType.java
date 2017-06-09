
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduledActivityOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledActivityOverrideType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>AUCodeSetsYesOrNoCategoryTypeOrEmpty">
 *       &lt;attribute name="DateOfOverride" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledActivityOverrideType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "value"
})
public class ScheduledActivityOverrideType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DateOfOverride")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfOverride;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateOfOverride property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfOverride() {
        return dateOfOverride;
    }

    /**
     * Sets the value of the dateOfOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfOverride(XMLGregorianCalendar value) {
        this.dateOfOverride = value;
    }

}
