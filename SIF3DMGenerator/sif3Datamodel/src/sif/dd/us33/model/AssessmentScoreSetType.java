
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The scored results from an assessment.
 * 
 * <p>Java class for assessmentScoreSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentScoreSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="scoreMetric" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="studentPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="assessmentAdministrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="scoreList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="score" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="preliminaryIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="passFailIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="numberOfResponses" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
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
 *         &lt;element name="feedbackItemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
@XmlType(name = "assessmentScoreSetType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "scoreMetric",
    "studentPersonalRefId",
    "assessmentAdministrationRefId",
    "assessmentRegistrationRefId",
    "scoreList",
    "feedbackItemList"
})
public class AssessmentScoreSetType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scoreMetric;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentAdministrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRegistrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected AssessmentScoreSetType.ScoreList scoreList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentScoreSetType.FeedbackItemList feedbackItemList;

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
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the assessmentAdministrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationRefId() {
        return assessmentAdministrationRefId;
    }

    /**
     * Sets the value of the assessmentAdministrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationRefId(String value) {
        this.assessmentAdministrationRefId = value;
    }

    /**
     * Gets the value of the assessmentRegistrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationRefId() {
        return assessmentRegistrationRefId;
    }

    /**
     * Sets the value of the assessmentRegistrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationRefId(String value) {
        this.assessmentRegistrationRefId = value;
    }

    /**
     * Gets the value of the scoreList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentScoreSetType.ScoreList }
     *     
     */
    public AssessmentScoreSetType.ScoreList getScoreList() {
        return scoreList;
    }

    /**
     * Sets the value of the scoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentScoreSetType.ScoreList }
     *     
     */
    public void setScoreList(AssessmentScoreSetType.ScoreList value) {
        this.scoreList = value;
    }

    /**
     * Gets the value of the feedbackItemList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentScoreSetType.FeedbackItemList }
     *     
     */
    public AssessmentScoreSetType.FeedbackItemList getFeedbackItemList() {
        return feedbackItemList;
    }

    /**
     * Sets the value of the feedbackItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentScoreSetType.FeedbackItemList }
     *     
     */
    public void setFeedbackItemList(AssessmentScoreSetType.FeedbackItemList value) {
        this.feedbackItemList = value;
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
     *         &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "feedbackItem"
    })
    public static class FeedbackItemList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentScoreSetType.FeedbackItemList.FeedbackItem> feedbackItem;

        /**
         * Gets the value of the feedbackItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feedbackItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeedbackItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentScoreSetType.FeedbackItemList.FeedbackItem }
         * 
         * 
         */
        public List<AssessmentScoreSetType.FeedbackItemList.FeedbackItem> getFeedbackItem() {
            if (feedbackItem == null) {
                feedbackItem = new ArrayList<AssessmentScoreSetType.FeedbackItemList.FeedbackItem>();
            }
            return this.feedbackItem;
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
         *         &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "diagnosticStatement",
            "feedbackDescription",
            "feedbackSource"
        })
        public static class FeedbackItem {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected String diagnosticStatement;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected String feedbackDescription;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String feedbackSource;

            /**
             * Gets the value of the diagnosticStatement property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiagnosticStatement() {
                return diagnosticStatement;
            }

            /**
             * Sets the value of the diagnosticStatement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiagnosticStatement(String value) {
                this.diagnosticStatement = value;
            }

            /**
             * Gets the value of the feedbackDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeedbackDescription() {
                return feedbackDescription;
            }

            /**
             * Sets the value of the feedbackDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeedbackDescription(String value) {
                this.feedbackDescription = value;
            }

            /**
             * Gets the value of the feedbackSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeedbackSource() {
                return feedbackSource;
            }

            /**
             * Sets the value of the feedbackSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeedbackSource(String value) {
                this.feedbackSource = value;
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
     *                   &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="preliminaryIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="passFailIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="numberOfResponses" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
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
        protected List<AssessmentScoreSetType.ScoreList.Score> score;

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
         * {@link AssessmentScoreSetType.ScoreList.Score }
         * 
         * 
         */
        public List<AssessmentScoreSetType.ScoreList.Score> getScore() {
            if (score == null) {
                score = new ArrayList<AssessmentScoreSetType.ScoreList.Score>();
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
         *         &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="preliminaryIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="passFailIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="numberOfResponses" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
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
            "assessmentSubTestRefId",
            "preliminaryIndicator",
            "scoreValue",
            "passFailIndicator",
            "numberOfResponses"
        })
        public static class Score {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentSubTestRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GYesNoUnknownType preliminaryIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String scoreValue;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GYesNoUnknownType passFailIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "unsignedShort")
            protected Integer numberOfResponses;

            /**
             * Gets the value of the assessmentSubTestRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentSubTestRefId() {
                return assessmentSubTestRefId;
            }

            /**
             * Sets the value of the assessmentSubTestRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentSubTestRefId(String value) {
                this.assessmentSubTestRefId = value;
            }

            /**
             * Gets the value of the preliminaryIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getPreliminaryIndicator() {
                return preliminaryIndicator;
            }

            /**
             * Sets the value of the preliminaryIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setPreliminaryIndicator(GYesNoUnknownType value) {
                this.preliminaryIndicator = value;
            }

            /**
             * Gets the value of the scoreValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScoreValue() {
                return scoreValue;
            }

            /**
             * Sets the value of the scoreValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScoreValue(String value) {
                this.scoreValue = value;
            }

            /**
             * Gets the value of the passFailIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getPassFailIndicator() {
                return passFailIndicator;
            }

            /**
             * Sets the value of the passFailIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setPassFailIndicator(GYesNoUnknownType value) {
                this.passFailIndicator = value;
            }

            /**
             * Gets the value of the numberOfResponses property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumberOfResponses() {
                return numberOfResponses;
            }

            /**
             * Sets the value of the numberOfResponses property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumberOfResponses(Integer value) {
                this.numberOfResponses = value;
            }

        }

    }

}
