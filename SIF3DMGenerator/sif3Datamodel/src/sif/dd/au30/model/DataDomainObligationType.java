
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataDomainObligationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDomainObligationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareWithList" type="{http://www.sifassociation.org/datamodel/au/3.4}ShareWithListType" minOccurs="0"/>
 *         &lt;element name="DoNotShareWithList" type="{http://www.sifassociation.org/datamodel/au/3.4}DoNotShareWithListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDomainObligationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "dataDomain",
    "domainComments",
    "shareWithList",
    "doNotShareWithList"
})
public class DataDomainObligationType {

    @XmlElement(name = "DataDomain", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String dataDomain;
    @XmlElement(name = "DomainComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String domainComments;
    @XmlElementRef(name = "ShareWithList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ShareWithListType> shareWithList;
    @XmlElementRef(name = "DoNotShareWithList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<DoNotShareWithListType> doNotShareWithList;

    /**
     * Gets the value of the dataDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDomain() {
        return dataDomain;
    }

    /**
     * Sets the value of the dataDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDomain(String value) {
        this.dataDomain = value;
    }

    /**
     * Gets the value of the domainComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainComments() {
        return domainComments;
    }

    /**
     * Sets the value of the domainComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainComments(String value) {
        this.domainComments = value;
    }

    /**
     * Gets the value of the shareWithList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShareWithListType }{@code >}
     *     
     */
    public JAXBElement<ShareWithListType> getShareWithList() {
        return shareWithList;
    }

    /**
     * Sets the value of the shareWithList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShareWithListType }{@code >}
     *     
     */
    public void setShareWithList(JAXBElement<ShareWithListType> value) {
        this.shareWithList = value;
    }

    /**
     * Gets the value of the doNotShareWithList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DoNotShareWithListType }{@code >}
     *     
     */
    public JAXBElement<DoNotShareWithListType> getDoNotShareWithList() {
        return doNotShareWithList;
    }

    /**
     * Sets the value of the doNotShareWithList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DoNotShareWithListType }{@code >}
     *     
     */
    public void setDoNotShareWithList(JAXBElement<DoNotShareWithListType> value) {
        this.doNotShareWithList = value;
    }

}
