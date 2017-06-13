
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlausibleScaledValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlausibleScaledValueListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlausibleScaledValue" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlausibleScaledValueListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "plausibleScaledValue"
})
public class PlausibleScaledValueListType {

    @XmlElement(name = "PlausibleScaledValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<BigDecimal> plausibleScaledValue;

    /**
     * Gets the value of the plausibleScaledValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plausibleScaledValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlausibleScaledValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getPlausibleScaledValue() {
        if (plausibleScaledValue == null) {
            plausibleScaledValue = new ArrayList<BigDecimal>();
        }
        return this.plausibleScaledValue;
    }

}
