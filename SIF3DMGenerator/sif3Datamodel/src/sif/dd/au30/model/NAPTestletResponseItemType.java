
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Scores received by the student for teach item in the testlet
 * 
 * <p>Java class for NAPTestletResponseItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestItemLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCorrectness" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPResponseCorrectnessType"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LapsedTimeItem" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ItemWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SubscoreList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPSubscoreListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletResponseItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestItemRefId",
    "napTestItemLocalId",
    "response",
    "responseCorrectness",
    "score",
    "lapsedTimeItem",
    "sequenceNumber",
    "itemWeight",
    "subscoreList"
})
public class NAPTestletResponseItemType {

    @XmlElementRef(name = "NAPTestItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestItemRefId;
    @XmlElement(name = "NAPTestItemLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestItemLocalId;
    @XmlElementRef(name = "Response", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> response;
    @XmlElement(name = "ResponseCorrectness", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AUCodeSetsNAPResponseCorrectnessType responseCorrectness;
    @XmlElementRef(name = "Score", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> score;
    @XmlElementRef(name = "LapsedTimeItem", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> lapsedTimeItem;
    @XmlElement(name = "SequenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigInteger sequenceNumber;
    @XmlElement(name = "ItemWeight", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal itemWeight;
    @XmlElementRef(name = "SubscoreList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<NAPSubscoreListType> subscoreList;

    /**
     * Gets the value of the napTestItemRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestItemRefId() {
        return napTestItemRefId;
    }

    /**
     * Sets the value of the napTestItemRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestItemRefId(JAXBElement<String> value) {
        this.napTestItemRefId = value;
    }

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = value;
    }

    /**
     * Gets the value of the responseCorrectness property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPResponseCorrectnessType }
     *     
     */
    public AUCodeSetsNAPResponseCorrectnessType getResponseCorrectness() {
        return responseCorrectness;
    }

    /**
     * Sets the value of the responseCorrectness property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPResponseCorrectnessType }
     *     
     */
    public void setResponseCorrectness(AUCodeSetsNAPResponseCorrectnessType value) {
        this.responseCorrectness = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setScore(JAXBElement<BigDecimal> value) {
        this.score = value;
    }

    /**
     * Gets the value of the lapsedTimeItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getLapsedTimeItem() {
        return lapsedTimeItem;
    }

    /**
     * Sets the value of the lapsedTimeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setLapsedTimeItem(JAXBElement<Duration> value) {
        this.lapsedTimeItem = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the itemWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemWeight(BigDecimal value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the subscoreList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NAPSubscoreListType }{@code >}
     *     
     */
    public JAXBElement<NAPSubscoreListType> getSubscoreList() {
        return subscoreList;
    }

    /**
     * Sets the value of the subscoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NAPSubscoreListType }{@code >}
     *     
     */
    public void setSubscoreList(JAXBElement<NAPSubscoreListType> value) {
        this.subscoreList = value;
    }

}
