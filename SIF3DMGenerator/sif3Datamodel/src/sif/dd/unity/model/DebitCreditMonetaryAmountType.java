
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DebitCreditMonetaryAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitCreditMonetaryAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>MonetaryAmountType">
 *       &lt;attribute name="FinancialAccountAccountingPeriodLocationInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="TypeCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitCreditMonetaryAmountType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
public class DebitCreditMonetaryAmountType
    extends MonetaryAmountType
{

    @XmlAttribute(name = "FinancialAccountAccountingPeriodLocationInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialAccountAccountingPeriodLocationInfoRefId;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String type;
    @XmlAttribute(name = "TypeCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCodeset;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCodeset() {
        return typeCodeset;
    }

    /**
     * Sets the value of the typeCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCodeset(String value) {
        this.typeCodeset = value;
    }

}
