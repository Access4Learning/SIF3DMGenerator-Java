
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicableLawListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicableLawListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableLaw" type="{http://www.sifassociation.org/datamodel/au/3.4}ApplicableLawType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicableLawListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "applicableLaw"
})
public class ApplicableLawListType {

    @XmlElement(name = "ApplicableLaw", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ApplicableLawType> applicableLaw;

    /**
     * Gets the value of the applicableLaw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableLaw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableLaw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableLawType }
     * 
     * 
     */
    public List<ApplicableLawType> getApplicableLaw() {
        if (applicableLaw == null) {
            applicableLaw = new ArrayList<ApplicableLawType>();
        }
        return this.applicableLaw;
    }

}
