
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FollowUpActionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FollowUpActionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FollowUpAction" type="{http://www.sifassociation.org/datamodel/au/3.4}FollowUpActionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FollowUpActionListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "followUpAction"
})
public class FollowUpActionListType {

    @XmlElement(name = "FollowUpAction", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<FollowUpActionType> followUpAction;

    /**
     * Gets the value of the followUpAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the followUpAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFollowUpAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FollowUpActionType }
     * 
     * 
     */
    public List<FollowUpActionType> getFollowUpAction() {
        if (followUpAction == null) {
            followUpAction = new ArrayList<FollowUpActionType>();
        }
        return this.followUpAction;
    }

}
