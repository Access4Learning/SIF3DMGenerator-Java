
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Rule.
 * 
 * <p>Java class for AGRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRuleCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AGRuleComment" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AGRuleResponse" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AGRuleStatus" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRuleType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "agRuleCode",
    "agRuleComment",
    "agRuleResponse",
    "agRuleStatus"
})
public class AGRuleType {

    @XmlElementRef(name = "AGRuleCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agRuleCode;
    @XmlElementRef(name = "AGRuleComment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agRuleComment;
    @XmlElementRef(name = "AGRuleResponse", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agRuleResponse;
    @XmlElementRef(name = "AGRuleStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agRuleStatus;

    /**
     * Gets the value of the agRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGRuleCode() {
        return agRuleCode;
    }

    /**
     * Sets the value of the agRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGRuleCode(JAXBElement<String> value) {
        this.agRuleCode = value;
    }

    /**
     * Gets the value of the agRuleComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGRuleComment() {
        return agRuleComment;
    }

    /**
     * Sets the value of the agRuleComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGRuleComment(JAXBElement<String> value) {
        this.agRuleComment = value;
    }

    /**
     * Gets the value of the agRuleResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGRuleResponse() {
        return agRuleResponse;
    }

    /**
     * Sets the value of the agRuleResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGRuleResponse(JAXBElement<String> value) {
        this.agRuleResponse = value;
    }

    /**
     * Gets the value of the agRuleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGRuleStatus() {
        return agRuleStatus;
    }

    /**
     * Sets the value of the agRuleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGRuleStatus(JAXBElement<String> value) {
        this.agRuleStatus = value;
    }

}
