
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
 *         &lt;element name="StimulusLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="TextGenre" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="WordCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TextDescriptor" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StimulusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "stimulusLocalId",
    "textGenre",
    "textType",
    "wordCount",
    "textDescriptor",
    "content"
})
public class StimulusType {

    @XmlElement(name = "StimulusLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stimulusLocalId;
    @XmlElementRef(name = "TextGenre", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textGenre;
    @XmlElementRef(name = "TextType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textType;
    @XmlElementRef(name = "WordCount", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> wordCount;
    @XmlElement(name = "TextDescriptor", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String textDescriptor;
    @XmlElement(name = "Content", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String content;

    /**
     * Gets the value of the stimulusLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStimulusLocalId() {
        return stimulusLocalId;
    }

    /**
     * Sets the value of the stimulusLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStimulusLocalId(String value) {
        this.stimulusLocalId = value;
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
     * Gets the value of the textDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDescriptor() {
        return textDescriptor;
    }

    /**
     * Sets the value of the textDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDescriptor(String value) {
        this.textDescriptor = value;
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
