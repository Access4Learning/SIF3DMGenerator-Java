
package sif.dd.au30.model;

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
 * 
 * 
 * <p>Java class for GenericRubricType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericRubricType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RubricType" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ScoreList" type="{http://www.sifassociation.org/datamodel/au/3.4}ScoreListType"/>
 *         &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericRubricType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "rubricType",
    "scoreList",
    "descriptor"
})
public class GenericRubricType {

    @XmlElement(name = "RubricType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rubricType;
    @XmlElement(name = "ScoreList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected ScoreListType scoreList;
    @XmlElementRef(name = "Descriptor", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptor;

    /**
     * Gets the value of the rubricType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricType() {
        return rubricType;
    }

    /**
     * Sets the value of the rubricType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricType(String value) {
        this.rubricType = value;
    }

    /**
     * Gets the value of the scoreList property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreListType }
     *     
     */
    public ScoreListType getScoreList() {
        return scoreList;
    }

    /**
     * Sets the value of the scoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreListType }
     *     
     */
    public void setScoreList(ScoreListType value) {
        this.scoreList = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptor(JAXBElement<String> value) {
        this.descriptor = value;
    }

}
