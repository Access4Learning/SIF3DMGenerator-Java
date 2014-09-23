
package sif.dd.us32.model;

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
 * K12Course is a school course and extends Course
 * 
 * <p>Java class for gK12CourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gK12CourseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gCourseType">
 *       &lt;sequence>
 *         &lt;element name="termInfoRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="externalCourseCodeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="externalCourseCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="courseCreditList" type="{http://www.sifassociation.org/datamodel/na/3.2}gCourseCreditList" minOccurs="0"/>
 *         &lt;element name="graduationRequirement" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gK12CourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "termInfoRefId",
    "externalCourseCodeList",
    "courseCreditList",
    "graduationRequirement",
    "department"
})
public class GK12CourseType
    extends GCourseType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termInfoRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GK12CourseType.ExternalCourseCodeList externalCourseCodeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCourseCreditList courseCreditList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType graduationRequirement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String department;

    /**
     * Gets the value of the termInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermInfoRefId() {
        return termInfoRefId;
    }

    /**
     * Sets the value of the termInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermInfoRefId(String value) {
        this.termInfoRefId = value;
    }

    /**
     * Gets the value of the externalCourseCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link GK12CourseType.ExternalCourseCodeList }
     *     
     */
    public GK12CourseType.ExternalCourseCodeList getExternalCourseCodeList() {
        return externalCourseCodeList;
    }

    /**
     * Sets the value of the externalCourseCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GK12CourseType.ExternalCourseCodeList }
     *     
     */
    public void setExternalCourseCodeList(GK12CourseType.ExternalCourseCodeList value) {
        this.externalCourseCodeList = value;
    }

    /**
     * Gets the value of the courseCreditList property.
     * 
     * @return
     *     possible object is
     *     {@link GCourseCreditList }
     *     
     */
    public GCourseCreditList getCourseCreditList() {
        return courseCreditList;
    }

    /**
     * Sets the value of the courseCreditList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCourseCreditList }
     *     
     */
    public void setCourseCreditList(GCourseCreditList value) {
        this.courseCreditList = value;
    }

    /**
     * Gets the value of the graduationRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getGraduationRequirement() {
        return graduationRequirement;
    }

    /**
     * Sets the value of the graduationRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setGraduationRequirement(GYesNoUnknownType value) {
        this.graduationRequirement = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
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
     *         &lt;element name="externalCourseCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "externalCourseCode"
    })
    public static class ExternalCourseCodeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GExternalIdType> externalCourseCode;

        /**
         * Gets the value of the externalCourseCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalCourseCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalCourseCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GExternalIdType }
         * 
         * 
         */
        public List<GExternalIdType> getExternalCourseCode() {
            if (externalCourseCode == null) {
                externalCourseCode = new ArrayList<GExternalIdType>();
            }
            return this.externalCourseCode;
        }

    }

}
