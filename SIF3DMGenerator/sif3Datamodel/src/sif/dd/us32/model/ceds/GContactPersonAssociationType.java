
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The relationship of a contact person to another person.
 * 
 * <p>Java class for gContactPersonAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gContactPersonAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gPersonAssociationType">
 *       &lt;sequence>
 *         &lt;element name="contactPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="relationship" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType"/>
 *         &lt;element name="contactFlagList" type="{http://www.sifassociation.org/datamodel/na/3.2}gContactFlagList" minOccurs="0"/>
 *         &lt;element name="contactSequence" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="contactSequenceSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gContactPersonAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "contactPersonRefId",
    "relationship",
    "contactFlagList",
    "contactSequence",
    "contactSequenceSource"
})
public class GContactPersonAssociationType
    extends GPersonAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPersonRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLaxCodedElementType relationship;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GContactFlagList contactFlagList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer contactSequence;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactSequenceSource;

    /**
     * Gets the value of the contactPersonRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonRefId() {
        return contactPersonRefId;
    }

    /**
     * Sets the value of the contactPersonRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonRefId(String value) {
        this.contactPersonRefId = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setRelationship(GLaxCodedElementType value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the contactFlagList property.
     * 
     * @return
     *     possible object is
     *     {@link GContactFlagList }
     *     
     */
    public GContactFlagList getContactFlagList() {
        return contactFlagList;
    }

    /**
     * Sets the value of the contactFlagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GContactFlagList }
     *     
     */
    public void setContactFlagList(GContactFlagList value) {
        this.contactFlagList = value;
    }

    /**
     * Gets the value of the contactSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactSequence() {
        return contactSequence;
    }

    /**
     * Sets the value of the contactSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactSequence(Integer value) {
        this.contactSequence = value;
    }

    /**
     * Gets the value of the contactSequenceSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSequenceSource() {
        return contactSequenceSource;
    }

    /**
     * Sets the value of the contactSequenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSequenceSource(String value) {
        this.contactSequenceSource = value;
    }

}
