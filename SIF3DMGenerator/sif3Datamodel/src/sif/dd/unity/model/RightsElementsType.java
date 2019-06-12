
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightsElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightsElementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RightsElement" type="{http://www.sifassociation.org/datamodel/na/4.x}RightsElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightsElementsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "rightsElement"
})
public class RightsElementsType {

    @XmlElement(name = "RightsElement", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<RightsElementType> rightsElement;

    /**
     * Gets the value of the rightsElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightsElementType }
     * 
     * 
     */
    public List<RightsElementType> getRightsElement() {
        if (rightsElement == null) {
            rightsElement = new ArrayList<RightsElementType>();
        }
        return this.rightsElement;
    }

}
