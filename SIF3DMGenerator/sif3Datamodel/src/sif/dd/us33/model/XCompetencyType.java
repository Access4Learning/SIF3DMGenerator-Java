
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
 * <p>Java class for xCompetencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCompetencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardItemUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="learningStandardItemCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="associatedCourses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="courseRefId" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "xCompetencyType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "learningStandardItemUrl",
    "learningStandardItemCode",
    "masteryLevel",
    "masteryLevelSystem",
    "associatedCourses",
    "any"
})
public class XCompetencyType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String learningStandardItemUrl;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLaxCodedElementType learningStandardItemCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String masteryLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String masteryLevelSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XCompetencyType.AssociatedCourses associatedCourses;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the learningStandardItemUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemUrl() {
        return learningStandardItemUrl;
    }

    /**
     * Sets the value of the learningStandardItemUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemUrl(String value) {
        this.learningStandardItemUrl = value;
    }

    /**
     * Gets the value of the learningStandardItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getLearningStandardItemCode() {
        return learningStandardItemCode;
    }

    /**
     * Sets the value of the learningStandardItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setLearningStandardItemCode(GLaxCodedElementType value) {
        this.learningStandardItemCode = value;
    }

    /**
     * Gets the value of the masteryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasteryLevel() {
        return masteryLevel;
    }

    /**
     * Sets the value of the masteryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasteryLevel(String value) {
        this.masteryLevel = value;
    }

    /**
     * Gets the value of the masteryLevelSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasteryLevelSystem() {
        return masteryLevelSystem;
    }

    /**
     * Sets the value of the masteryLevelSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasteryLevelSystem(String value) {
        this.masteryLevelSystem = value;
    }

    /**
     * Gets the value of the associatedCourses property.
     * 
     * @return
     *     possible object is
     *     {@link XCompetencyType.AssociatedCourses }
     *     
     */
    public XCompetencyType.AssociatedCourses getAssociatedCourses() {
        return associatedCourses;
    }

    /**
     * Sets the value of the associatedCourses property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCompetencyType.AssociatedCourses }
     *     
     */
    public void setAssociatedCourses(XCompetencyType.AssociatedCourses value) {
        this.associatedCourses = value;
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
     *         &lt;element name="courseRefId" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "courseRefId"
    })
    public static class AssociatedCourses {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<Object> courseRefId;

        /**
         * Gets the value of the courseRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the courseRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCourseRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getCourseRefId() {
            if (courseRefId == null) {
                courseRefId = new ArrayList<Object>();
            }
            return this.courseRefId;
        }

    }

}
