
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An incident that has caused the displacement of students.
 * 
 * <p>Java class for crisisIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crisisIncidentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEventType">
 *       &lt;sequence>
 *         &lt;element name="crisisCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="crisisName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="crisisType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="crisisStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crisisIncidentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "crisisCode",
    "crisisName",
    "crisisType",
    "crisisStartDate"
})
public class CrisisIncidentType
    extends GEventType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crisisCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String crisisName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crisisType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crisisStartDate;

    /**
     * Gets the value of the crisisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisCode() {
        return crisisCode;
    }

    /**
     * Sets the value of the crisisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisCode(String value) {
        this.crisisCode = value;
    }

    /**
     * Gets the value of the crisisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisName() {
        return crisisName;
    }

    /**
     * Sets the value of the crisisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisName(String value) {
        this.crisisName = value;
    }

    /**
     * Gets the value of the crisisType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisType() {
        return crisisType;
    }

    /**
     * Sets the value of the crisisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisType(String value) {
        this.crisisType = value;
    }

    /**
     * Gets the value of the crisisStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrisisStartDate() {
        return crisisStartDate;
    }

    /**
     * Sets the value of the crisisStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrisisStartDate(XMLGregorianCalendar value) {
        this.crisisStartDate = value;
    }

}
