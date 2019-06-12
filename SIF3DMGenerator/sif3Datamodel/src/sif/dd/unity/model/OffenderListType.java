
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffenderListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenderListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offender" type="{http://www.sifassociation.org/datamodel/na/4.x}OffenderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenderListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "offender"
})
public class OffenderListType {

    @XmlElement(name = "Offender", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<OffenderType> offender;

    /**
     * Gets the value of the offender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenderType }
     * 
     * 
     */
    public List<OffenderType> getOffender() {
        if (offender == null) {
            offender = new ArrayList<OffenderType>();
        }
        return this.offender;
    }

}
