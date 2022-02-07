
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareWithListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareWithListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareWith" type="{http://www.sifassociation.org/datamodel/au/3.4}ShareWithType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareWithListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "shareWith"
})
public class ShareWithListType {

    @XmlElement(name = "ShareWith", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ShareWithType> shareWith;

    /**
     * Gets the value of the shareWith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareWith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareWith().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareWithType }
     * 
     * 
     */
    public List<ShareWithType> getShareWith() {
        if (shareWith == null) {
            shareWith = new ArrayList<ShareWithType>();
        }
        return this.shareWith;
    }

}
