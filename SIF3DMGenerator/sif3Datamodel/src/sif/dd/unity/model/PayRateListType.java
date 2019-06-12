
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayRateListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayRateListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayRate" type="{http://www.sifassociation.org/datamodel/na/4.x}PayRateType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayRateListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "payRate"
})
public class PayRateListType {

    @XmlElement(name = "PayRate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<PayRateType> payRate;

    /**
     * Gets the value of the payRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayRateType }
     * 
     * 
     */
    public List<PayRateType> getPayRate() {
        if (payRate == null) {
            payRate = new ArrayList<PayRateType>();
        }
        return this.payRate;
    }

}
