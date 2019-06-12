
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
 * <p>Java class for IdMApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdMApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="DefaultFunction" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="FunctionList" type="{http://www.sifassociation.org/datamodel/na/4.x}FunctionListType" minOccurs="0"/>
 *         &lt;element name="DefaultIdentityProvider" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="IdentityProviderList" type="{http://www.sifassociation.org/datamodel/na/4.x}IdentityProviderListType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdMApplicationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "uri",
    "defaultFunction",
    "functionList",
    "defaultIdentityProvider",
    "identityProviderList",
    "startDate",
    "endDate",
    "sifMetadata",
    "sifExtendedElements"
})
public class IdMApplicationType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "URI", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "DefaultFunction", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String defaultFunction;
    @XmlElement(name = "FunctionList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FunctionListType functionList;
    @XmlElement(name = "DefaultIdentityProvider", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultIdentityProvider;
    @XmlElement(name = "IdentityProviderList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IdentityProviderListType identityProviderList;
    @XmlElement(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the defaultFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultFunction() {
        return defaultFunction;
    }

    /**
     * Sets the value of the defaultFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultFunction(String value) {
        this.defaultFunction = value;
    }

    /**
     * Gets the value of the functionList property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionListType }
     *     
     */
    public FunctionListType getFunctionList() {
        return functionList;
    }

    /**
     * Sets the value of the functionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionListType }
     *     
     */
    public void setFunctionList(FunctionListType value) {
        this.functionList = value;
    }

    /**
     * Gets the value of the defaultIdentityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultIdentityProvider() {
        return defaultIdentityProvider;
    }

    /**
     * Sets the value of the defaultIdentityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultIdentityProvider(String value) {
        this.defaultIdentityProvider = value;
    }

    /**
     * Gets the value of the identityProviderList property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityProviderListType }
     *     
     */
    public IdentityProviderListType getIdentityProviderList() {
        return identityProviderList;
    }

    /**
     * Sets the value of the identityProviderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityProviderListType }
     *     
     */
    public void setIdentityProviderList(IdentityProviderListType value) {
        this.identityProviderList = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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

}
