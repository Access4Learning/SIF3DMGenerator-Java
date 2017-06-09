
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReligiousEventListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReligiousEventListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReligiousEvent" type="{http://www.sifassociation.org/datamodel/au/3.4}ReligiousEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReligiousEventListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "religiousEvent"
})
public class ReligiousEventListType {

    @XmlElement(name = "ReligiousEvent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ReligiousEventType> religiousEvent;

    /**
     * Gets the value of the religiousEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the religiousEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReligiousEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReligiousEventType }
     * 
     * 
     */
    public List<ReligiousEventType> getReligiousEvent() {
        if (religiousEvent == null) {
            religiousEvent = new ArrayList<ReligiousEventType>();
        }
        return this.religiousEvent;
    }

}
