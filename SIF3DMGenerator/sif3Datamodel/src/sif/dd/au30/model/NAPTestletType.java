
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object represents a student’s attempt to undergo NAP assessment in a particular test.
 * 
 * <p>Java class for NAPTestletType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="TestletContent" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletContentType"/>
 *         &lt;element name="TestItemList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestItemListType"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestRefId",
    "napTestLocalId",
    "testletContent",
    "testItemList",
    "sifMetadata",
    "sifExtendedElements"
})
public class NAPTestletType {

    @XmlElementRef(name = "NAPTestRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestRefId;
    @XmlElement(name = "NAPTestLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestLocalId;
    @XmlElement(name = "TestletContent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected NAPTestletContentType testletContent;
    @XmlElement(name = "TestItemList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected NAPTestItemListType testItemList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the napTestRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestRefId() {
        return napTestRefId;
    }

    /**
     * Sets the value of the napTestRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestRefId(JAXBElement<String> value) {
        this.napTestRefId = value;
    }

    /**
     * Gets the value of the napTestLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestLocalId() {
        return napTestLocalId;
    }

    /**
     * Sets the value of the napTestLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestLocalId(String value) {
        this.napTestLocalId = value;
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
     *     {@link NAPTestItemListType }
     *     
     */
    public NAPTestItemListType getTestItemList() {
        return testItemList;
    }

    /**
     * Sets the value of the testItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPTestItemListType }
     *     
     */
    public void setTestItemList(NAPTestItemListType value) {
        this.testItemList = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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
