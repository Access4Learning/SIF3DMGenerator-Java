
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisciplineIncidentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisciplineIncidentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisciplineIncident" type="{http://www.sifassociation.org/datamodel/na/4.x}DisciplineIncidentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisciplineIncidentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "disciplineIncident"
})
public class DisciplineIncidentCollectionType {

    @XmlElement(name = "DisciplineIncident", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<DisciplineIncidentType> disciplineIncident;

    /**
     * Gets the value of the disciplineIncident property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplineIncident property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplineIncident().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisciplineIncidentType }
     * 
     * 
     */
    public List<DisciplineIncidentType> getDisciplineIncident() {
        if (disciplineIncident == null) {
            disciplineIncident = new ArrayList<DisciplineIncidentType>();
        }
        return this.disciplineIncident;
    }

}
