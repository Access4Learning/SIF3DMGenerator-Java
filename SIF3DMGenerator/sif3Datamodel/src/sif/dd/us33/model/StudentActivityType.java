
package sif.dd.us33.model;

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
 * Co-curricular or extra-curricular activities (e.g., student organizations, intramural and interscholastic athletes, publications, band, orchestra, and service activities) in which students may participate.
 * 
 * <p>Java class for studentActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentActivityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_EntityType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="studentActivityCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
 *         &lt;element name="studentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="gradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.3}gYearGroupList" minOccurs="0"/>
 *         &lt;element name="curricularStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentActivityType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "title",
    "description",
    "studentActivityCode",
    "studentActivityLevel",
    "gradeLevels",
    "curricularStatus",
    "location"
})
public class StudentActivityType
    extends GSIFEntityType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElementRef(name = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GCodedElementType studentActivityCode;
    @XmlElementRef(name = "studentActivityLevel", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentActivityLevel;
    @XmlElementRef(name = "gradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<GYearGroupList> gradeLevels;
    @XmlElementRef(name = "curricularStatus", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<GCodedElementType> curricularStatus;
    @XmlElementRef(name = "location", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the studentActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link GCodedElementType }
     *     
     */
    public GCodedElementType getStudentActivityCode() {
        return studentActivityCode;
    }

    /**
     * Sets the value of the studentActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCodedElementType }
     *     
     */
    public void setStudentActivityCode(GCodedElementType value) {
        this.studentActivityCode = value;
    }

    /**
     * Gets the value of the studentActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentActivityLevel() {
        return studentActivityLevel;
    }

    /**
     * Sets the value of the studentActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentActivityLevel(JAXBElement<String> value) {
        this.studentActivityLevel = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GYearGroupList }{@code >}
     *     
     */
    public JAXBElement<GYearGroupList> getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GYearGroupList }{@code >}
     *     
     */
    public void setGradeLevels(JAXBElement<GYearGroupList> value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the curricularStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GCodedElementType }{@code >}
     *     
     */
    public JAXBElement<GCodedElementType> getCurricularStatus() {
        return curricularStatus;
    }

    /**
     * Sets the value of the curricularStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GCodedElementType }{@code >}
     *     
     */
    public void setCurricularStatus(JAXBElement<GCodedElementType> value) {
        this.curricularStatus = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

}
