
package sif.dd.unity.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ItemCharacteristicsChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCharacteristicsChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChoiceLabel" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="Responses" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCharacteristicsChoiceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "choiceLabel",
    "responses"
})
public class ItemCharacteristicsChoiceType {

    @XmlElement(name = "ChoiceLabel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String choiceLabel;
    @XmlElement(name = "Responses", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigInteger responses;

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
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponses(BigInteger value) {
        this.responses = value;
    }

}
