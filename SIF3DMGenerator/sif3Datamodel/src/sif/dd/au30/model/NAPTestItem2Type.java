
package sif.dd.au30.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NAPTestItem2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestItem2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}IdRefType"/>
 *         &lt;element name="TestItemLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestItem2Type", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "testItemRefId",
    "testItemLocalId",
    "sequenceNumber"
})
public class NAPTestItem2Type {

    @XmlElement(name = "TestItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String testItemRefId;
    @XmlElement(name = "TestItemLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String testItemLocalId;
    @XmlElement(name = "SequenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigInteger sequenceNumber;

    /**
     * Gets the value of the testItemRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestItemRefId() {
        return testItemRefId;
    }

    /**
     * Sets the value of the testItemRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestItemRefId(String value) {
        this.testItemRefId = value;
    }

    /**
     * Gets the value of the testItemLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestItemLocalId() {
        return testItemLocalId;
    }

    /**
     * Sets the value of the testItemLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestItemLocalId(String value) {
        this.testItemLocalId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

}
