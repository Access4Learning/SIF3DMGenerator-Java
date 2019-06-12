
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrelationSectionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationSectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationSection" type="{http://www.sifassociation.org/datamodel/na/4.x}CorrelationSectionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelationSectionListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "correlationSection"
})
public class CorrelationSectionListType {

    @XmlElement(name = "CorrelationSection", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<CorrelationSectionType> correlationSection;

    /**
     * Gets the value of the correlationSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelationSectionType }
     * 
     * 
     */
    public List<CorrelationSectionType> getCorrelationSection() {
        if (correlationSection == null) {
            correlationSection = new ArrayList<CorrelationSectionType>();
        }
        return this.correlationSection;
    }

}
