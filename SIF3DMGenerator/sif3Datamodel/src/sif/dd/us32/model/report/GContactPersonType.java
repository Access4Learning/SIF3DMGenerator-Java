
package sif.dd.us32.model.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A person who might be referenced as a contact for some purpose.
 * 
 * <p>Java class for gContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gContactPersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gClientType">
 *       &lt;sequence>
 *         &lt;element name="publishIndicator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="employerType" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="educationLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="addressRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gContactPersonType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "publishIndicator",
    "employerType",
    "educationLevel",
    "positionTitle",
    "role",
    "addressRefId"
})
public class GContactPersonType
    extends GClientType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType publishIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType employerType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType educationLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String positionTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType role;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressRefId;

    /**
     * Gets the value of the publishIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getPublishIndicator() {
        return publishIndicator;
    }

    /**
     * Sets the value of the publishIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setPublishIndicator(GYesNoUnknownType value) {
        this.publishIndicator = value;
    }

    /**
     * Gets the value of the employerType property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getEmployerType() {
        return employerType;
    }

    /**
     * Sets the value of the employerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setEmployerType(GLaxCodedElementType value) {
        this.employerType = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setEducationLevel(GLaxCodedElementType value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTitle(String value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setRole(GLaxCodedElementType value) {
        this.role = value;
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

}
