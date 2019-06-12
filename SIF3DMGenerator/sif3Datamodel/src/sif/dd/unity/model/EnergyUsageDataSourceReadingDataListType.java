
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyUsageDataSourceReadingDataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyUsageDataSourceReadingDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadingData" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyUsageDataSourceReadingDataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyUsageDataSourceReadingDataListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "readingData"
})
public class EnergyUsageDataSourceReadingDataListType {

    @XmlElement(name = "ReadingData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<EnergyUsageDataSourceReadingDataType> readingData;

    /**
     * Gets the value of the readingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyUsageDataSourceReadingDataType }
     * 
     * 
     */
    public List<EnergyUsageDataSourceReadingDataType> getReadingData() {
        if (readingData == null) {
            readingData = new ArrayList<EnergyUsageDataSourceReadingDataType>();
        }
        return this.readingData;
    }

}
