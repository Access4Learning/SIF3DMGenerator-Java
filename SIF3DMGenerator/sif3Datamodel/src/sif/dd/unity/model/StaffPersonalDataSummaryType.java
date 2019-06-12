
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffPersonalDataSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffPersonalDataSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffPersonalData" type="{http://www.sifassociation.org/datamodel/na/4.x}StaffPersonalDataSummary2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffPersonalDataSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "staffPersonalData"
})
public class StaffPersonalDataSummaryType {

    @XmlElement(name = "StaffPersonalData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StaffPersonalDataSummary2Type staffPersonalData;

    /**
     * Gets the value of the staffPersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link StaffPersonalDataSummary2Type }
     *     
     */
    public StaffPersonalDataSummary2Type getStaffPersonalData() {
        return staffPersonalData;
    }

    /**
     * Sets the value of the staffPersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffPersonalDataSummary2Type }
     *     
     */
    public void setStaffPersonalData(StaffPersonalDataSummary2Type value) {
        this.staffPersonalData = value;
    }

}
