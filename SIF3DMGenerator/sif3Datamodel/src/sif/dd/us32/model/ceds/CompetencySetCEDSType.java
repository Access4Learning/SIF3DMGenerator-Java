
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for competencySetCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="competencySetCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="competencySetCompletionCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="competencySetCompletionCriteriaThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competencySetCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "competencySetCompletionCriteria",
    "competencySetCompletionCriteriaThreshold"
})
public class CompetencySetCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String competencySetCompletionCriteria;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String competencySetCompletionCriteriaThreshold;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the competencySetCompletionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencySetCompletionCriteria() {
        return competencySetCompletionCriteria;
    }

    /**
     * Sets the value of the competencySetCompletionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencySetCompletionCriteria(String value) {
        this.competencySetCompletionCriteria = value;
    }

    /**
     * Gets the value of the competencySetCompletionCriteriaThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencySetCompletionCriteriaThreshold() {
        return competencySetCompletionCriteriaThreshold;
    }

    /**
     * Sets the value of the competencySetCompletionCriteriaThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencySetCompletionCriteriaThreshold(String value) {
        this.competencySetCompletionCriteriaThreshold = value;
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
