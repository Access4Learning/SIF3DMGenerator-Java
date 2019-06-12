
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personal" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="academic" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceAcademicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functional" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceFunctionalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consequenceOfDisability" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceConsequenceOfDisabilityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "personal",
    "academic",
    "functional",
    "consequenceOfDisability"
})
public class IepPlanPresentLevelPerformanceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformancePersonalType> personal;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceAcademicType> academic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceFunctionalType> functional;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceConsequenceOfDisabilityType consequenceOfDisability;

    /**
     * Gets the value of the personal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformancePersonalType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformancePersonalType> getPersonal() {
        if (personal == null) {
            personal = new ArrayList<IepPlanPresentLevelPerformancePersonalType>();
        }
        return this.personal;
    }

    /**
     * Gets the value of the academic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceAcademicType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceAcademicType> getAcademic() {
        if (academic == null) {
            academic = new ArrayList<IepPlanPresentLevelPerformanceAcademicType>();
        }
        return this.academic;
    }

    /**
     * Gets the value of the functional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceFunctionalType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceFunctionalType> getFunctional() {
        if (functional == null) {
            functional = new ArrayList<IepPlanPresentLevelPerformanceFunctionalType>();
        }
        return this.functional;
    }

    /**
     * Gets the value of the consequenceOfDisability property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceConsequenceOfDisabilityType }
     *     
     */
    public IepPlanPresentLevelPerformanceConsequenceOfDisabilityType getConsequenceOfDisability() {
        return consequenceOfDisability;
    }

    /**
     * Sets the value of the consequenceOfDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceConsequenceOfDisabilityType }
     *     
     */
    public void setConsequenceOfDisability(IepPlanPresentLevelPerformanceConsequenceOfDisabilityType value) {
        this.consequenceOfDisability = value;
    }

}
