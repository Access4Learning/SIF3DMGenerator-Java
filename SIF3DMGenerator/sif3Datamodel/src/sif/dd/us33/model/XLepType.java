
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xLepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lepStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="perkinsLepStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="title3AcountabilityProgressStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}xTitle3AccountabilityProgressStatusType" minOccurs="0"/>
 *         &lt;element name="title3LepParticipationStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="participationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
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
@XmlType(name = "xLepType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "lepStatus",
    "perkinsLepStatus",
    "title3AcountabilityProgressStatus",
    "title3LepParticipationStatus",
    "entryDate",
    "participationEndDate",
    "school",
    "any"
})
public class XLepType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType lepStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType perkinsLepStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTitle3AccountabilityProgressStatusType title3AcountabilityProgressStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType title3LepParticipationStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar participationEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lepStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getLepStatus() {
        return lepStatus;
    }

    /**
     * Sets the value of the lepStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setLepStatus(GYesNoUnknownType value) {
        this.lepStatus = value;
    }

    /**
     * Gets the value of the perkinsLepStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getPerkinsLepStatus() {
        return perkinsLepStatus;
    }

    /**
     * Sets the value of the perkinsLepStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setPerkinsLepStatus(GYesNoUnknownType value) {
        this.perkinsLepStatus = value;
    }

    /**
     * Gets the value of the title3AcountabilityProgressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XTitle3AccountabilityProgressStatusType }
     *     
     */
    public XTitle3AccountabilityProgressStatusType getTitle3AcountabilityProgressStatus() {
        return title3AcountabilityProgressStatus;
    }

    /**
     * Sets the value of the title3AcountabilityProgressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTitle3AccountabilityProgressStatusType }
     *     
     */
    public void setTitle3AcountabilityProgressStatus(XTitle3AccountabilityProgressStatusType value) {
        this.title3AcountabilityProgressStatus = value;
    }

    /**
     * Gets the value of the title3LepParticipationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getTitle3LepParticipationStatus() {
        return title3LepParticipationStatus;
    }

    /**
     * Sets the value of the title3LepParticipationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setTitle3LepParticipationStatus(GYesNoUnknownType value) {
        this.title3LepParticipationStatus = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the participationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParticipationEndDate() {
        return participationEndDate;
    }

    /**
     * Sets the value of the participationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParticipationEndDate(XMLGregorianCalendar value) {
        this.participationEndDate = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchool(XSchoolType value) {
        this.school = value;
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
