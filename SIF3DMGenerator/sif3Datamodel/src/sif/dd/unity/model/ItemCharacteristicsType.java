
package sif.dd.unity.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for ItemCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PercentCorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SampleSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SampleDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Measurements" type="{http://www.sifassociation.org/datamodel/na/4.x}ItemCharacteristicsMeasurementListType" minOccurs="0"/>
 *         &lt;element name="Descriptive" type="{http://www.sifassociation.org/datamodel/na/4.x}ItemCharacteristicsDescriptiveType" minOccurs="0"/>
 *         &lt;element name="DifferentialItemAnalysis" type="{http://www.sifassociation.org/datamodel/na/4.x}ItemCharacteristicsDifferentialItemAnalysisType" minOccurs="0"/>
 *         &lt;element name="ResponseChoicePattern" type="{http://www.sifassociation.org/datamodel/na/4.x}ItemCharacteristicsChoiceListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="AssessmentItemRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="AssessmentFormRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCharacteristicsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "percentCorrect",
    "sampleSize",
    "sampleDescription",
    "measurements",
    "descriptive",
    "differentialItemAnalysis",
    "responseChoicePattern",
    "sifMetadata",
    "sifExtendedElements"
})
public class ItemCharacteristicsType {

    @XmlElement(name = "PercentCorrect", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal percentCorrect;
    @XmlElement(name = "SampleSize", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger sampleSize;
    @XmlElement(name = "SampleDescription", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sampleDescription;
    @XmlElement(name = "Measurements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ItemCharacteristicsMeasurementListType measurements;
    @XmlElement(name = "Descriptive", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ItemCharacteristicsDescriptiveType descriptive;
    @XmlElement(name = "DifferentialItemAnalysis", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ItemCharacteristicsDifferentialItemAnalysisType differentialItemAnalysis;
    @XmlElement(name = "ResponseChoicePattern", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ItemCharacteristicsChoiceListType responseChoicePattern;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "AssessmentItemRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentItemRefId;
    @XmlAttribute(name = "AssessmentFormRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentFormRefId;

    /**
     * Gets the value of the percentCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentCorrect() {
        return percentCorrect;
    }

    /**
     * Sets the value of the percentCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentCorrect(BigDecimal value) {
        this.percentCorrect = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleSize(BigInteger value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the sampleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleDescription() {
        return sampleDescription;
    }

    /**
     * Sets the value of the sampleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleDescription(String value) {
        this.sampleDescription = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCharacteristicsMeasurementListType }
     *     
     */
    public ItemCharacteristicsMeasurementListType getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCharacteristicsMeasurementListType }
     *     
     */
    public void setMeasurements(ItemCharacteristicsMeasurementListType value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the descriptive property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCharacteristicsDescriptiveType }
     *     
     */
    public ItemCharacteristicsDescriptiveType getDescriptive() {
        return descriptive;
    }

    /**
     * Sets the value of the descriptive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCharacteristicsDescriptiveType }
     *     
     */
    public void setDescriptive(ItemCharacteristicsDescriptiveType value) {
        this.descriptive = value;
    }

    /**
     * Gets the value of the differentialItemAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCharacteristicsDifferentialItemAnalysisType }
     *     
     */
    public ItemCharacteristicsDifferentialItemAnalysisType getDifferentialItemAnalysis() {
        return differentialItemAnalysis;
    }

    /**
     * Sets the value of the differentialItemAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCharacteristicsDifferentialItemAnalysisType }
     *     
     */
    public void setDifferentialItemAnalysis(ItemCharacteristicsDifferentialItemAnalysisType value) {
        this.differentialItemAnalysis = value;
    }

    /**
     * Gets the value of the responseChoicePattern property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCharacteristicsChoiceListType }
     *     
     */
    public ItemCharacteristicsChoiceListType getResponseChoicePattern() {
        return responseChoicePattern;
    }

    /**
     * Sets the value of the responseChoicePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCharacteristicsChoiceListType }
     *     
     */
    public void setResponseChoicePattern(ItemCharacteristicsChoiceListType value) {
        this.responseChoicePattern = value;
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
     * Gets the value of the assessmentItemRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemRefId() {
        return assessmentItemRefId;
    }

    /**
     * Sets the value of the assessmentItemRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemRefId(String value) {
        this.assessmentItemRefId = value;
    }

    /**
     * Gets the value of the assessmentFormRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormRefId() {
        return assessmentFormRefId;
    }

    /**
     * Sets the value of the assessmentFormRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormRefId(String value) {
        this.assessmentFormRefId = value;
    }

}
