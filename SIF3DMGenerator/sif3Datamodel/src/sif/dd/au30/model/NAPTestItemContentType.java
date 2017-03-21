
package sif.dd.au30.model;

import java.math.BigDecimal;
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
 * <p>Java class for NAPTestItemContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestItemContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestItemLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ItemType" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsNAPTestItemTypeType"/>
 *         &lt;element name="Subdomain" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="WritingGenre" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsNAPWritingGenreType" minOccurs="0"/>
 *         &lt;element name="ItemDescriptor" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ReleasedStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MarkingType" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsNAPTestItemMarkingTypeType"/>
 *         &lt;element name="MultipleChoiceOptionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CorrectAnswer" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="MaximumScore" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemDifficulty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemDifficultyLogit5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemDifficultyLogit62" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemDifficultyLogit5SE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemDifficultyLogit62SE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ItemProficiencyBand" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ItemProficiencyLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ExemplarURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ItemSubstitutedForList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SubstituteItemListType" minOccurs="0"/>
 *         &lt;element name="ContentDescriptionList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}ContentDescriptionListType" minOccurs="0"/>
 *         &lt;element name="StimulusList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StimulusListType" minOccurs="0"/>
 *         &lt;element name="NAPWritingRubricList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}NAPWritingRubricListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestItemContentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "napTestItemLocalId",
    "itemName",
    "itemType",
    "subdomain",
    "writingGenre",
    "itemDescriptor",
    "releasedStatus",
    "markingType",
    "multipleChoiceOptionCount",
    "correctAnswer",
    "maximumScore",
    "itemDifficulty",
    "itemDifficultyLogit5",
    "itemDifficultyLogit62",
    "itemDifficultyLogit5SE",
    "itemDifficultyLogit62SE",
    "itemProficiencyBand",
    "itemProficiencyLevel",
    "exemplarURL",
    "itemSubstitutedForList",
    "contentDescriptionList",
    "stimulusList",
    "napWritingRubricList"
})
public class NAPTestItemContentType {

