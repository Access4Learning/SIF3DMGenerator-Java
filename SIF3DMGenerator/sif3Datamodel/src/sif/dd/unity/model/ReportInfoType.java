
package sif.dd.unity.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SubmissionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="SubmissionReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Initial"/>
 *               &lt;enumeration value="Correction"/>
 *               &lt;enumeration value="Revision"/>
 *               &lt;enumeration value="Addition"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportSubmitterInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}ReportSubmitterInfoType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReportManifestRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "calculationDate",
    "submissionNumber",
    "submissionReason",
    "reportSubmitterInfo",
    "description"
})
public class ReportInfoType {

    @XmlElement(name = "CalculationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calculationDate;
    @XmlElement(name = "SubmissionNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger submissionNumber;
    @XmlElement(name = "SubmissionReason", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String submissionReason;
    @XmlElement(name = "ReportSubmitterInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ReportSubmitterInfoType reportSubmitterInfo;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlAttribute(name = "ReportManifestRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reportManifestRefId;

    /**
     * Gets the value of the calculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculationDate() {
        return calculationDate;
    }

    /**
     * Sets the value of the calculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculationDate(XMLGregorianCalendar value) {
        this.calculationDate = value;
    }

    /**
     * Gets the value of the submissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Sets the value of the submissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubmissionNumber(BigInteger value) {
        this.submissionNumber = value;
    }

    /**
     * Gets the value of the submissionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionReason() {
        return submissionReason;
    }

    /**
     * Sets the value of the submissionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionReason(String value) {
        this.submissionReason = value;
    }

    /**
     * Gets the value of the reportSubmitterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSubmitterInfoType }
     *     
     */
    public ReportSubmitterInfoType getReportSubmitterInfo() {
        return reportSubmitterInfo;
    }

    /**
     * Sets the value of the reportSubmitterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSubmitterInfoType }
     *     
     */
    public void setReportSubmitterInfo(ReportSubmitterInfoType value) {
        this.reportSubmitterInfo = value;
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
     * Gets the value of the reportManifestRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportManifestRefId() {
        return reportManifestRefId;
    }

    /**
     * Sets the value of the reportManifestRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportManifestRefId(String value) {
        this.reportManifestRefId = value;
    }

}
