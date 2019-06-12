
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanAnnualGoalProgressReportListProgressReportMeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalProgressReportListProgressReportMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="dataNames" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType" minOccurs="0"/>
 *         &lt;element name="dataValuesList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalProgressReportListProgressReportMeasurementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "explanation",
    "dataNames",
    "dataValuesList"
})
public class IepPlanAnnualGoalProgressReportListProgressReportMeasurementType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String explanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType dataNames;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType> dataValuesList;

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the dataNames property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType }
     *     
     */
    public IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType getDataNames() {
        return dataNames;
    }

    /**
     * Sets the value of the dataNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType }
     *     
     */
    public void setDataNames(IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataNamesType value) {
        this.dataNames = value;
    }

    /**
     * Gets the value of the dataValuesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataValuesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataValuesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType> getDataValuesList() {
        if (dataValuesList == null) {
            dataValuesList = new ArrayList<IepPlanAnnualGoalProgressReportListProgressReportMeasurementDataValuesListType>();
        }
        return this.dataValuesList;
    }

}
