
package sif.dd.unity.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentAttendanceAuditInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAttendanceAuditInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationUser" type="{http://www.sifassociation.org/datamodel/na/4.x}AuditInfoCreationUserType"/>
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAttendanceAuditInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "creationUser",
    "creationDateTime"
})
public class StudentAttendanceAuditInfoType {

    @XmlElement(name = "CreationUser", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected AuditInfoCreationUserType creationUser;
    @XmlElement(name = "CreationDateTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creationDateTime;

    /**
     * Gets the value of the creationUser property.
     * 
     * @return
     *     possible object is
     *     {@link AuditInfoCreationUserType }
     *     
     */
    public AuditInfoCreationUserType getCreationUser() {
        return creationUser;
    }

    /**
     * Sets the value of the creationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditInfoCreationUserType }
     *     
     */
    public void setCreationUser(AuditInfoCreationUserType value) {
        this.creationUser = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(Calendar value) {
        this.creationDateTime = value;
    }

}
