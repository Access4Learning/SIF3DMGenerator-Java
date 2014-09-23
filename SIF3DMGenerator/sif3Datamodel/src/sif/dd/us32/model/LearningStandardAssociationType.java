
package sif.dd.us32.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object associates a learning standard with particular learning resources.  
 * 
 * <p>Java class for learningStandardAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gAssociationType">
 *       &lt;sequence>
 *         &lt;element name="refURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="learningStandardRefId">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gGenericRefIdPointerType">
 *                 &lt;attribute name="sif_Object" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gObjectNameType" />
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="targetObjectList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="targetObject" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="targetObjectRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
 *                             &lt;element name="associationStrength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="associationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="authoritativeSource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="associationCreator" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="creatorRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningStandardAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "refURI",
    "learningStandardRefId",
    "targetObjectList",
    "startDate",
    "endDate",
    "authoritativeSource",
    "associationCreator",
    "creationDate"
})
public class LearningStandardAssociationType
    extends GAssociationType
{

    @XmlElementRef(name = "refURI", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refURI;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected LearningStandardAssociationType.LearningStandardRefId learningStandardRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected LearningStandardAssociationType.TargetObjectList targetObjectList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String authoritativeSource;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LearningStandardAssociationType.AssociationCreator associationCreator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;

    /**
     * Gets the value of the refURI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefURI() {
        return refURI;
    }

    /**
     * Sets the value of the refURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefURI(JAXBElement<String> value) {
        this.refURI = value;
    }

    /**
     * Gets the value of the learningStandardRefId property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardAssociationType.LearningStandardRefId }
     *     
     */
    public LearningStandardAssociationType.LearningStandardRefId getLearningStandardRefId() {
        return learningStandardRefId;
    }

    /**
     * Sets the value of the learningStandardRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardAssociationType.LearningStandardRefId }
     *     
     */
    public void setLearningStandardRefId(LearningStandardAssociationType.LearningStandardRefId value) {
        this.learningStandardRefId = value;
    }

    /**
     * Gets the value of the targetObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardAssociationType.TargetObjectList }
     *     
     */
    public LearningStandardAssociationType.TargetObjectList getTargetObjectList() {
        return targetObjectList;
    }

    /**
     * Sets the value of the targetObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardAssociationType.TargetObjectList }
     *     
     */
    public void setTargetObjectList(LearningStandardAssociationType.TargetObjectList value) {
        this.targetObjectList = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the authoritativeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoritativeSource() {
        return authoritativeSource;
    }

    /**
     * Sets the value of the authoritativeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoritativeSource(String value) {
        this.authoritativeSource = value;
    }

    /**
     * Gets the value of the associationCreator property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardAssociationType.AssociationCreator }
     *     
     */
    public LearningStandardAssociationType.AssociationCreator getAssociationCreator() {
        return associationCreator;
    }

    /**
     * Sets the value of the associationCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardAssociationType.AssociationCreator }
     *     
     */
    public void setAssociationCreator(LearningStandardAssociationType.AssociationCreator value) {
        this.associationCreator = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="creatorRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
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
        "creatorName",
        "creatorRefId"
    })
    public static class AssociationCreator {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String creatorName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GGenericRefIdPointerType creatorRefId;

        /**
         * Gets the value of the creatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatorName() {
            return creatorName;
        }

        /**
         * Sets the value of the creatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatorName(String value) {
            this.creatorName = value;
        }

        /**
         * Gets the value of the creatorRefId property.
         * 
         * @return
         *     possible object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public GGenericRefIdPointerType getCreatorRefId() {
            return creatorRefId;
        }

        /**
         * Sets the value of the creatorRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public void setCreatorRefId(GGenericRefIdPointerType value) {
            this.creatorRefId = value;
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
     *     &lt;restriction base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gGenericRefIdPointerType">
     *       &lt;attribute name="sif_Object" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gObjectNameType" />
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LearningStandardRefId
        extends GGenericRefIdPointerType
    {


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
     *         &lt;element name="targetObject" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="targetObjectRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
     *                   &lt;element name="associationStrength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="associationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "targetObject"
    })
    public static class TargetObjectList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<LearningStandardAssociationType.TargetObjectList.TargetObject> targetObject;

        /**
         * Gets the value of the targetObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningStandardAssociationType.TargetObjectList.TargetObject }
         * 
         * 
         */
        public List<LearningStandardAssociationType.TargetObjectList.TargetObject> getTargetObject() {
            if (targetObject == null) {
                targetObject = new ArrayList<LearningStandardAssociationType.TargetObjectList.TargetObject>();
            }
            return this.targetObject;
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
         *         &lt;element name="targetObjectRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType"/>
         *         &lt;element name="associationStrength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="associationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "targetObjectRefId",
            "associationStrength",
            "associationType"
        })
        public static class TargetObject {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected GGenericRefIdPointerType targetObjectRefId;
            @XmlElementRef(name = "associationStrength", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> associationStrength;
            @XmlElementRef(name = "associationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", type = JAXBElement.class, required = false)
            protected JAXBElement<String> associationType;

            /**
             * Gets the value of the targetObjectRefId property.
             * 
             * @return
             *     possible object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public GGenericRefIdPointerType getTargetObjectRefId() {
                return targetObjectRefId;
            }

            /**
             * Sets the value of the targetObjectRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public void setTargetObjectRefId(GGenericRefIdPointerType value) {
                this.targetObjectRefId = value;
            }

            /**
             * Gets the value of the associationStrength property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getAssociationStrength() {
                return associationStrength;
            }

            /**
             * Sets the value of the associationStrength property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setAssociationStrength(JAXBElement<BigDecimal> value) {
                this.associationStrength = value;
            }

            /**
             * Gets the value of the associationType property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAssociationType() {
                return associationType;
            }

            /**
             * Sets the value of the associationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAssociationType(JAXBElement<String> value) {
                this.associationType = value;
            }

        }

    }

}
