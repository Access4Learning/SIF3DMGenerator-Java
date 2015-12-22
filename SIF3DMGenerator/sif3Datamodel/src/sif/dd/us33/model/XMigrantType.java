
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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xMigrantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xMigrantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="moveFromCity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="moveFromState" type="{http://www.sifassociation.org/datamodel/na/3.3}gStateProvinceType" minOccurs="0"/>
 *         &lt;element name="moveFromCountry" type="{http://www.sifassociation.org/datamodel/na/3.3}gCountryType" minOccurs="0"/>
 *         &lt;element name="eligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="enrollmentType" type="{http://www.sifassociation.org/datamodel/na/3.3}xMigrantEnrollmentType" minOccurs="0"/>
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
@XmlType(name = "xMigrantType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "lastQualifyingMoveDate",
    "moveFromCity",
    "moveFromState",
    "moveFromCountry",
    "eligibilityExpirationDate",
    "enrollmentDate",
    "enrollmentType",
    "school",
    "any"
})
public class XMigrantType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastQualifyingMoveDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String moveFromCity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GStateProvinceType moveFromState;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GCountryType moveFromCountry;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eligibilityExpirationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollmentDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enrollmentType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lastQualifyingMoveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastQualifyingMoveDate() {
        return lastQualifyingMoveDate;
    }

    /**
     * Sets the value of the lastQualifyingMoveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastQualifyingMoveDate(XMLGregorianCalendar value) {
        this.lastQualifyingMoveDate = value;
    }

    /**
     * Gets the value of the moveFromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveFromCity() {
        return moveFromCity;
    }

    /**
     * Sets the value of the moveFromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveFromCity(String value) {
        this.moveFromCity = value;
    }

    /**
     * Gets the value of the moveFromState property.
     * 
     * @return
     *     possible object is
     *     {@link GStateProvinceType }
     *     
     */
    public GStateProvinceType getMoveFromState() {
        return moveFromState;
    }

    /**
     * Sets the value of the moveFromState property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStateProvinceType }
     *     
     */
    public void setMoveFromState(GStateProvinceType value) {
        this.moveFromState = value;
    }

    /**
     * Gets the value of the moveFromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link GCountryType }
     *     
     */
    public GCountryType getMoveFromCountry() {
        return moveFromCountry;
    }

    /**
     * Sets the value of the moveFromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCountryType }
     *     
     */
    public void setMoveFromCountry(GCountryType value) {
        this.moveFromCountry = value;
    }

    /**
     * Gets the value of the eligibilityExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEligibilityExpirationDate() {
        return eligibilityExpirationDate;
    }

    /**
     * Sets the value of the eligibilityExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEligibilityExpirationDate(XMLGregorianCalendar value) {
        this.eligibilityExpirationDate = value;
    }

    /**
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentDate(XMLGregorianCalendar value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the enrollmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentType() {
        return enrollmentType;
    }

    /**
     * Sets the value of the enrollmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentType(String value) {
        this.enrollmentType = value;
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
