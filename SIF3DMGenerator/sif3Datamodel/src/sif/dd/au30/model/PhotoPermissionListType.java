
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PhotoPermissionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhotoPermissionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhotoPermission" type="{http://www.sifassociation.org/datamodel/au/3.4}PhotoPermissionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoPermissionListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "photoPermission"
})
public class PhotoPermissionListType {

    @XmlElement(name = "PhotoPermission", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<PhotoPermissionType> photoPermission;

    /**
     * Gets the value of the photoPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photoPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhotoPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhotoPermissionType }
     * 
     * 
     */
    public List<PhotoPermissionType> getPhotoPermission() {
        if (photoPermission == null) {
            photoPermission = new ArrayList<PhotoPermissionType>();
        }
        return this.photoPermission;
    }

}
