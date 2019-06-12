
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SectionCorrelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionCorrelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CorrelationType" type="{http://www.sifassociation.org/datamodel/na/4.x}CorrelationTypeType" minOccurs="0"/>
 *         &lt;element name="CorrelationSectionList" type="{http://www.sifassociation.org/datamodel/na/4.x}CorrelationSectionListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
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
@XmlType(name = "SectionCorrelationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "correlationName",
    "correlationType",
    "correlationSectionList",
    "sifMetadata",
    "sifExtendedElements"
})
public class SectionCorrelationType {

    @XmlElement(name = "CorrelationName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String correlationName;
    @XmlElement(name = "CorrelationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CorrelationTypeType correlationType;
    @XmlElement(name = "CorrelationSectionList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CorrelationSectionListType correlationSectionList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the correlationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationName() {
        return correlationName;
    }

    /**
     * Sets the value of the correlationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationName(String value) {
        this.correlationName = value;
    }

    /**
     * Gets the value of the correlationType property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationTypeType }
     *     
     */
    public CorrelationTypeType getCorrelationType() {
        return correlationType;
    }

    /**
     * Sets the value of the correlationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationTypeType }
     *     
     */
    public void setCorrelationType(CorrelationTypeType value) {
        this.correlationType = value;
    }

    /**
     * Gets the value of the correlationSectionList property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationSectionListType }
     *     
     */
    public CorrelationSectionListType getCorrelationSectionList() {
        return correlationSectionList;
    }

    /**
     * Sets the value of the correlationSectionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationSectionListType }
     *     
     */
    public void setCorrelationSectionList(CorrelationSectionListType value) {
        this.correlationSectionList = value;
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

}
