
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentToSharingOfDataContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentToSharingOfDataContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataDomainObligationList" type="{http://www.sifassociation.org/datamodel/au/3.4}DataDomainObligationListType" minOccurs="0"/>
 *         &lt;element name="NeverShareWithList" type="{http://www.sifassociation.org/datamodel/au/3.4}NeverShareWithListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentToSharingOfDataContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "dataDomainObligationList",
    "neverShareWithList"
})
public class ConsentToSharingOfDataContainerType {

    @XmlElementRef(name = "DataDomainObligationList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<DataDomainObligationListType> dataDomainObligationList;
    @XmlElementRef(name = "NeverShareWithList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<NeverShareWithListType> neverShareWithList;

    /**
     * Gets the value of the dataDomainObligationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataDomainObligationListType }{@code >}
     *     
     */
    public JAXBElement<DataDomainObligationListType> getDataDomainObligationList() {
        return dataDomainObligationList;
    }

    /**
     * Sets the value of the dataDomainObligationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataDomainObligationListType }{@code >}
     *     
     */
    public void setDataDomainObligationList(JAXBElement<DataDomainObligationListType> value) {
        this.dataDomainObligationList = value;
    }

    /**
     * Gets the value of the neverShareWithList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NeverShareWithListType }{@code >}
     *     
     */
    public JAXBElement<NeverShareWithListType> getNeverShareWithList() {
        return neverShareWithList;
    }

    /**
     * Sets the value of the neverShareWithList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NeverShareWithListType }{@code >}
     *     
     */
    public void setNeverShareWithList(JAXBElement<NeverShareWithListType> value) {
        this.neverShareWithList = value;
    }

}
