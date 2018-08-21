
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentGradeMarkersListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentGradeMarkersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Marker" type="{http://www.sifassociation.org/datamodel/au/3.4}MarkerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentGradeMarkersListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "marker"
})
public class StudentGradeMarkersListType {

    @XmlElement(name = "Marker", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<MarkerType> marker;

    /**
     * Gets the value of the marker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkerType }
     * 
     * 
     */
    public List<MarkerType> getMarker() {
        if (marker == null) {
            marker = new ArrayList<MarkerType>();
        }
        return this.marker;
    }

}
