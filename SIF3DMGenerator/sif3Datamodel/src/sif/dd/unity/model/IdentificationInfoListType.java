
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}IdentificationInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationInfoListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "identificationInfo"
})
public class IdentificationInfoListType {

    @XmlElement(name = "IdentificationInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<IdentificationInfoType> identificationInfo;

    /**
     * Gets the value of the identificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationInfoType }
     * 
     * 
     */
    public List<IdentificationInfoType> getIdentificationInfo() {
        if (identificationInfo == null) {
            identificationInfo = new ArrayList<IdentificationInfoType>();
        }
        return this.identificationInfo;
    }

}
