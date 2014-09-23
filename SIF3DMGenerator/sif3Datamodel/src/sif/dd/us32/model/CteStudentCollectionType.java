
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cteStudentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cteStudentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cteStudent" type="{http://www.sifassociation.org/datamodel/na/3.2}cteStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cteStudentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "cteStudent"
})
public class CteStudentCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<CteStudentType> cteStudent;

    /**
     * Gets the value of the cteStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cteStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCteStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CteStudentType }
     * 
     * 
     */
    public List<CteStudentType> getCteStudent() {
        if (cteStudent == null) {
            cteStudent = new ArrayList<CteStudentType>();
        }
        return this.cteStudent;
    }

}
