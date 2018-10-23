
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about data sharing.
 * 
 * <p>Java class for ShareWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareWithType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareWithParty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShareWithComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermissionToOnShare" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType"/>
 *         &lt;element name="ShareWithURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareWithType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "shareWithParty",
    "purpose",
    "shareWithComments",
    "permissionToOnShare",
    "shareWithURL"
})
public class ShareWithType {

    @XmlElement(name = "ShareWithParty", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String shareWithParty;
    @XmlElement(name = "Purpose", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String purpose;
    @XmlElement(name = "ShareWithComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String shareWithComments;
    @XmlElement(name = "PermissionToOnShare", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AUCodeSetsYesOrNoCategoryType permissionToOnShare;
    @XmlElement(name = "ShareWithURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String shareWithURL;

    /**
     * Gets the value of the shareWithParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithParty() {
        return shareWithParty;
    }

    /**
     * Sets the value of the shareWithParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithParty(String value) {
        this.shareWithParty = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the shareWithComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithComments() {
        return shareWithComments;
    }

    /**
     * Sets the value of the shareWithComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithComments(String value) {
        this.shareWithComments = value;
    }

    /**
     * Gets the value of the permissionToOnShare property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public AUCodeSetsYesOrNoCategoryType getPermissionToOnShare() {
        return permissionToOnShare;
    }

    /**
     * Sets the value of the permissionToOnShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public void setPermissionToOnShare(AUCodeSetsYesOrNoCategoryType value) {
        this.permissionToOnShare = value;
    }

    /**
     * Gets the value of the shareWithURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareWithURL() {
        return shareWithURL;
    }

    /**
     * Sets the value of the shareWithURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareWithURL(String value) {
        this.shareWithURL = value;
    }

}
