
package sif.dd.au30.model;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ResourceBookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceBookingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceRefId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4.1>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="RoomInfo"/>
 *                       &lt;enumeration value="EquipmentInfo"/>
 *                       &lt;enumeration value="LearningResource"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResourceLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FinishDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FromPeriod" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="ToPeriod" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="Booker" type="{http://www.sifassociation.org/datamodel/au/3.4.1}IdRefType"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ScheduledActivityRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}IdRefType" minOccurs="0"/>
 *         &lt;element name="KeepOld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceBookingType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "resourceRefId",
    "resourceLocalId",
    "startDateTime",
    "finishDateTime",
    "fromPeriod",
    "toPeriod",
    "booker",
    "reason",
    "scheduledActivityRefId",
    "keepOld",
    "sifMetadata",
    "sifExtendedElements"
})
public class ResourceBookingType {

    @XmlElementRef(name = "ResourceRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceBookingType.ResourceRefId> resourceRefId;
    @XmlElement(name = "ResourceLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resourceLocalId;
    @XmlElement(name = "StartDateTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDateTime;
    @XmlElement(name = "FinishDateTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar finishDateTime;
    @XmlElementRef(name = "FromPeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromPeriod;
    @XmlElementRef(name = "ToPeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toPeriod;
    @XmlElement(name = "Booker", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String booker;
    @XmlElementRef(name = "Reason", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "ScheduledActivityRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scheduledActivityRefId;
    @XmlElementRef(name = "KeepOld", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> keepOld;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the resourceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceBookingType.ResourceRefId }{@code >}
     *     
     */
    public JAXBElement<ResourceBookingType.ResourceRefId> getResourceRefId() {
        return resourceRefId;
    }

    /**
     * Sets the value of the resourceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceBookingType.ResourceRefId }{@code >}
     *     
     */
    public void setResourceRefId(JAXBElement<ResourceBookingType.ResourceRefId> value) {
        this.resourceRefId = value;
    }

    /**
     * Gets the value of the resourceLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceLocalId() {
        return resourceLocalId;
    }

    /**
     * Sets the value of the resourceLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceLocalId(String value) {
        this.resourceLocalId = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(Calendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the finishDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFinishDateTime() {
        return finishDateTime;
    }

    /**
     * Sets the value of the finishDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishDateTime(Calendar value) {
        this.finishDateTime = value;
    }

    /**
     * Gets the value of the fromPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromPeriod() {
        return fromPeriod;
    }

    /**
     * Sets the value of the fromPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromPeriod(JAXBElement<String> value) {
        this.fromPeriod = value;
    }

    /**
     * Gets the value of the toPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToPeriod() {
        return toPeriod;
    }

    /**
     * Sets the value of the toPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToPeriod(JAXBElement<String> value) {
        this.toPeriod = value;
    }

    /**
     * Gets the value of the booker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooker() {
        return booker;
    }

    /**
     * Sets the value of the booker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooker(String value) {
        this.booker = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the scheduledActivityRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScheduledActivityRefId() {
        return scheduledActivityRefId;
    }

    /**
     * Sets the value of the scheduledActivityRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScheduledActivityRefId(JAXBElement<String> value) {
        this.scheduledActivityRefId = value;
    }

    /**
     * Gets the value of the keepOld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getKeepOld() {
        return keepOld;
    }

    /**
     * Sets the value of the keepOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setKeepOld(JAXBElement<Boolean> value) {
        this.keepOld = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4.1>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="RoomInfo"/>
     *             &lt;enumeration value="EquipmentInfo"/>
     *             &lt;enumeration value="LearningResource"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ResourceRefId {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }

}
