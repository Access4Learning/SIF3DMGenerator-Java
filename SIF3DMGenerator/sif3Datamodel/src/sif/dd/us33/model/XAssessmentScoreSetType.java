
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xAssessmentScoreSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAssessmentScoreSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.3}xGradeLevelType" minOccurs="0"/>
 *         &lt;element name="subTestSubjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}xAcademicSubjectType" minOccurs="0"/>
 *         &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="scores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="score" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentScoreType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAssessmentScoreSetType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "assessmentGradeLevel",
    "subTestSubjectArea",
    "subTestName",
    "scores",
    "any"
})
public class XAssessmentScoreSetType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentGradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subTestSubjectArea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subTestName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XAssessmentScoreSetType.Scores scores;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the assessmentGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentGradeLevel() {
        return assessmentGradeLevel;
    }

    /**
     * Sets the value of the assessmentGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentGradeLevel(String value) {
        this.assessmentGradeLevel = value;
    }

    /**
     * Gets the value of the subTestSubjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTestSubjectArea() {
        return subTestSubjectArea;
    }

    /**
     * Sets the value of the subTestSubjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTestSubjectArea(String value) {
        this.subTestSubjectArea = value;
    }

    /**
     * Gets the value of the subTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTestName() {
        return subTestName;
    }

    /**
     * Sets the value of the subTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTestName(String value) {
        this.subTestName = value;
    }

    /**
     * Gets the value of the scores property.
     * 
     * @return
     *     possible object is
     *     {@link XAssessmentScoreSetType.Scores }
     *     
     */
    public XAssessmentScoreSetType.Scores getScores() {
        return scores;
    }

    /**
     * Sets the value of the scores property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAssessmentScoreSetType.Scores }
     *     
     */
    public void setScores(XAssessmentScoreSetType.Scores value) {
        this.scores = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="score" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentScoreType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "score"
    })
    public static class Scores {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected List<XAssessmentScoreType> score;

        /**
         * Gets the value of the score property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the score property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAssessmentScoreType }
         * 
         * 
         */
        public List<XAssessmentScoreType> getScore() {
            if (score == null) {
                score = new ArrayList<XAssessmentScoreType>();
            }
            return this.score;
        }

    }

}
