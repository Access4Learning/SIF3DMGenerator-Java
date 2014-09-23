
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for aeProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aeProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careerPathwaysProgramParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aeProgramType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "careerCluster",
    "careerPathwaysProgramParticipationIndicator"
})
public class AeProgramType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String careerCluster;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String careerPathwaysProgramParticipationIndicator;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the careerCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareerCluster() {
        return careerCluster;
    }

    /**
     * Sets the value of the careerCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareerCluster(String value) {
        this.careerCluster = value;
    }

    /**
     * Gets the value of the careerPathwaysProgramParticipationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareerPathwaysProgramParticipationIndicator() {
        return careerPathwaysProgramParticipationIndicator;
    }

    /**
     * Sets the value of the careerPathwaysProgramParticipationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareerPathwaysProgramParticipationIndicator(String value) {
        this.careerPathwaysProgramParticipationIndicator = value;
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
