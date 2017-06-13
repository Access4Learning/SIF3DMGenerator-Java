
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPCodeFrameTestletListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPCodeFrameTestletListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Testlet" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletCodeFrameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPCodeFrameTestletListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "testlet"
})
public class NAPCodeFrameTestletListType {

    @XmlElement(name = "Testlet", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<NAPTestletCodeFrameType> testlet;

    /**
     * Gets the value of the testlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPTestletCodeFrameType }
     * 
     * 
     */
    public List<NAPTestletCodeFrameType> getTestlet() {
        if (testlet == null) {
            testlet = new ArrayList<NAPTestletCodeFrameType>();
        }
        return this.testlet;
    }

}
