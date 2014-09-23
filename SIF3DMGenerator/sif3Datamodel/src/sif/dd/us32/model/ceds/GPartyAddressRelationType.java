
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The relation between a party and an address.
 * 
 * <p>Java class for gPartyAddressRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gPartyAddressRelationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gAssociationType">
 *       &lt;sequence>
 *         &lt;element name="partyRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
 *         &lt;element name="addressRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="addressType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType"/>
 *         &lt;element name="addressRole" type="{http://www.sifassociation.org/datamodel/na/3.2}gAddressRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gPartyAddressRelationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "partyRefId",
    "addressRefId",
    "addressType",
    "addressRole"
})
public class GPartyAddressRelationType
    extends GAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GGenericRefIdPointerType partyRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GCodedElementType addressType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressRole;

    /**
     * Gets the value of the partyRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getPartyRefId() {
        return partyRefId;
    }

    /**
     * Sets the value of the partyRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setPartyRefId(GGenericRefIdPointerType value) {
        this.partyRefId = value;
    }

    /**
     * Gets the value of the addressRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRefId() {
        return addressRefId;
    }

    /**
     * Sets the value of the addressRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRefId(String value) {
        this.addressRefId = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link GCodedElementType }
     *     
     */
    public GCodedElementType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCodedElementType }
     *     
     */
    public void setAddressType(GCodedElementType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRole() {
        return addressRole;
    }

    /**
     * Sets the value of the addressRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRole(String value) {
        this.addressRole = value;
    }

}
