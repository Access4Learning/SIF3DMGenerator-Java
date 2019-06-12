
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StandardsSettingBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardsSettingBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.sifassociation.org/datamodel/na/4.x}CountryType" minOccurs="0"/>
 *         &lt;element name="StateProvince" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceType" minOccurs="0"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="SettingBodyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardsSettingBodyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "country",
    "stateProvince",
    "ncesId",
    "settingBodyName"
})
public class StandardsSettingBodyType {

    @XmlElement(name = "Country", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CountryType country;
    @XmlElement(name = "StateProvince", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StateProvinceType stateProvince;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "SettingBodyName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String settingBodyName;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceType }
     *     
     */
    public StateProvinceType getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceType }
     *     
     */
    public void setStateProvince(StateProvinceType value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCESId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCESId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the settingBodyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingBodyName() {
        return settingBodyName;
    }

    /**
     * Sets the value of the settingBodyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingBodyName(String value) {
        this.settingBodyName = value;
    }

}
