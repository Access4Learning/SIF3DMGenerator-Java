
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StatisticalAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalAreaType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *       &lt;attribute name="SpatialUnitType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="MB"/>
 *             &lt;enumeration value="SA1"/>
 *             &lt;enumeration value="SA2"/>
 *             &lt;enumeration value="SA3"/>
 *             &lt;enumeration value="SA4"/>
 *             &lt;enumeration value="GCCSA"/>
 *             &lt;enumeration value="S/T"/>
 *             &lt;enumeration value="LG"/>
 *             &lt;enumeration value="TR"/>
 *             &lt;enumeration value="ILOC"/>
 *             &lt;enumeration value="IARE"/>
 *             &lt;enumeration value="IREG"/>
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
@XmlType(name = "StatisticalAreaType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "value"
})
public class StatisticalAreaType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    @XmlAttribute(name = "SpatialUnitType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String spatialUnitType;

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
     * Gets the value of the spatialUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpatialUnitType() {
        return spatialUnitType;
    }

    /**
     * Sets the value of the spatialUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpatialUnitType(String value) {
        this.spatialUnitType = value;
    }

}
