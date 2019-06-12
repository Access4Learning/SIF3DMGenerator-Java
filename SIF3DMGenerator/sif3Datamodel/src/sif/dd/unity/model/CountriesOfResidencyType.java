
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountriesOfResidencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountriesOfResidencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryOfResidency" type="{http://www.sifassociation.org/datamodel/na/4.x}CountryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountriesOfResidencyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "countryOfResidency"
})
public class CountriesOfResidencyType {

    @XmlElement(name = "CountryOfResidency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<CountryType> countryOfResidency;

    /**
     * Gets the value of the countryOfResidency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfResidency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfResidency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfResidency() {
        if (countryOfResidency == null) {
            countryOfResidency = new ArrayList<CountryType>();
        }
        return this.countryOfResidency;
    }

}
