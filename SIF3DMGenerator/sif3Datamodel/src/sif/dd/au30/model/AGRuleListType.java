
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRuleListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRuleListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRule" type="{http://www.sifassociation.org/datamodel/au/3.4}AGRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRuleListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "agRule"
})
public class AGRuleListType {

    @XmlElement(name = "AGRule", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<AGRuleType> agRule;

    /**
     * Gets the value of the agRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGRuleType }
     * 
     * 
     */
    public List<AGRuleType> getAGRule() {
        if (agRule == null) {
            agRule = new ArrayList<AGRuleType>();
        }
        return this.agRule;
    }

}
