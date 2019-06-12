
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssessmentItemChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItemChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChoiceLabel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ChoiceContent" type="{http://www.sifassociation.org/datamodel/na/4.x}AbstractContentElementType"/>
 *         &lt;element name="CreditValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItemChoiceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "choiceLabel",
    "choiceContent",
    "creditValue"
})
public class AssessmentItemChoiceType {

    @XmlElement(name = "ChoiceLabel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String choiceLabel;
    @XmlElement(name = "ChoiceContent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected AbstractContentElementType choiceContent;
    @XmlElement(name = "CreditValue", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Float creditValue;

    /**
     * Gets the value of the choiceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoiceLabel() {
        return choiceLabel;
    }

    /**
     * Sets the value of the choiceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoiceLabel(String value) {
        this.choiceLabel = value;
    }

    /**
     * Gets the value of the choiceContent property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractContentElementType }
     *     
     */
    public AbstractContentElementType getChoiceContent() {
        return choiceContent;
    }

    /**
     * Sets the value of the choiceContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractContentElementType }
     *     
     */
    public void setChoiceContent(AbstractContentElementType value) {
        this.choiceContent = value;
    }

    /**
     * Gets the value of the creditValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCreditValue() {
        return creditValue;
    }

    /**
     * Sets the value of the creditValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCreditValue(Float value) {
        this.creditValue = value;
    }

}
