
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iepPlanCommonAuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanCommonAuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizingOfficialsList" type="{http://www.sifassociation.org/datamodel/na/4.x}authorizingOfficialsListType" minOccurs="0"/>
 *         &lt;element name="parentGuardianAuthorization" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanCommonAuthorizationParentGuardianAuthorizationType" minOccurs="0"/>
 *         &lt;element name="transferOfRightsNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanCommonAuthorizationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "authorizingOfficialsList",
    "parentGuardianAuthorization",
    "transferOfRightsNotificationDate"
})
public class IepPlanCommonAuthorizationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AuthorizingOfficialsListType authorizingOfficialsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanCommonAuthorizationParentGuardianAuthorizationType parentGuardianAuthorization;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transferOfRightsNotificationDate;

    /**
     * Gets the value of the authorizingOfficialsList property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizingOfficialsListType }
     *     
     */
    public AuthorizingOfficialsListType getAuthorizingOfficialsList() {
        return authorizingOfficialsList;
    }

    /**
     * Sets the value of the authorizingOfficialsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizingOfficialsListType }
     *     
     */
    public void setAuthorizingOfficialsList(AuthorizingOfficialsListType value) {
        this.authorizingOfficialsList = value;
    }

    /**
     * Gets the value of the parentGuardianAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanCommonAuthorizationParentGuardianAuthorizationType }
     *     
     */
    public IepPlanCommonAuthorizationParentGuardianAuthorizationType getParentGuardianAuthorization() {
        return parentGuardianAuthorization;
    }

    /**
     * Sets the value of the parentGuardianAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanCommonAuthorizationParentGuardianAuthorizationType }
     *     
     */
    public void setParentGuardianAuthorization(IepPlanCommonAuthorizationParentGuardianAuthorizationType value) {
        this.parentGuardianAuthorization = value;
    }

    /**
     * Gets the value of the transferOfRightsNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferOfRightsNotificationDate() {
        return transferOfRightsNotificationDate;
    }

    /**
     * Sets the value of the transferOfRightsNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferOfRightsNotificationDate(XMLGregorianCalendar value) {
        this.transferOfRightsNotificationDate = value;
    }

}
