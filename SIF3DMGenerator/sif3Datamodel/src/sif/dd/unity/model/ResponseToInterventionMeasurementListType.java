
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseToInterventionMeasurementListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseToInterventionMeasurementListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Measurement" type="{http://www.sifassociation.org/datamodel/na/4.x}ResponseToInterventionMeasurementType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseToInterventionMeasurementListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "measurement"
})
public class ResponseToInterventionMeasurementListType {

    @XmlElement(name = "Measurement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<ResponseToInterventionMeasurementType> measurement;

    /**
     * Gets the value of the measurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseToInterventionMeasurementType }
     * 
     * 
     */
    public List<ResponseToInterventionMeasurementType> getMeasurement() {
        if (measurement == null) {
            measurement = new ArrayList<ResponseToInterventionMeasurementType>();
        }
        return this.measurement;
    }

}
