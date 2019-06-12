
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalProgressReportListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalProgressReportListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progressReport" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalProgressReportListProgressReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalProgressReportListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "progressReport"
})
public class IepPlanAnnualGoalProgressReportListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalProgressReportListProgressReportType progressReport;

    /**
     * Gets the value of the progressReport property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportType }
     *     
     */
    public IepPlanAnnualGoalProgressReportListProgressReportType getProgressReport() {
        return progressReport;
    }

    /**
     * Sets the value of the progressReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportType }
     *     
     */
    public void setProgressReport(IepPlanAnnualGoalProgressReportListProgressReportType value) {
        this.progressReport = value;
    }

}
