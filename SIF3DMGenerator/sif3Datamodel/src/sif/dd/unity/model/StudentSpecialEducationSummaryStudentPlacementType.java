
package sif.dd.unity.model;

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
 * <p>Java class for StudentSpecialEducationSummaryStudentPlacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSpecialEducationSummaryStudentPlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementServiceType"/>
 *         &lt;element name="ServiceCategory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceFundingSources" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementServiceFundingSourceListType" minOccurs="0"/>
 *         &lt;element name="ServicingPublicAgency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="LEAInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServicingSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolWhereServiceDelivered" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceProviderType" type="{http://www.sifassociation.org/datamodel/na/4.x}ServiceProviderTypeType" minOccurs="0"/>
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FrequencyTime" type="{http://www.sifassociation.org/datamodel/na/4.x}FrequencyTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSpecialEducationSummaryStudentPlacementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "service",
    "serviceCategory",
    "serviceFundingSources",
    "servicingPublicAgency",
    "servicingSchool",
    "schoolWhereServiceDelivered",
    "serviceProviderType",
    "agencyType",
    "frequencyTime"
})
public class StudentSpecialEducationSummaryStudentPlacementType {

    @XmlElement(name = "Service", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentPlacementServiceType service;
    @XmlElement(name = "ServiceCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentPlacementType.ServiceCategory serviceCategory;
    @XmlElement(name = "ServiceFundingSources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementServiceFundingSourceListType serviceFundingSources;
    @XmlElement(name = "ServicingPublicAgency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentPlacementType.ServicingPublicAgency servicingPublicAgency;
    @XmlElement(name = "ServicingSchool", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentPlacementType.ServicingSchool servicingSchool;
    @XmlElement(name = "SchoolWhereServiceDelivered", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentPlacementType.SchoolWhereServiceDelivered schoolWhereServiceDelivered;
    @XmlElement(name = "ServiceProviderType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ServiceProviderTypeType serviceProviderType;
    @XmlElement(name = "AgencyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String agencyType;
    @XmlElement(name = "FrequencyTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FrequencyTimeType frequencyTime;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementServiceType }
     *     
     */
    public StudentPlacementServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementServiceType }
     *     
     */
    public void setService(StudentPlacementServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServiceCategory }
     *     
     */
    public StudentSpecialEducationSummaryStudentPlacementType.ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServiceCategory }
     *     
     */
    public void setServiceCategory(StudentSpecialEducationSummaryStudentPlacementType.ServiceCategory value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceFundingSources property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementServiceFundingSourceListType }
     *     
     */
    public StudentPlacementServiceFundingSourceListType getServiceFundingSources() {
        return serviceFundingSources;
    }

    /**
     * Sets the value of the serviceFundingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementServiceFundingSourceListType }
     *     
     */
    public void setServiceFundingSources(StudentPlacementServiceFundingSourceListType value) {
        this.serviceFundingSources = value;
    }

    /**
     * Gets the value of the servicingPublicAgency property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServicingPublicAgency }
     *     
     */
    public StudentSpecialEducationSummaryStudentPlacementType.ServicingPublicAgency getServicingPublicAgency() {
        return servicingPublicAgency;
    }

    /**
     * Sets the value of the servicingPublicAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServicingPublicAgency }
     *     
     */
    public void setServicingPublicAgency(StudentSpecialEducationSummaryStudentPlacementType.ServicingPublicAgency value) {
        this.servicingPublicAgency = value;
    }

    /**
     * Gets the value of the servicingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServicingSchool }
     *     
     */
    public StudentSpecialEducationSummaryStudentPlacementType.ServicingSchool getServicingSchool() {
        return servicingSchool;
    }

    /**
     * Sets the value of the servicingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.ServicingSchool }
     *     
     */
    public void setServicingSchool(StudentSpecialEducationSummaryStudentPlacementType.ServicingSchool value) {
        this.servicingSchool = value;
    }

    /**
     * Gets the value of the schoolWhereServiceDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.SchoolWhereServiceDelivered }
     *     
     */
    public StudentSpecialEducationSummaryStudentPlacementType.SchoolWhereServiceDelivered getSchoolWhereServiceDelivered() {
        return schoolWhereServiceDelivered;
    }

    /**
     * Sets the value of the schoolWhereServiceDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementType.SchoolWhereServiceDelivered }
     *     
     */
    public void setSchoolWhereServiceDelivered(StudentSpecialEducationSummaryStudentPlacementType.SchoolWhereServiceDelivered value) {
        this.schoolWhereServiceDelivered = value;
    }

    /**
     * Gets the value of the serviceProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderTypeType }
     *     
     */
    public ServiceProviderTypeType getServiceProviderType() {
        return serviceProviderType;
    }

    /**
     * Sets the value of the serviceProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderTypeType }
     *     
     */
    public void setServiceProviderType(ServiceProviderTypeType value) {
        this.serviceProviderType = value;
    }

    /**
     * Gets the value of the agencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * Sets the value of the agencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * Gets the value of the frequencyTime property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTimeType }
     *     
     */
    public FrequencyTimeType getFrequencyTime() {
        return frequencyTime;
    }

    /**
     * Sets the value of the frequencyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTimeType }
     *     
     */
    public void setFrequencyTime(FrequencyTimeType value) {
        this.frequencyTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
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
    public static class SchoolWhereServiceDelivered {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
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
    public static class ServiceCategory {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

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
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="LEAInfo"/>
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
    public static class ServicingPublicAgency {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
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
    public static class ServicingSchool {

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
