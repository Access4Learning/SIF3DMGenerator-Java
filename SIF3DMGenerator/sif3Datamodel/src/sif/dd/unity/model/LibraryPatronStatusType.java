
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}ElectronicIdListType"/>
 *         &lt;element name="TransactionList" type="{http://www.sifassociation.org/datamodel/na/4.x}LibraryTransactionListType" minOccurs="0"/>
 *         &lt;element name="MessageList" type="{http://www.sifassociation.org/datamodel/na/4.x}LibraryMessageListType" minOccurs="0"/>
 *         &lt;element name="NumberOfCheckouts" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="NumberOfOverdues" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="NumberOfFines" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FineAmount" type="{http://www.sifassociation.org/datamodel/na/4.x}MonetaryAmountType"/>
 *         &lt;element name="NumberOfRefunds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{http://www.sifassociation.org/datamodel/na/4.x}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="LibraryType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SIF_RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SIF_RefObject" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="SIF_RefObjectCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryPatronStatusType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "electronicIdList",
    "transactionList",
    "messageList",
    "numberOfCheckouts",
    "numberOfOverdues",
    "numberOfFines",
    "fineAmount",
    "numberOfRefunds",
    "refundAmount",
    "sifMetadata",
    "sifExtendedElements"
})
public class LibraryPatronStatusType {

    @XmlElement(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ElectronicIdListType electronicIdList;
    @XmlElement(name = "TransactionList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LibraryTransactionListType transactionList;
    @XmlElement(name = "MessageList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LibraryMessageListType messageList;
    @XmlElement(name = "NumberOfCheckouts", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfCheckouts;
    @XmlElement(name = "NumberOfOverdues", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfOverdues;
    @XmlElement(name = "NumberOfFines", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfFines;
    @XmlElement(name = "FineAmount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected MonetaryAmountType fineAmount;
    @XmlElement(name = "NumberOfRefunds", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfRefunds;
    @XmlElement(name = "RefundAmount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MonetaryAmountType refundAmount;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "LibraryType", required = true)
    protected String libraryType;
    @XmlAttribute(name = "SIF_RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefId;
    @XmlAttribute(name = "SIF_RefObject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObject;
    @XmlAttribute(name = "SIF_RefObjectCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObjectCodeset;

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicIdListType }
     *     
     */
    public ElectronicIdListType getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicIdListType }
     *     
     */
    public void setElectronicIdList(ElectronicIdListType value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryTransactionListType }
     *     
     */
    public LibraryTransactionListType getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryTransactionListType }
     *     
     */
    public void setTransactionList(LibraryTransactionListType value) {
        this.transactionList = value;
    }

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryMessageListType }
     *     
     */
    public LibraryMessageListType getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryMessageListType }
     *     
     */
    public void setMessageList(LibraryMessageListType value) {
        this.messageList = value;
    }

    /**
     * Gets the value of the numberOfCheckouts property.
     * 
     */
    public long getNumberOfCheckouts() {
        return numberOfCheckouts;
    }

    /**
     * Sets the value of the numberOfCheckouts property.
     * 
     */
    public void setNumberOfCheckouts(long value) {
        this.numberOfCheckouts = value;
    }

    /**
     * Gets the value of the numberOfOverdues property.
     * 
     */
    public long getNumberOfOverdues() {
        return numberOfOverdues;
    }

    /**
     * Sets the value of the numberOfOverdues property.
     * 
     */
    public void setNumberOfOverdues(long value) {
        this.numberOfOverdues = value;
    }

    /**
     * Gets the value of the numberOfFines property.
     * 
     */
    public long getNumberOfFines() {
        return numberOfFines;
    }

    /**
     * Sets the value of the numberOfFines property.
     * 
     */
    public void setNumberOfFines(long value) {
        this.numberOfFines = value;
    }

    /**
     * Gets the value of the fineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getFineAmount() {
        return fineAmount;
    }

    /**
     * Sets the value of the fineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setFineAmount(MonetaryAmountType value) {
        this.fineAmount = value;
    }

    /**
     * Gets the value of the numberOfRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfRefunds() {
        return numberOfRefunds;
    }

    /**
     * Sets the value of the numberOfRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfRefunds(Long value) {
        this.numberOfRefunds = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setRefundAmount(MonetaryAmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
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
     * Gets the value of the sifRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefId() {
        return sifRefId;
    }

    /**
     * Sets the value of the sifRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefId(String value) {
        this.sifRefId = value;
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

    /**
     * Gets the value of the sifRefObjectCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObjectCodeset() {
        return sifRefObjectCodeset;
    }

    /**
     * Sets the value of the sifRefObjectCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObjectCodeset(String value) {
        this.sifRefObjectCodeset = value;
    }

}
