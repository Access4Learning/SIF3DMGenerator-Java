
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountriesOfCitizenshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountriesOfCitizenshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryOfCitizenship" type="{http://www.sifassociation.org/datamodel/na/4.x}CountryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountriesOfCitizenshipType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "countryOfCitizenship"
})
public class CountriesOfCitizenshipType {

    @XmlElement(name = "CountryOfCitizenship", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<CountryType> countryOfCitizenship;

    /**
     * Gets the value of the countryOfCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfCitizenship() {
        if (countryOfCitizenship == null) {
            countryOfCitizenship = new ArrayList<CountryType>();
        }
        return this.countryOfCitizenship;
    }

}
