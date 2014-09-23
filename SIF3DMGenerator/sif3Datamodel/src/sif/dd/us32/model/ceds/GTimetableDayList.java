
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gTimetableDayList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gTimetableDayList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timetableDay" type="{http://www.sifassociation.org/datamodel/na/3.2}gTimetableDayType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gTimetableDayList", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "timetableDay"
})
public class GTimetableDayList {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<GTimetableDayType> timetableDay;

    /**
     * Gets the value of the timetableDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetableDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetableDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GTimetableDayType }
     * 
     * 
     */
    public List<GTimetableDayType> getTimetableDay() {
        if (timetableDay == null) {
            timetableDay = new ArrayList<GTimetableDayType>();
        }
        return this.timetableDay;
    }

}
