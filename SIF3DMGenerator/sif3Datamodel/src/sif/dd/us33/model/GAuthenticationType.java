
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines how authentication is performed and exchanged.
 * 
 * <p>Java class for gAuthenticationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gAuthenticationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gIdentityManagementArtifactType">
 *       &lt;sequence>
 *         &lt;element name="userOrganizationAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="applicationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="identityProviderLoginId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="identityProviderType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="authoritativeSourceId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gAuthenticationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "userOrganizationAssociationRefId",
    "applicationRefId",
    "identityProviderLoginId",
    "identityProviderType",
    "authoritativeSourceId",
    "startDate",
    "endDate"
})
public class GAuthenticationType
    extends GIdentityManagementArtifactType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String userOrganizationAssociationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String applicationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityProviderLoginId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityProviderType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authoritativeSourceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the userOrganizationAssociationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserOrganizationAssociationRefId() {
        return userOrganizationAssociationRefId;
    }

    /**
     * Sets the value of the userOrganizationAssociationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserOrganizationAssociationRefId(String value) {
        this.userOrganizationAssociationRefId = value;
    }

    /**
     * Gets the value of the applicationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationRefId() {
        return applicationRefId;
    }

    /**
     * Sets the value of the applicationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationRefId(String value) {
        this.applicationRefId = value;
    }

    /**
     * Gets the value of the identityProviderLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityProviderLoginId() {
        return identityProviderLoginId;
    }

    /**
     * Sets the value of the identityProviderLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityProviderLoginId(String value) {
        this.identityProviderLoginId = value;
    }

    /**
     * Gets the value of the identityProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityProviderType() {
        return identityProviderType;
    }

    /**
     * Sets the value of the identityProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityProviderType(String value) {
        this.identityProviderType = value;
    }

    /**
     * Gets the value of the authoritativeSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoritativeSourceId() {
        return authoritativeSourceId;
    }

    /**
     * Sets the value of the authoritativeSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoritativeSourceId(String value) {
        this.authoritativeSourceId = value;
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

}
