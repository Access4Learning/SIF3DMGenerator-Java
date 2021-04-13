
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceReportColumnListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceReportColumnListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceReportColumn" type="{http://www.sifassociation.org/datamodel/au/3.4}ResourceReportColumnType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceReportColumnListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "resourceReportColumn"
})
public class ResourceReportColumnListType {

    @XmlElement(name = "ResourceReportColumn", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ResourceReportColumnType> resourceReportColumn;

    /**
     * Gets the value of the resourceReportColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceReportColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceReportColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReportColumnType }
     * 
     * 
     */
    public List<ResourceReportColumnType> getResourceReportColumn() {
        if (resourceReportColumn == null) {
            resourceReportColumn = new ArrayList<ResourceReportColumnType>();
        }
        return this.resourceReportColumn;
    }

}
