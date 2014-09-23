
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An element that is defined by a set of codes.  In SIF this is a list separate from the XSD. Annotations in the XSD where the code is instantiated identify which code set to use.
 * 
 * <p>Java class for gCodedElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gCodedElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="hexValue">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *                 &lt;length value="4"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="hexValueDashed">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                 &lt;pattern value="[0-9A-F]{2}\-[0-9A-F]{2}\-[0-9A-F]{2}\-[0-9A-F]{2}"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="otherCodeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="otherCode" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="codesetName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="codesetName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gCodedElementType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "code",
    "hexValue",
    "hexValueDashed",
    "otherCodeList"
})
@XmlSeeAlso({
    GOperationalStatusType.class,
    GCountryType.class,
    GElectoralDistrictType.class,
    GLanguageType.class,
    GEthnicityType.class,
    GYearGroupType.class,
    GStateProvinceType.class
})
public class GCodedElementType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] hexValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hexValueDashed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCodedElementType.OtherCodeList otherCodeList;
    @XmlAttribute(name = "codesetName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String codesetName;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the hexValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getHexValue() {
        return hexValue;
    }

    /**
     * Sets the value of the hexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexValue(byte[] value) {
        this.hexValue = value;
    }

    /**
     * Gets the value of the hexValueDashed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexValueDashed() {
        return hexValueDashed;
    }

    /**
     * Sets the value of the hexValueDashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexValueDashed(String value) {
        this.hexValueDashed = value;
    }

    /**
     * Gets the value of the otherCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link GCodedElementType.OtherCodeList }
     *     
     */
    public GCodedElementType.OtherCodeList getOtherCodeList() {
        return otherCodeList;
    }

    /**
     * Sets the value of the otherCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCodedElementType.OtherCodeList }
     *     
     */
    public void setOtherCodeList(GCodedElementType.OtherCodeList value) {
        this.otherCodeList = value;
    }

    /**
     * Gets the value of the codesetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetName() {
        return codesetName;
    }

    /**
     * Sets the value of the codesetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetName(String value) {
        this.codesetName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="otherCode" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="codesetName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherCode"
    })
    public static class OtherCodeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GCodedElementType.OtherCodeList.OtherCode> otherCode;

        /**
         * Gets the value of the otherCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCodedElementType.OtherCodeList.OtherCode }
         * 
         * 
         */
        public List<GCodedElementType.OtherCodeList.OtherCode> getOtherCode() {
            if (otherCode == null) {
                otherCode = new ArrayList<GCodedElementType.OtherCodeList.OtherCode>();
            }
            return this.otherCode;
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
         *       &lt;attribute name="codesetName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class OtherCode {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "codesetName")
            @XmlSchemaType(name = "anySimpleType")
            protected String codesetName;

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
             * Gets the value of the codesetName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodesetName() {
                return codesetName;
            }

            /**
             * Sets the value of the codesetName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodesetName(String value) {
                this.codesetName = value;
            }

        }

    }

}
