
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StimulusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StimulusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stimulus" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StimulusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StimulusListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "stimulus"
})
public class StimulusListType {

    @XmlElement(name = "Stimulus", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<StimulusType> stimulus;

    /**
     * Gets the value of the stimulus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stimulus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStimulus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StimulusType }
     * 
     * 
     */
    public List<StimulusType> getStimulus() {
        if (stimulus == null) {
            stimulus = new ArrayList<StimulusType>();
        }
        return this.stimulus;
    }

}
