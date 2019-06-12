
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentRecordExchangeCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentRecordExchangeCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentRecordExchange" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentRecordExchangeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentRecordExchangeCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentRecordExchange"
})
public class StudentRecordExchangeCollectionType {

    @XmlElement(name = "StudentRecordExchange", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentRecordExchangeType> studentRecordExchange;

    /**
     * Gets the value of the studentRecordExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentRecordExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentRecordExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentRecordExchangeType }
     * 
     * 
     */
    public List<StudentRecordExchangeType> getStudentRecordExchange() {
        if (studentRecordExchange == null) {
            studentRecordExchange = new ArrayList<StudentRecordExchangeType>();
        }
        return this.studentRecordExchange;
    }

}
