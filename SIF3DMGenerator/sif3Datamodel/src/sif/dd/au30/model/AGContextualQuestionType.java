
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGContextualQuestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGContextualQuestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGContextCode" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAGContextQuestionType" minOccurs="0"/>
 *         &lt;element name="AGAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGContextualQuestionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "agContextCode",
    "agAnswer"
})
public class AGContextualQuestionType {

    @XmlElement(name = "AGContextCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsAGContextQuestionType agContextCode;
    @XmlElement(name = "AGAnswer", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String agAnswer;

    /**
     * Gets the value of the agContextCode property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsAGContextQuestionType }
     *     
     */
    public AUCodeSetsAGContextQuestionType getAGContextCode() {
        return agContextCode;
    }

    /**
     * Sets the value of the agContextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsAGContextQuestionType }
     *     
     */
    public void setAGContextCode(AUCodeSetsAGContextQuestionType value) {
        this.agContextCode = value;
    }

    /**
     * Gets the value of the agAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGAnswer() {
        return agAnswer;
    }

    /**
     * Sets the value of the agAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGAnswer(String value) {
        this.agAnswer = value;
    }

}
