
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NAPCodeFrameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPCodeFrameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="TestContent" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestContentType" minOccurs="0"/>
 *         &lt;element name="TestletList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPCodeFrameTestletListType" minOccurs="0"/>
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
@XmlType(name = "NAPCodeFrameType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestRefId",
    "testContent",
    "testletList",
    "sifMetadata",
    "sifExtendedElements"
})
public class NAPCodeFrameType {

    @XmlElement(name = "NAPTestRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String napTestRefId;
    @XmlElement(name = "TestContent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected NAPTestContentType testContent;
    @XmlElement(name = "TestletList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected NAPCodeFrameTestletListType testletList;
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
     *     {@link String }
     *     
     */
    public String getNAPTestRefId() {
        return napTestRefId;
    }

    /**
     * Sets the value of the napTestRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestRefId(String value) {
        this.napTestRefId = value;
    }

    /**
     * Gets the value of the testContent property.
     * 
     * @return
     *     possible object is
     *     {@link NAPTestContentType }
     *     
     */
    public NAPTestContentType getTestContent() {
        return testContent;
    }

    /**
     * Sets the value of the testContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPTestContentType }
     *     
     */
    public void setTestContent(NAPTestContentType value) {
        this.testContent = value;
    }

    /**
     * Gets the value of the testletList property.
     * 
     * @return
     *     possible object is
     *     {@link NAPCodeFrameTestletListType }
     *     
     */
    public NAPCodeFrameTestletListType getTestletList() {
        return testletList;
    }

    /**
     * Sets the value of the testletList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPCodeFrameTestletListType }
     *     
     */
    public void setTestletList(NAPCodeFrameTestletListType value) {
        this.testletList = value;
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
