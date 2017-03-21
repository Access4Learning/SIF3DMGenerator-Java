
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPWritingRubricListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPWritingRubricListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPWritingRubric" type="{http://www.sifassociation.org/datamodel/au/3.4.1}NAPWritingRubricType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPWritingRubricListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "napWritingRubric"
})
public class NAPWritingRubricListType {

    @XmlElement(name = "NAPWritingRubric", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<NAPWritingRubricType> napWritingRubric;

    /**
     * Gets the value of the napWritingRubric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napWritingRubric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAPWritingRubric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPWritingRubricType }
     * 
     * 
     */
    public List<NAPWritingRubricType> getNAPWritingRubric() {
        if (napWritingRubric == null) {
            napWritingRubric = new ArrayList<NAPWritingRubricType>();
        }
        return this.napWritingRubric;
    }

}
