
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublishingPermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishingPermissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsPermissionCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="PermissionValue" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishingPermissionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "permissionCategory",
    "permissionValue"
})
public class PublishingPermissionType {

    @XmlElement(name = "PermissionCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsPermissionCategoryCodeType permissionCategory;
    @XmlElement(name = "PermissionValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsYesOrNoCategoryType permissionValue;

    /**
     * Gets the value of the permissionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsPermissionCategoryCodeType }
     *     
     */
    public AUCodeSetsPermissionCategoryCodeType getPermissionCategory() {
        return permissionCategory;
    }

    /**
     * Sets the value of the permissionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsPermissionCategoryCodeType }
     *     
     */
    public void setPermissionCategory(AUCodeSetsPermissionCategoryCodeType value) {
        this.permissionCategory = value;
    }

    /**
     * Gets the value of the permissionValue property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public AUCodeSetsYesOrNoCategoryType getPermissionValue() {
        return permissionValue;
    }

    /**
     * Sets the value of the permissionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public void setPermissionValue(AUCodeSetsYesOrNoCategoryType value) {
        this.permissionValue = value;
    }

}
