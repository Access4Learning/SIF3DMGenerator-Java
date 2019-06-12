
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iepPlanCommonAuthorizationParentGuardianAuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanCommonAuthorizationParentGuardianAuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accepted" type="{http://www.sifassociation.org/datamodel/na/4.x}iepAcceptedType" minOccurs="0"/>
 *         &lt;element name="rejectedPlanElements" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authorizingParentGuardian" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAuthorizingPersonType" minOccurs="0"/>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanCommonAuthorizationParentGuardianAuthorizationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accepted",
    "rejectedPlanElements",
    "authorizingParentGuardian",
    "authorizationDate"
})
public class IepPlanCommonAuthorizationParentGuardianAuthorizationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepAcceptedType accepted;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType> rejectedPlanElements;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonAuthorizingPersonType authorizingParentGuardian;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar authorizationDate;

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link IepAcceptedType }
     *     
     */
    public IepAcceptedType getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepAcceptedType }
     *     
     */
    public void setAccepted(IepAcceptedType value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the rejectedPlanElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectedPlanElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectedPlanElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType }
     * 
     * 
     */
    public List<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType> getRejectedPlanElements() {
        if (rejectedPlanElements == null) {
            rejectedPlanElements = new ArrayList<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType>();
        }
        return this.rejectedPlanElements;
    }

    /**
     * Gets the value of the authorizingParentGuardian property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public IepCommonAuthorizingPersonType getAuthorizingParentGuardian() {
        return authorizingParentGuardian;
    }

    /**
     * Sets the value of the authorizingParentGuardian property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public void setAuthorizingParentGuardian(IepCommonAuthorizingPersonType value) {
        this.authorizingParentGuardian = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

}
