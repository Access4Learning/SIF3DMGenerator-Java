
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ScoreDescriptionList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}ScoreDescriptionListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "maxScoreValue",
    "scoreDescriptionList"
})
public class ScoreType {

    @XmlElement(name = "MaxScoreValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal maxScoreValue;
    @XmlElement(name = "ScoreDescriptionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected ScoreDescriptionListType scoreDescriptionList;

    /**
     * Gets the value of the maxScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxScoreValue() {
        return maxScoreValue;
    }

    /**
     * Sets the value of the maxScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxScoreValue(BigDecimal value) {
        this.maxScoreValue = value;
    }

    /**
     * Gets the value of the scoreDescriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreDescriptionListType }
     *     
     */
    public ScoreDescriptionListType getScoreDescriptionList() {
        return scoreDescriptionList;
    }

    /**
     * Sets the value of the scoreDescriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreDescriptionListType }
     *     
     */
    public void setScoreDescriptionList(ScoreDescriptionListType value) {
        this.scoreDescriptionList = value;
    }

}
