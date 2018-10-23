
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FQReportingCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQReportingCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQReporting" type="{http://www.sifassociation.org/datamodel/au/3.4}FQReportingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQReportingCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqReporting"
})
public class FQReportingCollectionType {

    @XmlElement(name = "FQReporting", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<FQReportingType> fqReporting;

    /**
     * Gets the value of the fqReporting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqReporting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFQReporting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FQReportingType }
     * 
     * 
     */
    public List<FQReportingType> getFQReporting() {
        if (fqReporting == null) {
            fqReporting = new ArrayList<FQReportingType>();
        }
        return this.fqReporting;
    }

}
