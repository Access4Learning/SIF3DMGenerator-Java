
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
 * <p>Java class for FoodservicePurchaseQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodservicePurchaseQuantityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MealType">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FoodserviceItemPortionRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="Earned" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="EarnedCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodservicePurchaseQuantityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mealType",
    "value"
})
public class FoodservicePurchaseQuantityType {

    @XmlElement(name = "MealType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected FoodservicePurchaseQuantityType.MealType mealType;
    @XmlElement(name = "Value", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal value;
    @XmlAttribute(name = "FoodserviceItemPortionRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String foodserviceItemPortionRefId;
    @XmlAttribute(name = "Earned", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String earned;
    @XmlAttribute(name = "EarnedCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String earnedCodeset;

    /**
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link FoodservicePurchaseQuantityType.MealType }
     *     
     */
    public FoodservicePurchaseQuantityType.MealType getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodservicePurchaseQuantityType.MealType }
     *     
     */
    public void setMealType(FoodservicePurchaseQuantityType.MealType value) {
        this.mealType = value;
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
     * Gets the value of the foodserviceItemPortionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodserviceItemPortionRefId() {
        return foodserviceItemPortionRefId;
    }

    /**
     * Sets the value of the foodserviceItemPortionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodserviceItemPortionRefId(String value) {
        this.foodserviceItemPortionRefId = value;
    }

    /**
     * Gets the value of the earned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarned() {
        return earned;
    }

    /**
     * Sets the value of the earned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarned(String value) {
        this.earned = value;
    }

    /**
     * Gets the value of the earnedCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnedCodeset() {
        return earnedCodeset;
    }

    /**
     * Sets the value of the earnedCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnedCodeset(String value) {
        this.earnedCodeset = value;
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
