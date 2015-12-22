
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object represents the scoring rubric used to evaluate responses to open-ended items. Rubrics define how a student response is to be evaluated and what score values should be applied based on that evaluation. Rubrics can be used by human scorers (teachers or professional scorers) or used to train artificial intelligence engines. An individual item may have multiple rubrics that are used to evaluate different 'traits' of the response. 
 * 
 * <p>Java class for assessmentRubricType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentRubricType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="rubricVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="rubricPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rubricIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rubricIdentifier" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="rubricIdentifierType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;enumeration value="client"/>
 *                                 &lt;enumeration value="publisher"/>
 *                                 &lt;enumeration value="internal"/>
 *                                 &lt;enumeration value="other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rubricName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="scoringGuideReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="scoreList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="score" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="scoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="scoreCodeDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="scoreDescriptionList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="scoreDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="scoreCommentList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="scoreComment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                                                 &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentRubricType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "rubricVersion",
    "rubricPublishDate",
    "rubricIdentifierList",
    "rubricName",
    "scoringGuideReference",
    "scoreList"
})
public class AssessmentRubricType
    extends GOtherSIFType
{

    @XmlElementRef(name = "rubricVersion", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rubricVersion;
    @XmlElementRef(name = "rubricPublishDate", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> rubricPublishDate;
    @XmlElementRef(name = "rubricIdentifierList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssessmentRubricType.RubricIdentifierList> rubricIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rubricName;
    @XmlElementRef(name = "scoringGuideReference", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scoringGuideReference;
    @XmlElementRef(name = "scoreList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssessmentRubricType.ScoreList> scoreList;

    /**
     * Gets the value of the rubricVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRubricVersion() {
        return rubricVersion;
    }

    /**
     * Sets the value of the rubricVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRubricVersion(JAXBElement<String> value) {
        this.rubricVersion = value;
    }

    /**
     * Gets the value of the rubricPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRubricPublishDate() {
        return rubricPublishDate;
    }

    /**
     * Sets the value of the rubricPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRubricPublishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.rubricPublishDate = value;
    }

    /**
     * Gets the value of the rubricIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.RubricIdentifierList }{@code >}
     *     
     */
    public JAXBElement<AssessmentRubricType.RubricIdentifierList> getRubricIdentifierList() {
        return rubricIdentifierList;
    }

    /**
     * Sets the value of the rubricIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.RubricIdentifierList }{@code >}
     *     
     */
    public void setRubricIdentifierList(JAXBElement<AssessmentRubricType.RubricIdentifierList> value) {
        this.rubricIdentifierList = value;
    }

    /**
     * Gets the value of the rubricName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricName() {
        return rubricName;
    }

    /**
     * Sets the value of the rubricName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricName(String value) {
        this.rubricName = value;
    }

    /**
     * Gets the value of the scoringGuideReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScoringGuideReference() {
        return scoringGuideReference;
    }

    /**
     * Sets the value of the scoringGuideReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScoringGuideReference(JAXBElement<String> value) {
        this.scoringGuideReference = value;
    }

    /**
     * Gets the value of the scoreList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList }{@code >}
     *     
     */
    public JAXBElement<AssessmentRubricType.ScoreList> getScoreList() {
        return scoreList;
    }

    /**
     * Sets the value of the scoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList }{@code >}
     *     
     */
    public void setScoreList(JAXBElement<AssessmentRubricType.ScoreList> value) {
        this.scoreList = value;
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
     *         &lt;element name="rubricIdentifier" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="rubricIdentifierType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="client"/>
     *                       &lt;enumeration value="publisher"/>
     *                       &lt;enumeration value="internal"/>
     *                       &lt;enumeration value="other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "rubricIdentifier"
    })
    public static class RubricIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentRubricType.RubricIdentifierList.RubricIdentifier> rubricIdentifier;

        /**
         * Gets the value of the rubricIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rubricIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRubricIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentRubricType.RubricIdentifierList.RubricIdentifier }
         * 
         * 
         */
        public List<AssessmentRubricType.RubricIdentifierList.RubricIdentifier> getRubricIdentifier() {
            if (rubricIdentifier == null) {
                rubricIdentifier = new ArrayList<AssessmentRubricType.RubricIdentifierList.RubricIdentifier>();
            }
            return this.rubricIdentifier;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
         *       &lt;attribute name="rubricIdentifierType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="client"/>
         *             &lt;enumeration value="publisher"/>
         *             &lt;enumeration value="internal"/>
         *             &lt;enumeration value="other"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class RubricIdentifier {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "rubricIdentifierType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String rubricIdentifierType;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the rubricIdentifierType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRubricIdentifierType() {
                return rubricIdentifierType;
            }

            /**
             * Sets the value of the rubricIdentifierType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRubricIdentifierType(String value) {
                this.rubricIdentifierType = value;
            }

        }

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
     *         &lt;element name="score" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="scoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="scoreCodeDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="scoreDescriptionList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="scoreDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="scoreCommentList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="scoreComment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                                       &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    public static class ScoreList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentRubricType.ScoreList.Score> score;

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
         * {@link AssessmentRubricType.ScoreList.Score }
         * 
         * 
         */
        public List<AssessmentRubricType.ScoreList.Score> getScore() {
            if (score == null) {
                score = new ArrayList<AssessmentRubricType.ScoreList.Score>();
            }
            return this.score;
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
         *         &lt;element name="scoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="scoreCodeDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="scoreDescriptionList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="scoreDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="scoreCommentList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="scoreComment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *                             &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "scoreCode",
            "scoreCodeDefinition",
            "scoreValue",
            "scoreDescriptionList",
            "scoreCommentList"
        })
        public static class Score {

            @XmlElementRef(name = "scoreCode", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<String> scoreCode;
            @XmlElementRef(name = "scoreCodeDefinition", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<String> scoreCodeDefinition;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected BigDecimal scoreValue;
            @XmlElementRef(name = "scoreDescriptionList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList> scoreDescriptionList;
            @XmlElementRef(name = "scoreCommentList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList> scoreCommentList;

            /**
             * Gets the value of the scoreCode property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getScoreCode() {
                return scoreCode;
            }

            /**
             * Sets the value of the scoreCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setScoreCode(JAXBElement<String> value) {
                this.scoreCode = value;
            }

            /**
             * Gets the value of the scoreCodeDefinition property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getScoreCodeDefinition() {
                return scoreCodeDefinition;
            }

            /**
             * Sets the value of the scoreCodeDefinition property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setScoreCodeDefinition(JAXBElement<String> value) {
                this.scoreCodeDefinition = value;
            }

            /**
             * Gets the value of the scoreValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getScoreValue() {
                return scoreValue;
            }

            /**
             * Sets the value of the scoreValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setScoreValue(BigDecimal value) {
                this.scoreValue = value;
            }

            /**
             * Gets the value of the scoreDescriptionList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreDescriptionList }{@code >}
             *     
             */
            public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList> getScoreDescriptionList() {
                return scoreDescriptionList;
            }

            /**
             * Sets the value of the scoreDescriptionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreDescriptionList }{@code >}
             *     
             */
            public void setScoreDescriptionList(JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList> value) {
                this.scoreDescriptionList = value;
            }

            /**
             * Gets the value of the scoreCommentList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreCommentList }{@code >}
             *     
             */
            public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList> getScoreCommentList() {
                return scoreCommentList;
            }

            /**
             * Sets the value of the scoreCommentList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreCommentList }{@code >}
             *     
             */
            public void setScoreCommentList(JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList> value) {
                this.scoreCommentList = value;
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
             *         &lt;element name="scoreComment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
             *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "scoreComment"
            })
            public static class ScoreCommentList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment> scoreComment;

                /**
                 * Gets the value of the scoreComment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the scoreComment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getScoreComment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment }
                 * 
                 * 
                 */
                public List<AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment> getScoreComment() {
                    if (scoreComment == null) {
                        scoreComment = new ArrayList<AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment>();
                    }
                    return this.scoreComment;
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
                 *         &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
                 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "commentCode",
                    "comment"
                })
                public static class ScoreComment {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String commentCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    protected String comment;

                    /**
                     * Gets the value of the commentCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCommentCode() {
                        return commentCode;
                    }

                    /**
                     * Sets the value of the commentCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCommentCode(String value) {
                        this.commentCode = value;
                    }

                    /**
                     * Gets the value of the comment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getComment() {
                        return comment;
                    }

                    /**
                     * Sets the value of the comment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setComment(String value) {
                        this.comment = value;
                    }

                }

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
             *         &lt;element name="scoreDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "scoreDescription"
            })
            public static class ScoreDescriptionList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<String> scoreDescription;

                /**
                 * Gets the value of the scoreDescription property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the scoreDescription property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getScoreDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getScoreDescription() {
                    if (scoreDescription == null) {
                        scoreDescription = new ArrayList<String>();
                    }
                    return this.scoreDescription;
                }

            }

        }

    }

}
