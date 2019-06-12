
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
 * <p>Java class for iepPlanAnnualGoalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentStatus" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="goalType" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalGoalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measurableObjectiveList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="independentActionsList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalIndependentActionsListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servicesList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalServicesListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coursesList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalCoursesListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="progressReportList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalProgressReportListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentAcceptance" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalListParentAcceptanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "currentStatus",
    "goalType",
    "measurableObjectiveList",
    "independentActionsList",
    "servicesList",
    "coursesList",
    "progressReportList",
    "parentAcceptance"
})
public class IepPlanAnnualGoalType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String currentStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalGoalType> goalType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalMeasurableObjectiveListType> measurableObjectiveList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalIndependentActionsListType> independentActionsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalServicesListType> servicesList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalCoursesListType> coursesList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalProgressReportListType> progressReportList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalListParentAcceptanceType parentAcceptance;

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the goalType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalGoalType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalGoalType> getGoalType() {
        if (goalType == null) {
            goalType = new ArrayList<IepPlanAnnualGoalGoalType>();
        }
        return this.goalType;
    }

    /**
     * Gets the value of the measurableObjectiveList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurableObjectiveList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurableObjectiveList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalMeasurableObjectiveListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalMeasurableObjectiveListType> getMeasurableObjectiveList() {
        if (measurableObjectiveList == null) {
            measurableObjectiveList = new ArrayList<IepPlanAnnualGoalMeasurableObjectiveListType>();
        }
        return this.measurableObjectiveList;
    }

    /**
     * Gets the value of the independentActionsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentActionsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentActionsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalIndependentActionsListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalIndependentActionsListType> getIndependentActionsList() {
        if (independentActionsList == null) {
            independentActionsList = new ArrayList<IepPlanAnnualGoalIndependentActionsListType>();
        }
        return this.independentActionsList;
    }

    /**
     * Gets the value of the servicesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalServicesListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalServicesListType> getServicesList() {
        if (servicesList == null) {
            servicesList = new ArrayList<IepPlanAnnualGoalServicesListType>();
        }
        return this.servicesList;
    }

    /**
     * Gets the value of the coursesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coursesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoursesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalCoursesListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalCoursesListType> getCoursesList() {
        if (coursesList == null) {
            coursesList = new ArrayList<IepPlanAnnualGoalCoursesListType>();
        }
        return this.coursesList;
    }

    /**
     * Gets the value of the progressReportList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressReportList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressReportList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalProgressReportListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalProgressReportListType> getProgressReportList() {
        if (progressReportList == null) {
            progressReportList = new ArrayList<IepPlanAnnualGoalProgressReportListType>();
        }
        return this.progressReportList;
    }

    /**
     * Gets the value of the parentAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalListParentAcceptanceType }
     *     
     */
    public IepPlanAnnualGoalListParentAcceptanceType getParentAcceptance() {
        return parentAcceptance;
    }

    /**
     * Sets the value of the parentAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalListParentAcceptanceType }
     *     
     */
    public void setParentAcceptance(IepPlanAnnualGoalListParentAcceptanceType value) {
        this.parentAcceptance = value;
    }

}
