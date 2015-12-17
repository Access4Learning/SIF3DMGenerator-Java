
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *             This element provides a wrapper for data returned in response to a SIF_ExtendedQuery.  Used in SIF_Response
 *             and SIF_ReportObject.
 *           
 * 
 * <p>Java class for SIF_ExtendedQueryResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIF_ExtendedQueryResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIF_ColumnHeaders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SIF_Element" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *                           &lt;attribute name="ObjectName" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectNameType" />
 *                           &lt;attribute name="Alias">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                                 &lt;maxLength value="64"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SIF_Rows">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="R" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="C" type="{http://www.sifassociation.org/au/datamodel/3.4}SelectedContentType" maxOccurs="unbounded"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIF_ExtendedQueryResultsType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
    "sifColumnHeaders",
    "sifRows"
})
public class SIFExtendedQueryResultsType {

    @XmlElement(name = "SIF_ColumnHeaders", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
    protected SIFExtendedQueryResultsType.SIFColumnHeaders sifColumnHeaders;
    @XmlElement(name = "SIF_Rows", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
    protected SIFExtendedQueryResultsType.SIFRows sifRows;

    /**
     * Gets the value of the sifColumnHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedQueryResultsType.SIFColumnHeaders }
     *     
     */
    public SIFExtendedQueryResultsType.SIFColumnHeaders getSIFColumnHeaders() {
        return sifColumnHeaders;
    }

    /**
     * Sets the value of the sifColumnHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedQueryResultsType.SIFColumnHeaders }
     *     
     */
    public void setSIFColumnHeaders(SIFExtendedQueryResultsType.SIFColumnHeaders value) {
        this.sifColumnHeaders = value;
    }

    /**
     * Gets the value of the sifRows property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedQueryResultsType.SIFRows }
     *     
     */
    public SIFExtendedQueryResultsType.SIFRows getSIFRows() {
        return sifRows;
    }

    /**
     * Sets the value of the sifRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedQueryResultsType.SIFRows }
     *     
     */
    public void setSIFRows(SIFExtendedQueryResultsType.SIFRows value) {
        this.sifRows = value;
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
     *         &lt;element name="SIF_Element" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
     *                 &lt;attribute name="ObjectName" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectNameType" />
     *                 &lt;attribute name="Alias">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *                       &lt;maxLength value="64"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "sifElement"
    })
    public static class SIFColumnHeaders {

        @XmlElement(name = "SIF_Element", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
        protected List<SIFExtendedQueryResultsType.SIFColumnHeaders.SIFElement> sifElement;

        /**
         * Gets the value of the sifElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sifElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIFElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIFExtendedQueryResultsType.SIFColumnHeaders.SIFElement }
         * 
         * 
         */
        public List<SIFExtendedQueryResultsType.SIFColumnHeaders.SIFElement> getSIFElement() {
            if (sifElement == null) {
                sifElement = new ArrayList<SIFExtendedQueryResultsType.SIFColumnHeaders.SIFElement>();
            }
            return this.sifElement;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
         *       &lt;attribute name="ObjectName" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectNameType" />
         *       &lt;attribute name="Alias">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
         *             &lt;maxLength value="64"/>
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
        public static class SIFElement {

            @XmlValue
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String value;
            @XmlAttribute(name = "ObjectName", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String objectName;
            @XmlAttribute(name = "Alias")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String alias;

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
             * Gets the value of the objectName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectName() {
                return objectName;
            }

            /**
             * Sets the value of the objectName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectName(String value) {
                this.objectName = value;
            }

            /**
             * Gets the value of the alias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlias() {
                return alias;
            }

            /**
             * Sets the value of the alias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlias(String value) {
                this.alias = value;
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
     *         &lt;element name="R" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="C" type="{http://www.sifassociation.org/au/datamodel/3.4}SelectedContentType" maxOccurs="unbounded"/>
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
        "r"
    })
    public static class SIFRows {

        @XmlElement(name = "R", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
        protected List<SIFExtendedQueryResultsType.SIFRows.R> r;

        /**
         * Gets the value of the r property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the r property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIFExtendedQueryResultsType.SIFRows.R }
         * 
         * 
         */
        public List<SIFExtendedQueryResultsType.SIFRows.R> getR() {
            if (r == null) {
                r = new ArrayList<SIFExtendedQueryResultsType.SIFRows.R>();
            }
            return this.r;
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
         *         &lt;element name="C" type="{http://www.sifassociation.org/au/datamodel/3.4}SelectedContentType" maxOccurs="unbounded"/>
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
            "c"
        })
        public static class R {

            @XmlElement(name = "C", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
            protected List<SelectedContentType> c;

            /**
             * Gets the value of the c property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the c property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SelectedContentType }
             * 
             * 
             */
            public List<SelectedContentType> getC() {
                if (c == null) {
                    c = new ArrayList<SelectedContentType>();
                }
                return this.c;
            }

        }

    }

}
