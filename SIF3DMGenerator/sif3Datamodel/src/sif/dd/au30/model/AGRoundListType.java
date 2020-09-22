
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRoundListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRoundListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRound" type="{http://www.sifassociation.org/datamodel/au/3.4}AGRoundType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRoundListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "agRound"
})
public class AGRoundListType {

    @XmlElement(name = "AGRound", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<AGRoundType> agRound;

    /**
     * Gets the value of the agRound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agRound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGRound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGRoundType }
     * 
     * 
     */
    public List<AGRoundType> getAGRound() {
        if (agRound == null) {
            agRound = new ArrayList<AGRoundType>();
        }
        return this.agRound;
    }

}
