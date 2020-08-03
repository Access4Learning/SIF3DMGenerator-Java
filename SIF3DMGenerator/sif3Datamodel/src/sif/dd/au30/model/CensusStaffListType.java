
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusStaffListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusStaffListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusStaff" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusStaffType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusStaffListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "censusStaff"
})
public class CensusStaffListType {

    @XmlElement(name = "CensusStaff", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<CensusStaffType> censusStaff;

    /**
     * Gets the value of the censusStaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censusStaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensusStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusStaffType }
     * 
     * 
     */
    public List<CensusStaffType> getCensusStaff() {
        if (censusStaff == null) {
            censusStaff = new ArrayList<CensusStaffType>();
        }
        return this.censusStaff;
    }

}
