
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FoodserviceCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MealStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}MealStatusType" minOccurs="0"/>
 *           &lt;element name="EarnedStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}EarnedStatusType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="SIF_RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SIF_RefObject" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceCustomerType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mealStatus",
    "earnedStatus"
})
public class FoodserviceCustomerType {

    @XmlElement(name = "MealStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MealStatusType mealStatus;
    @XmlElement(name = "EarnedStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EarnedStatusType earnedStatus;
    @XmlAttribute(name = "SIF_RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefId;
    @XmlAttribute(name = "SIF_RefObject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObject;

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
     * Gets the value of the sifRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefId() {
        return sifRefId;
    }

    /**
     * Sets the value of the sifRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefId(String value) {
        this.sifRefId = value;
    }

    /**
     * Gets the value of the sifRefObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObject() {
        return sifRefObject;
    }

    /**
     * Sets the value of the sifRefObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObject(String value) {
        this.sifRefObject = value;
    }

}
