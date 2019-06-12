
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BellScheduleCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BellScheduleCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BellSchedule" type="{http://www.sifassociation.org/datamodel/na/4.x}BellScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BellScheduleCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "bellSchedule"
})
public class BellScheduleCollectionType {

    @XmlElement(name = "BellSchedule", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<BellScheduleType> bellSchedule;

    /**
     * Gets the value of the bellSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bellSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBellSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BellScheduleType }
     * 
     * 
     */
    public List<BellScheduleType> getBellSchedule() {
        if (bellSchedule == null) {
            bellSchedule = new ArrayList<BellScheduleType>();
        }
        return this.bellSchedule;
    }

}
