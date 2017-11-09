
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalisedPlanCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalisedPlanCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonalisedPlan" type="{http://www.sifassociation.org/datamodel/au/3.4}PersonalisedPlanType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalisedPlanCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "personalisedPlan"
})
public class PersonalisedPlanCollectionType {

    @XmlElement(name = "PersonalisedPlan", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<PersonalisedPlanType> personalisedPlan;

    /**
     * Gets the value of the personalisedPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalisedPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalisedPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalisedPlanType }
     * 
     * 
     */
    public List<PersonalisedPlanType> getPersonalisedPlan() {
        if (personalisedPlan == null) {
            personalisedPlan = new ArrayList<PersonalisedPlanType>();
        }
        return this.personalisedPlan;
    }

}
