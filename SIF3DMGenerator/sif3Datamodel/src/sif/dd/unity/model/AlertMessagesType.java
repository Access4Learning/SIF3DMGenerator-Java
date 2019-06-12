
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertMessagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertMessage" type="{http://www.sifassociation.org/datamodel/na/4.x}AlertMessageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertMessagesType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "alertMessage"
})
public class AlertMessagesType {

    @XmlElement(name = "AlertMessage", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<AlertMessageType> alertMessage;

    /**
     * Gets the value of the alertMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertMessageType }
     * 
     * 
     */
    public List<AlertMessageType> getAlertMessage() {
        if (alertMessage == null) {
            alertMessage = new ArrayList<AlertMessageType>();
        }
        return this.alertMessage;
    }

}
