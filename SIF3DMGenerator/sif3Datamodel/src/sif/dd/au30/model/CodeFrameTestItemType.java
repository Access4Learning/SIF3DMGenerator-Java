
package sif.dd.au30.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CodeFrameTestItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeFrameTestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TestItemContent" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestItemContentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeFrameTestItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "testItemRefId",
    "sequenceNumber",
    "testItemContent"
})
public class CodeFrameTestItemType {

    @XmlElement(name = "TestItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String testItemRefId;
    @XmlElement(name = "SequenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigInteger sequenceNumber;
    @XmlElement(name = "TestItemContent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected NAPTestItemContentType testItemContent;

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

    /**
     * Gets the value of the testItemContent property.
     * 
     * @return
     *     possible object is
     *     {@link NAPTestItemContentType }
     *     
     */
    public NAPTestItemContentType getTestItemContent() {
        return testItemContent;
    }

    /**
     * Sets the value of the testItemContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPTestItemContentType }
     *     
     */
    public void setTestItemContent(NAPTestItemContentType value) {
        this.testItemContent = value;
    }

}
