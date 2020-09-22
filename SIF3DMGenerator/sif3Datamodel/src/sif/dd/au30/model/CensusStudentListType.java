
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusStudentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusStudentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}CensusStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusStudentListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "censusStudent"
})
public class CensusStudentListType {

    @XmlElement(name = "CensusStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<CensusStudentType> censusStudent;

    /**
     * Gets the value of the censusStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censusStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensusStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusStudentType }
     * 
     * 
     */
    public List<CensusStudentType> getCensusStudent() {
        if (censusStudent == null) {
            censusStudent = new ArrayList<CensusStudentType>();
        }
        return this.censusStudent;
    }

}
