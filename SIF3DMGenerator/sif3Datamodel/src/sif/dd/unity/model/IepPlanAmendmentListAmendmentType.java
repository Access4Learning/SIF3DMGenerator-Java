
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
 * <p>Java class for iepPlanAmendmentListAmendmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAmendmentListAmendmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAmendmentListAmendmentChangeListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="authorization" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanCommonAuthorizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAmendmentListAmendmentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "changeList",
    "explanation",
    "authorization"
})
public class IepPlanAmendmentListAmendmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAmendmentListAmendmentChangeListType> changeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String explanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanCommonAuthorizationType authorization;

    /**
     * Gets the value of the changeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAmendmentListAmendmentChangeListType }
     * 
     * 
     */
    public List<IepPlanAmendmentListAmendmentChangeListType> getChangeList() {
        if (changeList == null) {
            changeList = new ArrayList<IepPlanAmendmentListAmendmentChangeListType>();
        }
        return this.changeList;
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

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanCommonAuthorizationType }
     *     
     */
    public IepPlanCommonAuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanCommonAuthorizationType }
     *     
     */
    public void setAuthorization(IepPlanCommonAuthorizationType value) {
        this.authorization = value;
    }

}
