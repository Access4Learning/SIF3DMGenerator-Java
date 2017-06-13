
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LanguageBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType"/>
 *         &lt;element name="OtherCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}OtherCodeListType" minOccurs="0"/>
 *         &lt;element name="LanguageType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsLanguageTypeType" minOccurs="0"/>
 *         &lt;element name="Dialect" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageBaseType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "code",
    "otherCodeList",
    "languageType",
    "dialect"
})
public class LanguageBaseType {

    @XmlElement(name = "Code", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String code;
    @XmlElementRef(name = "OtherCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<OtherCodeListType> otherCodeList;
    @XmlElementRef(name = "LanguageType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageType;
    @XmlElementRef(name = "Dialect", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dialect;

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
     * Gets the value of the otherCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}
     *     
     */
    public JAXBElement<OtherCodeListType> getOtherCodeList() {
        return otherCodeList;
    }

    /**
     * Sets the value of the otherCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}
     *     
     */
    public void setOtherCodeList(JAXBElement<OtherCodeListType> value) {
        this.otherCodeList = value;
    }

    /**
     * Gets the value of the languageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageType() {
        return languageType;
    }

    /**
     * Sets the value of the languageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageType(JAXBElement<String> value) {
        this.languageType = value;
    }

    /**
     * Gets the value of the dialect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDialect() {
        return dialect;
    }

    /**
     * Sets the value of the dialect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDialect(JAXBElement<String> value) {
        this.dialect = value;
    }

}
