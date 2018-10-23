
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Households this Person is associated with
 * 
 * <p>Java class for HouseholdContactInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdContactInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HouseholdContactInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}HouseholdContactInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdContactInfoListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "householdContactInfo"
})
public class HouseholdContactInfoListType {

    @XmlElement(name = "HouseholdContactInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<HouseholdContactInfoType> householdContactInfo;

    /**
     * Gets the value of the householdContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the householdContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseholdContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdContactInfoType }
     * 
     * 
     */
    public List<HouseholdContactInfoType> getHouseholdContactInfo() {
        if (householdContactInfo == null) {
            householdContactInfo = new ArrayList<HouseholdContactInfoType>();
        }
        return this.householdContactInfo;
    }

}
