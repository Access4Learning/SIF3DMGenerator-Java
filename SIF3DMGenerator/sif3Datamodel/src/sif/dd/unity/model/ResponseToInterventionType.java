
package sif.dd.unity.model;

import java.math.BigDecimal;
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
 * <p>Java class for ResponseToInterventionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseToInterventionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RTILocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="LocationWhereInterventionDelivered" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="InterventionProviderNames" type="{http://www.sifassociation.org/datamodel/na/4.x}InterventionProviderNameListType" minOccurs="0"/>
 *         &lt;element name="Tier" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Interventions" type="{http://www.sifassociation.org/datamodel/na/4.x}InterventionListType"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType"/>
 *         &lt;element name="LearningStandardItems" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectiveListType" minOccurs="0"/>
 *         &lt;element name="Measurements" type="{http://www.sifassociation.org/datamodel/na/4.x}ResponseToInterventionMeasurementListType" minOccurs="0"/>
 *         &lt;element name="Baselines" type="{http://www.sifassociation.org/datamodel/na/4.x}BaselineListType" minOccurs="0"/>
 *         &lt;element name="Targets" type="{http://www.sifassociation.org/datamodel/na/4.x}TargetListType" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProjectedExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FrequencyTime" type="{http://www.sifassociation.org/datamodel/na/4.x}InterventionFrequencyTimeType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="StaffPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="StudentPlacementRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseToInterventionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "rtiLocalId",
    "locationWhereInterventionDelivered",
    "interventionProviderNames",
    "tier",
    "interventions",
    "subjectArea",
    "learningStandardItems",
    "learningObjectives",
    "measurements",
    "baselines",
    "targets",
    "entryDate",
    "projectedExitDate",
    "exitDate",
    "frequencyTime",
    "sifMetadata",
    "sifExtendedElements"
})
public class ResponseToInterventionType {

    @XmlElement(name = "RTILocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rtiLocalId;
    @XmlElement(name = "LocationWhereInterventionDelivered", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String locationWhereInterventionDelivered;
    @XmlElement(name = "InterventionProviderNames", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InterventionProviderNameListType interventionProviderNames;
    @XmlElement(name = "Tier", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal tier;
    @XmlElement(name = "Interventions", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected InterventionListType interventions;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "LearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandardItems;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectiveListType learningObjectives;
    @XmlElement(name = "Measurements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ResponseToInterventionMeasurementListType measurements;
    @XmlElement(name = "Baselines", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BaselineListType baselines;
    @XmlElement(name = "Targets", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TargetListType targets;
    @XmlElement(name = "EntryDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "ProjectedExitDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectedExitDate;
    @XmlElement(name = "ExitDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(name = "FrequencyTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InterventionFrequencyTimeType frequencyTime;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlAttribute(name = "SchoolInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlAttribute(name = "StaffPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonalRefId;
    @XmlAttribute(name = "StudentPlacementRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPlacementRefId;

    /**
     * Gets the value of the rtiLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTILocalId() {
        return rtiLocalId;
    }

    /**
     * Sets the value of the rtiLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTILocalId(String value) {
        this.rtiLocalId = value;
    }

    /**
     * Gets the value of the locationWhereInterventionDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationWhereInterventionDelivered() {
        return locationWhereInterventionDelivered;
    }

    /**
     * Sets the value of the locationWhereInterventionDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationWhereInterventionDelivered(String value) {
        this.locationWhereInterventionDelivered = value;
    }

    /**
     * Gets the value of the interventionProviderNames property.
     * 
     * @return
     *     possible object is
     *     {@link InterventionProviderNameListType }
     *     
     */
    public InterventionProviderNameListType getInterventionProviderNames() {
        return interventionProviderNames;
    }

    /**
     * Sets the value of the interventionProviderNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterventionProviderNameListType }
     *     
     */
    public void setInterventionProviderNames(InterventionProviderNameListType value) {
        this.interventionProviderNames = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTier(BigDecimal value) {
        this.tier = value;
    }

    /**
     * Gets the value of the interventions property.
     * 
     * @return
     *     possible object is
     *     {@link InterventionListType }
     *     
     */
    public InterventionListType getInterventions() {
        return interventions;
    }

    /**
     * Sets the value of the interventions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterventionListType }
     *     
     */
    public void setInterventions(InterventionListType value) {
        this.interventions = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaType }
     *     
     */
    public SubjectAreaType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaType }
     *     
     */
    public void setSubjectArea(SubjectAreaType value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the learningStandardItems property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getLearningStandardItems() {
        return learningStandardItems;
    }

    /**
     * Sets the value of the learningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setLearningStandardItems(LearningStandardItemRefIdListType value) {
        this.learningStandardItems = value;
    }

    /**
     * Gets the value of the learningObjectives property.
     * 
     * @return
     *     possible object is
     *     {@link LearningObjectiveListType }
     *     
     */
    public LearningObjectiveListType getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Sets the value of the learningObjectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningObjectiveListType }
     *     
     */
    public void setLearningObjectives(LearningObjectiveListType value) {
        this.learningObjectives = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseToInterventionMeasurementListType }
     *     
     */
    public ResponseToInterventionMeasurementListType getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseToInterventionMeasurementListType }
     *     
     */
    public void setMeasurements(ResponseToInterventionMeasurementListType value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the baselines property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineListType }
     *     
     */
    public BaselineListType getBaselines() {
        return baselines;
    }

    /**
     * Sets the value of the baselines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineListType }
     *     
     */
    public void setBaselines(BaselineListType value) {
        this.baselines = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link TargetListType }
     *     
     */
    public TargetListType getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetListType }
     *     
     */
    public void setTargets(TargetListType value) {
        this.targets = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the projectedExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedExitDate() {
        return projectedExitDate;
    }

    /**
     * Sets the value of the projectedExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedExitDate(XMLGregorianCalendar value) {
        this.projectedExitDate = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitDate(XMLGregorianCalendar value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the frequencyTime property.
     * 
     * @return
     *     possible object is
     *     {@link InterventionFrequencyTimeType }
     *     
     */
    public InterventionFrequencyTimeType getFrequencyTime() {
        return frequencyTime;
    }

    /**
     * Sets the value of the frequencyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterventionFrequencyTimeType }
     *     
     */
    public void setFrequencyTime(InterventionFrequencyTimeType value) {
        this.frequencyTime = value;
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

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
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
     * Gets the value of the studentPlacementRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPlacementRefId() {
        return studentPlacementRefId;
    }

    /**
     * Sets the value of the studentPlacementRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPlacementRefId(String value) {
        this.studentPlacementRefId = value;
    }

}
