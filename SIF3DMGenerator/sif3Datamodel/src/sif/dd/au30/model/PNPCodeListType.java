
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNPCodeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNPCodeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNPCode" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsPNPCodeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNPCodeListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "pnpCode"
})
public class PNPCodeListType {

    @XmlElement(name = "PNPCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<AUCodeSetsPNPCodeType> pnpCode;

    /**
     * Gets the value of the pnpCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnpCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNPCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUCodeSetsPNPCodeType }
     * 
     * 
     */
    public List<AUCodeSetsPNPCodeType> getPNPCode() {
        if (pnpCode == null) {
            pnpCode = new ArrayList<AUCodeSetsPNPCodeType>();
        }
        return this.pnpCode;
    }

}
