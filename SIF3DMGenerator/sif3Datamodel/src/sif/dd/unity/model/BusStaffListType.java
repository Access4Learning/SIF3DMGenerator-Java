
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusStaffListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusStaffListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusStaff" type="{http://www.sifassociation.org/datamodel/na/4.x}BusStaffType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusStaffListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "busStaff"
})
public class BusStaffListType {

    @XmlElement(name = "BusStaff", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<BusStaffType> busStaff;

    /**
     * Gets the value of the busStaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busStaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusStaffType }
     * 
     * 
     */
    public List<BusStaffType> getBusStaff() {
        if (busStaff == null) {
            busStaff = new ArrayList<BusStaffType>();
        }
        return this.busStaff;
    }

}
