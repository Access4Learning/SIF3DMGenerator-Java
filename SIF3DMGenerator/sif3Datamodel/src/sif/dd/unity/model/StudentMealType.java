
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentMealType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentMealType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MealStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}MealStatusType" minOccurs="0"/>
 *         &lt;element name="HistoricalMealStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}MealStatusListType" minOccurs="0"/>
 *         &lt;element name="LastBreakfastDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastLunchDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Amounts" type="{http://www.sifassociation.org/datamodel/na/4.x}FSAmountListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentMealType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mealStatus",
    "historicalMealStatus",
    "lastBreakfastDate",
    "lastLunchDate",
    "amounts",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentMealType {

    @XmlElement(name = "MealStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MealStatusType mealStatus;
    @XmlElement(name = "HistoricalMealStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MealStatusListType historicalMealStatus;
    @XmlElement(name = "LastBreakfastDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastBreakfastDate;
    @XmlElement(name = "LastLunchDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastLunchDate;
    @XmlElement(name = "Amounts", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FSAmountListType amounts;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;

    /**
     * Gets the value of the mealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MealStatusType }
     *     
     */
    public MealStatusType getMealStatus() {
        return mealStatus;
    }

    /**
     * Sets the value of the mealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealStatusType }
     *     
     */
    public void setMealStatus(MealStatusType value) {
        this.mealStatus = value;
    }

    /**
     * Gets the value of the historicalMealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MealStatusListType }
     *     
     */
    public MealStatusListType getHistoricalMealStatus() {
        return historicalMealStatus;
    }

    /**
     * Sets the value of the historicalMealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealStatusListType }
     *     
     */
    public void setHistoricalMealStatus(MealStatusListType value) {
        this.historicalMealStatus = value;
    }

    /**
     * Gets the value of the lastBreakfastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBreakfastDate() {
        return lastBreakfastDate;
    }

    /**
     * Sets the value of the lastBreakfastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBreakfastDate(XMLGregorianCalendar value) {
        this.lastBreakfastDate = value;
    }

    /**
     * Gets the value of the lastLunchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLunchDate() {
        return lastLunchDate;
    }

    /**
     * Sets the value of the lastLunchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLunchDate(XMLGregorianCalendar value) {
        this.lastLunchDate = value;
    }

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link FSAmountListType }
     *     
     */
    public FSAmountListType getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSAmountListType }
     *     
     */
    public void setAmounts(FSAmountListType value) {
        this.amounts = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
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

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

}
