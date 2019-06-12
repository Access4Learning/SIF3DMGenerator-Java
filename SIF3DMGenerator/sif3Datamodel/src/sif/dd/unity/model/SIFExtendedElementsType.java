
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIF_ExtendedElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIF_ExtendedElementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIF_ExtendedElement" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIF_ExtendedElementsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "sifExtendedElement"
})
public class SIFExtendedElementsType {

    @XmlElement(name = "SIF_ExtendedElement", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<SIFExtendedElementType> sifExtendedElement;

    /**
     * Gets the value of the sifExtendedElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sifExtendedElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIFExtendedElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SIFExtendedElementType }
     * 
     * 
     */
    public List<SIFExtendedElementType> getSIFExtendedElement() {
        if (sifExtendedElement == null) {
            sifExtendedElement = new ArrayList<SIFExtendedElementType>();
        }
        return this.sifExtendedElement;
    }

}
