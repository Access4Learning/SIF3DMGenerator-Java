
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsCohortListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsCohortListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatsCohort" type="{http://www.sifassociation.org/datamodel/au/3.4}StatsCohortType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsCohortListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "statsCohort"
})
public class StatsCohortListType {

    @XmlElement(name = "StatsCohort", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<StatsCohortType> statsCohort;

    /**
     * Gets the value of the statsCohort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statsCohort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatsCohort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatsCohortType }
     * 
     * 
     */
    public List<StatsCohortType> getStatsCohort() {
        if (statsCohort == null) {
            statsCohort = new ArrayList<StatsCohortType>();
        }
        return this.statsCohort;
    }

}
