
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LearningResourceComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningResourceComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strategies" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceComponentStrategyListType" minOccurs="0"/>
 *         &lt;element name="AssociatedObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}AssociatedObjectListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningResourceComponentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "reference",
    "description",
    "strategies",
    "associatedObjects"
})
public class LearningResourceComponentType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "Reference", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String reference;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "Strategies", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceComponentStrategyListType strategies;
    @XmlElement(name = "AssociatedObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AssociatedObjectListType associatedObjects;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceComponentStrategyListType }
     *     
     */
    public LearningResourceComponentStrategyListType getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceComponentStrategyListType }
     *     
     */
    public void setStrategies(LearningResourceComponentStrategyListType value) {
        this.strategies = value;
    }

    /**
     * Gets the value of the associatedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedObjectListType }
     *     
     */
    public AssociatedObjectListType getAssociatedObjects() {
        return associatedObjects;
    }

    /**
     * Sets the value of the associatedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedObjectListType }
     *     
     */
    public void setAssociatedObjects(AssociatedObjectListType value) {
        this.associatedObjects = value;
    }

}
