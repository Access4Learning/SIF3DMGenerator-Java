
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPCodeFrameCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPCodeFrameCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPCodeFrame" type="{http://www.sifassociation.org/datamodel/au/3.4.1}NAPCodeFrameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPCodeFrameCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "napCodeFrame"
})
public class NAPCodeFrameCollectionType {

    @XmlElement(name = "NAPCodeFrame", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
    protected List<NAPCodeFrameType> napCodeFrame;

    /**
     * Gets the value of the napCodeFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napCodeFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAPCodeFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPCodeFrameType }
     * 
     * 
     */
    public List<NAPCodeFrameType> getNAPCodeFrame() {
        if (napCodeFrame == null) {
            napCodeFrame = new ArrayList<NAPCodeFrameType>();
        }
        return this.napCodeFrame;
    }

}
