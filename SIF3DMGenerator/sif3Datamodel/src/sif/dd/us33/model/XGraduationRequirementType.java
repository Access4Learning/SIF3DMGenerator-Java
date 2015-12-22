
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xGraduationRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xGraduationRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programOfFocus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="schoolOfRecord" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="subjectAreas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}xSubjectAreaType" maxOccurs="unbounded"/>
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
@XmlType(name = "xGraduationRequirementType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "programOfFocus",
    "schoolOfRecord",
    "subjectAreas",
    "any"
})
public class XGraduationRequirementType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programOfFocus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType schoolOfRecord;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XGraduationRequirementType.SubjectAreas subjectAreas;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the programOfFocus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramOfFocus() {
        return programOfFocus;
    }

    /**
     * Sets the value of the programOfFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramOfFocus(String value) {
        this.programOfFocus = value;
    }

    /**
     * Gets the value of the schoolOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchoolOfRecord() {
        return schoolOfRecord;
    }

    /**
     * Sets the value of the schoolOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchoolOfRecord(XSchoolType value) {
        this.schoolOfRecord = value;
    }

    /**
     * Gets the value of the subjectAreas property.
     * 
     * @return
     *     possible object is
     *     {@link XGraduationRequirementType.SubjectAreas }
     *     
     */
    public XGraduationRequirementType.SubjectAreas getSubjectAreas() {
        return subjectAreas;
    }

    /**
     * Sets the value of the subjectAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGraduationRequirementType.SubjectAreas }
     *     
     */
    public void setSubjectAreas(XGraduationRequirementType.SubjectAreas value) {
        this.subjectAreas = value;
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
     *         &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}xSubjectAreaType" maxOccurs="unbounded"/>
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
    public static class SubjectAreas {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected List<XSubjectAreaType> subjectArea;

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
         * {@link XSubjectAreaType }
         * 
         * 
         */
        public List<XSubjectAreaType> getSubjectArea() {
            if (subjectArea == null) {
                subjectArea = new ArrayList<XSubjectAreaType>();
            }
            return this.subjectArea;
        }

    }

}
