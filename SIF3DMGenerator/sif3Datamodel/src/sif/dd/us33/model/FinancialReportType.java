
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A flat-file layout report for financial education information that follows the education Chart of Accounts methodology. 
 * 
 * <p>Java class for financialReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.3}gStateProvinceType"/>
 *         &lt;element name="fiscalYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="reportPeriod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="record" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="accountId" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
 *                             &lt;element name="fund" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
 *                             &lt;element name="levelOfInstruction" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="function" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="object" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="program" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="facility" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="project" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="source" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                             &lt;element name="amount">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialReportType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "reportDate",
    "stateProvinceId",
    "fiscalYear",
    "reportPeriod",
    "recordList"
})
public class FinancialReportType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GStateProvinceType stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fiscalYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected FinancialReportType.ReportPeriod reportPeriod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected FinancialReportType.RecordList recordList;

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link GStateProvinceType }
     *     
     */
    public GStateProvinceType getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStateProvinceType }
     *     
     */
    public void setStateProvinceId(GStateProvinceType value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYear(String value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the reportPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialReportType.ReportPeriod }
     *     
     */
    public FinancialReportType.ReportPeriod getReportPeriod() {
        return reportPeriod;
    }

    /**
     * Sets the value of the reportPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialReportType.ReportPeriod }
     *     
     */
    public void setReportPeriod(FinancialReportType.ReportPeriod value) {
        this.reportPeriod = value;
    }

    /**
     * Gets the value of the recordList property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialReportType.RecordList }
     *     
     */
    public FinancialReportType.RecordList getRecordList() {
        return recordList;
    }

    /**
     * Sets the value of the recordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialReportType.RecordList }
     *     
     */
    public void setRecordList(FinancialReportType.RecordList value) {
        this.recordList = value;
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
     *         &lt;element name="record" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="accountId" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
     *                   &lt;element name="fund" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
     *                   &lt;element name="levelOfInstruction" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="function" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="object" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="program" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="facility" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="project" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="source" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *                   &lt;element name="amount">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "record"
    })
    public static class RecordList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<FinancialReportType.RecordList.Record> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FinancialReportType.RecordList.Record }
         * 
         * 
         */
        public List<FinancialReportType.RecordList.Record> getRecord() {
            if (record == null) {
                record = new ArrayList<FinancialReportType.RecordList.Record>();
            }
            return this.record;
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
         *         &lt;element name="accountId" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
         *         &lt;element name="fund" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType"/>
         *         &lt;element name="levelOfInstruction" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="function" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="object" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="program" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="facility" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="project" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="source" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
         *         &lt;element name="amount">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "accountId",
            "fund",
            "levelOfInstruction",
            "function",
            "object",
            "program",
            "facility",
            "project",
            "source",
            "amount"
        })
        public static class Record {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected GCodedElementType accountId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected GCodedElementType fund;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType levelOfInstruction;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType function;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType object;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType program;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType facility;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType project;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GCodedElementType source;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected BigDecimal amount;

            /**
             * Gets the value of the accountId property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getAccountId() {
                return accountId;
            }

            /**
             * Sets the value of the accountId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setAccountId(GCodedElementType value) {
                this.accountId = value;
            }

            /**
             * Gets the value of the fund property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getFund() {
                return fund;
            }

            /**
             * Sets the value of the fund property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setFund(GCodedElementType value) {
                this.fund = value;
            }

            /**
             * Gets the value of the levelOfInstruction property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getLevelOfInstruction() {
                return levelOfInstruction;
            }

            /**
             * Sets the value of the levelOfInstruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setLevelOfInstruction(GCodedElementType value) {
                this.levelOfInstruction = value;
            }

            /**
             * Gets the value of the function property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getFunction() {
                return function;
            }

            /**
             * Sets the value of the function property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setFunction(GCodedElementType value) {
                this.function = value;
            }

            /**
             * Gets the value of the object property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getObject() {
                return object;
            }

            /**
             * Sets the value of the object property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setObject(GCodedElementType value) {
                this.object = value;
            }

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getProgram() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setProgram(GCodedElementType value) {
                this.program = value;
            }

            /**
             * Gets the value of the facility property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getFacility() {
                return facility;
            }

            /**
             * Sets the value of the facility property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setFacility(GCodedElementType value) {
                this.facility = value;
            }

            /**
             * Gets the value of the project property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getProject() {
                return project;
            }

            /**
             * Sets the value of the project property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setProject(GCodedElementType value) {
                this.project = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link GCodedElementType }
             *     
             */
            public GCodedElementType getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link GCodedElementType }
             *     
             */
            public void setSource(GCodedElementType value) {
                this.source = value;
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "startDate",
        "endDate"
    })
    public static class ReportPeriod {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}
