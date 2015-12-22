
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="actualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="studentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.3}xGradeLevelType" minOccurs="0"/>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="accommodations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accommodation" type="{http://www.sifassociation.org/datamodel/na/3.3}xAccommodationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scoreSets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scoreSet" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentScoreSetType" maxOccurs="unbounded"/>
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
@XmlType(name = "xAssessmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "name",
    "actualStartDateTime",
    "actualEndDateTime",
    "studentGradeLevel",
    "school",
    "accommodations",
    "scoreSets",
    "any"
})
public class XAssessmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentGradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XAssessmentType.Accommodations accommodations;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XAssessmentType.ScoreSets scoreSets;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the actualStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartDateTime() {
        return actualStartDateTime;
    }

    /**
     * Sets the value of the actualStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartDateTime(XMLGregorianCalendar value) {
        this.actualStartDateTime = value;
    }

    /**
     * Gets the value of the actualEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndDateTime() {
        return actualEndDateTime;
    }

    /**
     * Sets the value of the actualEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndDateTime(XMLGregorianCalendar value) {
        this.actualEndDateTime = value;
    }

    /**
     * Gets the value of the studentGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentGradeLevel() {
        return studentGradeLevel;
    }

    /**
     * Sets the value of the studentGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentGradeLevel(String value) {
        this.studentGradeLevel = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchool(XSchoolType value) {
        this.school = value;
    }

    /**
     * Gets the value of the accommodations property.
     * 
     * @return
     *     possible object is
     *     {@link XAssessmentType.Accommodations }
     *     
     */
    public XAssessmentType.Accommodations getAccommodations() {
        return accommodations;
    }

    /**
     * Sets the value of the accommodations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAssessmentType.Accommodations }
     *     
     */
    public void setAccommodations(XAssessmentType.Accommodations value) {
        this.accommodations = value;
    }

    /**
     * Gets the value of the scoreSets property.
     * 
     * @return
     *     possible object is
     *     {@link XAssessmentType.ScoreSets }
     *     
     */
    public XAssessmentType.ScoreSets getScoreSets() {
        return scoreSets;
    }

    /**
     * Sets the value of the scoreSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAssessmentType.ScoreSets }
     *     
     */
    public void setScoreSets(XAssessmentType.ScoreSets value) {
        this.scoreSets = value;
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
     *         &lt;element name="accommodation" type="{http://www.sifassociation.org/datamodel/na/3.3}xAccommodationType" maxOccurs="unbounded"/>
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
        "accommodation"
    })
    public static class Accommodations {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected List<XAccommodationType> accommodation;

        /**
         * Gets the value of the accommodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAccommodationType }
         * 
         * 
         */
        public List<XAccommodationType> getAccommodation() {
            if (accommodation == null) {
                accommodation = new ArrayList<XAccommodationType>();
            }
            return this.accommodation;
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
     *         &lt;element name="scoreSet" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentScoreSetType" maxOccurs="unbounded"/>
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
        "scoreSet"
    })
    public static class ScoreSets {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected List<XAssessmentScoreSetType> scoreSet;

        /**
         * Gets the value of the scoreSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoreSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScoreSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAssessmentScoreSetType }
         * 
         * 
         */
        public List<XAssessmentScoreSetType> getScoreSet() {
            if (scoreSet == null) {
                scoreSet = new ArrayList<XAssessmentScoreSetType>();
            }
            return this.scoreSet;
        }

    }

}
