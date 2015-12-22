
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The co-curricular or extra-curricular activity in which the student participates.
 * 
 * <p>Java class for studentActivityParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentActivityParticipationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gAssociationType">
 *       &lt;sequence>
 *         &lt;element name="studentRefId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="studentActivityRefId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="participationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="recognitionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recognition" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" maxOccurs="unbounded"/>
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
@XmlType(name = "studentActivityParticipationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "studentRefId",
    "studentActivityRefId",
    "schoolYear",
    "participationComment",
    "startDate",
    "endDate",
    "role",
    "recognitionList"
})
public class StudentActivityParticipationType
    extends GAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected Object studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected Object studentActivityRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected Object schoolYear;
    @XmlElementRef(name = "participationComment", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> participationComment;
    @XmlElementRef(name = "startDate", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "role", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role;
    @XmlElementRef(name = "recognitionList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentActivityParticipationType.RecognitionList> recognitionList;

    /**
     * Gets the value of the studentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStudentRefId() {
        return studentRefId;
    }

    /**
     * Sets the value of the studentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStudentRefId(Object value) {
        this.studentRefId = value;
    }

    /**
     * Gets the value of the studentActivityRefId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStudentActivityRefId() {
        return studentActivityRefId;
    }

    /**
     * Sets the value of the studentActivityRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStudentActivityRefId(Object value) {
        this.studentActivityRefId = value;
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
     * Gets the value of the recognitionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentActivityParticipationType.RecognitionList }{@code >}
     *     
     */
    public JAXBElement<StudentActivityParticipationType.RecognitionList> getRecognitionList() {
        return recognitionList;
    }

    /**
     * Sets the value of the recognitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentActivityParticipationType.RecognitionList }{@code >}
     *     
     */
    public void setRecognitionList(JAXBElement<StudentActivityParticipationType.RecognitionList> value) {
        this.recognitionList = value;
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
     *         &lt;element name="recognition" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" maxOccurs="unbounded"/>
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
    public static class RecognitionList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
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
