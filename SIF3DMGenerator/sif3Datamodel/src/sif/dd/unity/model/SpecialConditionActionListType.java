
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialConditionActionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialConditionActionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialCondition" type="{http://www.sifassociation.org/datamodel/na/4.x}ActionListSpecialConditionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialConditionActionListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "specialCondition"
})
public class SpecialConditionActionListType {

    @XmlElement(name = "SpecialCondition", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<ActionListSpecialConditionType> specialCondition;

    /**
     * Gets the value of the specialCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionListSpecialConditionType }
     * 
     * 
     */
    public List<ActionListSpecialConditionType> getSpecialCondition() {
        if (specialCondition == null) {
            specialCondition = new ArrayList<ActionListSpecialConditionType>();
        }
        return this.specialCondition;
    }

}
