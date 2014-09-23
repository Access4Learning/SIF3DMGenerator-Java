
package sif.dd.us32.model.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gTermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gIntervalEventType">
 *       &lt;sequence>
 *         &lt;element name="organizationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relativeDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="termCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="track" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="termSpanType" type="{http://www.sifassociation.org/datamodel/na/3.2}gSessionTypeType" minOccurs="0"/>
 *         &lt;element name="markingTerm" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="schedulingTerm" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="attendanceTerm" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gTermType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "organizationRefId",
    "schoolYear",
    "description",
    "relativeDuration",
    "termCode",
    "track",
    "termSpanType",
    "markingTerm",
    "schedulingTerm",
    "attendanceTerm"
})
@XmlSeeAlso({
    TermType.class
})
public class GTermType
    extends GIntervalEventType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GGenericRefIdPointerType organizationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal relativeDuration;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType termCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String track;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSessionTypeType termSpanType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType markingTerm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType schedulingTerm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType attendanceTerm;

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
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
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
     * Gets the value of the relativeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeDuration() {
        return relativeDuration;
    }

    /**
     * Sets the value of the relativeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeDuration(BigDecimal value) {
        this.relativeDuration = value;
    }

    /**
     * Gets the value of the termCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getTermCode() {
        return termCode;
    }

    /**
     * Sets the value of the termCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setTermCode(GLaxCodedElementType value) {
        this.termCode = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack() {
        return track;
    }

    /**
     * Sets the value of the track property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack(String value) {
        this.track = value;
    }

    /**
     * Gets the value of the termSpanType property.
     * 
     * @return
     *     possible object is
     *     {@link GSessionTypeType }
     *     
     */
    public GSessionTypeType getTermSpanType() {
        return termSpanType;
    }

    /**
     * Sets the value of the termSpanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSessionTypeType }
     *     
     */
    public void setTermSpanType(GSessionTypeType value) {
        this.termSpanType = value;
    }

    /**
     * Gets the value of the markingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getMarkingTerm() {
        return markingTerm;
    }

    /**
     * Sets the value of the markingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setMarkingTerm(GYesNoUnknownType value) {
        this.markingTerm = value;
    }

    /**
     * Gets the value of the schedulingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSchedulingTerm() {
        return schedulingTerm;
    }

    /**
     * Sets the value of the schedulingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSchedulingTerm(GYesNoUnknownType value) {
        this.schedulingTerm = value;
    }

    /**
     * Gets the value of the attendanceTerm property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getAttendanceTerm() {
        return attendanceTerm;
    }

    /**
     * Sets the value of the attendanceTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setAttendanceTerm(GYesNoUnknownType value) {
        this.attendanceTerm = value;
    }

}
