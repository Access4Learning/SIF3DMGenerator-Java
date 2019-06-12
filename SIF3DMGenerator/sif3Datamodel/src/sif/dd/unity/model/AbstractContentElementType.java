
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *           &lt;element name="XMLData" type="{http://www.sifassociation.org/datamodel/na/4.x}XMLDataType"/>
 *           &lt;element name="TextData" type="{http://www.sifassociation.org/datamodel/na/4.x}TextDataType"/>
 *           &lt;element name="BinaryData" type="{http://www.sifassociation.org/datamodel/na/4.x}TextDataType"/>
 *           &lt;element name="Reference" type="{http://www.sifassociation.org/datamodel/na/4.x}ReferenceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractContentElementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "xmlData",
    "textData",
    "binaryData",
    "reference"
})
public class AbstractContentElementType {

    @XmlElement(name = "XMLData", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected XMLDataType xmlData;
    @XmlElement(name = "TextData", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected TextDataType textData;
    @XmlElement(name = "BinaryData", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected TextDataType binaryData;
    @XmlElement(name = "Reference", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected ReferenceType reference;

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
     *     {@link TextDataType }
     *     
     */
    public TextDataType getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDataType }
     *     
     */
    public void setBinaryData(TextDataType value) {
        this.binaryData = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

}
