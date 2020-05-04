
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournalAdjustmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalAdjustmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JournalAdjustment" type="{http://www.sifassociation.org/datamodel/au/3.4}JournalAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalAdjustmentListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "journalAdjustment"
})
public class JournalAdjustmentListType {

    @XmlElement(name = "JournalAdjustment", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<JournalAdjustmentType> journalAdjustment;

    /**
     * Gets the value of the journalAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalAdjustmentType }
     * 
     * 
     */
    public List<JournalAdjustmentType> getJournalAdjustment() {
        if (journalAdjustment == null) {
            journalAdjustment = new ArrayList<JournalAdjustmentType>();
        }
        return this.journalAdjustment;
    }

}
