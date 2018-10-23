
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for Information outlining details of a possible Plan.  A Personalised Plan will be referenced by a separate Object.
 * 
 * <p>Java class for PlanRequiredContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanRequiredContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanRequiredList" type="{http://www.sifassociation.org/datamodel/au/3.4}PlanRequiredListType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanRequiredContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "planRequiredList",
    "status"
})
public class PlanRequiredContainerType {

    @XmlElementRef(name = "PlanRequiredList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PlanRequiredListType> planRequiredList;
    @XmlElementRef(name = "Status", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingStatusType> status;

    /**
     * Gets the value of the planRequiredList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlanRequiredListType }{@code >}
     *     
     */
    public JAXBElement<PlanRequiredListType> getPlanRequiredList() {
        return planRequiredList;
    }

    /**
     * Sets the value of the planRequiredList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlanRequiredListType }{@code >}
     *     
     */
    public void setPlanRequiredList(JAXBElement<PlanRequiredListType> value) {
        this.planRequiredList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingStatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<AUCodeSetsWellbeingStatusType> value) {
        this.status = value;
    }

}
