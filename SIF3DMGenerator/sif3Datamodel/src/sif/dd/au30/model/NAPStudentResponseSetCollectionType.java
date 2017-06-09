
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPStudentResponseSetCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPStudentResponseSetCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPStudentResponseSet" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPStudentResponseSetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPStudentResponseSetCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napStudentResponseSet"
})
public class NAPStudentResponseSetCollectionType {

    @XmlElement(name = "NAPStudentResponseSet", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<NAPStudentResponseSetType> napStudentResponseSet;

    /**
     * Gets the value of the napStudentResponseSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napStudentResponseSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAPStudentResponseSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPStudentResponseSetType }
     * 
     * 
     */
    public List<NAPStudentResponseSetType> getNAPStudentResponseSet() {
        if (napStudentResponseSet == null) {
            napStudentResponseSet = new ArrayList<NAPStudentResponseSetType>();
        }
        return this.napStudentResponseSet;
    }

}
