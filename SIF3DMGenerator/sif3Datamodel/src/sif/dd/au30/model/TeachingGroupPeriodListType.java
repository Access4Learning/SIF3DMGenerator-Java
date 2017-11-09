
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeachingGroupPeriodListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeachingGroupPeriodListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeachingGroupPeriod" type="{http://www.sifassociation.org/datamodel/au/3.4}TeachingGroupPeriodType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeachingGroupPeriodListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "teachingGroupPeriod"
})
public class TeachingGroupPeriodListType {

    @XmlElement(name = "TeachingGroupPeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<TeachingGroupPeriodType> teachingGroupPeriod;

    /**
     * Gets the value of the teachingGroupPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teachingGroupPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeachingGroupPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeachingGroupPeriodType }
     * 
     * 
     */
    public List<TeachingGroupPeriodType> getTeachingGroupPeriod() {
        if (teachingGroupPeriod == null) {
            teachingGroupPeriod = new ArrayList<TeachingGroupPeriodType>();
        }
        return this.teachingGroupPeriod;
    }

}
