
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Connects a Teacher to a section or class.
 * 
 * <p>Java class for staffSectionAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staffSectionAssociationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gStaffSectionAssociationType">
 *       &lt;sequence>
 *         &lt;element name="teacherOfRecord" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="roleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="percentResponsible" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "staffSectionAssociationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "teacherOfRecord",
    "roleList",
    "percentResponsible"
})
public class StaffSectionAssociationType
    extends GStaffSectionAssociationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType teacherOfRecord;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected StaffSectionAssociationType.RoleList roleList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal percentResponsible;

    /**
     * Gets the value of the teacherOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getTeacherOfRecord() {
        return teacherOfRecord;
    }

    /**
     * Sets the value of the teacherOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setTeacherOfRecord(GYesNoUnknownType value) {
        this.teacherOfRecord = value;
    }

    /**
     * Gets the value of the roleList property.
     * 
     * @return
     *     possible object is
     *     {@link StaffSectionAssociationType.RoleList }
     *     
     */
    public StaffSectionAssociationType.RoleList getRoleList() {
        return roleList;
    }

    /**
     * Sets the value of the roleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffSectionAssociationType.RoleList }
     *     
     */
    public void setRoleList(StaffSectionAssociationType.RoleList value) {
        this.roleList = value;
    }

    /**
     * Gets the value of the percentResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentResponsible() {
        return percentResponsible;
    }

    /**
     * Sets the value of the percentResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentResponsible(BigDecimal value) {
        this.percentResponsible = value;
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
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "role"
    })
    public static class RoleList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRole() {
            if (role == null) {
                role = new ArrayList<String>();
            }
            return this.role;
        }

    }

}
