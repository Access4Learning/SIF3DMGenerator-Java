
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BudgetAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountClass">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FundBreakdown" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FunctionBreakdown" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ObjectBreakdown" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="BudgetAmount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetAccountType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accountClass",
    "fundBreakdown",
    "functionBreakdown",
    "objectBreakdown",
    "budgetAmount"
})
public class BudgetAccountType {

    @XmlElement(name = "AccountClass", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BudgetAccountType.AccountClass accountClass;
    @XmlElement(name = "FundBreakdown", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fundBreakdown;
    @XmlElement(name = "FunctionBreakdown", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String functionBreakdown;
    @XmlElement(name = "ObjectBreakdown", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String objectBreakdown;
    @XmlElement(name = "BudgetAmount", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long budgetAmount;

    /**
     * Gets the value of the accountClass property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetAccountType.AccountClass }
     *     
     */
    public BudgetAccountType.AccountClass getAccountClass() {
        return accountClass;
    }

    /**
     * Sets the value of the accountClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetAccountType.AccountClass }
     *     
     */
    public void setAccountClass(BudgetAccountType.AccountClass value) {
        this.accountClass = value;
    }

    /**
     * Gets the value of the fundBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundBreakdown() {
        return fundBreakdown;
    }

    /**
     * Sets the value of the fundBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundBreakdown(String value) {
        this.fundBreakdown = value;
    }

    /**
     * Gets the value of the functionBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionBreakdown() {
        return functionBreakdown;
    }

    /**
     * Sets the value of the functionBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionBreakdown(String value) {
        this.functionBreakdown = value;
    }

    /**
     * Gets the value of the objectBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectBreakdown() {
        return objectBreakdown;
    }

    /**
     * Sets the value of the objectBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectBreakdown(String value) {
        this.objectBreakdown = value;
    }

    /**
     * Gets the value of the budgetAmount property.
     * 
     */
    public long getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     */
    public void setBudgetAmount(long value) {
        this.budgetAmount = value;
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
    public static class AccountClass {

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
