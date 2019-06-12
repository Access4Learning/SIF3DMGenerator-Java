
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LearningStandardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningStandardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StandardsSettingBody" type="{http://www.sifassociation.org/datamodel/na/4.x}StandardsSettingBodyType" minOccurs="0"/>
 *         &lt;element name="StatementCodes" type="{http://www.sifassociation.org/datamodel/na/4.x}StatementCodeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningStandardType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "title",
    "standardsSettingBody",
    "statementCodes"
})
public class LearningStandardType {

    @XmlElement(name = "Title", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "StandardsSettingBody", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StandardsSettingBodyType standardsSettingBody;
    @XmlElement(name = "StatementCodes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StatementCodeListType statementCodes;

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
     * Gets the value of the standardsSettingBody property.
     * 
     * @return
     *     possible object is
     *     {@link StandardsSettingBodyType }
     *     
     */
    public StandardsSettingBodyType getStandardsSettingBody() {
        return standardsSettingBody;
    }

    /**
     * Sets the value of the standardsSettingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardsSettingBodyType }
     *     
     */
    public void setStandardsSettingBody(StandardsSettingBodyType value) {
        this.standardsSettingBody = value;
    }

    /**
     * Gets the value of the statementCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StatementCodeListType }
     *     
     */
    public StatementCodeListType getStatementCodes() {
        return statementCodes;
    }

    /**
     * Sets the value of the statementCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementCodeListType }
     *     
     */
    public void setStatementCodes(StatementCodeListType value) {
        this.statementCodes = value;
    }

}
