
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Skills or competencies the student must have to engage in activity.
 * 
 * <p>Java class for PrerequisitesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrerequisitesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prerequisite" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrerequisitesType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "prerequisite"
})
public class PrerequisitesType {

    @XmlElement(name = "Prerequisite", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<String> prerequisite;

    /**
     * Gets the value of the prerequisite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prerequisite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrerequisite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrerequisite() {
        if (prerequisite == null) {
            prerequisite = new ArrayList<String>();
        }
        return this.prerequisite;
    }

}
