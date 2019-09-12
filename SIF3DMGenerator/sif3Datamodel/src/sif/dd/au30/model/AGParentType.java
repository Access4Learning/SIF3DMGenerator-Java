
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGParentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGParentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentName" type="{http://www.sifassociation.org/datamodel/au/3.4}NameOfRecordType" minOccurs="0"/>
 *         &lt;element name="AddressSameAsStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ParentAddress" type="{http://www.sifassociation.org/datamodel/au/3.4}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGParentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "parentName",
    "addressSameAsStudent",
    "parentAddress"
})
public class AGParentType {

    @XmlElement(name = "ParentName", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected NameOfRecordType parentName;
    @XmlElement(name = "AddressSameAsStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsYesOrNoCategoryType addressSameAsStudent;
    @XmlElement(name = "ParentAddress", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AddressType parentAddress;

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link NameOfRecordType }
     *     
     */
    public NameOfRecordType getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOfRecordType }
     *     
     */
    public void setParentName(NameOfRecordType value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the addressSameAsStudent property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public AUCodeSetsYesOrNoCategoryType getAddressSameAsStudent() {
        return addressSameAsStudent;
    }

    /**
     * Sets the value of the addressSameAsStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public void setAddressSameAsStudent(AUCodeSetsYesOrNoCategoryType value) {
        this.addressSameAsStudent = value;
    }

    /**
     * Gets the value of the parentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getParentAddress() {
        return parentAddress;
    }

    /**
     * Sets the value of the parentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setParentAddress(AddressType value) {
        this.parentAddress = value;
    }

}
