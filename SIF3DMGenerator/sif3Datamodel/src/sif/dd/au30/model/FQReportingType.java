
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FQReportingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQReportingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="CommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ACARAId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityContact" type="{http://www.sifassociation.org/datamodel/au/3.4}EntityContactInfoType" minOccurs="0"/>
 *         &lt;element name="FQContextualQuestionList" type="{http://www.sifassociation.org/datamodel/au/3.4}FQContextualQuestionListType" minOccurs="0"/>
 *         &lt;element name="FQItemList" type="{http://www.sifassociation.org/datamodel/au/3.4}FQItemListType" minOccurs="0"/>
 *         &lt;element name="AGRuleList" type="{http://www.sifassociation.org/datamodel/au/3.4}AGRuleListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQReportingType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "entityLevel",
    "schoolInfoRefId",
    "localId",
    "stateProvinceId",
    "commonwealthId",
    "acaraId",
    "entityName",
    "entityContact",
    "fqContextualQuestionList",
    "fqItemList",
    "agRuleList"
})
public class FQReportingType {

    @XmlElement(name = "EntityLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String entityLevel;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElement(name = "CommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String commonwealthId;
    @XmlElementRef(name = "ACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acaraId;
    @XmlElementRef(name = "EntityName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElement(name = "EntityContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected EntityContactInfoType entityContact;
    @XmlElementRef(name = "FQContextualQuestionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<FQContextualQuestionListType> fqContextualQuestionList;
    @XmlElement(name = "FQItemList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected FQItemListType fqItemList;
    @XmlElementRef(name = "AGRuleList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AGRuleListType> agRuleList;

    /**
     * Gets the value of the entityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLevel() {
        return entityLevel;
    }

    /**
     * Sets the value of the entityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLevel(String value) {
        this.entityLevel = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceId(JAXBElement<String> value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the commonwealthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonwealthId() {
        return commonwealthId;
    }

    /**
     * Sets the value of the commonwealthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonwealthId(String value) {
        this.commonwealthId = value;
    }

    /**
     * Gets the value of the acaraId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACARAId() {
        return acaraId;
    }

    /**
     * Sets the value of the acaraId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACARAId(JAXBElement<String> value) {
        this.acaraId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityContact property.
     * 
     * @return
     *     possible object is
     *     {@link EntityContactInfoType }
     *     
     */
    public EntityContactInfoType getEntityContact() {
        return entityContact;
    }

    /**
     * Sets the value of the entityContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityContactInfoType }
     *     
     */
    public void setEntityContact(EntityContactInfoType value) {
        this.entityContact = value;
    }

    /**
     * Gets the value of the fqContextualQuestionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FQContextualQuestionListType }{@code >}
     *     
     */
    public JAXBElement<FQContextualQuestionListType> getFQContextualQuestionList() {
        return fqContextualQuestionList;
    }

    /**
     * Sets the value of the fqContextualQuestionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FQContextualQuestionListType }{@code >}
     *     
     */
    public void setFQContextualQuestionList(JAXBElement<FQContextualQuestionListType> value) {
        this.fqContextualQuestionList = value;
    }

    /**
     * Gets the value of the fqItemList property.
     * 
     * @return
     *     possible object is
     *     {@link FQItemListType }
     *     
     */
    public FQItemListType getFQItemList() {
        return fqItemList;
    }

    /**
     * Sets the value of the fqItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQItemListType }
     *     
     */
    public void setFQItemList(FQItemListType value) {
        this.fqItemList = value;
    }

    /**
     * Gets the value of the agRuleList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}
     *     
     */
    public JAXBElement<AGRuleListType> getAGRuleList() {
        return agRuleList;
    }

    /**
     * Sets the value of the agRuleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}
     *     
     */
    public void setAGRuleList(JAXBElement<AGRuleListType> value) {
        this.agRuleList = value;
    }

}
