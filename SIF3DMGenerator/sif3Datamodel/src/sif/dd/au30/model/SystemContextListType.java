
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemContextListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemContextListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemContext" type="{http://www.sifassociation.org/datamodel/au/3.4}SystemContextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemContextListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "systemContext"
})
public class SystemContextListType {

    @XmlElement(name = "SystemContext", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<SystemContextType> systemContext;

    /**
     * Gets the value of the systemContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemContextType }
     * 
     * 
     */
    public List<SystemContextType> getSystemContext() {
        if (systemContext == null) {
            systemContext = new ArrayList<SystemContextType>();
        }
        return this.systemContext;
    }

}
