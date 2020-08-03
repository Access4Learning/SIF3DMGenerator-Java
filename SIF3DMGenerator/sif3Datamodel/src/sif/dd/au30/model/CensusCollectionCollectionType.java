
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusCollectionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusCollectionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusCollection" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusCollectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusCollectionCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "censusCollection"
})
public class CensusCollectionCollectionType {

    @XmlElement(name = "CensusCollection", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<CensusCollectionType> censusCollection;

    /**
     * Gets the value of the censusCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censusCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensusCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusCollectionType }
     * 
     * 
     */
    public List<CensusCollectionType> getCensusCollection() {
        if (censusCollection == null) {
            censusCollection = new ArrayList<CensusCollectionType>();
        }
        return this.censusCollection;
    }

}
