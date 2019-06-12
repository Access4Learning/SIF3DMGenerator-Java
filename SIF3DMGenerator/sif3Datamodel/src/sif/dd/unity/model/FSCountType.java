
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FSCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FSCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MealStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}MealStatusType" minOccurs="0"/>
 *           &lt;element name="EarnedStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}EarnedStatusType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="MealType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amount" type="{http://www.sifassociation.org/datamodel/na/4.x}FSAmountType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.sifassociation.org/datamodel/na/4.x}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FSCountType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mealStatus",
    "earnedStatus",
    "mealType",
    "amount",
    "tax",
    "value"
})
public class FSCountType {

    @XmlElement(name = "MealStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MealStatusType mealStatus;
    @XmlElement(name = "EarnedStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EarnedStatusType earnedStatus;
    @XmlElement(name = "MealType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FSCountType.MealType mealType;
    @XmlElement(name = "Amount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FSAmountType amount;
    @XmlElement(name = "Tax", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MonetaryAmountType tax;
    @XmlElement(name = "Value", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the mealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MealStatusType }
     *     
     */
    public MealStatusType getMealStatus() {
        return mealStatus;
    }

    /**
     * Sets the value of the mealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealStatusType }
     *     
     */
    public void setMealStatus(MealStatusType value) {
        this.mealStatus = value;
    }

    /**
     * Gets the value of the earnedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EarnedStatusType }
     *     
     */
    public EarnedStatusType getEarnedStatus() {
        return earnedStatus;
    }

    /**
     * Sets the value of the earnedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarnedStatusType }
     *     
     */
    public void setEarnedStatus(EarnedStatusType value) {
        this.earnedStatus = value;
    }

    /**
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link FSCountType.MealType }
     *     
     */
    public FSCountType.MealType getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSCountType.MealType }
     *     
     */
    public void setMealType(FSCountType.MealType value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link FSAmountType }
     *     
     */
    public FSAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSAmountType }
     *     
     */
    public void setAmount(FSAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTax(MonetaryAmountType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MealType {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
