
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FineInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FineInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FineInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}FineInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FineInfoListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fineInfo"
})
public class FineInfoListType {

    @XmlElement(name = "FineInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<FineInfoType> fineInfo;

    /**
     * Gets the value of the fineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FineInfoType }
     * 
     * 
     */
    public List<FineInfoType> getFineInfo() {
        if (fineInfo == null) {
            fineInfo = new ArrayList<FineInfoType>();
        }
        return this.fineInfo;
    }

}
