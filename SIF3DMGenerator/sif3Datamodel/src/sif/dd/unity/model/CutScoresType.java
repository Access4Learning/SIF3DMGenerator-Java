
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
 * <p>Java class for CutScoresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutScoresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerCut" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="UpperCut" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ScoreMetricCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutScoresType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "lowerCut",
    "upperCut"
})
public class CutScoresType {

    @XmlElement(name = "LowerCut", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lowerCut;
    @XmlElement(name = "UpperCut", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String upperCut;
    @XmlAttribute(name = "ScoreMetric", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scoreMetric;
    @XmlAttribute(name = "ScoreMetricCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scoreMetricCodeset;

    /**
     * Gets the value of the lowerCut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerCut() {
        return lowerCut;
    }

    /**
     * Sets the value of the lowerCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerCut(String value) {
        this.lowerCut = value;
    }

    /**
     * Gets the value of the upperCut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperCut() {
        return upperCut;
    }

    /**
     * Sets the value of the upperCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperCut(String value) {
        this.upperCut = value;
    }

    /**
     * Gets the value of the scoreMetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreMetric() {
        return scoreMetric;
    }

    /**
     * Sets the value of the scoreMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreMetric(String value) {
        this.scoreMetric = value;
    }

    /**
     * Gets the value of the scoreMetricCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreMetricCodeset() {
        return scoreMetricCodeset;
    }

    /**
     * Sets the value of the scoreMetricCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreMetricCodeset(String value) {
        this.scoreMetricCodeset = value;
    }

}
