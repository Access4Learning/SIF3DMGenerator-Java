
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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * This object transmits the student's responses to stimuli presented in an assessment. This object contains the raw responses as well as provides item-level scores and feedback to the student based on those responses..
 * 
 * <p>Java class for assessmentResponseSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentResponseSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="assessmentAdministrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="studentPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="itemList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *                             &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="responseLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="responseCorrect" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="viewStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="attemptStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="numberOfAttempts" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *                             &lt;element name="timeOnItem" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                             &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *                             &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="assessmentRubricRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="itemScore" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="itemScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="commentList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="commentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="traitScoreList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="traitScore" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="traitScoreType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="traitScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="traitScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="feedbackItemList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="feedbackCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="itemAidList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="itemAid" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
@XmlType(name = "assessmentResponseSetType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "assessmentAdministrationRefId",
    "studentPersonalRefId",
    "assessmentRegistrationRefId",
    "itemList"
})
public class AssessmentResponseSetType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentAdministrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRegistrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected AssessmentResponseSetType.ItemList itemList;

    /**
     * Gets the value of the assessmentAdministrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationRefId() {
        return assessmentAdministrationRefId;
    }

    /**
     * Sets the value of the assessmentAdministrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationRefId(String value) {
        this.assessmentAdministrationRefId = value;
    }

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the assessmentRegistrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationRefId() {
        return assessmentRegistrationRefId;
    }

    /**
     * Sets the value of the assessmentRegistrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationRefId(String value) {
        this.assessmentRegistrationRefId = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentResponseSetType.ItemList }
     *     
     */
    public AssessmentResponseSetType.ItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentResponseSetType.ItemList }
     *     
     */
    public void setItemList(AssessmentResponseSetType.ItemList value) {
        this.itemList = value;
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
     *                   &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="responseLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="responseCorrect" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="viewStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="attemptStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="numberOfAttempts" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
     *                   &lt;element name="timeOnItem" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
     *                   &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
     *                   &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="assessmentRubricRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="itemScore" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="itemScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="commentList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="commentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="traitScoreList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="traitScore" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="traitScoreType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="traitScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="traitScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="feedbackItemList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="feedbackCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="itemAidList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="itemAid" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ItemList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentResponseSetType.ItemList.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentResponseSetType.ItemList.Item }
         * 
         * 
         */
        public List<AssessmentResponseSetType.ItemList.Item> getItem() {
            if (item == null) {
                item = new ArrayList<AssessmentResponseSetType.ItemList.Item>();
            }
            return this.item;
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
         *         &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
         *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="responseLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="responseCorrect" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="viewStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="attemptStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="numberOfAttempts" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
         *         &lt;element name="timeOnItem" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
         *         &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
         *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="assessmentRubricRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="itemScore" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="itemScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="commentList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="commentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="traitScoreList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="traitScore" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="traitScoreType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="traitScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="traitScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
         *         &lt;element name="feedbackItemList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="feedbackCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
         *         &lt;element name="itemAidList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="itemAid" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
            "assessmentItemRefId",
            "response",
            "responseLocation",
            "responseCorrect",
            "viewStatus",
            "attemptStatus",
            "numberOfAttempts",
            "timeOnItem",
            "itemNumber",
            "itemName",
            "assessmentRubricRefId",
            "itemScore",
            "itemScoreCode",
            "commentList",
            "traitScoreList",
            "feedbackItemList",
            "itemAidList"
        })
        public static class Item {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentItemRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected String response;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "anyURI")
            protected String responseLocation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GYesNoUnknownType responseCorrect;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GYesNoUnknownType viewStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GYesNoUnknownType attemptStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "unsignedShort")
            protected Integer numberOfAttempts;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected Duration timeOnItem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "unsignedShort")
            protected Integer itemNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String itemName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentRubricRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String itemScore;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String itemScoreCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected AssessmentResponseSetType.ItemList.Item.CommentList commentList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected AssessmentResponseSetType.ItemList.Item.TraitScoreList traitScoreList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected AssessmentResponseSetType.ItemList.Item.FeedbackItemList feedbackItemList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected AssessmentResponseSetType.ItemList.Item.ItemAidList itemAidList;

            /**
             * Gets the value of the assessmentItemRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentItemRefId() {
                return assessmentItemRefId;
            }

            /**
             * Sets the value of the assessmentItemRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentItemRefId(String value) {
                this.assessmentItemRefId = value;
            }

            /**
             * Gets the value of the response property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponse() {
                return response;
            }

            /**
             * Sets the value of the response property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponse(String value) {
                this.response = value;
            }

            /**
             * Gets the value of the responseLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponseLocation() {
                return responseLocation;
            }

            /**
             * Sets the value of the responseLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseLocation(String value) {
                this.responseLocation = value;
            }

            /**
             * Gets the value of the responseCorrect property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getResponseCorrect() {
                return responseCorrect;
            }

            /**
             * Sets the value of the responseCorrect property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setResponseCorrect(GYesNoUnknownType value) {
                this.responseCorrect = value;
            }

            /**
             * Gets the value of the viewStatus property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getViewStatus() {
                return viewStatus;
            }

            /**
             * Sets the value of the viewStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setViewStatus(GYesNoUnknownType value) {
                this.viewStatus = value;
            }

            /**
             * Gets the value of the attemptStatus property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getAttemptStatus() {
                return attemptStatus;
            }

            /**
             * Sets the value of the attemptStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setAttemptStatus(GYesNoUnknownType value) {
                this.attemptStatus = value;
            }

            /**
             * Gets the value of the numberOfAttempts property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumberOfAttempts() {
                return numberOfAttempts;
            }

            /**
             * Sets the value of the numberOfAttempts property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumberOfAttempts(Integer value) {
                this.numberOfAttempts = value;
            }

            /**
             * Gets the value of the timeOnItem property.
             * 
             * @return
             *     possible object is
             *     {@link Duration }
             *     
             */
            public Duration getTimeOnItem() {
                return timeOnItem;
            }

            /**
             * Sets the value of the timeOnItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setTimeOnItem(Duration value) {
                this.timeOnItem = value;
            }

            /**
             * Gets the value of the itemNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getItemNumber() {
                return itemNumber;
            }

            /**
             * Sets the value of the itemNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setItemNumber(Integer value) {
                this.itemNumber = value;
            }

            /**
             * Gets the value of the itemName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemName() {
                return itemName;
            }

            /**
             * Sets the value of the itemName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemName(String value) {
                this.itemName = value;
            }

            /**
             * Gets the value of the assessmentRubricRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentRubricRefId() {
                return assessmentRubricRefId;
            }

            /**
             * Sets the value of the assessmentRubricRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentRubricRefId(String value) {
                this.assessmentRubricRefId = value;
            }

            /**
             * Gets the value of the itemScore property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemScore() {
                return itemScore;
            }

            /**
             * Sets the value of the itemScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemScore(String value) {
                this.itemScore = value;
            }

            /**
             * Gets the value of the itemScoreCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemScoreCode() {
                return itemScoreCode;
            }

            /**
             * Sets the value of the itemScoreCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemScoreCode(String value) {
                this.itemScoreCode = value;
            }

            /**
             * Gets the value of the commentList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentResponseSetType.ItemList.Item.CommentList }
             *     
             */
            public AssessmentResponseSetType.ItemList.Item.CommentList getCommentList() {
                return commentList;
            }

            /**
             * Sets the value of the commentList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentResponseSetType.ItemList.Item.CommentList }
             *     
             */
            public void setCommentList(AssessmentResponseSetType.ItemList.Item.CommentList value) {
                this.commentList = value;
            }

            /**
             * Gets the value of the traitScoreList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentResponseSetType.ItemList.Item.TraitScoreList }
             *     
             */
            public AssessmentResponseSetType.ItemList.Item.TraitScoreList getTraitScoreList() {
                return traitScoreList;
            }

            /**
             * Sets the value of the traitScoreList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentResponseSetType.ItemList.Item.TraitScoreList }
             *     
             */
            public void setTraitScoreList(AssessmentResponseSetType.ItemList.Item.TraitScoreList value) {
                this.traitScoreList = value;
            }

            /**
             * Gets the value of the feedbackItemList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentResponseSetType.ItemList.Item.FeedbackItemList }
             *     
             */
            public AssessmentResponseSetType.ItemList.Item.FeedbackItemList getFeedbackItemList() {
                return feedbackItemList;
            }

            /**
             * Sets the value of the feedbackItemList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentResponseSetType.ItemList.Item.FeedbackItemList }
             *     
             */
            public void setFeedbackItemList(AssessmentResponseSetType.ItemList.Item.FeedbackItemList value) {
                this.feedbackItemList = value;
            }

            /**
             * Gets the value of the itemAidList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentResponseSetType.ItemList.Item.ItemAidList }
             *     
             */
            public AssessmentResponseSetType.ItemList.Item.ItemAidList getItemAidList() {
                return itemAidList;
            }

            /**
             * Sets the value of the itemAidList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentResponseSetType.ItemList.Item.ItemAidList }
             *     
             */
            public void setItemAidList(AssessmentResponseSetType.ItemList.Item.ItemAidList value) {
                this.itemAidList = value;
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
             *         &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="commentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "comment"
            })
            public static class CommentList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<AssessmentResponseSetType.ItemList.Item.CommentList.Comment> comment;

                /**
                 * Gets the value of the comment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the comment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentResponseSetType.ItemList.Item.CommentList.Comment }
                 * 
                 * 
                 */
                public List<AssessmentResponseSetType.ItemList.Item.CommentList.Comment> getComment() {
                    if (comment == null) {
                        comment = new ArrayList<AssessmentResponseSetType.ItemList.Item.CommentList.Comment>();
                    }
                    return this.comment;
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
                 *         &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="commentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "commentCode",
                    "commentDescription"
                })
                public static class Comment {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String commentCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    protected String commentDescription;

                    /**
                     * Gets the value of the commentCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCommentCode() {
                        return commentCode;
                    }

                    /**
                     * Sets the value of the commentCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCommentCode(String value) {
                        this.commentCode = value;
                    }

                    /**
                     * Gets the value of the commentDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCommentDescription() {
                        return commentDescription;
                    }

                    /**
                     * Sets the value of the commentDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCommentDescription(String value) {
                        this.commentDescription = value;
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
             *         &lt;element name="feedbackItem" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="feedbackCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "feedbackItem"
            })
            public static class FeedbackItemList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem> feedbackItem;

                /**
                 * Gets the value of the feedbackItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the feedbackItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFeedbackItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem }
                 * 
                 * 
                 */
                public List<AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem> getFeedbackItem() {
                    if (feedbackItem == null) {
                        feedbackItem = new ArrayList<AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem>();
                    }
                    return this.feedbackItem;
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
                 *         &lt;element name="feedbackCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="diagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feedbackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feedbackSource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                    "feedbackCode",
                    "diagnosticStatement",
                    "feedbackDescription",
                    "feedbackSource"
                })
                public static class FeedbackItem {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String feedbackCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    protected String diagnosticStatement;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    protected String feedbackDescription;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String feedbackSource;

                    /**
                     * Gets the value of the feedbackCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeedbackCode() {
                        return feedbackCode;
                    }

                    /**
                     * Sets the value of the feedbackCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeedbackCode(String value) {
                        this.feedbackCode = value;
                    }

                    /**
                     * Gets the value of the diagnosticStatement property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDiagnosticStatement() {
                        return diagnosticStatement;
                    }

                    /**
                     * Sets the value of the diagnosticStatement property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDiagnosticStatement(String value) {
                        this.diagnosticStatement = value;
                    }

                    /**
                     * Gets the value of the feedbackDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeedbackDescription() {
                        return feedbackDescription;
                    }

                    /**
                     * Sets the value of the feedbackDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeedbackDescription(String value) {
                        this.feedbackDescription = value;
                    }

                    /**
                     * Gets the value of the feedbackSource property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeedbackSource() {
                        return feedbackSource;
                    }

                    /**
                     * Sets the value of the feedbackSource property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeedbackSource(String value) {
                        this.feedbackSource = value;
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
             *         &lt;element name="itemAid" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
                "itemAid"
            })
            public static class ItemAidList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected List<String> itemAid;

                /**
                 * Gets the value of the itemAid property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itemAid property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItemAid().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getItemAid() {
                    if (itemAid == null) {
                        itemAid = new ArrayList<String>();
                    }
                    return this.itemAid;
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
             *         &lt;element name="traitScore" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="traitScoreType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="traitScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="traitScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "traitScore"
            })
            public static class TraitScoreList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore> traitScore;

                /**
                 * Gets the value of the traitScore property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the traitScore property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTraitScore().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore }
                 * 
                 * 
                 */
                public List<AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore> getTraitScore() {
                    if (traitScore == null) {
                        traitScore = new ArrayList<AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore>();
                    }
                    return this.traitScore;
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
                 *         &lt;element name="traitScoreType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="traitScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="traitScoreCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                    "traitScoreType",
                    "traitScoreValue",
                    "traitScoreCode"
                })
                public static class TraitScore {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String traitScoreType;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    protected BigDecimal traitScoreValue;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String traitScoreCode;

                    /**
                     * Gets the value of the traitScoreType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTraitScoreType() {
                        return traitScoreType;
                    }

                    /**
                     * Sets the value of the traitScoreType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTraitScoreType(String value) {
                        this.traitScoreType = value;
                    }

                    /**
                     * Gets the value of the traitScoreValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTraitScoreValue() {
                        return traitScoreValue;
                    }

                    /**
                     * Sets the value of the traitScoreValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setTraitScoreValue(BigDecimal value) {
                        this.traitScoreValue = value;
                    }

                    /**
                     * Gets the value of the traitScoreCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTraitScoreCode() {
                        return traitScoreCode;
                    }

                    /**
                     * Sets the value of the traitScoreCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTraitScoreCode(String value) {
                        this.traitScoreCode = value;
                    }

                }

            }

        }

    }

}
