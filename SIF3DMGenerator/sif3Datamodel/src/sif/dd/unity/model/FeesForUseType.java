
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeesForUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeesForUseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeForUse" type="{http://www.sifassociation.org/datamodel/na/4.x}FeeForUseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeesForUseType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "feeForUse"
})
public class FeesForUseType {

    @XmlElement(name = "FeeForUse", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FeeForUseType> feeForUse;

    /**
     * Gets the value of the feeForUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeForUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeForUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeForUseType }
     * 
     * 
     */
    public List<FeeForUseType> getFeeForUse() {
        if (feeForUse == null) {
            feeForUse = new ArrayList<FeeForUseType>();
        }
        return this.feeForUse;
    }

}
