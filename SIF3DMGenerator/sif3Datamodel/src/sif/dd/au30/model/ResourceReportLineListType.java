
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceReportLineListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceReportLineListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceReportLine" type="{http://www.sifassociation.org/datamodel/au/3.4}ResourceReportLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceReportLineListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "resourceReportLine"
})
public class ResourceReportLineListType {

    @XmlElement(name = "ResourceReportLine", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ResourceReportLineType> resourceReportLine;

    /**
     * Gets the value of the resourceReportLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceReportLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceReportLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReportLineType }
     * 
     * 
     */
    public List<ResourceReportLineType> getResourceReportLine() {
        if (resourceReportLine == null) {
            resourceReportLine = new ArrayList<ResourceReportLineType>();
        }
        return this.resourceReportLine;
    }

}
