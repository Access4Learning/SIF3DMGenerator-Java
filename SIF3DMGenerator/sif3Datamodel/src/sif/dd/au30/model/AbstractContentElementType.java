
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AbstractContentElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractContentElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="XMLData" type="{http://www.sifassociation.org/datamodel/au/3.4}XMLDataType"/>
 *           &lt;element name="TextData" type="{http://www.sifassociation.org/datamodel/au/3.4}TextDataType"/>
 *           &lt;element name="BinaryData" type="{http://www.sifassociation.org/datamodel/au/3.4}BinaryDataType"/>
 *           &lt;element name="Reference" type="{http://www.sifassociation.org/datamodel/au/3.4}ReferenceDataType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractContentElementType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "xmlData",
    "textData",
    "binaryData",
    "reference"
})
@XmlSeeAlso({
    LearningResourcePackageType.class
})
public class AbstractContentElementType {

    @XmlElement(name = "XMLData", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLDataType xmlData;
    @XmlElement(name = "TextData", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected TextDataType textData;
    @XmlElement(name = "BinaryData", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BinaryDataType binaryData;
    @XmlElement(name = "Reference", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ReferenceDataType reference;
    @XmlAttribute(name = "RefId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the xmlData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLDataType }
     *     
     */
    public XMLDataType getXMLData() {
        return xmlData;
    }

    /**
     * Sets the value of the xmlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDataType }
     *     
     */
    public void setXMLData(XMLDataType value) {
        this.xmlData = value;
    }

    /**
     * Gets the value of the textData property.
     * 
     * @return
     *     possible object is
     *     {@link TextDataType }
     *     
     */
    public TextDataType getTextData() {
        return textData;
    }

    /**
     * Sets the value of the textData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDataType }
     *     
     */
    public void setTextData(TextDataType value) {
        this.textData = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataType }
     *     
     */
    public BinaryDataType getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataType }
     *     
     */
    public void setBinaryData(BinaryDataType value) {
        this.binaryData = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setReference(ReferenceDataType value) {
        this.reference = value;
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
