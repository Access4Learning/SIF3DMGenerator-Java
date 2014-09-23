
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gSessionScheduleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSessionScheduleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionSchedule" type="{http://www.sifassociation.org/datamodel/na/3.2}gSessionScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSessionScheduleList", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "sessionSchedule"
})
public class GSessionScheduleList {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<GSessionScheduleType> sessionSchedule;

    /**
     * Gets the value of the sessionSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GSessionScheduleType }
     * 
     * 
     */
    public List<GSessionScheduleType> getSessionSchedule() {
        if (sessionSchedule == null) {
            sessionSchedule = new ArrayList<GSessionScheduleType>();
        }
        return this.sessionSchedule;
    }

}
