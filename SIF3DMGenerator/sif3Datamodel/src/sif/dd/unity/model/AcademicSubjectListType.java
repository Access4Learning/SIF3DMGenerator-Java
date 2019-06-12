
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcademicSubjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicSubjectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicSubject" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicSubjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicSubjectListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "academicSubject"
})
public class AcademicSubjectListType {

    @XmlElement(name = "AcademicSubject", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<AcademicSubjectType> academicSubject;

    /**
     * Gets the value of the academicSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicSubjectType }
     * 
     * 
     */
    public List<AcademicSubjectType> getAcademicSubject() {
        if (academicSubject == null) {
            academicSubject = new ArrayList<AcademicSubjectType>();
        }
        return this.academicSubject;
    }

}
