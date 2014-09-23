
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A refId that refers to a generic (specified by the data) instance of a SIF object. The RefId points to the object instance and the sif_RefObject specifies the name of the SIF Object. 
 * 
 * <p>Java class for gGenericRefIdPointerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gGenericRefIdPointerType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gUUIDType">
 *       &lt;attribute name="sif_Object" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gObjectNameType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gGenericRefIdPointerType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "value"
})
@XmlSeeAlso({
    sif.dd.us32.model.entity.LearningStandardAssociationType.LearningStandardRefId.class
})
public class GGenericRefIdPointerType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "sif_Object", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifObject;

    /**
     * UUID, used as object identifier. UUIDs are to be generated using version 1 or 4 as specified in RFC 4122, section 4.1.3.
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
     * Gets the value of the sifObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifObject() {
        return sifObject;
    }

    /**
     * Sets the value of the sifObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifObject(String value) {
        this.sifObject = value;
    }

}
