
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceReimbursementAgencyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceReimbursementAgencyListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agency" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceReimbursementAgencyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceReimbursementAgencyListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "agency"
})
public class FoodserviceReimbursementAgencyListType {

    @XmlElement(name = "Agency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FoodserviceReimbursementAgencyType> agency;

    /**
     * Gets the value of the agency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceReimbursementAgencyType }
     * 
     * 
     */
    public List<FoodserviceReimbursementAgencyType> getAgency() {
        if (agency == null) {
            agency = new ArrayList<FoodserviceReimbursementAgencyType>();
        }
        return this.agency;
    }

}
