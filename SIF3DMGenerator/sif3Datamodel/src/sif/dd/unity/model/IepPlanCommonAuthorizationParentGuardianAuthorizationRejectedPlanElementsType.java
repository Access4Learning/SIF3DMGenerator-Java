
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rejectedDetailList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsRejectedDetailListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "rejectedDetailList",
    "explanation"
})
public class IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsRejectedDetailListType> rejectedDetailList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String explanation;

    /**
     * Gets the value of the rejectedDetailList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectedDetailList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectedDetailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsRejectedDetailListType }
     * 
     * 
     */
    public List<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsRejectedDetailListType> getRejectedDetailList() {
        if (rejectedDetailList == null) {
            rejectedDetailList = new ArrayList<IepPlanCommonAuthorizationParentGuardianAuthorizationRejectedPlanElementsRejectedDetailListType>();
        }
        return this.rejectedDetailList;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

}
