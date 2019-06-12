
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssessmentItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemLabel" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LearningStandardItems" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="Stimulus" type="{http://www.sifassociation.org/datamodel/na/4.x}AbstractContentElementType" minOccurs="0"/>
 *         &lt;element name="Stem" type="{http://www.sifassociation.org/datamodel/na/4.x}AbstractContentElementType" minOccurs="0"/>
 *         &lt;element name="ResponseChoices" type="{http://www.sifassociation.org/datamodel/na/4.x}AssessmentItemChoiceListType" minOccurs="0"/>
 *         &lt;element name="ItemScoreMaximum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ItemScoreMinimum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="PerformanceLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}PerformanceLevelListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="AssessmentFormRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="ResponseType" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ResponseTypeCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "itemLabel",
    "itemName",
    "learningStandardItems",
    "stimulus",
    "stem",
    "responseChoices",
    "itemScoreMaximum",
    "itemScoreMinimum",
    "performanceLevels",
    "sifMetadata",
    "sifExtendedElements"
})
public class AssessmentItemType {

    @XmlElement(name = "ItemLabel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemLabel;
    @XmlElement(name = "ItemName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String itemName;
    @XmlElement(name = "LearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandardItems;
    @XmlElement(name = "Stimulus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AbstractContentElementType stimulus;
    @XmlElement(name = "Stem", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AbstractContentElementType stem;
    @XmlElement(name = "ResponseChoices", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AssessmentItemChoiceListType responseChoices;
    @XmlElement(name = "ItemScoreMaximum", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemScoreMaximum;
    @XmlElement(name = "ItemScoreMinimum", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemScoreMinimum;
    @XmlElement(name = "PerformanceLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PerformanceLevelListType performanceLevels;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "AssessmentFormRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentFormRefId;
    @XmlAttribute(name = "ResponseType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responseType;
    @XmlAttribute(name = "ResponseTypeCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responseTypeCodeset;

    /**
     * Gets the value of the itemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLabel() {
        return itemLabel;
    }

    /**
     * Sets the value of the itemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLabel(String value) {
        this.itemLabel = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the learningStandardItems property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getLearningStandardItems() {
        return learningStandardItems;
    }

    /**
     * Sets the value of the learningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setLearningStandardItems(LearningStandardItemRefIdListType value) {
        this.learningStandardItems = value;
    }

    /**
     * Gets the value of the stimulus property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractContentElementType }
     *     
     */
    public AbstractContentElementType getStimulus() {
        return stimulus;
    }

    /**
     * Sets the value of the stimulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractContentElementType }
     *     
     */
    public void setStimulus(AbstractContentElementType value) {
        this.stimulus = value;
    }

    /**
     * Gets the value of the stem property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractContentElementType }
     *     
     */
    public AbstractContentElementType getStem() {
        return stem;
    }

    /**
     * Sets the value of the stem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractContentElementType }
     *     
     */
    public void setStem(AbstractContentElementType value) {
        this.stem = value;
    }

    /**
     * Gets the value of the responseChoices property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemChoiceListType }
     *     
     */
    public AssessmentItemChoiceListType getResponseChoices() {
        return responseChoices;
    }

    /**
     * Sets the value of the responseChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemChoiceListType }
     *     
     */
    public void setResponseChoices(AssessmentItemChoiceListType value) {
        this.responseChoices = value;
    }

    /**
     * Gets the value of the itemScoreMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemScoreMaximum() {
        return itemScoreMaximum;
    }

    /**
     * Sets the value of the itemScoreMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemScoreMaximum(String value) {
        this.itemScoreMaximum = value;
    }

    /**
     * Gets the value of the itemScoreMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemScoreMinimum() {
        return itemScoreMinimum;
    }

    /**
     * Sets the value of the itemScoreMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemScoreMinimum(String value) {
        this.itemScoreMinimum = value;
    }

    /**
     * Gets the value of the performanceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLevelListType }
     *     
     */
    public PerformanceLevelListType getPerformanceLevels() {
        return performanceLevels;
    }

    /**
     * Sets the value of the performanceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLevelListType }
     *     
     */
    public void setPerformanceLevels(PerformanceLevelListType value) {
        this.performanceLevels = value;
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

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the responseTypeCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTypeCodeset() {
        return responseTypeCodeset;
    }

    /**
     * Sets the value of the responseTypeCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTypeCodeset(String value) {
        this.responseTypeCodeset = value;
    }

}
