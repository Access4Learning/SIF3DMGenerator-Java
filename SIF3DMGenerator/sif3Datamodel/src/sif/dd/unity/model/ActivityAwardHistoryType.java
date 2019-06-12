
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
 * <p>Java class for ActivityAwardHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityAwardHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="InvolvementCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvolvementBeginningDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="InvolvementEndingDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="InvolvementAmount" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="HonorsInformationCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HonorsDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DiplomaCredentialHonorsCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DiplomaCredentialHonorsDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityAwardHistoryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "involvementCode",
    "involvementBeginningDate",
    "involvementEndingDate",
    "involvementAmount",
    "honorsInformationCode",
    "honorsDescription",
    "diplomaCredentialHonorsCode",
    "diplomaCredentialHonorsDescription",
    "sifExtendedElements"
})
public class ActivityAwardHistoryType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "InvolvementCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityAwardHistoryType.InvolvementCode involvementCode;
    @XmlElement(name = "InvolvementBeginningDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String involvementBeginningDate;
    @XmlElement(name = "InvolvementEndingDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String involvementEndingDate;
    @XmlElement(name = "InvolvementAmount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String involvementAmount;
    @XmlElement(name = "HonorsInformationCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityAwardHistoryType.HonorsInformationCode honorsInformationCode;
    @XmlElement(name = "HonorsDescription", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String honorsDescription;
    @XmlElement(name = "DiplomaCredentialHonorsCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityAwardHistoryType.DiplomaCredentialHonorsCode diplomaCredentialHonorsCode;
    @XmlElement(name = "DiplomaCredentialHonorsDescription", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String diplomaCredentialHonorsDescription;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the involvementCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAwardHistoryType.InvolvementCode }
     *     
     */
    public ActivityAwardHistoryType.InvolvementCode getInvolvementCode() {
        return involvementCode;
    }

    /**
     * Sets the value of the involvementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAwardHistoryType.InvolvementCode }
     *     
     */
    public void setInvolvementCode(ActivityAwardHistoryType.InvolvementCode value) {
        this.involvementCode = value;
    }

    /**
     * Gets the value of the involvementBeginningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvementBeginningDate() {
        return involvementBeginningDate;
    }

    /**
     * Sets the value of the involvementBeginningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvementBeginningDate(String value) {
        this.involvementBeginningDate = value;
    }

    /**
     * Gets the value of the involvementEndingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvementEndingDate() {
        return involvementEndingDate;
    }

    /**
     * Sets the value of the involvementEndingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvementEndingDate(String value) {
        this.involvementEndingDate = value;
    }

    /**
     * Gets the value of the involvementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvementAmount() {
        return involvementAmount;
    }

    /**
     * Sets the value of the involvementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvementAmount(String value) {
        this.involvementAmount = value;
    }

    /**
     * Gets the value of the honorsInformationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAwardHistoryType.HonorsInformationCode }
     *     
     */
    public ActivityAwardHistoryType.HonorsInformationCode getHonorsInformationCode() {
        return honorsInformationCode;
    }

    /**
     * Sets the value of the honorsInformationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAwardHistoryType.HonorsInformationCode }
     *     
     */
    public void setHonorsInformationCode(ActivityAwardHistoryType.HonorsInformationCode value) {
        this.honorsInformationCode = value;
    }

    /**
     * Gets the value of the honorsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHonorsDescription() {
        return honorsDescription;
    }

    /**
     * Sets the value of the honorsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHonorsDescription(String value) {
        this.honorsDescription = value;
    }

    /**
     * Gets the value of the diplomaCredentialHonorsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAwardHistoryType.DiplomaCredentialHonorsCode }
     *     
     */
    public ActivityAwardHistoryType.DiplomaCredentialHonorsCode getDiplomaCredentialHonorsCode() {
        return diplomaCredentialHonorsCode;
    }

    /**
     * Sets the value of the diplomaCredentialHonorsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAwardHistoryType.DiplomaCredentialHonorsCode }
     *     
     */
    public void setDiplomaCredentialHonorsCode(ActivityAwardHistoryType.DiplomaCredentialHonorsCode value) {
        this.diplomaCredentialHonorsCode = value;
    }

    /**
     * Gets the value of the diplomaCredentialHonorsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplomaCredentialHonorsDescription() {
        return diplomaCredentialHonorsDescription;
    }

    /**
     * Sets the value of the diplomaCredentialHonorsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomaCredentialHonorsDescription(String value) {
        this.diplomaCredentialHonorsDescription = value;
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
    public static class DiplomaCredentialHonorsCode {

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
    public static class HonorsInformationCode {

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
    public static class InvolvementCode {

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
