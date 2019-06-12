
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xStudentContactListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentContactListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPersonRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="xContact" type="{http://www.sifassociation.org/datamodel/na/4.x}xContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentContactListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "contactPersonRefId",
    "xContact"
})
public class XStudentContactListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> contactPersonRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<XContactType> xContact;

    /**
     * Gets the value of the contactPersonRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactPersonRefId() {
        if (contactPersonRefId == null) {
            contactPersonRefId = new ArrayList<String>();
        }
        return this.contactPersonRefId;
    }

    /**
     * Gets the value of the xContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XContactType }
     * 
     * 
     */
    public List<XContactType> getXContact() {
        if (xContact == null) {
            xContact = new ArrayList<XContactType>();
        }
        return this.xContact;
    }

}
