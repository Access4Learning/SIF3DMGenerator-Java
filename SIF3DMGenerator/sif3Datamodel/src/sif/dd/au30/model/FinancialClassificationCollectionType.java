
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialClassificationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialClassificationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialClassification" type="{http://www.sifassociation.org/au/datamodel/1.4}FinancialClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialClassificationCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "financialClassification"
})
public class FinancialClassificationCollectionType {

    @XmlElement(name = "FinancialClassification", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected List<FinancialClassificationType> financialClassification;

    /**
     * Gets the value of the financialClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialClassificationType }
     * 
     * 
     */
    public List<FinancialClassificationType> getFinancialClassification() {
        if (financialClassification == null) {
            financialClassification = new ArrayList<FinancialClassificationType>();
        }
        return this.financialClassification;
    }

}
