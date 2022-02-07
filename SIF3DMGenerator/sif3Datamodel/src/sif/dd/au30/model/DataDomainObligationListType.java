
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataDomainObligationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDomainObligationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataDomainObligation" type="{http://www.sifassociation.org/datamodel/au/3.4}DataDomainObligationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDomainObligationListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "dataDomainObligation"
})
public class DataDomainObligationListType {

    @XmlElement(name = "DataDomainObligation", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<DataDomainObligationType> dataDomainObligation;

    /**
     * Gets the value of the dataDomainObligation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataDomainObligation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataDomainObligation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataDomainObligationType }
     * 
     * 
     */
    public List<DataDomainObligationType> getDataDomainObligation() {
        if (dataDomainObligation == null) {
            dataDomainObligation = new ArrayList<DataDomainObligationType>();
        }
        return this.dataDomainObligation;
    }

}
