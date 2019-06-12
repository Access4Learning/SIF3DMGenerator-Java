
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataValue" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "dataValue"
})
public class IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType dataValue;

    /**
     * Gets the value of the dataValue property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType }
     *     
     */
    public IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType }
     *     
     */
    public void setDataValue(IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListDataValueType value) {
        this.dataValue = value;
    }

}
