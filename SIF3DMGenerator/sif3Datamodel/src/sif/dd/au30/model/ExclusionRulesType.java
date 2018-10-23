
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rules for which statistic may not be reported.
 * 
 * <p>Java class for ExclusionRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExclusionRule" type="{http://www.sifassociation.org/datamodel/au/3.4}ExclusionRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionRulesType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "exclusionRule"
})
public class ExclusionRulesType {

    @XmlElement(name = "ExclusionRule", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ExclusionRuleType> exclusionRule;

    /**
     * Gets the value of the exclusionRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionRuleType }
     * 
     * 
     */
    public List<ExclusionRuleType> getExclusionRule() {
        if (exclusionRule == null) {
            exclusionRule = new ArrayList<ExclusionRuleType>();
        }
        return this.exclusionRule;
    }

}
