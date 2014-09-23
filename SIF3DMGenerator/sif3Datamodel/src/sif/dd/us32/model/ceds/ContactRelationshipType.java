
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for contactRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relationshipToLearnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="k12StudentRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPersonRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactRelationshipType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "relationshipToLearnerType",
    "k12StudentRefId",
    "contactPersonRefId"
})
public class ContactRelationshipType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String relationshipToLearnerType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String k12StudentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String contactPersonRefId;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the relationshipToLearnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToLearnerType() {
        return relationshipToLearnerType;
    }

    /**
     * Sets the value of the relationshipToLearnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipToLearnerType(String value) {
        this.relationshipToLearnerType = value;
    }

    /**
     * Gets the value of the k12StudentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getK12StudentRefId() {
        return k12StudentRefId;
    }

    /**
     * Sets the value of the k12StudentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK12StudentRefId(String value) {
        this.k12StudentRefId = value;
    }

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
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
