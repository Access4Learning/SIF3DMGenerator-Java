
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcademicFocusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicFocusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicFocus" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicFocusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicFocusListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "academicFocus"
})
public class AcademicFocusListType {

    @XmlElement(name = "AcademicFocus", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<AcademicFocusType> academicFocus;

    /**
     * Gets the value of the academicFocus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicFocus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicFocus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicFocusType }
     * 
     * 
     */
    public List<AcademicFocusType> getAcademicFocus() {
        if (academicFocus == null) {
            academicFocus = new ArrayList<AcademicFocusType>();
        }
        return this.academicFocus;
    }

}
