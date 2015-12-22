
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xDisciplineIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xDisciplineIncidentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidentCategory" type="{http://www.sifassociation.org/datamodel/na/3.3}xIncidentBehaviorType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="incidentTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.3}xWeaponType" minOccurs="0"/>
 *         &lt;element name="actions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="action" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisciplineActionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xDisciplineIncidentType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "incidentCategory",
    "description",
    "incidentDate",
    "incidentTime",
    "weaponType",
    "actions",
    "any"
})
public class XDisciplineIncidentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String incidentCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incidentDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar incidentTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XWeaponType weaponType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XDisciplineIncidentType.Actions actions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the incidentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCategory() {
        return incidentCategory;
    }

    /**
     * Sets the value of the incidentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCategory(String value) {
        this.incidentCategory = value;
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
     * Gets the value of the incidentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentDate() {
        return incidentDate;
    }

    /**
     * Sets the value of the incidentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentDate(XMLGregorianCalendar value) {
        this.incidentDate = value;
    }

    /**
     * Gets the value of the incidentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentTime() {
        return incidentTime;
    }

    /**
     * Sets the value of the incidentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentTime(XMLGregorianCalendar value) {
        this.incidentTime = value;
    }

    /**
     * Gets the value of the weaponType property.
     * 
     * @return
     *     possible object is
     *     {@link XWeaponType }
     *     
     */
    public XWeaponType getWeaponType() {
        return weaponType;
    }

    /**
     * Sets the value of the weaponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWeaponType }
     *     
     */
    public void setWeaponType(XWeaponType value) {
        this.weaponType = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link XDisciplineIncidentType.Actions }
     *     
     */
    public XDisciplineIncidentType.Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDisciplineIncidentType.Actions }
     *     
     */
    public void setActions(XDisciplineIncidentType.Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="action" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisciplineActionType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "action"
    })
    public static class Actions {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected List<XDisciplineActionType> action;

        /**
         * Gets the value of the action property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the action property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDisciplineActionType }
         * 
         * 
         */
        public List<XDisciplineActionType> getAction() {
            if (action == null) {
                action = new ArrayList<XDisciplineActionType>();
            }
            return this.action;
        }

    }

}
