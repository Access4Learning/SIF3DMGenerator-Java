
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsGroupCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="GroupLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="GroupDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentGroupType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "groupCategory",
    "groupLocalId",
    "groupDescription"
})
public class StudentGroupType {

    @XmlElement(name = "GroupCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsGroupCategoryCodeType groupCategory;
    @XmlElement(name = "GroupLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupLocalId;
    @XmlElementRef(name = "GroupDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupDescription;

    /**
     * Gets the value of the groupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsGroupCategoryCodeType }
     *     
     */
    public AUCodeSetsGroupCategoryCodeType getGroupCategory() {
        return groupCategory;
    }

    /**
     * Sets the value of the groupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsGroupCategoryCodeType }
     *     
     */
    public void setGroupCategory(AUCodeSetsGroupCategoryCodeType value) {
        this.groupCategory = value;
    }

    /**
     * Gets the value of the groupLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLocalId() {
        return groupLocalId;
    }

    /**
     * Sets the value of the groupLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLocalId(String value) {
        this.groupLocalId = value;
    }

    /**
     * Gets the value of the groupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupDescription() {
        return groupDescription;
    }

    /**
     * Sets the value of the groupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupDescription(JAXBElement<String> value) {
        this.groupDescription = value;
    }

}
