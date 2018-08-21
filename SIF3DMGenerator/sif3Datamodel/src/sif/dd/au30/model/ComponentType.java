
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strategies" type="{http://www.sifassociation.org/datamodel/au/3.4}StrategiesType" minOccurs="0"/>
 *         &lt;element name="AssociatedObjects" type="{http://www.sifassociation.org/datamodel/au/3.4}AssociatedObjectsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "name",
    "reference",
    "description",
    "strategies",
    "associatedObjects"
})
public class ComponentType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "Reference", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String reference;
    @XmlElementRef(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Strategies", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategiesType> strategies;
    @XmlElementRef(name = "AssociatedObjects", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AssociatedObjectsType> associatedObjects;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategiesType }{@code >}
     *     
     */
    public JAXBElement<StrategiesType> getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategiesType }{@code >}
     *     
     */
    public void setStrategies(JAXBElement<StrategiesType> value) {
        this.strategies = value;
    }

    /**
     * Gets the value of the associatedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssociatedObjectsType }{@code >}
     *     
     */
    public JAXBElement<AssociatedObjectsType> getAssociatedObjects() {
        return associatedObjects;
    }

    /**
     * Sets the value of the associatedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssociatedObjectsType }{@code >}
     *     
     */
    public void setAssociatedObjects(JAXBElement<AssociatedObjectsType> value) {
        this.associatedObjects = value;
    }

}
