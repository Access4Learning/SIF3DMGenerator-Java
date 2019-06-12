
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeglectedOrDelinquentParticipationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeglectedOrDelinquentParticipationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeglectedOrDelinquentParticipation" type="{http://www.sifassociation.org/datamodel/na/4.x}NeglectedOrDelinquentParticipationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeglectedOrDelinquentParticipationListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "neglectedOrDelinquentParticipation"
})
public class NeglectedOrDelinquentParticipationListType {

    @XmlElement(name = "NeglectedOrDelinquentParticipation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<NeglectedOrDelinquentParticipationType> neglectedOrDelinquentParticipation;

    /**
     * Gets the value of the neglectedOrDelinquentParticipation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neglectedOrDelinquentParticipation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeglectedOrDelinquentParticipation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeglectedOrDelinquentParticipationType }
     * 
     * 
     */
    public List<NeglectedOrDelinquentParticipationType> getNeglectedOrDelinquentParticipation() {
        if (neglectedOrDelinquentParticipation == null) {
            neglectedOrDelinquentParticipation = new ArrayList<NeglectedOrDelinquentParticipationType>();
        }
        return this.neglectedOrDelinquentParticipation;
    }

}
