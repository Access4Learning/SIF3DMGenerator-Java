
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramAvailabilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramAvailabilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgramAvailability" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramAvailabilityType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramAvailabilityListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "programAvailability"
})
public class ProgramAvailabilityListType {

    @XmlElement(name = "ProgramAvailability", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<ProgramAvailabilityType> programAvailability;

    /**
     * Gets the value of the programAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramAvailabilityType }
     * 
     * 
     */
    public List<ProgramAvailabilityType> getProgramAvailability() {
        if (programAvailability == null) {
            programAvailability = new ArrayList<ProgramAvailabilityType>();
        }
        return this.programAvailability;
    }

}
