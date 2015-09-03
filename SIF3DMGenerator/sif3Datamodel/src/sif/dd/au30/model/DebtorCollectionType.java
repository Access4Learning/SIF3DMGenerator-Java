
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Debtor" type="{http://www.sifassociation.org/au/datamodel/1.4}DebtorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "debtor"
})
public class DebtorCollectionType {

    @XmlElement(name = "Debtor", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected List<DebtorType> debtor;

    /**
     * Gets the value of the debtor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtorType }
     * 
     * 
     */
    public List<DebtorType> getDebtor() {
        if (debtor == null) {
            debtor = new ArrayList<DebtorType>();
        }
        return this.debtor;
    }

}
