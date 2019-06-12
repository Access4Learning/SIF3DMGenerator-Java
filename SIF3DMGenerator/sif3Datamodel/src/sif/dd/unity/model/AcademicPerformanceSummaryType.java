
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AcademicPerformanceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicPerformanceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CumulativeGPACreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CumulativeGradePoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CumulativeGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GPAType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ClassRank" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ClassTotalNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ClassRankingDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ProjectedGraduationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="GraduationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="GraduationDiplomaType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AcademicTrack" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AcademicFoci" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicFocusListType" minOccurs="0"/>
 *         &lt;element name="AcademicSubjects" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicSubjectListType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicPerformanceSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "totalCreditsAttempted",
    "totalCreditsEarned",
    "cumulativeGPACreditsEarned",
    "cumulativeGradePoints",
    "cumulativeGPA",
    "gpaType",
    "classRank",
    "classTotalNumber",
    "classRankingDate",
    "projectedGraduationDate",
    "graduationDate",
    "graduationDiplomaType",
    "academicTrack",
    "academicFoci",
    "academicSubjects",
    "sifExtendedElements"
})
public class AcademicPerformanceSummaryType {

    @XmlElement(name = "TotalCreditsAttempted", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal totalCreditsAttempted;
    @XmlElement(name = "TotalCreditsEarned", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal totalCreditsEarned;
    @XmlElement(name = "CumulativeGPACreditsEarned", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal cumulativeGPACreditsEarned;
    @XmlElement(name = "CumulativeGradePoints", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal cumulativeGradePoints;
    @XmlElement(name = "CumulativeGPA", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal cumulativeGPA;
    @XmlElement(name = "GPAType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gpaType;
    @XmlElement(name = "ClassRank", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long classRank;
    @XmlElement(name = "ClassTotalNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long classTotalNumber;
    @XmlElement(name = "ClassRankingDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String classRankingDate;
    @XmlElement(name = "ProjectedGraduationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String projectedGraduationDate;
    @XmlElement(name = "GraduationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String graduationDate;
    @XmlElement(name = "GraduationDiplomaType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graduationDiplomaType;
    @XmlElement(name = "AcademicTrack", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AcademicPerformanceSummaryType.AcademicTrack academicTrack;
    @XmlElement(name = "AcademicFoci", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AcademicFocusListType academicFoci;
    @XmlElement(name = "AcademicSubjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AcademicSubjectListType academicSubjects;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the totalCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditsAttempted() {
        return totalCreditsAttempted;
    }

    /**
     * Sets the value of the totalCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditsAttempted(BigDecimal value) {
        this.totalCreditsAttempted = value;
    }

    /**
     * Gets the value of the totalCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    /**
     * Sets the value of the totalCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditsEarned(BigDecimal value) {
        this.totalCreditsEarned = value;
    }

    /**
     * Gets the value of the cumulativeGPACreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGPACreditsEarned() {
        return cumulativeGPACreditsEarned;
    }

    /**
     * Sets the value of the cumulativeGPACreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGPACreditsEarned(BigDecimal value) {
        this.cumulativeGPACreditsEarned = value;
    }

    /**
     * Gets the value of the cumulativeGradePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGradePoints() {
        return cumulativeGradePoints;
    }

    /**
     * Sets the value of the cumulativeGradePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGradePoints(BigDecimal value) {
        this.cumulativeGradePoints = value;
    }

    /**
     * Gets the value of the cumulativeGPA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGPA() {
        return cumulativeGPA;
    }

    /**
     * Sets the value of the cumulativeGPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGPA(BigDecimal value) {
        this.cumulativeGPA = value;
    }

    /**
     * Gets the value of the gpaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPAType() {
        return gpaType;
    }

    /**
     * Sets the value of the gpaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPAType(String value) {
        this.gpaType = value;
    }

    /**
     * Gets the value of the classRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassRank() {
        return classRank;
    }

    /**
     * Sets the value of the classRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassRank(Long value) {
        this.classRank = value;
    }

    /**
     * Gets the value of the classTotalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassTotalNumber() {
        return classTotalNumber;
    }

    /**
     * Sets the value of the classTotalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassTotalNumber(Long value) {
        this.classTotalNumber = value;
    }

    /**
     * Gets the value of the classRankingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassRankingDate() {
        return classRankingDate;
    }

    /**
     * Sets the value of the classRankingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassRankingDate(String value) {
        this.classRankingDate = value;
    }

    /**
     * Gets the value of the projectedGraduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectedGraduationDate() {
        return projectedGraduationDate;
    }

    /**
     * Sets the value of the projectedGraduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectedGraduationDate(String value) {
        this.projectedGraduationDate = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationDate(String value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the graduationDiplomaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationDiplomaType() {
        return graduationDiplomaType;
    }

    /**
     * Sets the value of the graduationDiplomaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationDiplomaType(String value) {
        this.graduationDiplomaType = value;
    }

    /**
     * Gets the value of the academicTrack property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPerformanceSummaryType.AcademicTrack }
     *     
     */
    public AcademicPerformanceSummaryType.AcademicTrack getAcademicTrack() {
        return academicTrack;
    }

    /**
     * Sets the value of the academicTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPerformanceSummaryType.AcademicTrack }
     *     
     */
    public void setAcademicTrack(AcademicPerformanceSummaryType.AcademicTrack value) {
        this.academicTrack = value;
    }

    /**
     * Gets the value of the academicFoci property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicFocusListType }
     *     
     */
    public AcademicFocusListType getAcademicFoci() {
        return academicFoci;
    }

    /**
     * Sets the value of the academicFoci property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicFocusListType }
     *     
     */
    public void setAcademicFoci(AcademicFocusListType value) {
        this.academicFoci = value;
    }

    /**
     * Gets the value of the academicSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSubjectListType }
     *     
     */
    public AcademicSubjectListType getAcademicSubjects() {
        return academicSubjects;
    }

    /**
     * Sets the value of the academicSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSubjectListType }
     *     
     */
    public void setAcademicSubjects(AcademicSubjectListType value) {
        this.academicSubjects = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
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
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
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
    public static class AcademicTrack {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

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
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
