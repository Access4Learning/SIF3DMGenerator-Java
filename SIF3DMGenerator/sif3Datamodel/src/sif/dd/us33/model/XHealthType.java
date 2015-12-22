
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xHealthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xHealthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="immunizations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="immunization" type="{http://www.sifassociation.org/datamodel/na/3.3}xImmunizationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="screenings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="screening" type="{http://www.sifassociation.org/datamodel/na/3.3}xScreeningType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "xHealthType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "immunizations",
    "screenings",
    "any"
})
public class XHealthType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XHealthType.Immunizations immunizations;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XHealthType.Screenings screenings;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the immunizations property.
     * 
     * @return
     *     possible object is
     *     {@link XHealthType.Immunizations }
     *     
     */
    public XHealthType.Immunizations getImmunizations() {
        return immunizations;
    }

    /**
     * Sets the value of the immunizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHealthType.Immunizations }
     *     
     */
    public void setImmunizations(XHealthType.Immunizations value) {
        this.immunizations = value;
    }

    /**
     * Gets the value of the screenings property.
     * 
     * @return
     *     possible object is
     *     {@link XHealthType.Screenings }
     *     
     */
    public XHealthType.Screenings getScreenings() {
        return screenings;
    }

    /**
     * Sets the value of the screenings property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHealthType.Screenings }
     *     
     */
    public void setScreenings(XHealthType.Screenings value) {
        this.screenings = value;
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
     *         &lt;element name="immunization" type="{http://www.sifassociation.org/datamodel/na/3.3}xImmunizationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "immunization"
    })
    public static class Immunizations {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XImmunizationType> immunization;

        /**
         * Gets the value of the immunization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the immunization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImmunization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XImmunizationType }
         * 
         * 
         */
        public List<XImmunizationType> getImmunization() {
            if (immunization == null) {
                immunization = new ArrayList<XImmunizationType>();
            }
            return this.immunization;
        }

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
     *         &lt;element name="screening" type="{http://www.sifassociation.org/datamodel/na/3.3}xScreeningType" maxOccurs="unbounded" minOccurs="0"/>
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
        "screening"
    })
    public static class Screenings {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XScreeningType> screening;

        /**
         * Gets the value of the screening property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the screening property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScreening().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XScreeningType }
         * 
         * 
         */
        public List<XScreeningType> getScreening() {
            if (screening == null) {
                screening = new ArrayList<XScreeningType>();
            }
            return this.screening;
        }

    }

}
