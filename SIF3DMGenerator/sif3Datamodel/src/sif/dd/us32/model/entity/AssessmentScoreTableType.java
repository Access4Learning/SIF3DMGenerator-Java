
package sif.dd.us32.model.entity;

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
 * This object represents the score conversion tables to be used by the scoring system to derive alternate values. As an example, it is often typical for a scoring system to convert a raw score to a scale score. It is also common for a scoring system to derive a student performance level on an assessment from a total scaled score. 
 * 
 * <p>Java class for assessmentScoreTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentScoreTableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="scoreTableVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="scoreTablePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scoreTableIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scoreTableIdentifier" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="scoreTableIdentifierType">
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
 *         &lt;element name="scoreTableName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="scoreValueList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scoreValue" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lowerCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="upperCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="derivedValue">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                                     &lt;attribute name="toScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="passFailIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="feedbackList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="feedback" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                 &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
 *                           &lt;attribute name="fromScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "assessmentScoreTableType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "scoreTableVersion",
    "scoreTablePublishDate",
    "scoreTableIdentifierList",
    "scoreTableName",
    "scoreValueList"
})
public class AssessmentScoreTableType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scoreTableVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scoreTablePublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentScoreTableType.ScoreTableIdentifierList scoreTableIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scoreTableName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentScoreTableType.ScoreValueList scoreValueList;

    /**
     * Gets the value of the scoreTableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTableVersion() {
        return scoreTableVersion;
    }

    /**
     * Sets the value of the scoreTableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTableVersion(String value) {
        this.scoreTableVersion = value;
    }

    /**
     * Gets the value of the scoreTablePublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScoreTablePublishDate() {
        return scoreTablePublishDate;
    }

    /**
     * Sets the value of the scoreTablePublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScoreTablePublishDate(XMLGregorianCalendar value) {
        this.scoreTablePublishDate = value;
    }

    /**
     * Gets the value of the scoreTableIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentScoreTableType.ScoreTableIdentifierList }
     *     
     */
    public AssessmentScoreTableType.ScoreTableIdentifierList getScoreTableIdentifierList() {
        return scoreTableIdentifierList;
    }

    /**
     * Sets the value of the scoreTableIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentScoreTableType.ScoreTableIdentifierList }
     *     
     */
    public void setScoreTableIdentifierList(AssessmentScoreTableType.ScoreTableIdentifierList value) {
        this.scoreTableIdentifierList = value;
    }

    /**
     * Gets the value of the scoreTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTableName() {
        return scoreTableName;
    }

    /**
     * Sets the value of the scoreTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTableName(String value) {
        this.scoreTableName = value;
    }

    /**
     * Gets the value of the scoreValueList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentScoreTableType.ScoreValueList }
     *     
     */
    public AssessmentScoreTableType.ScoreValueList getScoreValueList() {
        return scoreValueList;
    }

    /**
     * Sets the value of the scoreValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentScoreTableType.ScoreValueList }
     *     
     */
    public void setScoreValueList(AssessmentScoreTableType.ScoreValueList value) {
        this.scoreValueList = value;
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
     *         &lt;element name="scoreTableIdentifier" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="scoreTableIdentifierType">
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
        "scoreTableIdentifier"
    })
    public static class ScoreTableIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier> scoreTableIdentifier;

        /**
         * Gets the value of the scoreTableIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoreTableIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScoreTableIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier }
         * 
         * 
         */
        public List<AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier> getScoreTableIdentifier() {
            if (scoreTableIdentifier == null) {
                scoreTableIdentifier = new ArrayList<AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier>();
            }
            return this.scoreTableIdentifier;
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
         *       &lt;attribute name="scoreTableIdentifierType">
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
        public static class ScoreTableIdentifier {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "scoreTableIdentifierType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String scoreTableIdentifierType;

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
             * Gets the value of the scoreTableIdentifierType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScoreTableIdentifierType() {
                return scoreTableIdentifierType;
            }

            /**
             * Sets the value of the scoreTableIdentifierType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScoreTableIdentifierType(String value) {
                this.scoreTableIdentifierType = value;
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
     *         &lt;element name="scoreValue" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lowerCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="upperCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="derivedValue">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                           &lt;attribute name="toScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="passFailIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="feedbackList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="feedback" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                       &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
     *                 &lt;attribute name="fromScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "scoreValue"
    })
    public static class ScoreValueList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentScoreTableType.ScoreValueList.ScoreValue> scoreValue;

        /**
         * Gets the value of the scoreValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoreValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScoreValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentScoreTableType.ScoreValueList.ScoreValue }
         * 
         * 
         */
        public List<AssessmentScoreTableType.ScoreValueList.ScoreValue> getScoreValue() {
            if (scoreValue == null) {
                scoreValue = new ArrayList<AssessmentScoreTableType.ScoreValueList.ScoreValue>();
            }
            return this.scoreValue;
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
         *         &lt;element name="lowerCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="upperCut" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="derivedValue">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
         *                 &lt;attribute name="toScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="passFailIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="feedbackList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="feedback" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                             &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
         *       &lt;attribute name="fromScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowerCut",
            "upperCut",
            "derivedValue",
            "passFailIndicator",
            "feedbackList"
        })
        public static class ScoreValue {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String lowerCut;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String upperCut;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue derivedValue;
            @XmlElementRef(name = "passFailIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
            protected JAXBElement<String> passFailIndicator;
            @XmlElementRef(name = "feedbackList", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
            protected JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList> feedbackList;
            @XmlAttribute(name = "fromScoreMetric", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String fromScoreMetric;

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
             * Gets the value of the derivedValue property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue }
             *     
             */
            public AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue getDerivedValue() {
                return derivedValue;
            }

            /**
             * Sets the value of the derivedValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue }
             *     
             */
            public void setDerivedValue(AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue value) {
                this.derivedValue = value;
            }

            /**
             * Gets the value of the passFailIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPassFailIndicator() {
                return passFailIndicator;
            }

            /**
             * Sets the value of the passFailIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPassFailIndicator(JAXBElement<String> value) {
                this.passFailIndicator = value;
            }

            /**
             * Gets the value of the feedbackList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList }{@code >}
             *     
             */
            public JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList> getFeedbackList() {
                return feedbackList;
            }

            /**
             * Sets the value of the feedbackList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList }{@code >}
             *     
             */
            public void setFeedbackList(JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList> value) {
                this.feedbackList = value;
            }

            /**
             * Gets the value of the fromScoreMetric property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromScoreMetric() {
                return fromScoreMetric;
            }

            /**
             * Sets the value of the fromScoreMetric property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromScoreMetric(String value) {
                this.fromScoreMetric = value;
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
             *       &lt;attribute name="toScoreMetric" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            public static class DerivedValue {

                @XmlValue
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String value;
                @XmlAttribute(name = "toScoreMetric", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String toScoreMetric;

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
                 * Gets the value of the toScoreMetric property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getToScoreMetric() {
                    return toScoreMetric;
                }

                /**
                 * Sets the value of the toScoreMetric property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setToScoreMetric(String value) {
                    this.toScoreMetric = value;
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
             *         &lt;element name="feedback" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "feedback"
            })
            public static class FeedbackList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback> feedback;

                /**
                 * Gets the value of the feedback property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the feedback property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFeedback().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback }
                 * 
                 * 
                 */
                public List<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback> getFeedback() {
                    if (feedback == null) {
                        feedback = new ArrayList<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback>();
                    }
                    return this.feedback;
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
                 *         &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                    "description",
                    "source"
                })
                public static class Feedback {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                    protected String diagnosticStatement;
                    @XmlElementRef(name = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> description;
                    @XmlElementRef(name = "source", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> source;

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
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setDescription(JAXBElement<String> value) {
                        this.description = value;
                    }

                    /**
                     * Gets the value of the source property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSource() {
                        return source;
                    }

                    /**
                     * Sets the value of the source property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSource(JAXBElement<String> value) {
                        this.source = value;
                    }

                }

            }

        }

    }

}
