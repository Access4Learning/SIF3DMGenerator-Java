
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourseHistorySectionInfoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseHistorySectionInfoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediumOfInstruction" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseHistoryMediumOfInstructionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseHistorySectionInfoDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mediumOfInstruction"
})
public class CourseHistorySectionInfoDataType {

    @XmlElement(name = "MediumOfInstruction", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseHistoryMediumOfInstructionType mediumOfInstruction;

    /**
     * Gets the value of the mediumOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link CourseHistoryMediumOfInstructionType }
     *     
     */
    public CourseHistoryMediumOfInstructionType getMediumOfInstruction() {
        return mediumOfInstruction;
    }

    /**
     * Sets the value of the mediumOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseHistoryMediumOfInstructionType }
     *     
     */
    public void setMediumOfInstruction(CourseHistoryMediumOfInstructionType value) {
        this.mediumOfInstruction = value;
    }

}
