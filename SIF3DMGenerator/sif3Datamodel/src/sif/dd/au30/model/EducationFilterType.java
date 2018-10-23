
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EducationFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearningStandardItems" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationFilterType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "learningStandardItems"
})
public class EducationFilterType {

    @XmlElementRef(name = "LearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardsType> learningStandardItems;

    /**
     * Gets the value of the learningStandardItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public JAXBElement<LearningStandardsType> getLearningStandardItems() {
        return learningStandardItems;
    }

    /**
     * Sets the value of the learningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public void setLearningStandardItems(JAXBElement<LearningStandardsType> value) {
        this.learningStandardItems = value;
    }

}
