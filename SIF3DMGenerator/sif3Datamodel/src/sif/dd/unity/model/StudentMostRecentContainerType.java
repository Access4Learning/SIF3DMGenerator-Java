
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentMostRecentContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentMostRecentContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="HomeroomLocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="GradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentMostRecentContainerType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolLocalId",
    "homeroomLocalId",
    "gradeLevel"
})
public class StudentMostRecentContainerType {

    @XmlElement(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String schoolLocalId;
    @XmlElement(name = "HomeroomLocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String homeroomLocalId;
    @XmlElement(name = "GradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevel;

    /**
     * Gets the value of the schoolLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolLocalId() {
        return schoolLocalId;
    }

    /**
     * Sets the value of the schoolLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolLocalId(String value) {
        this.schoolLocalId = value;
    }

    /**
     * Gets the value of the homeroomLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeroomLocalId() {
        return homeroomLocalId;
    }

    /**
     * Sets the value of the homeroomLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeroomLocalId(String value) {
        this.homeroomLocalId = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevel(GradeLevelType value) {
        this.gradeLevel = value;
    }

}
