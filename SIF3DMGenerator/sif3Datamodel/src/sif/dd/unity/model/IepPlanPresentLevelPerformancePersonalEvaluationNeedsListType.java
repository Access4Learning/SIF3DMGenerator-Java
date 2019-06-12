
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanPresentLevelPerformancePersonalEvaluationNeedsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformancePersonalEvaluationNeedsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="need" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformancePersonalEvaluationNeedsListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "need"
})
public class IepPlanPresentLevelPerformancePersonalEvaluationNeedsListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String need;

    /**
     * Gets the value of the need property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeed() {
        return need;
    }

    /**
     * Sets the value of the need property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeed(String value) {
        this.need = value;
    }

}
