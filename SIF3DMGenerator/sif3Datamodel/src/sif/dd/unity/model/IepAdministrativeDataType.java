
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iepAdministrativeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepAdministrativeDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonStudentRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="reevaluationDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="costSharing" type="{http://www.sifassociation.org/datamodel/na/4.x}iepAdministrativeDataCostSharingType" minOccurs="0"/>
 *         &lt;element name="transferPermissionList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepTransmitPermissionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepAdministrativeDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentRefId",
    "reevaluationDueDate",
    "costSharing",
    "transferPermissionList"
})
public class IepAdministrativeDataType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reevaluationDueDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepAdministrativeDataCostSharingType costSharing;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepTransmitPermissionListType transferPermissionList;

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
     * Gets the value of the reevaluationDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReevaluationDueDate() {
        return reevaluationDueDate;
    }

    /**
     * Sets the value of the reevaluationDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReevaluationDueDate(XMLGregorianCalendar value) {
        this.reevaluationDueDate = value;
    }

    /**
     * Gets the value of the costSharing property.
     * 
     * @return
     *     possible object is
     *     {@link IepAdministrativeDataCostSharingType }
     *     
     */
    public IepAdministrativeDataCostSharingType getCostSharing() {
        return costSharing;
    }

    /**
     * Sets the value of the costSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepAdministrativeDataCostSharingType }
     *     
     */
    public void setCostSharing(IepAdministrativeDataCostSharingType value) {
        this.costSharing = value;
    }

    /**
     * Gets the value of the transferPermissionList property.
     * 
     * @return
     *     possible object is
     *     {@link IepTransmitPermissionListType }
     *     
     */
    public IepTransmitPermissionListType getTransferPermissionList() {
        return transferPermissionList;
    }

    /**
     * Sets the value of the transferPermissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepTransmitPermissionListType }
     *     
     */
    public void setTransferPermissionList(IepTransmitPermissionListType value) {
        this.transferPermissionList = value;
    }

}
