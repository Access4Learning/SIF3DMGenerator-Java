
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="TimeElements" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeElementListType" minOccurs="0"/>
 *         &lt;element name="LifeCycle" type="{http://www.sifassociation.org/datamodel/au/3.4}LifeCycleType" minOccurs="0"/>
 *         &lt;element name="EducationFilter" type="{http://www.sifassociation.org/datamodel/au/3.4}EducationFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIF_MetadataType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "timeElements",
    "lifeCycle",
    "educationFilter"
})
public class SIFMetadataType {

    @XmlElementRef(name = "TimeElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeElementListType> timeElements;
    @XmlElementRef(name = "LifeCycle", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LifeCycleType> lifeCycle;
    @XmlElementRef(name = "EducationFilter", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<EducationFilterType> educationFilter;

    /**
     * Gets the value of the timeElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeElementListType }{@code >}
     *     
     */
    public JAXBElement<TimeElementListType> getTimeElements() {
        return timeElements;
    }

    /**
     * Sets the value of the timeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeElementListType }{@code >}
     *     
     */
    public void setTimeElements(JAXBElement<TimeElementListType> value) {
        this.timeElements = value;
    }

    /**
     * Gets the value of the lifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType }{@code >}
     *     
     */
    public JAXBElement<LifeCycleType> getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Sets the value of the lifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType }{@code >}
     *     
     */
    public void setLifeCycle(JAXBElement<LifeCycleType> value) {
        this.lifeCycle = value;
    }

    /**
     * Gets the value of the educationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EducationFilterType }{@code >}
     *     
     */
    public JAXBElement<EducationFilterType> getEducationFilter() {
        return educationFilter;
    }

    /**
     * Sets the value of the educationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EducationFilterType }{@code >}
     *     
     */
    public void setEducationFilter(JAXBElement<EducationFilterType> value) {
        this.educationFilter = value;
    }

}
