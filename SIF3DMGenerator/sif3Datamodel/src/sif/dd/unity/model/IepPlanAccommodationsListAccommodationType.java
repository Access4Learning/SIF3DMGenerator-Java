
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAccommodationsListAccommodationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAccommodationsListAccommodationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAccommodationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicabilityList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAccommodationsListAccommodationApplicabiltyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAccommodationsListAccommodationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accommodation",
    "applicabilityList"
})
public class IepPlanAccommodationsListAccommodationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepCommonAccommodationType> accommodation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAccommodationsListAccommodationApplicabiltyListType> applicabilityList;

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepCommonAccommodationType }
     * 
     * 
     */
    public List<IepCommonAccommodationType> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<IepCommonAccommodationType>();
        }
        return this.accommodation;
    }

    /**
     * Gets the value of the applicabilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicabilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicabilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAccommodationsListAccommodationApplicabiltyListType }
     * 
     * 
     */
    public List<IepPlanAccommodationsListAccommodationApplicabiltyListType> getApplicabilityList() {
        if (applicabilityList == null) {
            applicabilityList = new ArrayList<IepPlanAccommodationsListAccommodationApplicabiltyListType>();
        }
        return this.applicabilityList;
    }

}
