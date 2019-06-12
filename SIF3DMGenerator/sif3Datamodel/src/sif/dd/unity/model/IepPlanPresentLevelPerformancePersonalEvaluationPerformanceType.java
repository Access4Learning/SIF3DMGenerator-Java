
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
 * <p>Java class for iepPlanPresentLevelPerformancePersonalEvaluationPerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformancePersonalEvaluationPerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalEducationDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="testResultList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalEvaluationPerformanceTestResultListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformancePersonalEvaluationPerformanceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "generalEducationDescription",
    "testResultList"
})
public class IepPlanPresentLevelPerformancePersonalEvaluationPerformanceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String generalEducationDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceTestResultListType> testResultList;

    /**
     * Gets the value of the generalEducationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralEducationDescription() {
        return generalEducationDescription;
    }

    /**
     * Sets the value of the generalEducationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralEducationDescription(String value) {
        this.generalEducationDescription = value;
    }

    /**
     * Gets the value of the testResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformancePersonalEvaluationPerformanceTestResultListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceTestResultListType> getTestResultList() {
        if (testResultList == null) {
            testResultList = new ArrayList<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceTestResultListType>();
        }
        return this.testResultList;
    }

}
