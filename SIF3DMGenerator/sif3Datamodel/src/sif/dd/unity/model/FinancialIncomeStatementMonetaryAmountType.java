
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FinancialIncomeStatementMonetaryAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialIncomeStatementMonetaryAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>MonetaryAmountType">
 *       &lt;attribute name="FinancialAccountAccountingPeriodLocationInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="FinancialClassRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialIncomeStatementMonetaryAmountType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
public class FinancialIncomeStatementMonetaryAmountType
    extends MonetaryAmountType
{

    @XmlAttribute(name = "FinancialAccountAccountingPeriodLocationInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialAccountAccountingPeriodLocationInfoRefId;
    @XmlAttribute(name = "FinancialClassRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialClassRefId;

    /**
     * Gets the value of the financialAccountAccountingPeriodLocationInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAccountAccountingPeriodLocationInfoRefId() {
        return financialAccountAccountingPeriodLocationInfoRefId;
    }

    /**
     * Sets the value of the financialAccountAccountingPeriodLocationInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAccountAccountingPeriodLocationInfoRefId(String value) {
        this.financialAccountAccountingPeriodLocationInfoRefId = value;
    }

    /**
     * Gets the value of the financialClassRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialClassRefId() {
        return financialClassRefId;
    }

    /**
     * Sets the value of the financialClassRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialClassRefId(String value) {
        this.financialClassRefId = value;
    }

}
