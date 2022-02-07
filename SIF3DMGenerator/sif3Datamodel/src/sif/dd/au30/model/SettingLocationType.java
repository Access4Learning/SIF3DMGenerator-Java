
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SettingLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SettingLocationName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="SettingLocationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="SettingLocationRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SettingLocationObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingLocationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "settingLocationName",
    "settingLocationType",
    "settingLocationRefId",
    "settingLocationObjectTypeName"
})
public class SettingLocationType {

    @XmlElementRef(name = "SettingLocationName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settingLocationName;
    @XmlElementRef(name = "SettingLocationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settingLocationType;
    @XmlElementRef(name = "SettingLocationRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settingLocationRefId;
    @XmlElement(name = "SettingLocationObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String settingLocationObjectTypeName;

    /**
     * Gets the value of the settingLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettingLocationName() {
        return settingLocationName;
    }

    /**
     * Sets the value of the settingLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettingLocationName(JAXBElement<String> value) {
        this.settingLocationName = value;
    }

    /**
     * Gets the value of the settingLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettingLocationType() {
        return settingLocationType;
    }

    /**
     * Sets the value of the settingLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettingLocationType(JAXBElement<String> value) {
        this.settingLocationType = value;
    }

    /**
     * Gets the value of the settingLocationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettingLocationRefId() {
        return settingLocationRefId;
    }

    /**
     * Sets the value of the settingLocationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettingLocationRefId(JAXBElement<String> value) {
        this.settingLocationRefId = value;
    }

    /**
     * Gets the value of the settingLocationObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingLocationObjectTypeName() {
        return settingLocationObjectTypeName;
    }

    /**
     * Sets the value of the settingLocationObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingLocationObjectTypeName(String value) {
        this.settingLocationObjectTypeName = value;
    }

}
