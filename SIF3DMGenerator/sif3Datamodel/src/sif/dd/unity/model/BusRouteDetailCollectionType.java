
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusRouteDetailCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusRouteDetailCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusRouteDetail" type="{http://www.sifassociation.org/datamodel/na/4.x}BusRouteDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusRouteDetailCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "busRouteDetail"
})
public class BusRouteDetailCollectionType {

    @XmlElement(name = "BusRouteDetail", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<BusRouteDetailType> busRouteDetail;

    /**
     * Gets the value of the busRouteDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busRouteDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusRouteDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusRouteDetailType }
     * 
     * 
     */
    public List<BusRouteDetailType> getBusRouteDetail() {
        if (busRouteDetail == null) {
            busRouteDetail = new ArrayList<BusRouteDetailType>();
        }
        return this.busRouteDetail;
    }

}
