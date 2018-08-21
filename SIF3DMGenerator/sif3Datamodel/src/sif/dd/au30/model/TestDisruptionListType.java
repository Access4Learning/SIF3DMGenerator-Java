
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestDisruptionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestDisruptionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestDisruption" type="{http://www.sifassociation.org/datamodel/au/3.4}TestDisruptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestDisruptionListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "testDisruption"
})
public class TestDisruptionListType {

    @XmlElement(name = "TestDisruption", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<TestDisruptionType> testDisruption;

    /**
     * Gets the value of the testDisruption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testDisruption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestDisruption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestDisruptionType }
     * 
     * 
     */
    public List<TestDisruptionType> getTestDisruption() {
        if (testDisruption == null) {
            testDisruption = new ArrayList<TestDisruptionType>();
        }
        return this.testDisruption;
    }

}
