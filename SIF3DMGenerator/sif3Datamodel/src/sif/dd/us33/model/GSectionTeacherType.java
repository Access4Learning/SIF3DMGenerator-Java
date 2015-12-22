
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for gSectionTeacherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSectionTeacherType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="teachingAssignmentRole" type="{http://www.sifassociation.org/datamodel/na/3.3}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSectionTeacherType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "staffPersonRefId",
    "teachingAssignmentRole",
    "any"
})
public class GSectionTeacherType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLaxCodedElementType teachingAssignmentRole;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the staffPersonRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonRefId() {
        return staffPersonRefId;
    }

    /**
     * Sets the value of the staffPersonRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonRefId(String value) {
        this.staffPersonRefId = value;
    }

    /**
     * Gets the value of the teachingAssignmentRole property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getTeachingAssignmentRole() {
        return teachingAssignmentRole;
    }

    /**
     * Sets the value of the teachingAssignmentRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setTeachingAssignmentRole(GLaxCodedElementType value) {
        this.teachingAssignmentRole = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
