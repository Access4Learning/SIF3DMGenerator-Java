
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidLetterMarkListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidLetterMarkListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidLetterMark" type="{http://www.sifassociation.org/datamodel/au/3.4}ValidLetterMarkType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidLetterMarkListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "validLetterMark"
})
public class ValidLetterMarkListType {

    @XmlElement(name = "ValidLetterMark", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ValidLetterMarkType> validLetterMark;

    /**
     * Gets the value of the validLetterMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validLetterMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidLetterMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidLetterMarkType }
     * 
     * 
     */
    public List<ValidLetterMarkType> getValidLetterMark() {
        if (validLetterMark == null) {
            validLetterMark = new ArrayList<ValidLetterMarkType>();
        }
        return this.validLetterMark;
    }

}
