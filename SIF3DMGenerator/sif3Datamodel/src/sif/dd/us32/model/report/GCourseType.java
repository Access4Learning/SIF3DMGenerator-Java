
package sif.dd.us32.model.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object describes course information.
 * 
 * <p>Java class for gCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gCourseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gAcademicPlanType">
 *       &lt;sequence>
 *         &lt;element name="organizationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
 *         &lt;element name="yearOffered" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="courseCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType"/>
 *         &lt;element name="subjectAreaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="instructionalLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gInstructionalLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gCourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "organizationRefId",
    "yearOffered",
    "courseCode",
    "subjectAreaList",
    "courseTitle",
    "description",
    "instructionalLevel"
})
@XmlSeeAlso({
    GK12CourseType.class
})
public class GCourseType
    extends GAcademicPlanType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GGenericRefIdPointerType organizationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOffered;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLaxCodedElementType courseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCourseType.SubjectAreaList subjectAreaList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String instructionalLevel;

    /**
     * Gets the value of the organizationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getOrganizationRefId() {
        return organizationRefId;
    }

    /**
     * Sets the value of the organizationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setOrganizationRefId(GGenericRefIdPointerType value) {
        this.organizationRefId = value;
    }

    /**
     * Gets the value of the yearOffered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOffered() {
        return yearOffered;
    }

    /**
     * Sets the value of the yearOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOffered(XMLGregorianCalendar value) {
        this.yearOffered = value;
    }

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setCourseCode(GLaxCodedElementType value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the subjectAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link GCourseType.SubjectAreaList }
     *     
     */
    public GCourseType.SubjectAreaList getSubjectAreaList() {
        return subjectAreaList;
    }

    /**
     * Sets the value of the subjectAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCourseType.SubjectAreaList }
     *     
     */
    public void setSubjectAreaList(GCourseType.SubjectAreaList value) {
        this.subjectAreaList = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the instructionalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionalLevel() {
        return instructionalLevel;
    }

    /**
     * Sets the value of the instructionalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionalLevel(String value) {
        this.instructionalLevel = value;
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
     *         &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "subjectArea"
    })
    public static class SubjectAreaList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> subjectArea;

        /**
         * Gets the value of the subjectArea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectArea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getSubjectArea() {
            if (subjectArea == null) {
                subjectArea = new ArrayList<GSubjectAreaType>();
            }
            return this.subjectArea;
        }

    }

}
