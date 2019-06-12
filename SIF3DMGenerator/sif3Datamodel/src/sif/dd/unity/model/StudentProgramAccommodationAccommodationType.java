
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentProgramAccommodationAccommodationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentProgramAccommodationAccommodationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationTestMaterialType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationTestAdministrationType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationStudentEquipmentAndTechnologyType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationTestResponseType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationSchedulingType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/na/4.x}TestAccommodationSettingType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                   &lt;enumeration value="9999"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtherCodeList" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherCodeListType" minOccurs="0"/>
 *         &lt;element name="AccommodationCategory" type="{http://www.sifassociation.org/datamodel/na/4.x}AccommodationCategoryType" minOccurs="0"/>
 *         &lt;element name="SpecialMaterials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentProgramAccommodationAccommodationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "code",
    "otherCodeList",
    "accommodationCategory",
    "specialMaterials"
})
public class StudentProgramAccommodationAccommodationType {

    @XmlElement(name = "Code", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String code;
    @XmlElement(name = "OtherCodeList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherCodeListType otherCodeList;
    @XmlElement(name = "AccommodationCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AccommodationCategoryType accommodationCategory;
    @XmlElement(name = "SpecialMaterials", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected boolean specialMaterials;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the otherCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCodeListType }
     *     
     */
    public OtherCodeListType getOtherCodeList() {
        return otherCodeList;
    }

    /**
     * Sets the value of the otherCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCodeListType }
     *     
     */
    public void setOtherCodeList(OtherCodeListType value) {
        this.otherCodeList = value;
    }

    /**
     * Gets the value of the accommodationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationCategoryType }
     *     
     */
    public AccommodationCategoryType getAccommodationCategory() {
        return accommodationCategory;
    }

    /**
     * Sets the value of the accommodationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationCategoryType }
     *     
     */
    public void setAccommodationCategory(AccommodationCategoryType value) {
        this.accommodationCategory = value;
    }

    /**
     * Gets the value of the specialMaterials property.
     * 
     */
    public boolean isSpecialMaterials() {
        return specialMaterials;
    }

    /**
     * Sets the value of the specialMaterials property.
     * 
     */
    public void setSpecialMaterials(boolean value) {
        this.specialMaterials = value;
    }

}
