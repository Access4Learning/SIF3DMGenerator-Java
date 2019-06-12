
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIF_MetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIF_MetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeElements" type="{http://www.sifassociation.org/datamodel/na/4.x}TimeElementsType" minOccurs="0"/>
 *         &lt;element name="LifeCycle" type="{http://www.sifassociation.org/datamodel/na/4.x}LifeCycleType" minOccurs="0"/>
 *         &lt;element name="RightsElements" type="{http://www.sifassociation.org/datamodel/na/4.x}RightsElementsType" minOccurs="0"/>
 *         &lt;element name="EducationFilter" type="{http://www.sifassociation.org/datamodel/na/4.x}EducationFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIF_MetadataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "timeElements",
    "lifeCycle",
    "rightsElements",
    "educationFilter"
})
public class SIFMetadataType {

    @XmlElement(name = "TimeElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TimeElementsType timeElements;
    @XmlElement(name = "LifeCycle", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LifeCycleType lifeCycle;
    @XmlElement(name = "RightsElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RightsElementsType rightsElements;
    @XmlElement(name = "EducationFilter", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EducationFilterType educationFilter;

    /**
     * Gets the value of the timeElements property.
     * 
     * @return
     *     possible object is
     *     {@link TimeElementsType }
     *     
     */
    public TimeElementsType getTimeElements() {
        return timeElements;
    }

    /**
     * Sets the value of the timeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeElementsType }
     *     
     */
    public void setTimeElements(TimeElementsType value) {
        this.timeElements = value;
    }

    /**
     * Gets the value of the lifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleType }
     *     
     */
    public LifeCycleType getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Sets the value of the lifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleType }
     *     
     */
    public void setLifeCycle(LifeCycleType value) {
        this.lifeCycle = value;
    }

    /**
     * Gets the value of the rightsElements property.
     * 
     * @return
     *     possible object is
     *     {@link RightsElementsType }
     *     
     */
    public RightsElementsType getRightsElements() {
        return rightsElements;
    }

    /**
     * Sets the value of the rightsElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsElementsType }
     *     
     */
    public void setRightsElements(RightsElementsType value) {
        this.rightsElements = value;
    }

    /**
     * Gets the value of the educationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link EducationFilterType }
     *     
     */
    public EducationFilterType getEducationFilter() {
        return educationFilter;
    }

    /**
     * Sets the value of the educationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationFilterType }
     *     
     */
    public void setEducationFilter(EducationFilterType value) {
        this.educationFilter = value;
    }

}
