
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarkInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TermInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SIF_Action">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Delete"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkInfoListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "markInfoRefId"
})
public class MarkInfoListType {

    @XmlElement(name = "MarkInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> markInfoRefId;
    @XmlAttribute(name = "TermInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termInfoRefId;
    @XmlAttribute(name = "SIF_Action")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifAction;

    /**
     * Gets the value of the markInfoRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markInfoRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkInfoRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarkInfoRefId() {
        if (markInfoRefId == null) {
            markInfoRefId = new ArrayList<String>();
        }
        return this.markInfoRefId;
    }

    /**
     * Gets the value of the termInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermInfoRefId() {
        return termInfoRefId;
    }

    /**
     * Sets the value of the termInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermInfoRefId(String value) {
        this.termInfoRefId = value;
    }

    /**
     * Gets the value of the sifAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFAction() {
        return sifAction;
    }

    /**
     * Sets the value of the sifAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFAction(String value) {
        this.sifAction = value;
    }

}
