
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurriculumHierarchyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurriculumHierarchyListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurriculumHierarchy" type="{http://www.sifassociation.org/datamodel/na/4.x}CurriculumHierarchyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurriculumHierarchyListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "curriculumHierarchy"
})
public class CurriculumHierarchyListType {

    @XmlElement(name = "CurriculumHierarchy", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<CurriculumHierarchyType> curriculumHierarchy;

    /**
     * Gets the value of the curriculumHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curriculumHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurriculumHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurriculumHierarchyType }
     * 
     * 
     */
    public List<CurriculumHierarchyType> getCurriculumHierarchy() {
        if (curriculumHierarchy == null) {
            curriculumHierarchy = new ArrayList<CurriculumHierarchyType>();
        }
        return this.curriculumHierarchy;
    }

}
