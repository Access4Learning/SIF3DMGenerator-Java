
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LibraryPatronStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryPatronStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LibraryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatronRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PatronLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="PatronRefObject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="StudentPersonal"/>
 *               &lt;enumeration value="StaffPersonal"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PatronName" type="{http://www.sifassociation.org/datamodel/au/3.4}NameOfRecordType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/datamodel/au/3.4}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="TransactionList" type="{http://www.sifassociation.org/datamodel/au/3.4}LibraryTransactionListType" minOccurs="0"/>
 *         &lt;element name="MessageList" type="{http://www.sifassociation.org/datamodel/au/3.4}LibraryMessageListType" minOccurs="0"/>
 *         &lt;element name="NumberOfCheckouts" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NumberOfHoldItems" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NumberOfOverdues" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NumberOfFines" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="FineAmount" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="NumberOfRefunds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
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
@XmlType(name = "LibraryPatronStatusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "libraryType",
    "patronRefId",
    "patronLocalId",
    "patronRefObject",
    "patronName",
    "electronicIdList",
    "transactionList",
    "messageList",
    "numberOfCheckouts",
    "numberOfHoldItems",
    "numberOfOverdues",
    "numberOfFines",
    "fineAmount",
    "numberOfRefunds",
    "refundAmount",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class LibraryPatronStatusType {

    @XmlElement(name = "LibraryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected String libraryType;
    @XmlElementRef(name = "PatronRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patronRefId;
    @XmlElementRef(name = "PatronLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patronLocalId;
    @XmlElement(name = "PatronRefObject", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String patronRefObject;
    @XmlElementRef(name = "PatronName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<NameOfRecordType> patronName;
    @XmlElementRef(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectronicIdListType> electronicIdList;
    @XmlElementRef(name = "TransactionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LibraryTransactionListType> transactionList;
    @XmlElementRef(name = "MessageList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LibraryMessageListType> messageList;
    @XmlElement(name = "NumberOfCheckouts", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfCheckouts;
    @XmlElementRef(name = "NumberOfHoldItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numberOfHoldItems;
    @XmlElementRef(name = "NumberOfOverdues", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numberOfOverdues;
    @XmlElementRef(name = "NumberOfFines", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numberOfFines;
    @XmlElementRef(name = "FineAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> fineAmount;
    @XmlElementRef(name = "NumberOfRefunds", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numberOfRefunds;
    @XmlElementRef(name = "RefundAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> refundAmount;
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
     * Gets the value of the libraryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryType() {
        return libraryType;
    }

    /**
     * Sets the value of the libraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryType(String value) {
        this.libraryType = value;
    }

    /**
     * Gets the value of the patronRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatronRefId() {
        return patronRefId;
    }

    /**
     * Sets the value of the patronRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatronRefId(JAXBElement<String> value) {
        this.patronRefId = value;
    }

    /**
     * Gets the value of the patronLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatronLocalId() {
        return patronLocalId;
    }

    /**
     * Sets the value of the patronLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatronLocalId(JAXBElement<String> value) {
        this.patronLocalId = value;
    }

    /**
     * Gets the value of the patronRefObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatronRefObject() {
        return patronRefObject;
    }

    /**
     * Sets the value of the patronRefObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatronRefObject(String value) {
        this.patronRefObject = value;
    }

    /**
     * Gets the value of the patronName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameOfRecordType }{@code >}
     *     
     */
    public JAXBElement<NameOfRecordType> getPatronName() {
        return patronName;
    }

    /**
     * Sets the value of the patronName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameOfRecordType }{@code >}
     *     
     */
    public void setPatronName(JAXBElement<NameOfRecordType> value) {
        this.patronName = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public JAXBElement<ElectronicIdListType> getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public void setElectronicIdList(JAXBElement<ElectronicIdListType> value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LibraryTransactionListType }{@code >}
     *     
     */
    public JAXBElement<LibraryTransactionListType> getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LibraryTransactionListType }{@code >}
     *     
     */
    public void setTransactionList(JAXBElement<LibraryTransactionListType> value) {
        this.transactionList = value;
    }

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LibraryMessageListType }{@code >}
     *     
     */
    public JAXBElement<LibraryMessageListType> getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LibraryMessageListType }{@code >}
     *     
     */
    public void setMessageList(JAXBElement<LibraryMessageListType> value) {
        this.messageList = value;
    }

    /**
     * Gets the value of the numberOfCheckouts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfCheckouts() {
        return numberOfCheckouts;
    }

    /**
     * Sets the value of the numberOfCheckouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfCheckouts(Long value) {
        this.numberOfCheckouts = value;
    }

    /**
     * Gets the value of the numberOfHoldItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumberOfHoldItems() {
        return numberOfHoldItems;
    }

    /**
     * Sets the value of the numberOfHoldItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumberOfHoldItems(JAXBElement<Long> value) {
        this.numberOfHoldItems = value;
    }

    /**
     * Gets the value of the numberOfOverdues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumberOfOverdues() {
        return numberOfOverdues;
    }

    /**
     * Sets the value of the numberOfOverdues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumberOfOverdues(JAXBElement<Long> value) {
        this.numberOfOverdues = value;
    }

    /**
     * Gets the value of the numberOfFines property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumberOfFines() {
        return numberOfFines;
    }

    /**
     * Sets the value of the numberOfFines property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumberOfFines(JAXBElement<Long> value) {
        this.numberOfFines = value;
    }

    /**
     * Gets the value of the fineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getFineAmount() {
        return fineAmount;
    }

    /**
     * Sets the value of the fineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setFineAmount(JAXBElement<MonetaryAmountType> value) {
        this.fineAmount = value;
    }

    /**
     * Gets the value of the numberOfRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumberOfRefunds() {
        return numberOfRefunds;
    }

    /**
     * Sets the value of the numberOfRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumberOfRefunds(JAXBElement<Long> value) {
        this.numberOfRefunds = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setRefundAmount(JAXBElement<MonetaryAmountType> value) {
        this.refundAmount = value;
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
