
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FQContextualQuestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQContextualQuestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FQAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQContextualQuestionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqContext",
    "fqAnswer"
})
public class FQContextualQuestionType {

    @XmlElement(name = "FQContext", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String fqContext;
    @XmlElement(name = "FQAnswer", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String fqAnswer;

    /**
     * Gets the value of the fqContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQContext() {
        return fqContext;
    }

    /**
     * Sets the value of the fqContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQContext(String value) {
        this.fqContext = value;
    }

    /**
     * Gets the value of the fqAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQAnswer() {
        return fqAnswer;
    }

    /**
     * Sets the value of the fqAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQAnswer(String value) {
        this.fqAnswer = value;
    }

}
