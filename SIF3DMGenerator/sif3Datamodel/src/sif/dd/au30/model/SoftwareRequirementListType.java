
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information about required software.
 * 
 * <p>Java class for SoftwareRequirementListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareRequirementListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoftwareRequirement" type="{http://www.sifassociation.org/datamodel/au/3.4}SoftwareRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareRequirementListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "softwareRequirement"
})
public class SoftwareRequirementListType {

    @XmlElement(name = "SoftwareRequirement", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<SoftwareRequirementType> softwareRequirement;

    /**
     * Gets the value of the softwareRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareRequirementType }
     * 
     * 
     */
    public List<SoftwareRequirementType> getSoftwareRequirement() {
        if (softwareRequirement == null) {
            softwareRequirement = new ArrayList<SoftwareRequirementType>();
        }
        return this.softwareRequirement;
    }

}
