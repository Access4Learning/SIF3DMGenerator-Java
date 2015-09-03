
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         This object provides score information about a particular assignment. 
 *       
 * 
 * <p>Java class for GradingAssignmentScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GradingAssignmentScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentPersonalLocalId" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TeachingGroupRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="GradingAssignmentRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ScorePoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ScorePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScoreLetter" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ScoreDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/1.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GradingAssignmentScoreType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "studentPersonalRefId",
    "studentPersonalLocalId",
    "teachingGroupRefId",
    "schoolInfoRefId",
    "gradingAssignmentRefId",
    "scorePoints",
    "scorePercent",
    "scoreLetter",
    "scoreDescription",
    "sifMetadata",
    "sifExtendedElements"
})
public class GradingAssignmentScoreType {

    @XmlElementRef(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentPersonalRefId;
    @XmlElement(name = "StudentPersonalLocalId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String studentPersonalLocalId;
    @XmlElementRef(name = "TeachingGroupRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teachingGroupRefId;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElement(name = "GradingAssignmentRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gradingAssignmentRefId;
    @XmlElementRef(name = "ScorePoints", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> scorePoints;
    @XmlElementRef(name = "ScorePercent", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> scorePercent;
    @XmlElementRef(name = "ScoreLetter", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scoreLetter;
    @XmlElementRef(name = "ScoreDescription", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scoreDescription;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentPersonalRefId(JAXBElement<String> value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the studentPersonalLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalLocalId() {
        return studentPersonalLocalId;
    }

    /**
     * Sets the value of the studentPersonalLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalLocalId(String value) {
        this.studentPersonalLocalId = value;
    }

    /**
     * Gets the value of the teachingGroupRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeachingGroupRefId() {
        return teachingGroupRefId;
    }

    /**
     * Sets the value of the teachingGroupRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeachingGroupRefId(JAXBElement<String> value) {
        this.teachingGroupRefId = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the gradingAssignmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradingAssignmentRefId() {
        return gradingAssignmentRefId;
    }

    /**
     * Sets the value of the gradingAssignmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradingAssignmentRefId(String value) {
        this.gradingAssignmentRefId = value;
    }

    /**
     * Gets the value of the scorePoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getScorePoints() {
        return scorePoints;
    }

    /**
     * Sets the value of the scorePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setScorePoints(JAXBElement<Long> value) {
        this.scorePoints = value;
    }

    /**
     * Gets the value of the scorePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getScorePercent() {
        return scorePercent;
    }

    /**
     * Sets the value of the scorePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setScorePercent(JAXBElement<BigDecimal> value) {
        this.scorePercent = value;
    }

    /**
     * Gets the value of the scoreLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScoreLetter() {
        return scoreLetter;
    }

    /**
     * Sets the value of the scoreLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScoreLetter(JAXBElement<String> value) {
        this.scoreLetter = value;
    }

    /**
     * Gets the value of the scoreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScoreDescription() {
        return scoreDescription;
    }

    /**
     * Sets the value of the scoreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScoreDescription(JAXBElement<String> value) {
        this.scoreDescription = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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
