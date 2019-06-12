
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


/**
 * <p>Java class for RTIResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTIResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RTILocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="Intervention" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicators" type="{http://www.sifassociation.org/datamodel/na/4.x}PerformanceIndicatorListType" minOccurs="0"/>
 *         &lt;element name="Measurements" type="{http://www.sifassociation.org/datamodel/na/4.x}ResponseToInterventionMeasurementListType" minOccurs="0"/>
 *         &lt;element name="Baselines" type="{http://www.sifassociation.org/datamodel/na/4.x}BaselineListType" minOccurs="0"/>
 *         &lt;element name="Targets" type="{http://www.sifassociation.org/datamodel/na/4.x}TargetListType" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://www.sifassociation.org/datamodel/na/4.x}ResultListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="StudentPlacementRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="ResponseToInterventionRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTIResultsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "rtiLocalId",
    "intervention",
    "performanceIndicators",
    "measurements",
    "baselines",
    "targets",
    "results",
    "sifMetadata",
    "sifExtendedElements"
})
public class RTIResultsType {

    @XmlElement(name = "RTILocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rtiLocalId;
    @XmlElement(name = "Intervention", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String intervention;
    @XmlElement(name = "PerformanceIndicators", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PerformanceIndicatorListType performanceIndicators;
    @XmlElement(name = "Measurements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ResponseToInterventionMeasurementListType measurements;
    @XmlElement(name = "Baselines", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BaselineListType baselines;
    @XmlElement(name = "Targets", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TargetListType targets;
    @XmlElement(name = "Results", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ResultListType results;
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
    @XmlAttribute(name = "StudentPlacementRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPlacementRefId;
    @XmlAttribute(name = "ResponseToInterventionRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseToInterventionRefId;

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
     * Gets the value of the intervention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervention() {
        return intervention;
    }

    /**
     * Sets the value of the intervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervention(String value) {
        this.intervention = value;
    }

    /**
     * Gets the value of the performanceIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceIndicatorListType }
     *     
     */
    public PerformanceIndicatorListType getPerformanceIndicators() {
        return performanceIndicators;
    }

    /**
     * Sets the value of the performanceIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceIndicatorListType }
     *     
     */
    public void setPerformanceIndicators(PerformanceIndicatorListType value) {
        this.performanceIndicators = value;
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
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ResultListType }
     *     
     */
    public ResultListType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultListType }
     *     
     */
    public void setResults(ResultListType value) {
        this.results = value;
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

    /**
     * Gets the value of the responseToInterventionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseToInterventionRefId() {
        return responseToInterventionRefId;
    }

    /**
     * Sets the value of the responseToInterventionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseToInterventionRefId(String value) {
        this.responseToInterventionRefId = value;
    }

}
