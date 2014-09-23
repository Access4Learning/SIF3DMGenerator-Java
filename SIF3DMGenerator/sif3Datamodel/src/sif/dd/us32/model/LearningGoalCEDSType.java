
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learningGoalCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningGoalCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningGoalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningGoalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningGoalSuccessCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "learningGoalCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learningGoalType",
    "endDate",
    "startDate",
    "learningGoalDescription",
    "learningGoalSuccessCriteria"
})
public class LearningGoalCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningGoalType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String endDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningGoalDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningGoalSuccessCriteria;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the learningGoalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningGoalType() {
        return learningGoalType;
    }

    /**
     * Sets the value of the learningGoalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningGoalType(String value) {
        this.learningGoalType = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the learningGoalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningGoalDescription() {
        return learningGoalDescription;
    }

    /**
     * Sets the value of the learningGoalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningGoalDescription(String value) {
        this.learningGoalDescription = value;
    }

    /**
     * Gets the value of the learningGoalSuccessCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningGoalSuccessCriteria() {
        return learningGoalSuccessCriteria;
    }

    /**
     * Sets the value of the learningGoalSuccessCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningGoalSuccessCriteria(String value) {
        this.learningGoalSuccessCriteria = value;
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
