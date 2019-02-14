
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialQuestionnaireSubmissionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialQuestionnaireSubmissionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialQuestionnaireSubmission" type="{http://www.sifassociation.org/datamodel/au/3.4}FinancialQuestionnaireSubmissionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialQuestionnaireSubmissionCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "financialQuestionnaireSubmission"
})
public class FinancialQuestionnaireSubmissionCollectionType {

    @XmlElement(name = "FinancialQuestionnaireSubmission", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<FinancialQuestionnaireSubmissionType> financialQuestionnaireSubmission;

    /**
     * Gets the value of the financialQuestionnaireSubmission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialQuestionnaireSubmission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialQuestionnaireSubmission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialQuestionnaireSubmissionType }
     * 
     * 
     */
    public List<FinancialQuestionnaireSubmissionType> getFinancialQuestionnaireSubmission() {
        if (financialQuestionnaireSubmission == null) {
            financialQuestionnaireSubmission = new ArrayList<FinancialQuestionnaireSubmissionType>();
        }
        return this.financialQuestionnaireSubmission;
    }

}
