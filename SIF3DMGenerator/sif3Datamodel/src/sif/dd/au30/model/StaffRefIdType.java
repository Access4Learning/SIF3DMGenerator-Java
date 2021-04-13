
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StaffRefIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffRefIdType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefTypeOrEmpty">
 *       &lt;attribute name="SIF_RefObject" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="StaffPersonal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffRefIdType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "value"
})
public class StaffRefIdType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SIF_RefObject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefObject;

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
     * Gets the value of the sifRefObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObject() {
        return sifRefObject;
    }

    /**
     * Sets the value of the sifRefObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObject(String value) {
        this.sifRefObject = value;
    }

}