    @XmlElement(name = "NAPTestItemLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestItemLocalId;
    @XmlElement(name = "ItemName", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemName;
    @XmlElement(name = "ItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected AUCodeSetsNAPTestItemTypeType itemType;
    @XmlElement(name = "Subdomain", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subdomain;
    @XmlElementRef(name = "WritingGenre", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsNAPWritingGenreType> writingGenre;
    @XmlElement(name = "ItemDescriptor", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemDescriptor;
    @XmlElement(name = "ReleasedStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
    protected boolean releasedStatus;
    @XmlElement(name = "MarkingType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected AUCodeSetsNAPTestItemMarkingTypeType markingType;
    @XmlElementRef(name = "MultipleChoiceOptionCount", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> multipleChoiceOptionCount;
    @XmlElementRef(name = "CorrectAnswer", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correctAnswer;
    @XmlElement(name = "MaximumScore", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal maximumScore;
    @XmlElement(name = "ItemDifficulty", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal itemDifficulty;
    @XmlElement(name = "ItemDifficultyLogit5", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal itemDifficultyLogit5;
    @XmlElement(name = "ItemDifficultyLogit62", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal itemDifficultyLogit62;
    @XmlElement(name = "ItemDifficultyLogit5SE", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal itemDifficultyLogit5SE;
    @XmlElement(name = "ItemDifficultyLogit62SE", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal itemDifficultyLogit62SE;
    @XmlElement(name = "ItemProficiencyBand", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigInteger itemProficiencyBand;
    @XmlElement(name = "ItemProficiencyLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemProficiencyLevel;
    @XmlElementRef(name = "ExemplarURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exemplarURL;
    @XmlElementRef(name = "ItemSubstitutedForList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SubstituteItemListType> itemSubstitutedForList;
    @XmlElementRef(name = "ContentDescriptionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentDescriptionListType> contentDescriptionList;
    @XmlElementRef(name = "StimulusList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StimulusListType> stimulusList;
    @XmlElementRef(name = "NAPWritingRubricList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NAPWritingRubricListType> napWritingRubricList;

    /**
     * Gets the value of the napTestItemLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestItemLocalId() {
        return napTestItemLocalId;
    }

    /**
     * Sets the value of the napTestItemLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestItemLocalId(String value) {
        this.napTestItemLocalId = value;
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
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPTestItemTypeType }
     *     
     */
    public AUCodeSetsNAPTestItemTypeType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPTestItemTypeType }
     *     
     */
    public void setItemType(AUCodeSetsNAPTestItemTypeType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the subdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Sets the value of the subdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdomain(String value) {
        this.subdomain = value;
    }

    /**
     * Gets the value of the writingGenre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsNAPWritingGenreType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsNAPWritingGenreType> getWritingGenre() {
        return writingGenre;
    }

    /**
     * Sets the value of the writingGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsNAPWritingGenreType }{@code >}
     *     
     */
    public void setWritingGenre(JAXBElement<AUCodeSetsNAPWritingGenreType> value) {
        this.writingGenre = value;
    }

    /**
     * Gets the value of the itemDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescriptor() {
        return itemDescriptor;
    }

    /**
     * Sets the value of the itemDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescriptor(String value) {
        this.itemDescriptor = value;
    }

    /**
     * Gets the value of the releasedStatus property.
     * 
     */
    public boolean isReleasedStatus() {
        return releasedStatus;
    }

    /**
     * Sets the value of the releasedStatus property.
     * 
     */
    public void setReleasedStatus(boolean value) {
        this.releasedStatus = value;
    }

    /**
     * Gets the value of the markingType property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPTestItemMarkingTypeType }
     *     
     */
    public AUCodeSetsNAPTestItemMarkingTypeType getMarkingType() {
        return markingType;
    }

    /**
     * Sets the value of the markingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPTestItemMarkingTypeType }
     *     
     */
    public void setMarkingType(AUCodeSetsNAPTestItemMarkingTypeType value) {
        this.markingType = value;
    }

    /**
     * Gets the value of the multipleChoiceOptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMultipleChoiceOptionCount() {
        return multipleChoiceOptionCount;
    }

    /**
     * Sets the value of the multipleChoiceOptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMultipleChoiceOptionCount(JAXBElement<Integer> value) {
        this.multipleChoiceOptionCount = value;
    }

    /**
     * Gets the value of the correctAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Sets the value of the correctAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrectAnswer(JAXBElement<String> value) {
        this.correctAnswer = value;
    }

    /**
     * Gets the value of the maximumScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumScore() {
        return maximumScore;
    }

    /**
     * Sets the value of the maximumScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumScore(BigDecimal value) {
        this.maximumScore = value;
    }

    /**
     * Gets the value of the itemDifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDifficulty() {
        return itemDifficulty;
    }

    /**
     * Sets the value of the itemDifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDifficulty(BigDecimal value) {
        this.itemDifficulty = value;
    }

    /**
     * Gets the value of the itemDifficultyLogit5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDifficultyLogit5() {
        return itemDifficultyLogit5;
    }

    /**
     * Sets the value of the itemDifficultyLogit5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDifficultyLogit5(BigDecimal value) {
        this.itemDifficultyLogit5 = value;
    }

    /**
     * Gets the value of the itemDifficultyLogit62 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDifficultyLogit62() {
        return itemDifficultyLogit62;
    }

    /**
     * Sets the value of the itemDifficultyLogit62 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDifficultyLogit62(BigDecimal value) {
        this.itemDifficultyLogit62 = value;
    }

    /**
     * Gets the value of the itemDifficultyLogit5SE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDifficultyLogit5SE() {
        return itemDifficultyLogit5SE;
    }

    /**
     * Sets the value of the itemDifficultyLogit5SE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDifficultyLogit5SE(BigDecimal value) {
        this.itemDifficultyLogit5SE = value;
    }

    /**
     * Gets the value of the itemDifficultyLogit62SE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDifficultyLogit62SE() {
        return itemDifficultyLogit62SE;
    }

    /**
     * Sets the value of the itemDifficultyLogit62SE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDifficultyLogit62SE(BigDecimal value) {
        this.itemDifficultyLogit62SE = value;
    }

    /**
     * Gets the value of the itemProficiencyBand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemProficiencyBand() {
        return itemProficiencyBand;
    }

    /**
     * Sets the value of the itemProficiencyBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemProficiencyBand(BigInteger value) {
        this.itemProficiencyBand = value;
    }

    /**
     * Gets the value of the itemProficiencyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemProficiencyLevel() {
        return itemProficiencyLevel;
    }

    /**
     * Sets the value of the itemProficiencyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemProficiencyLevel(String value) {
        this.itemProficiencyLevel = value;
    }

    /**
     * Gets the value of the exemplarURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExemplarURL() {
        return exemplarURL;
    }

    /**
     * Sets the value of the exemplarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExemplarURL(JAXBElement<String> value) {
        this.exemplarURL = value;
    }

    /**
     * Gets the value of the itemSubstitutedForList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubstituteItemListType }{@code >}
     *     
     */
    public JAXBElement<SubstituteItemListType> getItemSubstitutedForList() {
        return itemSubstitutedForList;
    }

    /**
     * Sets the value of the itemSubstitutedForList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubstituteItemListType }{@code >}
     *     
     */
    public void setItemSubstitutedForList(JAXBElement<SubstituteItemListType> value) {
        this.itemSubstitutedForList = value;
    }

    /**
     * Gets the value of the contentDescriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentDescriptionListType }{@code >}
     *     
     */
    public JAXBElement<ContentDescriptionListType> getContentDescriptionList() {
        return contentDescriptionList;
    }

    /**
     * Sets the value of the contentDescriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentDescriptionListType }{@code >}
     *     
     */
    public void setContentDescriptionList(JAXBElement<ContentDescriptionListType> value) {
        this.contentDescriptionList = value;
    }

    /**
     * Gets the value of the stimulusList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StimulusListType }{@code >}
     *     
     */
    public JAXBElement<StimulusListType> getStimulusList() {
        return stimulusList;
    }

    /**
     * Sets the value of the stimulusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StimulusListType }{@code >}
     *     
     */
    public void setStimulusList(JAXBElement<StimulusListType> value) {
        this.stimulusList = value;
    }

    /**
     * Gets the value of the napWritingRubricList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NAPWritingRubricListType }{@code >}
     *     
     */
    public JAXBElement<NAPWritingRubricListType> getNAPWritingRubricList() {
        return napWritingRubricList;
    }

    /**
     * Sets the value of the napWritingRubricList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NAPWritingRubricListType }{@code >}
     *     
     */
    public void setNAPWritingRubricList(JAXBElement<NAPWritingRubricListType> value) {
        this.napWritingRubricList = value;
    }

}
