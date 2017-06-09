
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPTestletCodeFrameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletCodeFrameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestletRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="TestletContent" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletContentType" minOccurs="0"/>
 *         &lt;element name="TestItemList" type="{http://www.sifassociation.org/datamodel/au/3.4}CodeFrameTestItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletCodeFrameType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestletRefId",
    "testletContent",
    "testItemList"
})
public class NAPTestletCodeFrameType {

    @XmlElementRef(name = "NAPTestletRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestletRefId;
    @XmlElement(name = "TestletContent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected NAPTestletContentType testletContent;
    @XmlElement(name = "TestItemList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected CodeFrameTestItemListType testItemList;

    /**
     * Gets the value of the napTestletRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestletRefId() {
        return napTestletRefId;
    }

    /**
     * Sets the value of the napTestletRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestletRefId(JAXBElement<String> value) {
        this.napTestletRefId = value;
    }

    /**
     * Gets the value of the testletContent property.
     * 
     * @return
     *     possible object is
     *     {@link NAPTestletContentType }
     *     
     */
    public NAPTestletContentType getTestletContent() {
        return testletContent;
    }

    /**
     * Sets the value of the testletContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPTestletContentType }
     *     
     */
    public void setTestletContent(NAPTestletContentType value) {
        this.testletContent = value;
    }

    /**
     * Gets the value of the testItemList property.
     * 
     * @return
     *     possible object is
     *     {@link CodeFrameTestItemListType }
     *     
     */
    public CodeFrameTestItemListType getTestItemList() {
        return testItemList;
    }

    /**
     * Sets the value of the testItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeFrameTestItemListType }
     *     
     */
    public void setTestItemList(CodeFrameTestItemListType value) {
        this.testItemList = value;
    }

}
