
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentPlacementServiceFundingSourceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPlacementServiceFundingSourceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceFundingSource" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementServiceFundingSourceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPlacementServiceFundingSourceListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "serviceFundingSource"
})
public class StudentPlacementServiceFundingSourceListType {

    @XmlElement(name = "ServiceFundingSource", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<StudentPlacementServiceFundingSourceType> serviceFundingSource;

    /**
     * Gets the value of the serviceFundingSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFundingSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFundingSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentPlacementServiceFundingSourceType }
     * 
     * 
     */
    public List<StudentPlacementServiceFundingSourceType> getServiceFundingSource() {
        if (serviceFundingSource == null) {
            serviceFundingSource = new ArrayList<StudentPlacementServiceFundingSourceType>();
        }
        return this.serviceFundingSource;
    }

}
