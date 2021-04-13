
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
 * <p>Java class for ResourceUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ResourceUsageContentType" type="{http://www.sifassociation.org/datamodel/au/3.4}ResourceUsageContentTypeType" minOccurs="0"/>
 *         &lt;element name="ResourceReportColumnList" type="{http://www.sifassociation.org/datamodel/au/3.4}ResourceReportColumnListType" minOccurs="0"/>
 *         &lt;element name="ResourceReportLineList" type="{http://www.sifassociation.org/datamodel/au/3.4}ResourceReportLineListType" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
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
@XmlType(name = "ResourceUsageType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolInfoRefId",
    "resourceUsageContentType",
    "resourceReportColumnList",
    "resourceReportLineList",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class ResourceUsageType {

    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "ResourceUsageContentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ResourceUsageContentTypeType resourceUsageContentType;
    @XmlElement(name = "ResourceReportColumnList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ResourceReportColumnListType resourceReportColumnList;
    @XmlElement(name = "ResourceReportLineList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ResourceReportLineListType resourceReportLineList;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the resourceUsageContentType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceUsageContentTypeType }
     *     
     */
    public ResourceUsageContentTypeType getResourceUsageContentType() {
        return resourceUsageContentType;
    }

    /**
     * Sets the value of the resourceUsageContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceUsageContentTypeType }
     *     
     */
    public void setResourceUsageContentType(ResourceUsageContentTypeType value) {
        this.resourceUsageContentType = value;
    }

    /**
     * Gets the value of the resourceReportColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReportColumnListType }
     *     
     */
    public ResourceReportColumnListType getResourceReportColumnList() {
        return resourceReportColumnList;
    }

    /**
     * Sets the value of the resourceReportColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReportColumnListType }
     *     
     */
    public void setResourceReportColumnList(ResourceReportColumnListType value) {
        this.resourceReportColumnList = value;
    }

    /**
     * Gets the value of the resourceReportLineList property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReportLineListType }
     *     
     */
    public ResourceReportLineListType getResourceReportLineList() {
        return resourceReportLineList;
    }

    /**
     * Sets the value of the resourceReportLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReportLineListType }
     *     
     */
    public void setResourceReportLineList(ResourceReportLineListType value) {
        this.resourceReportLineList = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
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
