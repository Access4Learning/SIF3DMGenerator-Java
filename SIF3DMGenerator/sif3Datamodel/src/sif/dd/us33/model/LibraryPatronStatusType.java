
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object reports the current library status for the requested student or staff member.
 * 
 * <p>Java class for libraryPatronStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="libraryPatronStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="libraryType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="patronRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType"/>
 *         &lt;element name="electronicIdList" type="{http://www.sifassociation.org/datamodel/na/3.3}gElectronicIdList"/>
 *         &lt;element name="transactionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transaction" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="electronicId" type="{http://www.sifassociation.org/datamodel/na/3.3}gElectronicIdType" minOccurs="0"/>
 *                                       &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="price" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;fractionDigits value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                           &lt;enumeration value="Asset"/>
 *                                           &lt;enumeration value="LibraryMaterial"/>
 *                                           &lt;enumeration value="Media"/>
 *                                           &lt;enumeration value="Textbook"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="checkout" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="returnBy" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fineList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fine" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dateAssessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="amount">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;fractionDigits value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="type" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                     &lt;enumeration value="Damaged"/>
 *                                                     &lt;enumeration value="Lost"/>
 *                                                     &lt;enumeration value="Overdue"/>
 *                                                     &lt;enumeration value="Refund"/>
 *                                                     &lt;enumeration value="Other"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="holdList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hold" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="datePlaced" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="dateNeeded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="dateAvailable" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="type" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                     &lt;enumeration value="Ready"/>
 *                                                     &lt;enumeration value="NotReady"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="messageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="message" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="priority" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;enumeration value="Low"/>
 *                                 &lt;enumeration value="Normal"/>
 *                                 &lt;enumeration value="Urgent"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numberOfCheckouts" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="numberOfOverdues" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="numberOfFines" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fineAmount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numberOfRefunds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="refundAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryPatronStatusType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "libraryType",
    "patronRefId",
    "electronicIdList",
    "transactionList",
    "messageList",
    "numberOfCheckouts",
    "numberOfOverdues",
    "numberOfFines",
    "fineAmount",
    "numberOfRefunds",
    "refundAmount"
})
public class LibraryPatronStatusType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected Object libraryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GGenericRefIdPointerType patronRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GElectronicIdList electronicIdList;
    @XmlElementRef(name = "transactionList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<LibraryPatronStatusType.TransactionList> transactionList;
    @XmlElementRef(name = "messageList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<LibraryPatronStatusType.MessageList> messageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfCheckouts;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfOverdues;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfFines;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected BigDecimal fineAmount;
    @XmlElementRef(name = "numberOfRefunds", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numberOfRefunds;
    @XmlElementRef(name = "refundAmount", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> refundAmount;

    /**
     * Gets the value of the libraryType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibraryType() {
        return libraryType;
    }

    /**
     * Sets the value of the libraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibraryType(Object value) {
        this.libraryType = value;
    }

    /**
     * Gets the value of the patronRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getPatronRefId() {
        return patronRefId;
    }

    /**
     * Sets the value of the patronRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setPatronRefId(GGenericRefIdPointerType value) {
        this.patronRefId = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link GElectronicIdList }
     *     
     */
    public GElectronicIdList getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GElectronicIdList }
     *     
     */
    public void setElectronicIdList(GElectronicIdList value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList }{@code >}
     *     
     */
    public JAXBElement<LibraryPatronStatusType.TransactionList> getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList }{@code >}
     *     
     */
    public void setTransactionList(JAXBElement<LibraryPatronStatusType.TransactionList> value) {
        this.transactionList = value;
    }

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.MessageList }{@code >}
     *     
     */
    public JAXBElement<LibraryPatronStatusType.MessageList> getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.MessageList }{@code >}
     *     
     */
    public void setMessageList(JAXBElement<LibraryPatronStatusType.MessageList> value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFineAmount() {
        return fineAmount;
    }

    /**
     * Sets the value of the fineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFineAmount(BigDecimal value) {
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
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRefundAmount(JAXBElement<BigDecimal> value) {
        this.refundAmount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="message" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="priority" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="Low"/>
     *                       &lt;enumeration value="Normal"/>
     *                       &lt;enumeration value="Urgent"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "message"
    })
    public static class MessageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LibraryPatronStatusType.MessageList.Message> message;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LibraryPatronStatusType.MessageList.Message }
         * 
         * 
         */
        public List<LibraryPatronStatusType.MessageList.Message> getMessage() {
            if (message == null) {
                message = new ArrayList<LibraryPatronStatusType.MessageList.Message>();
            }
            return this.message;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="priority" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="Low"/>
         *             &lt;enumeration value="Normal"/>
         *             &lt;enumeration value="Urgent"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sent",
            "text",
            "any"
        })
        public static class Message {

            @XmlElementRef(name = "sent", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> sent;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected String text;
            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "priority", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String priority;

            /**
             * Gets the value of the sent property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getSent() {
                return sent;
            }

            /**
             * Sets the value of the sent property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setSent(JAXBElement<XMLGregorianCalendar> value) {
                this.sent = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

            /**
             * Gets the value of the priority property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriority() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriority(String value) {
                this.priority = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="transaction" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="electronicId" type="{http://www.sifassociation.org/datamodel/na/3.3}gElectronicIdType" minOccurs="0"/>
     *                             &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="price" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;fractionDigits value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                 &lt;enumeration value="Asset"/>
     *                                 &lt;enumeration value="LibraryMaterial"/>
     *                                 &lt;enumeration value="Media"/>
     *                                 &lt;enumeration value="Textbook"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="checkout" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="returnBy" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fineList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fine" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dateAssessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="amount">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;fractionDigits value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="type" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                           &lt;enumeration value="Damaged"/>
     *                                           &lt;enumeration value="Lost"/>
     *                                           &lt;enumeration value="Overdue"/>
     *                                           &lt;enumeration value="Refund"/>
     *                                           &lt;enumeration value="Other"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="holdList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="hold" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="datePlaced" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="dateNeeded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="dateAvailable" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="type" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                           &lt;enumeration value="Ready"/>
     *                                           &lt;enumeration value="NotReady"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transaction"
    })
    public static class TransactionList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LibraryPatronStatusType.TransactionList.Transaction> transaction;

        /**
         * Gets the value of the transaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LibraryPatronStatusType.TransactionList.Transaction }
         * 
         * 
         */
        public List<LibraryPatronStatusType.TransactionList.Transaction> getTransaction() {
            if (transaction == null) {
                transaction = new ArrayList<LibraryPatronStatusType.TransactionList.Transaction>();
            }
            return this.transaction;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="electronicId" type="{http://www.sifassociation.org/datamodel/na/3.3}gElectronicIdType" minOccurs="0"/>
         *                   &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="price" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;fractionDigits value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                       &lt;enumeration value="Asset"/>
         *                       &lt;enumeration value="LibraryMaterial"/>
         *                       &lt;enumeration value="Media"/>
         *                       &lt;enumeration value="Textbook"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="checkout" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="returnBy" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fineList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fine" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dateAssessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="amount">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;fractionDigits value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="type" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                 &lt;enumeration value="Damaged"/>
         *                                 &lt;enumeration value="Lost"/>
         *                                 &lt;enumeration value="Overdue"/>
         *                                 &lt;enumeration value="Refund"/>
         *                                 &lt;enumeration value="Other"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="holdList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="hold" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="datePlaced" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="dateNeeded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="dateAvailable" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="type" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                 &lt;enumeration value="Ready"/>
         *                                 &lt;enumeration value="NotReady"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item",
            "checkout",
            "fineList",
            "holdList",
            "any"
        })
        public static class Transaction {

            @XmlElementRef(name = "item", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Item> item;
            @XmlElementRef(name = "checkout", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Checkout> checkout;
            @XmlElementRef(name = "fineList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.FineList> fineList;
            @XmlElementRef(name = "holdList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.HoldList> holdList;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Item }{@code >}
             *     
             */
            public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Item> getItem() {
                return item;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Item }{@code >}
             *     
             */
            public void setItem(JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Item> value) {
                this.item = value;
            }

            /**
             * Gets the value of the checkout property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Checkout }{@code >}
             *     
             */
            public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Checkout> getCheckout() {
                return checkout;
            }

            /**
             * Sets the value of the checkout property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Checkout }{@code >}
             *     
             */
            public void setCheckout(JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Checkout> value) {
                this.checkout = value;
            }

            /**
             * Gets the value of the fineList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.FineList }{@code >}
             *     
             */
            public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.FineList> getFineList() {
                return fineList;
            }

            /**
             * Sets the value of the fineList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.FineList }{@code >}
             *     
             */
            public void setFineList(JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.FineList> value) {
                this.fineList = value;
            }

            /**
             * Gets the value of the holdList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.HoldList }{@code >}
             *     
             */
            public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.HoldList> getHoldList() {
                return holdList;
            }

            /**
             * Sets the value of the holdList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.HoldList }{@code >}
             *     
             */
            public void setHoldList(JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.HoldList> value) {
                this.holdList = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="returnBy" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "returnBy"
            })
            public static class Checkout {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar returnBy;

                /**
                 * Gets the value of the returnBy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getReturnBy() {
                    return returnBy;
                }

                /**
                 * Sets the value of the returnBy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setReturnBy(XMLGregorianCalendar value) {
                    this.returnBy = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="fine" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dateAssessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="amount">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;fractionDigits value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="type" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                       &lt;enumeration value="Damaged"/>
             *                       &lt;enumeration value="Lost"/>
             *                       &lt;enumeration value="Overdue"/>
             *                       &lt;enumeration value="Refund"/>
             *                       &lt;enumeration value="Other"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fine"
            })
            public static class FineList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine> fine;

                /**
                 * Gets the value of the fine property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fine property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFine().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine }
                 * 
                 * 
                 */
                public List<LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine> getFine() {
                    if (fine == null) {
                        fine = new ArrayList<LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine>();
                    }
                    return this.fine;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="dateAssessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="amount">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;fractionDigits value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="type" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="Damaged"/>
                 *             &lt;enumeration value="Lost"/>
                 *             &lt;enumeration value="Overdue"/>
                 *             &lt;enumeration value="Refund"/>
                 *             &lt;enumeration value="Other"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "dateAssessed",
                    "description",
                    "amount",
                    "reference"
                })
                public static class Fine {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar dateAssessed;
                    @XmlElementRef(name = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> description;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    protected BigDecimal amount;
                    @XmlElementRef(name = "reference", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> reference;
                    @XmlAttribute(name = "type", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String type;

                    /**
                     * Gets the value of the dateAssessed property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateAssessed() {
                        return dateAssessed;
                    }

                    /**
                     * Sets the value of the dateAssessed property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateAssessed(XMLGregorianCalendar value) {
                        this.dateAssessed = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setDescription(JAXBElement<String> value) {
                        this.description = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getReference() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setReference(JAXBElement<String> value) {
                        this.reference = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="hold" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="datePlaced" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="dateNeeded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="dateAvailable" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="type" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                       &lt;enumeration value="Ready"/>
             *                       &lt;enumeration value="NotReady"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "hold"
            })
            public static class HoldList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold> hold;

                /**
                 * Gets the value of the hold property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hold property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHold().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold }
                 * 
                 * 
                 */
                public List<LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold> getHold() {
                    if (hold == null) {
                        hold = new ArrayList<LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold>();
                    }
                    return this.hold;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="datePlaced" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="dateNeeded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="dateAvailable" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="type" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="Ready"/>
                 *             &lt;enumeration value="NotReady"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "datePlaced",
                    "dateNeeded",
                    "dateAvailable",
                    "expires"
                })
                public static class Hold {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar datePlaced;
                    @XmlElementRef(name = "dateNeeded", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> dateNeeded;
                    @XmlElementRef(name = "dateAvailable", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> dateAvailable;
                    @XmlElementRef(name = "expires", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> expires;
                    @XmlAttribute(name = "type", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String type;

                    /**
                     * Gets the value of the datePlaced property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDatePlaced() {
                        return datePlaced;
                    }

                    /**
                     * Sets the value of the datePlaced property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDatePlaced(XMLGregorianCalendar value) {
                        this.datePlaced = value;
                    }

                    /**
                     * Gets the value of the dateNeeded property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getDateNeeded() {
                        return dateNeeded;
                    }

                    /**
                     * Sets the value of the dateNeeded property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setDateNeeded(JAXBElement<XMLGregorianCalendar> value) {
                        this.dateNeeded = value;
                    }

                    /**
                     * Gets the value of the dateAvailable property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getDateAvailable() {
                        return dateAvailable;
                    }

                    /**
                     * Sets the value of the dateAvailable property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setDateAvailable(JAXBElement<XMLGregorianCalendar> value) {
                        this.dateAvailable = value;
                    }

                    /**
                     * Gets the value of the expires property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getExpires() {
                        return expires;
                    }

                    /**
                     * Sets the value of the expires property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setExpires(JAXBElement<XMLGregorianCalendar> value) {
                        this.expires = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="electronicId" type="{http://www.sifassociation.org/datamodel/na/3.3}gElectronicIdType" minOccurs="0"/>
             *         &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="price" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;fractionDigits value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="type" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *             &lt;enumeration value="Asset"/>
             *             &lt;enumeration value="LibraryMaterial"/>
             *             &lt;enumeration value="Media"/>
             *             &lt;enumeration value="Textbook"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "title",
                "author",
                "electronicId",
                "callNumber",
                "price"
            })
            public static class Item {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                protected String title;
                @XmlElementRef(name = "author", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> author;
                @XmlElementRef(name = "electronicId", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<GElectronicIdType> electronicId;
                @XmlElementRef(name = "callNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> callNumber;
                @XmlElementRef(name = "price", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> price;
                @XmlAttribute(name = "type", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String type;

                /**
                 * Gets the value of the title property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Sets the value of the title property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Gets the value of the author property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getAuthor() {
                    return author;
                }

                /**
                 * Sets the value of the author property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setAuthor(JAXBElement<String> value) {
                    this.author = value;
                }

                /**
                 * Gets the value of the electronicId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link GElectronicIdType }{@code >}
                 *     
                 */
                public JAXBElement<GElectronicIdType> getElectronicId() {
                    return electronicId;
                }

                /**
                 * Sets the value of the electronicId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link GElectronicIdType }{@code >}
                 *     
                 */
                public void setElectronicId(JAXBElement<GElectronicIdType> value) {
                    this.electronicId = value;
                }

                /**
                 * Gets the value of the callNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCallNumber() {
                    return callNumber;
                }

                /**
                 * Sets the value of the callNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCallNumber(JAXBElement<String> value) {
                    this.callNumber = value;
                }

                /**
                 * Gets the value of the price property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public JAXBElement<BigDecimal> getPrice() {
                    return price;
                }

                /**
                 * Sets the value of the price property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public void setPrice(JAXBElement<BigDecimal> value) {
                    this.price = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }

    }

}
