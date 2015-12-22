
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="studentActivityCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *         &lt;element name="studentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="gradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.3}xYearGroupListType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="timeInvolved" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="participationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="recognitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recognition" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "xActivityType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "title",
    "description",
    "studentActivityCode",
    "studentActivityLevel",
    "gradeLevels",
    "location",
    "timeInvolved",
    "school",
    "schoolYear",
    "participationComment",
    "startDate",
    "endDate",
    "role",
    "recognitions",
    "any"
})
public class XActivityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElementRef(name = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GCodedElementType studentActivityCode;
    @XmlElementRef(name = "studentActivityLevel", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentActivityLevel;
    @XmlElementRef(name = "gradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XYearGroupListType> gradeLevels;
    @XmlElementRef(name = "location", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String timeInvolved;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Object schoolYear;
    @XmlElementRef(name = "participationComment", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> participationComment;
    @XmlElementRef(name = "startDate", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "role", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role;
    @XmlElementRef(name = "recognitions", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XActivityType.Recognitions> recognitions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the studentActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link GCodedElementType }
     *     
     */
    public GCodedElementType getStudentActivityCode() {
        return studentActivityCode;
    }

    /**
     * Sets the value of the studentActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCodedElementType }
     *     
     */
    public void setStudentActivityCode(GCodedElementType value) {
        this.studentActivityCode = value;
    }

    /**
     * Gets the value of the studentActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentActivityLevel() {
        return studentActivityLevel;
    }

    /**
     * Sets the value of the studentActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentActivityLevel(JAXBElement<String> value) {
        this.studentActivityLevel = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XYearGroupListType }{@code >}
     *     
     */
    public JAXBElement<XYearGroupListType> getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XYearGroupListType }{@code >}
     *     
     */
    public void setGradeLevels(JAXBElement<XYearGroupListType> value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the timeInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInvolved() {
        return timeInvolved;
    }

    /**
     * Sets the value of the timeInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInvolved(String value) {
        this.timeInvolved = value;
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
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSchoolYear(Object value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the participationComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParticipationComment() {
        return participationComment;
    }

    /**
     * Sets the value of the participationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParticipationComment(JAXBElement<String> value) {
        this.participationComment = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole(JAXBElement<String> value) {
        this.role = value;
    }

    /**
     * Gets the value of the recognitions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XActivityType.Recognitions }{@code >}
     *     
     */
    public JAXBElement<XActivityType.Recognitions> getRecognitions() {
        return recognitions;
    }

    /**
     * Sets the value of the recognitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XActivityType.Recognitions }{@code >}
     *     
     */
    public void setRecognitions(JAXBElement<XActivityType.Recognitions> value) {
        this.recognitions = value;
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
     *         &lt;element name="recognition" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "recognition"
    })
    public static class Recognitions {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<GCodedElementType> recognition;

        /**
         * Gets the value of the recognition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recognition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecognition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCodedElementType }
         * 
         * 
         */
        public List<GCodedElementType> getRecognition() {
            if (recognition == null) {
                recognition = new ArrayList<GCodedElementType>();
            }
            return this.recognition;
        }

    }

}
