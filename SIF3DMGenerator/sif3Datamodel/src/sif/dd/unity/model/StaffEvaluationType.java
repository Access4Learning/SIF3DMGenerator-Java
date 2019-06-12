
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StaffEvaluationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffEvaluationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="EvaluatorStateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="BargainingUnit" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EvaluationCycleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EvaluationPreconferenceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProjectedEvaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EvaluationPostconferenceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="EvaluationParts" type="{http://www.sifassociation.org/datamodel/na/4.x}EvaluationPartsType" minOccurs="0"/>
 *         &lt;element name="EvaluationHolisticScore" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="EvaluationHolisticScale" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="EvaluationRecommendation" type="{http://www.sifassociation.org/datamodel/na/4.x}EvaluationRecommendationType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffEvaluationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "staffPersonalRefId",
    "schoolInfoRefId",
    "ncesId",
    "evaluatorStateProvinceId",
    "bargainingUnit",
    "evaluationCycleName",
    "evaluationPreconferenceDate",
    "projectedEvaluationDate",
    "evaluationDate",
    "evaluationPostconferenceDate",
    "evaluationSystem",
    "evaluationParts",
    "evaluationHolisticScore",
    "evaluationHolisticScale",
    "evaluationRecommendation",
    "sifMetadata",
    "sifExtendedElements"
})
public class StaffEvaluationType {

    @XmlElement(name = "StaffPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "EvaluatorStateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String evaluatorStateProvinceId;
    @XmlElement(name = "BargainingUnit", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bargainingUnit;
    @XmlElement(name = "EvaluationCycleName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String evaluationCycleName;
    @XmlElement(name = "EvaluationPreconferenceDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationPreconferenceDate;
    @XmlElement(name = "ProjectedEvaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectedEvaluationDate;
    @XmlElement(name = "EvaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationDate;
    @XmlElement(name = "EvaluationPostconferenceDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationPostconferenceDate;
    @XmlElement(name = "EvaluationSystem", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String evaluationSystem;
    @XmlElement(name = "EvaluationParts", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EvaluationPartsType evaluationParts;
    @XmlElement(name = "EvaluationHolisticScore", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String evaluationHolisticScore;
    @XmlElement(name = "EvaluationHolisticScale", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String evaluationHolisticScale;
    @XmlElement(name = "EvaluationRecommendation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EvaluationRecommendationType evaluationRecommendation;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the staffPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonalRefId() {
        return staffPersonalRefId;
    }

    /**
     * Sets the value of the staffPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonalRefId(String value) {
        this.staffPersonalRefId = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCESId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCESId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the evaluatorStateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluatorStateProvinceId() {
        return evaluatorStateProvinceId;
    }

    /**
     * Sets the value of the evaluatorStateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluatorStateProvinceId(String value) {
        this.evaluatorStateProvinceId = value;
    }

    /**
     * Gets the value of the bargainingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBargainingUnit() {
        return bargainingUnit;
    }

    /**
     * Sets the value of the bargainingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBargainingUnit(String value) {
        this.bargainingUnit = value;
    }

    /**
     * Gets the value of the evaluationCycleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationCycleName() {
        return evaluationCycleName;
    }

    /**
     * Sets the value of the evaluationCycleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationCycleName(String value) {
        this.evaluationCycleName = value;
    }

    /**
     * Gets the value of the evaluationPreconferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationPreconferenceDate() {
        return evaluationPreconferenceDate;
    }

    /**
     * Sets the value of the evaluationPreconferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationPreconferenceDate(XMLGregorianCalendar value) {
        this.evaluationPreconferenceDate = value;
    }

    /**
     * Gets the value of the projectedEvaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedEvaluationDate() {
        return projectedEvaluationDate;
    }

    /**
     * Sets the value of the projectedEvaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedEvaluationDate(XMLGregorianCalendar value) {
        this.projectedEvaluationDate = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationDate(XMLGregorianCalendar value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the evaluationPostconferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationPostconferenceDate() {
        return evaluationPostconferenceDate;
    }

    /**
     * Sets the value of the evaluationPostconferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationPostconferenceDate(XMLGregorianCalendar value) {
        this.evaluationPostconferenceDate = value;
    }

    /**
     * Gets the value of the evaluationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationSystem() {
        return evaluationSystem;
    }

    /**
     * Sets the value of the evaluationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationSystem(String value) {
        this.evaluationSystem = value;
    }

    /**
     * Gets the value of the evaluationParts property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationPartsType }
     *     
     */
    public EvaluationPartsType getEvaluationParts() {
        return evaluationParts;
    }

    /**
     * Sets the value of the evaluationParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationPartsType }
     *     
     */
    public void setEvaluationParts(EvaluationPartsType value) {
        this.evaluationParts = value;
    }

    /**
     * Gets the value of the evaluationHolisticScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationHolisticScore() {
        return evaluationHolisticScore;
    }

    /**
     * Sets the value of the evaluationHolisticScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationHolisticScore(String value) {
        this.evaluationHolisticScore = value;
    }

    /**
     * Gets the value of the evaluationHolisticScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationHolisticScale() {
        return evaluationHolisticScale;
    }

    /**
     * Sets the value of the evaluationHolisticScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationHolisticScale(String value) {
        this.evaluationHolisticScale = value;
    }

    /**
     * Gets the value of the evaluationRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationRecommendationType }
     *     
     */
    public EvaluationRecommendationType getEvaluationRecommendation() {
        return evaluationRecommendation;
    }

    /**
     * Sets the value of the evaluationRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationRecommendationType }
     *     
     */
    public void setEvaluationRecommendation(EvaluationRecommendationType value) {
        this.evaluationRecommendation = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
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
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
