
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for W4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="W4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="W4Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="MaritalStatusRate">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FederalAllowancesNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="StateAllowancesNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="StateProvince" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceType"/>
 *         &lt;element name="Exempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="EmployeePersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W4Type", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "w4Date",
    "maritalStatusRate",
    "federalAllowancesNumber",
    "stateAllowancesNumber",
    "stateProvince",
    "exempt",
    "sifMetadata",
    "sifExtendedElements"
})
public class W4Type {

    @XmlElement(name = "W4Date", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar w4Date;
    @XmlElement(name = "MaritalStatusRate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected W4Type.MaritalStatusRate maritalStatusRate;
    @XmlElement(name = "FederalAllowancesNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long federalAllowancesNumber;
    @XmlElement(name = "StateAllowancesNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long stateAllowancesNumber;
    @XmlElement(name = "StateProvince", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StateProvinceType stateProvince;
    @XmlElement(name = "Exempt", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected boolean exempt;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "EmployeePersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employeePersonalRefId;

    /**
     * Gets the value of the w4Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getW4Date() {
        return w4Date;
    }

    /**
     * Sets the value of the w4Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setW4Date(XMLGregorianCalendar value) {
        this.w4Date = value;
    }

    /**
     * Gets the value of the maritalStatusRate property.
     * 
     * @return
     *     possible object is
     *     {@link W4Type.MaritalStatusRate }
     *     
     */
    public W4Type.MaritalStatusRate getMaritalStatusRate() {
        return maritalStatusRate;
    }

    /**
     * Sets the value of the maritalStatusRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link W4Type.MaritalStatusRate }
     *     
     */
    public void setMaritalStatusRate(W4Type.MaritalStatusRate value) {
        this.maritalStatusRate = value;
    }

    /**
     * Gets the value of the federalAllowancesNumber property.
     * 
     */
    public long getFederalAllowancesNumber() {
        return federalAllowancesNumber;
    }

    /**
     * Sets the value of the federalAllowancesNumber property.
     * 
     */
    public void setFederalAllowancesNumber(long value) {
        this.federalAllowancesNumber = value;
    }

    /**
     * Gets the value of the stateAllowancesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateAllowancesNumber() {
        return stateAllowancesNumber;
    }

    /**
     * Sets the value of the stateAllowancesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateAllowancesNumber(Long value) {
        this.stateAllowancesNumber = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceType }
     *     
     */
    public StateProvinceType getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceType }
     *     
     */
    public void setStateProvince(StateProvinceType value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the exempt property.
     * 
     */
    public boolean isExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     */
    public void setExempt(boolean value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the employeePersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeePersonalRefId() {
        return employeePersonalRefId;
    }

    /**
     * Sets the value of the employeePersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeePersonalRefId(String value) {
        this.employeePersonalRefId = value;
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
    public static class MaritalStatusRate {

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
