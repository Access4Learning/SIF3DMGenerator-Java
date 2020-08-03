
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusReportingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusReportingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusReporting" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusReportingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusReportingListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "censusReporting"
})
public class CensusReportingListType {

    @XmlElement(name = "CensusReporting", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<CensusReportingType> censusReporting;

    /**
     * Gets the value of the censusReporting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censusReporting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensusReporting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusReportingType }
     * 
     * 
     */
    public List<CensusReportingType> getCensusReporting() {
        if (censusReporting == null) {
            censusReporting = new ArrayList<CensusReportingType>();
        }
        return this.censusReporting;
    }

}
