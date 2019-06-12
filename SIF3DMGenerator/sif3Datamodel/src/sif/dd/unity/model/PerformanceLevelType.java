
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PerformanceLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CutScores" type="{http://www.sifassociation.org/datamodel/na/4.x}CutScoresType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LevelName" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceLevelType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "cutScores"
})
public class PerformanceLevelType {

    @XmlElement(name = "CutScores", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CutScoresType cutScores;
    @XmlAttribute(name = "LevelName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String levelName;

    /**
     * Gets the value of the cutScores property.
     * 
     * @return
     *     possible object is
     *     {@link CutScoresType }
     *     
     */
    public CutScoresType getCutScores() {
        return cutScores;
    }

    /**
     * Sets the value of the cutScores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutScoresType }
     *     
     */
    public void setCutScores(CutScoresType value) {
        this.cutScores = value;
    }

    /**
     * Gets the value of the levelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * Sets the value of the levelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelName(String value) {
        this.levelName = value;
    }

}
