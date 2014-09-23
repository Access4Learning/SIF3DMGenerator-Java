
package sif.dd.us32.model.composite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gTimeElementList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gTimeElementList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeElement" type="{http://www.sifassociation.org/datamodel/na/3.2}gTimeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gTimeElementList", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "timeElement"
})
public class GTimeElementList {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<GTimeElementType> timeElement;

    /**
     * Gets the value of the timeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GTimeElementType }
     * 
     * 
     */
    public List<GTimeElementType> getTimeElement() {
        if (timeElement == null) {
            timeElement = new ArrayList<GTimeElementType>();
        }
        return this.timeElement;
    }

}
