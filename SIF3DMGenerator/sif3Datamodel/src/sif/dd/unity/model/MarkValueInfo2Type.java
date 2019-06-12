
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarkValueInfo2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkValueInfo2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Percentage" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkValuePercentageCleanType" minOccurs="0"/>
 *         &lt;element name="Numeric" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkValueNumberCleanType" minOccurs="0"/>
 *         &lt;element name="Letter" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkValueLetterCleanType" minOccurs="0"/>
 *         &lt;element name="Narrative" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkValueNarrativeCleanType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkValueInfo2Type", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "percentage",
    "numeric",
    "letter",
    "narrative",
    "sifExtendedElements"
})
public class MarkValueInfo2Type {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String name;
    @XmlElement(name = "Percentage", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkValuePercentageCleanType percentage;
    @XmlElement(name = "Numeric", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkValueNumberCleanType numeric;
    @XmlElement(name = "Letter", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkValueLetterCleanType letter;
    @XmlElement(name = "Narrative", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkValueNarrativeCleanType narrative;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link MarkValuePercentageCleanType }
     *     
     */
    public MarkValuePercentageCleanType getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkValuePercentageCleanType }
     *     
     */
    public void setPercentage(MarkValuePercentageCleanType value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the numeric property.
     * 
     * @return
     *     possible object is
     *     {@link MarkValueNumberCleanType }
     *     
     */
    public MarkValueNumberCleanType getNumeric() {
        return numeric;
    }

    /**
     * Sets the value of the numeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkValueNumberCleanType }
     *     
     */
    public void setNumeric(MarkValueNumberCleanType value) {
        this.numeric = value;
    }

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link MarkValueLetterCleanType }
     *     
     */
    public MarkValueLetterCleanType getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkValueLetterCleanType }
     *     
     */
    public void setLetter(MarkValueLetterCleanType value) {
        this.letter = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link MarkValueNarrativeCleanType }
     *     
     */
    public MarkValueNarrativeCleanType getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkValueNarrativeCleanType }
     *     
     */
    public void setNarrative(MarkValueNarrativeCleanType value) {
        this.narrative = value;
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

}
