
package sif.dd.unity.model;

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
 * <p>Java class for PromotionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Promotion" type="{http://www.sifassociation.org/datamodel/na/4.x}PromotionType" minOccurs="0"/>
 *         &lt;element name="Nonpromotion" type="{http://www.sifassociation.org/datamodel/na/4.x}NonpromotionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "promotionStatus",
    "promotion",
    "nonpromotion"
})
public class PromotionInfoType {

    @XmlElement(name = "PromotionStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PromotionInfoType.PromotionStatus promotionStatus;
    @XmlElement(name = "Promotion", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PromotionType promotion;
    @XmlElement(name = "Nonpromotion", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected NonpromotionType nonpromotion;

    /**
     * Gets the value of the promotionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionInfoType.PromotionStatus }
     *     
     */
    public PromotionInfoType.PromotionStatus getPromotionStatus() {
        return promotionStatus;
    }

    /**
     * Sets the value of the promotionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionInfoType.PromotionStatus }
     *     
     */
    public void setPromotionStatus(PromotionInfoType.PromotionStatus value) {
        this.promotionStatus = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotion(PromotionType value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the nonpromotion property.
     * 
     * @return
     *     possible object is
     *     {@link NonpromotionType }
     *     
     */
    public NonpromotionType getNonpromotion() {
        return nonpromotion;
    }

    /**
     * Sets the value of the nonpromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonpromotionType }
     *     
     */
    public void setNonpromotion(NonpromotionType value) {
        this.nonpromotion = value;
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
    public static class PromotionStatus {

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
