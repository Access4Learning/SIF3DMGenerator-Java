
package sif.dd.au30.model;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StimulusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StimulusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StimulusType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPTestItemStimulusTypeType" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPTestDomainType" minOccurs="0"/>
 *         &lt;element name="TextGenre" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="WordCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Content" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
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
@XmlType(name = "StimulusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "localId",
    "stimulusType",
    "domain",
    "textGenre",
    "textType",
    "wordCount",
    "descriptor",
    "content"
})
public class StimulusType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "StimulusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsNAPTestItemStimulusTypeType stimulusType;
    @XmlElementRef(name = "Domain", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsNAPTestDomainType> domain;
    @XmlElementRef(name = "TextGenre", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textGenre;
    @XmlElementRef(name = "TextType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textType;
    @XmlElementRef(name = "WordCount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> wordCount;
    @XmlElement(name = "Descriptor", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String descriptor;
    @XmlElement(name = "Content", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String content;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stimulusType property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPTestItemStimulusTypeType }
     *     
     */
    public AUCodeSetsNAPTestItemStimulusTypeType getStimulusType() {
        return stimulusType;
    }

    /**
     * Sets the value of the stimulusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPTestItemStimulusTypeType }
     *     
     */
    public void setStimulusType(AUCodeSetsNAPTestItemStimulusTypeType value) {
        this.stimulusType = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsNAPTestDomainType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsNAPTestDomainType> getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsNAPTestDomainType }{@code >}
     *     
     */
    public void setDomain(JAXBElement<AUCodeSetsNAPTestDomainType> value) {
        this.domain = value;
    }

    /**
     * Gets the value of the textGenre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextGenre() {
        return textGenre;
    }

    /**
     * Sets the value of the textGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextGenre(JAXBElement<String> value) {
        this.textGenre = value;
    }

    /**
     * Gets the value of the textType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextType() {
        return textType;
    }

    /**
     * Sets the value of the textType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextType(JAXBElement<String> value) {
        this.textType = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setWordCount(JAXBElement<BigInteger> value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

}
