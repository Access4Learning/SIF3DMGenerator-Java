
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for seaCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seaCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stateAgencyIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="street" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryContactIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="webSiteAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="addressList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="street" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="eMail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="electronicMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="electronicMailAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherNameList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="telephone" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="finance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="financialAccountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountFundClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountingPeriodActualValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountingPeriodBudgetedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialBalanceSheetAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialExpenditureFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialExpenditureObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoAYPProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteGraduationRateInclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="federalFunds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="federalProgramCodeList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="federalProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="federalProgramsFundingAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="federalProgramsFundingAllocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateTransferabilityOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateStateReceivedTitleIIIAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateTitleIIIFundsAvailableToSubgrantees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfDaysForTitleIIISubgrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="usesOfFundsNonStandardsAndAssessmentDevelopment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seaCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identification",
    "addressList",
    "contact",
    "finance",
    "accountability",
    "federalFunds"
})
public class SeaCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.Identification identification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.Finance finance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.Accountability accountability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SeaCEDSType.FederalFunds federalFunds;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.Identification }
     *     
     */
    public SeaCEDSType.Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.Identification }
     *     
     */
    public void setIdentification(SeaCEDSType.Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.AddressList }
     *     
     */
    public SeaCEDSType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.AddressList }
     *     
     */
    public void setAddressList(SeaCEDSType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.Contact }
     *     
     */
    public SeaCEDSType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.Contact }
     *     
     */
    public void setContact(SeaCEDSType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the finance property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.Finance }
     *     
     */
    public SeaCEDSType.Finance getFinance() {
        return finance;
    }

    /**
     * Sets the value of the finance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.Finance }
     *     
     */
    public void setFinance(SeaCEDSType.Finance value) {
        this.finance = value;
    }

    /**
     * Gets the value of the accountability property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.Accountability }
     *     
     */
    public SeaCEDSType.Accountability getAccountability() {
        return accountability;
    }

    /**
     * Sets the value of the accountability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.Accountability }
     *     
     */
    public void setAccountability(SeaCEDSType.Accountability value) {
        this.accountability = value;
    }

    /**
     * Gets the value of the federalFunds property.
     * 
     * @return
     *     possible object is
     *     {@link SeaCEDSType.FederalFunds }
     *     
     */
    public SeaCEDSType.FederalFunds getFederalFunds() {
        return federalFunds;
    }

    /**
     * Sets the value of the federalFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaCEDSType.FederalFunds }
     *     
     */
    public void setFederalFunds(SeaCEDSType.FederalFunds value) {
        this.federalFunds = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoAYPProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteGraduationRateInclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "aypStatus",
        "amaoAYPProgressLEPStudents",
        "amaoProficiencyLEPStudents",
        "amaoProgressLEPStudents",
        "cteGraduationRateInclusion"
    })
    public static class Accountability {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoAYPProgressLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProficiencyLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProgressLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteGraduationRateInclusion;

        /**
         * Gets the value of the aypStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAypStatus() {
            return aypStatus;
        }

        /**
         * Sets the value of the aypStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAypStatus(String value) {
            this.aypStatus = value;
        }

        /**
         * Gets the value of the amaoAYPProgressLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoAYPProgressLEPStudents() {
            return amaoAYPProgressLEPStudents;
        }

        /**
         * Sets the value of the amaoAYPProgressLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoAYPProgressLEPStudents(String value) {
            this.amaoAYPProgressLEPStudents = value;
        }

        /**
         * Gets the value of the amaoProficiencyLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoProficiencyLEPStudents() {
            return amaoProficiencyLEPStudents;
        }

        /**
         * Sets the value of the amaoProficiencyLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoProficiencyLEPStudents(String value) {
            this.amaoProficiencyLEPStudents = value;
        }

        /**
         * Gets the value of the amaoProgressLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoProgressLEPStudents() {
            return amaoProgressLEPStudents;
        }

        /**
         * Sets the value of the amaoProgressLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoProgressLEPStudents(String value) {
            this.amaoProgressLEPStudents = value;
        }

        /**
         * Gets the value of the cteGraduationRateInclusion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteGraduationRateInclusion() {
            return cteGraduationRateInclusion;
        }

        /**
         * Sets the value of the cteGraduationRateInclusion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteGraduationRateInclusion(String value) {
            this.cteGraduationRateInclusion = value;
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
     *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="street" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "address"
    })
    public static class AddressList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<SeaCEDSType.AddressList.Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeaCEDSType.AddressList.Address }
         * 
         * 
         */
        public List<SeaCEDSType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<SeaCEDSType.AddressList.Address>();
            }
            return this.address;
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
         *         &lt;element name="street" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "street",
            "city",
            "stateProvince",
            "postalCode",
            "stateANSICode"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SeaCEDSType.AddressList.Address.Street street;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateANSICode;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link SeaCEDSType.AddressList.Address.Street }
             *     
             */
            public SeaCEDSType.AddressList.Address.Street getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeaCEDSType.AddressList.Address.Street }
             *     
             */
            public void setStreet(SeaCEDSType.AddressList.Address.Street value) {
                this.street = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the stateProvince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProvince() {
                return stateProvince;
            }

            /**
             * Sets the value of the stateProvince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProvince(String value) {
                this.stateProvince = value;
            }

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Gets the value of the stateANSICode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateANSICode() {
                return stateANSICode;
            }

            /**
             * Sets the value of the stateANSICode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateANSICode(String value) {
                this.stateANSICode = value;
            }

            /**
             * Gets the value of the addressType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressType() {
                return addressType;
            }

            /**
             * Sets the value of the addressType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressType(String value) {
                this.addressType = value;
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
             *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "line1",
                "apartmentNumber"
            })
            public static class Street {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String line1;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String apartmentNumber;

                /**
                 * Gets the value of the line1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLine1() {
                    return line1;
                }

                /**
                 * Sets the value of the line1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLine1(String value) {
                    this.line1 = value;
                }

                /**
                 * Gets the value of the apartmentNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApartmentNumber() {
                    return apartmentNumber;
                }

                /**
                 * Sets the value of the apartmentNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApartmentNumber(String value) {
                    this.apartmentNumber = value;
                }

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
     *         &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryContactIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="webSiteAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="addressList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="street" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="eMail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="electronicMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="electronicMailAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherNameList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="telephone" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "positionTitle",
        "primaryContactIndicator",
        "webSiteAddress",
        "name",
        "addressList",
        "eMail",
        "otherNameList",
        "telephone"
    })
    public static class Contact {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String positionTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String primaryContactIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String webSiteAddress;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.Contact.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.Contact.EMail eMail;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.Contact.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.Contact.Telephone telephone;

        /**
         * Gets the value of the positionTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionTitle() {
            return positionTitle;
        }

        /**
         * Sets the value of the positionTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionTitle(String value) {
            this.positionTitle = value;
        }

        /**
         * Gets the value of the primaryContactIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryContactIndicator() {
            return primaryContactIndicator;
        }

        /**
         * Sets the value of the primaryContactIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryContactIndicator(String value) {
            this.primaryContactIndicator = value;
        }

        /**
         * Gets the value of the webSiteAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebSiteAddress() {
            return webSiteAddress;
        }

        /**
         * Sets the value of the webSiteAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebSiteAddress(String value) {
            this.webSiteAddress = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.Contact.Name }
         *     
         */
        public SeaCEDSType.Contact.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.Contact.Name }
         *     
         */
        public void setName(SeaCEDSType.Contact.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.Contact.AddressList }
         *     
         */
        public SeaCEDSType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.Contact.AddressList }
         *     
         */
        public void setAddressList(SeaCEDSType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.Contact.EMail }
         *     
         */
        public SeaCEDSType.Contact.EMail getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.Contact.EMail }
         *     
         */
        public void setEMail(SeaCEDSType.Contact.EMail value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.Contact.OtherNameList }
         *     
         */
        public SeaCEDSType.Contact.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.Contact.OtherNameList }
         *     
         */
        public void setOtherNameList(SeaCEDSType.Contact.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the telephone property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.Contact.Telephone }
         *     
         */
        public SeaCEDSType.Contact.Telephone getTelephone() {
            return telephone;
        }

        /**
         * Sets the value of the telephone property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.Contact.Telephone }
         *     
         */
        public void setTelephone(SeaCEDSType.Contact.Telephone value) {
            this.telephone = value;
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
         *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="street" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "address"
        })
        public static class AddressList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<SeaCEDSType.Contact.AddressList.Address> address;

            /**
             * Gets the value of the address property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the address property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddress().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeaCEDSType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<SeaCEDSType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<SeaCEDSType.Contact.AddressList.Address>();
                }
                return this.address;
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
             *         &lt;element name="street" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "street",
                "city",
                "stateProvince",
                "postalCode",
                "stateANSICode"
            })
            public static class Address {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected SeaCEDSType.Contact.AddressList.Address.Street street;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String city;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String stateProvince;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String postalCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String stateANSICode;
                @XmlAttribute(name = "addressType")
                protected String addressType;

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeaCEDSType.Contact.AddressList.Address.Street }
                 *     
                 */
                public SeaCEDSType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeaCEDSType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(SeaCEDSType.Contact.AddressList.Address.Street value) {
                    this.street = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the stateProvince property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvince() {
                    return stateProvince;
                }

                /**
                 * Sets the value of the stateProvince property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvince(String value) {
                    this.stateProvince = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the stateANSICode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateANSICode() {
                    return stateANSICode;
                }

                /**
                 * Sets the value of the stateANSICode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateANSICode(String value) {
                    this.stateANSICode = value;
                }

                /**
                 * Gets the value of the addressType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressType() {
                    return addressType;
                }

                /**
                 * Sets the value of the addressType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressType(String value) {
                    this.addressType = value;
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
                 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "line1",
                    "apartmentNumber"
                })
                public static class Street {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String line1;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String apartmentNumber;

                    /**
                     * Gets the value of the line1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLine1() {
                        return line1;
                    }

                    /**
                     * Sets the value of the line1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLine1(String value) {
                        this.line1 = value;
                    }

                    /**
                     * Gets the value of the apartmentNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getApartmentNumber() {
                        return apartmentNumber;
                    }

                    /**
                     * Sets the value of the apartmentNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setApartmentNumber(String value) {
                        this.apartmentNumber = value;
                    }

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
         *         &lt;element name="electronicMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="electronicMailAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "electronicMailAddress",
            "electronicMailAddressType"
        })
        public static class EMail {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String electronicMailAddress;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String electronicMailAddressType;

            /**
             * Gets the value of the electronicMailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElectronicMailAddress() {
                return electronicMailAddress;
            }

            /**
             * Sets the value of the electronicMailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElectronicMailAddress(String value) {
                this.electronicMailAddress = value;
            }

            /**
             * Gets the value of the electronicMailAddressType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElectronicMailAddressType() {
                return electronicMailAddressType;
            }

            /**
             * Sets the value of the electronicMailAddressType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElectronicMailAddressType(String value) {
                this.electronicMailAddressType = value;
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
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "firstName",
            "middleName",
            "lastOrSurname",
            "generationCodeOrSuffix",
            "personalTitleOrPrefix"
        })
        public static class Name {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String firstName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String middleName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String lastOrSurname;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String generationCodeOrSuffix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String personalTitleOrPrefix;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the middleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiddleName() {
                return middleName;
            }

            /**
             * Sets the value of the middleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiddleName(String value) {
                this.middleName = value;
            }

            /**
             * Gets the value of the lastOrSurname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastOrSurname() {
                return lastOrSurname;
            }

            /**
             * Sets the value of the lastOrSurname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastOrSurname(String value) {
                this.lastOrSurname = value;
            }

            /**
             * Gets the value of the generationCodeOrSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenerationCodeOrSuffix() {
                return generationCodeOrSuffix;
            }

            /**
             * Sets the value of the generationCodeOrSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenerationCodeOrSuffix(String value) {
                this.generationCodeOrSuffix = value;
            }

            /**
             * Gets the value of the personalTitleOrPrefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonalTitleOrPrefix() {
                return personalTitleOrPrefix;
            }

            /**
             * Sets the value of the personalTitleOrPrefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonalTitleOrPrefix(String value) {
                this.personalTitleOrPrefix = value;
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
         *         &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "otherName"
        })
        public static class OtherNameList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<SeaCEDSType.Contact.OtherNameList.OtherName> otherName;

            /**
             * Gets the value of the otherName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeaCEDSType.Contact.OtherNameList.OtherName }
             * 
             * 
             */
            public List<SeaCEDSType.Contact.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<SeaCEDSType.Contact.OtherNameList.OtherName>();
                }
                return this.otherName;
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
             *         &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "otherFirstName",
                "otherLastName",
                "otherMiddleName",
                "otherName"
            })
            public static class OtherName {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherFirstName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherLastName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherMiddleName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherName;
                @XmlAttribute(name = "otherNameType")
                protected String otherNameType;

                /**
                 * Gets the value of the otherFirstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherFirstName() {
                    return otherFirstName;
                }

                /**
                 * Sets the value of the otherFirstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherFirstName(String value) {
                    this.otherFirstName = value;
                }

                /**
                 * Gets the value of the otherLastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherLastName() {
                    return otherLastName;
                }

                /**
                 * Sets the value of the otherLastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherLastName(String value) {
                    this.otherLastName = value;
                }

                /**
                 * Gets the value of the otherMiddleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherMiddleName() {
                    return otherMiddleName;
                }

                /**
                 * Sets the value of the otherMiddleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherMiddleName(String value) {
                    this.otherMiddleName = value;
                }

                /**
                 * Gets the value of the otherName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherName() {
                    return otherName;
                }

                /**
                 * Sets the value of the otherName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherName(String value) {
                    this.otherName = value;
                }

                /**
                 * Gets the value of the otherNameType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherNameType() {
                    return otherNameType;
                }

                /**
                 * Sets the value of the otherNameType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherNameType(String value) {
                    this.otherNameType = value;
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
         *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "telephoneNumber",
            "telephoneNumberType",
            "primaryTelephoneNumberIndicator"
        })
        public static class Telephone {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String telephoneNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String telephoneNumberType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String primaryTelephoneNumberIndicator;

            /**
             * Gets the value of the telephoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumber() {
                return telephoneNumber;
            }

            /**
             * Sets the value of the telephoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumber(String value) {
                this.telephoneNumber = value;
            }

            /**
             * Gets the value of the telephoneNumberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumberType() {
                return telephoneNumberType;
            }

            /**
             * Sets the value of the telephoneNumberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumberType(String value) {
                this.telephoneNumberType = value;
            }

            /**
             * Gets the value of the primaryTelephoneNumberIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryTelephoneNumberIndicator() {
                return primaryTelephoneNumberIndicator;
            }

            /**
             * Sets the value of the primaryTelephoneNumberIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryTelephoneNumberIndicator(String value) {
                this.primaryTelephoneNumberIndicator = value;
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
     *         &lt;element name="federalProgramCodeList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="federalProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="federalProgramsFundingAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="federalProgramsFundingAllocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateTransferabilityOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dateStateReceivedTitleIIIAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dateTitleIIIFundsAvailableToSubgrantees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfDaysForTitleIIISubgrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="usesOfFundsNonStandardsAndAssessmentDevelopment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "federalProgramCodeList",
        "federalProgramsFundingAllocation",
        "federalProgramsFundingAllocationType",
        "stateTransferabilityOfFunds",
        "dateStateReceivedTitleIIIAllocation",
        "dateTitleIIIFundsAvailableToSubgrantees",
        "numberOfDaysForTitleIIISubgrants",
        "usesOfFundsNonStandardsAndAssessmentDevelopment"
    })
    public static class FederalFunds {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SeaCEDSType.FederalFunds.FederalProgramCodeList federalProgramCodeList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String federalProgramsFundingAllocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String federalProgramsFundingAllocationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateTransferabilityOfFunds;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String dateStateReceivedTitleIIIAllocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String dateTitleIIIFundsAvailableToSubgrantees;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfDaysForTitleIIISubgrants;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String usesOfFundsNonStandardsAndAssessmentDevelopment;

        /**
         * Gets the value of the federalProgramCodeList property.
         * 
         * @return
         *     possible object is
         *     {@link SeaCEDSType.FederalFunds.FederalProgramCodeList }
         *     
         */
        public SeaCEDSType.FederalFunds.FederalProgramCodeList getFederalProgramCodeList() {
            return federalProgramCodeList;
        }

        /**
         * Sets the value of the federalProgramCodeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeaCEDSType.FederalFunds.FederalProgramCodeList }
         *     
         */
        public void setFederalProgramCodeList(SeaCEDSType.FederalFunds.FederalProgramCodeList value) {
            this.federalProgramCodeList = value;
        }

        /**
         * Gets the value of the federalProgramsFundingAllocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederalProgramsFundingAllocation() {
            return federalProgramsFundingAllocation;
        }

        /**
         * Sets the value of the federalProgramsFundingAllocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederalProgramsFundingAllocation(String value) {
            this.federalProgramsFundingAllocation = value;
        }

        /**
         * Gets the value of the federalProgramsFundingAllocationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederalProgramsFundingAllocationType() {
            return federalProgramsFundingAllocationType;
        }

        /**
         * Sets the value of the federalProgramsFundingAllocationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederalProgramsFundingAllocationType(String value) {
            this.federalProgramsFundingAllocationType = value;
        }

        /**
         * Gets the value of the stateTransferabilityOfFunds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateTransferabilityOfFunds() {
            return stateTransferabilityOfFunds;
        }

        /**
         * Sets the value of the stateTransferabilityOfFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateTransferabilityOfFunds(String value) {
            this.stateTransferabilityOfFunds = value;
        }

        /**
         * Gets the value of the dateStateReceivedTitleIIIAllocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateStateReceivedTitleIIIAllocation() {
            return dateStateReceivedTitleIIIAllocation;
        }

        /**
         * Sets the value of the dateStateReceivedTitleIIIAllocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateStateReceivedTitleIIIAllocation(String value) {
            this.dateStateReceivedTitleIIIAllocation = value;
        }

        /**
         * Gets the value of the dateTitleIIIFundsAvailableToSubgrantees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateTitleIIIFundsAvailableToSubgrantees() {
            return dateTitleIIIFundsAvailableToSubgrantees;
        }

        /**
         * Sets the value of the dateTitleIIIFundsAvailableToSubgrantees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateTitleIIIFundsAvailableToSubgrantees(String value) {
            this.dateTitleIIIFundsAvailableToSubgrantees = value;
        }

        /**
         * Gets the value of the numberOfDaysForTitleIIISubgrants property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfDaysForTitleIIISubgrants() {
            return numberOfDaysForTitleIIISubgrants;
        }

        /**
         * Sets the value of the numberOfDaysForTitleIIISubgrants property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfDaysForTitleIIISubgrants(String value) {
            this.numberOfDaysForTitleIIISubgrants = value;
        }

        /**
         * Gets the value of the usesOfFundsNonStandardsAndAssessmentDevelopment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsesOfFundsNonStandardsAndAssessmentDevelopment() {
            return usesOfFundsNonStandardsAndAssessmentDevelopment;
        }

        /**
         * Sets the value of the usesOfFundsNonStandardsAndAssessmentDevelopment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsesOfFundsNonStandardsAndAssessmentDevelopment(String value) {
            this.usesOfFundsNonStandardsAndAssessmentDevelopment = value;
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
         *         &lt;element name="federalProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "federalProgramCode"
        })
        public static class FederalProgramCodeList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<String> federalProgramCode;

            /**
             * Gets the value of the federalProgramCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the federalProgramCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFederalProgramCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFederalProgramCode() {
                if (federalProgramCode == null) {
                    federalProgramCode = new ArrayList<String>();
                }
                return this.federalProgramCode;
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
     *         &lt;element name="financialAccountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountFundClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountingPeriodActualValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountingPeriodBudgetedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialBalanceSheetAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialExpenditureFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialExpenditureObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "financialAccountCategory",
        "financialAccountDescription",
        "financialAccountFundClassification",
        "financialAccountName",
        "financialAccountProgramCode",
        "financialAccountingPeriodActualValue",
        "financialAccountingPeriodBudgetedValue",
        "financialBalanceSheetAccountCode",
        "financialExpenditureFunctionCode",
        "financialExpenditureObjectCode"
    })
    public static class Finance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountFundClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountProgramCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountingPeriodActualValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountingPeriodBudgetedValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialBalanceSheetAccountCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialExpenditureFunctionCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialExpenditureObjectCode;

        /**
         * Gets the value of the financialAccountCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountCategory() {
            return financialAccountCategory;
        }

        /**
         * Sets the value of the financialAccountCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountCategory(String value) {
            this.financialAccountCategory = value;
        }

        /**
         * Gets the value of the financialAccountDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountDescription() {
            return financialAccountDescription;
        }

        /**
         * Sets the value of the financialAccountDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountDescription(String value) {
            this.financialAccountDescription = value;
        }

        /**
         * Gets the value of the financialAccountFundClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountFundClassification() {
            return financialAccountFundClassification;
        }

        /**
         * Sets the value of the financialAccountFundClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountFundClassification(String value) {
            this.financialAccountFundClassification = value;
        }

        /**
         * Gets the value of the financialAccountName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountName() {
            return financialAccountName;
        }

        /**
         * Sets the value of the financialAccountName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountName(String value) {
            this.financialAccountName = value;
        }

        /**
         * Gets the value of the financialAccountProgramCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountProgramCode() {
            return financialAccountProgramCode;
        }

        /**
         * Sets the value of the financialAccountProgramCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountProgramCode(String value) {
            this.financialAccountProgramCode = value;
        }

        /**
         * Gets the value of the financialAccountingPeriodActualValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountingPeriodActualValue() {
            return financialAccountingPeriodActualValue;
        }

        /**
         * Sets the value of the financialAccountingPeriodActualValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountingPeriodActualValue(String value) {
            this.financialAccountingPeriodActualValue = value;
        }

        /**
         * Gets the value of the financialAccountingPeriodBudgetedValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountingPeriodBudgetedValue() {
            return financialAccountingPeriodBudgetedValue;
        }

        /**
         * Sets the value of the financialAccountingPeriodBudgetedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountingPeriodBudgetedValue(String value) {
            this.financialAccountingPeriodBudgetedValue = value;
        }

        /**
         * Gets the value of the financialBalanceSheetAccountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialBalanceSheetAccountCode() {
            return financialBalanceSheetAccountCode;
        }

        /**
         * Sets the value of the financialBalanceSheetAccountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialBalanceSheetAccountCode(String value) {
            this.financialBalanceSheetAccountCode = value;
        }

        /**
         * Gets the value of the financialExpenditureFunctionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialExpenditureFunctionCode() {
            return financialExpenditureFunctionCode;
        }

        /**
         * Sets the value of the financialExpenditureFunctionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialExpenditureFunctionCode(String value) {
            this.financialExpenditureFunctionCode = value;
        }

        /**
         * Gets the value of the financialExpenditureObjectCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialExpenditureObjectCode() {
            return financialExpenditureObjectCode;
        }

        /**
         * Sets the value of the financialExpenditureObjectCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialExpenditureObjectCode(String value) {
            this.financialExpenditureObjectCode = value;
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
     *         &lt;element name="stateAgencyIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "stateAgencyIdentificationSystem",
        "stateAgencyIdentifier",
        "name",
        "organizationType"
    })
    public static class Identification {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateAgencyIdentificationSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateAgencyIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationType;

        /**
         * Gets the value of the stateAgencyIdentificationSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateAgencyIdentificationSystem() {
            return stateAgencyIdentificationSystem;
        }

        /**
         * Sets the value of the stateAgencyIdentificationSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateAgencyIdentificationSystem(String value) {
            this.stateAgencyIdentificationSystem = value;
        }

        /**
         * Gets the value of the stateAgencyIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateAgencyIdentifier() {
            return stateAgencyIdentifier;
        }

        /**
         * Sets the value of the stateAgencyIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateAgencyIdentifier(String value) {
            this.stateAgencyIdentifier = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the organizationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationType() {
            return organizationType;
        }

        /**
         * Sets the value of the organizationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationType(String value) {
            this.organizationType = value;
        }

    }

}
