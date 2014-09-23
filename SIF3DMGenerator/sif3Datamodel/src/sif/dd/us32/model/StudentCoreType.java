
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents core or basic information about a student. This object supports events and consumers can request change events, but not create or delete events.
 * 
 * <p>Java class for studentCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}gNameOfRecordType"/>
 *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType"/>
 *         &lt;element name="stateId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="enrollmentOperation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="register"/>
 *               &lt;enumeration value="enroll"/>
 *               &lt;enumeration value="withdraw"/>
 *               &lt;enumeration value="suspend"/>
 *               &lt;enumeration value="transfer"/>
 *               &lt;enumeration value="no show"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="studentSchoolAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="transferFromSchoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="concurrentSchoolList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="concurrentSchool" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="operation">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="enroll"/>
 *                                   &lt;enumeration value="withdraw"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="studentSchoolAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentCoreType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "gradeLevel",
    "localId",
    "stateId",
    "sex",
    "birthDate",
    "enrollmentOperation",
    "studentRefId",
    "studentSchoolAssociationRefId",
    "schoolRefId",
    "schoolName",
    "entryDate",
    "exitDate",
    "transferFromSchoolRefId",
    "concurrentSchoolList"
})
public class StudentCoreType
    extends GSIFCompositeType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GNameOfRecordType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GYearGroupType gradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType stateId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GSexusType sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enrollmentOperation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true, nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentSchoolAssociationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected Object schoolName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transferFromSchoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected StudentCoreType.ConcurrentSchoolList concurrentSchoolList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GNameOfRecordType }
     *     
     */
    public GNameOfRecordType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNameOfRecordType }
     *     
     */
    public void setName(GNameOfRecordType value) {
        this.name = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupType }
     *     
     */
    public GYearGroupType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupType }
     *     
     */
    public void setGradeLevel(GYearGroupType value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setLocalId(GLocalIdType value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setStateId(GLocalIdType value) {
        this.stateId = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link GSexusType }
     *     
     */
    public GSexusType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSexusType }
     *     
     */
    public void setSex(GSexusType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the enrollmentOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentOperation() {
        return enrollmentOperation;
    }

    /**
     * Sets the value of the enrollmentOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentOperation(String value) {
        this.enrollmentOperation = value;
    }

    /**
     * Gets the value of the studentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentRefId() {
        return studentRefId;
    }

    /**
     * Sets the value of the studentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentRefId(String value) {
        this.studentRefId = value;
    }

    /**
     * Gets the value of the studentSchoolAssociationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSchoolAssociationRefId() {
        return studentSchoolAssociationRefId;
    }

    /**
     * Sets the value of the studentSchoolAssociationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSchoolAssociationRefId(String value) {
        this.studentSchoolAssociationRefId = value;
    }

    /**
     * Gets the value of the schoolRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * Sets the value of the schoolRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolRefId(String value) {
        this.schoolRefId = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSchoolName(Object value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitDate(XMLGregorianCalendar value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the transferFromSchoolRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromSchoolRefId() {
        return transferFromSchoolRefId;
    }

    /**
     * Sets the value of the transferFromSchoolRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromSchoolRefId(String value) {
        this.transferFromSchoolRefId = value;
    }

    /**
     * Gets the value of the concurrentSchoolList property.
     * 
     * @return
     *     possible object is
     *     {@link StudentCoreType.ConcurrentSchoolList }
     *     
     */
    public StudentCoreType.ConcurrentSchoolList getConcurrentSchoolList() {
        return concurrentSchoolList;
    }

    /**
     * Sets the value of the concurrentSchoolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentCoreType.ConcurrentSchoolList }
     *     
     */
    public void setConcurrentSchoolList(StudentCoreType.ConcurrentSchoolList value) {
        this.concurrentSchoolList = value;
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
     *         &lt;element name="concurrentSchool" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="operation">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="enroll"/>
     *                         &lt;enumeration value="withdraw"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="studentSchoolAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
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
        "concurrentSchool"
    })
    public static class ConcurrentSchoolList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<StudentCoreType.ConcurrentSchoolList.ConcurrentSchool> concurrentSchool;

        /**
         * Gets the value of the concurrentSchool property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concurrentSchool property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcurrentSchool().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentCoreType.ConcurrentSchoolList.ConcurrentSchool }
         * 
         * 
         */
        public List<StudentCoreType.ConcurrentSchoolList.ConcurrentSchool> getConcurrentSchool() {
            if (concurrentSchool == null) {
                concurrentSchool = new ArrayList<StudentCoreType.ConcurrentSchoolList.ConcurrentSchool>();
            }
            return this.concurrentSchool;
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
         *         &lt;element name="operation">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="enroll"/>
         *               &lt;enumeration value="withdraw"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="studentSchoolAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
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
            "operation",
            "entryDate",
            "exitDate",
            "schoolRefId",
            "schoolName",
            "studentSchoolAssociationRefId",
            "any"
        })
        public static class ConcurrentSchool {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String operation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar entryDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar exitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String schoolRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected Object schoolName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String studentSchoolAssociationRefId;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperation(String value) {
                this.operation = value;
            }

            /**
             * Gets the value of the entryDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEntryDate() {
                return entryDate;
            }

            /**
             * Sets the value of the entryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEntryDate(XMLGregorianCalendar value) {
                this.entryDate = value;
            }

            /**
             * Gets the value of the exitDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExitDate() {
                return exitDate;
            }

            /**
             * Sets the value of the exitDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExitDate(XMLGregorianCalendar value) {
                this.exitDate = value;
            }

            /**
             * Gets the value of the schoolRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolRefId() {
                return schoolRefId;
            }

            /**
             * Sets the value of the schoolRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolRefId(String value) {
                this.schoolRefId = value;
            }

            /**
             * Gets the value of the schoolName property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSchoolName() {
                return schoolName;
            }

            /**
             * Sets the value of the schoolName property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSchoolName(Object value) {
                this.schoolName = value;
            }

            /**
             * Gets the value of the studentSchoolAssociationRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentSchoolAssociationRefId() {
                return studentSchoolAssociationRefId;
            }

            /**
             * Sets the value of the studentSchoolAssociationRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentSchoolAssociationRefId(String value) {
                this.studentSchoolAssociationRefId = value;
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

        }

    }

}
