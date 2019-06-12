
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xTransferIEPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xTransferIEPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepReferenceObjectsType" minOccurs="0"/>
 *         &lt;element name="iep" type="{http://www.sifassociation.org/datamodel/na/4.x}xIepType" minOccurs="0"/>
 *         &lt;element name="historyList" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepHistoryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xTransferIEPType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "referenceObjects",
    "iep",
    "historyList"
})
public class XTransferIEPType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepReferenceObjectsType referenceObjects;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XIepType iep;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepHistoryListType historyList;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the referenceObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TiepReferenceObjectsType }
     *     
     */
    public TiepReferenceObjectsType getReferenceObjects() {
        return referenceObjects;
    }

    /**
     * Sets the value of the referenceObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepReferenceObjectsType }
     *     
     */
    public void setReferenceObjects(TiepReferenceObjectsType value) {
        this.referenceObjects = value;
    }

    /**
     * Gets the value of the iep property.
     * 
     * @return
     *     possible object is
     *     {@link XIepType }
     *     
     */
    public XIepType getIep() {
        return iep;
    }

    /**
     * Sets the value of the iep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIepType }
     *     
     */
    public void setIep(XIepType value) {
        this.iep = value;
    }

    /**
     * Gets the value of the historyList property.
     * 
     * @return
     *     possible object is
     *     {@link TiepHistoryListType }
     *     
     */
    public TiepHistoryListType getHistoryList() {
        return historyList;
    }

    /**
     * Sets the value of the historyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepHistoryListType }
     *     
     */
    public void setHistoryList(TiepHistoryListType value) {
        this.historyList = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
