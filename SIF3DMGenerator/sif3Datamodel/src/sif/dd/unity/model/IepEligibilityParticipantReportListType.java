
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepEligibilityParticipantReportListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityParticipantReportListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantReport" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityParticipantReportListParticipantReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityParticipantReportListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "participantReport"
})
public class IepEligibilityParticipantReportListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityParticipantReportListParticipantReportType participantReport;

    /**
     * Gets the value of the participantReport property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityParticipantReportListParticipantReportType }
     *     
     */
    public IepEligibilityParticipantReportListParticipantReportType getParticipantReport() {
        return participantReport;
    }

    /**
     * Sets the value of the participantReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityParticipantReportListParticipantReportType }
     *     
     */
    public void setParticipantReport(IepEligibilityParticipantReportListParticipantReportType value) {
        this.participantReport = value;
    }

}
