
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gSpanGapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSpanGapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spanGapType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spanGapCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType"/>
 *         &lt;element name="spanGapName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="spanGapValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "gSpanGapType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "spanGapType",
    "spanGapCode",
    "spanGapName",
    "spanGapValue",
    "startDateTime",
    "endDateTime",
    "any"
})
public class GSpanGapType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected String spanGapType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLaxCodedElementType spanGapCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String spanGapName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String spanGapValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the spanGapType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanGapType() {
        return spanGapType;
    }

    /**
     * Sets the value of the spanGapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanGapType(String value) {
        this.spanGapType = value;
    }

    /**
     * Gets the value of the spanGapCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getSpanGapCode() {
        return spanGapCode;
    }

    /**
     * Sets the value of the spanGapCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setSpanGapCode(GLaxCodedElementType value) {
        this.spanGapCode = value;
    }

    /**
     * Gets the value of the spanGapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanGapName() {
        return spanGapName;
    }

    /**
     * Sets the value of the spanGapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanGapName(String value) {
        this.spanGapName = value;
    }

    /**
     * Gets the value of the spanGapValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanGapValue() {
        return spanGapValue;
    }

    /**
     * Sets the value of the spanGapValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanGapValue(String value) {
        this.spanGapValue = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
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

}
