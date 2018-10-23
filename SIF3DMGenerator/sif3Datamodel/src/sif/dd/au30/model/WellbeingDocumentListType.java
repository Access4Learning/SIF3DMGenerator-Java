
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List which describes the Location of any associated documents kept in relation. These include evidentiary documents, and action plans.
 * 
 * <p>Java class for WellbeingDocumentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingDocumentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingDocumentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingDocumentListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "document"
})
public class WellbeingDocumentListType {

    @XmlElement(name = "Document", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<WellbeingDocumentType> document;

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingDocumentType }
     * 
     * 
     */
    public List<WellbeingDocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<WellbeingDocumentType>();
        }
        return this.document;
    }

}
