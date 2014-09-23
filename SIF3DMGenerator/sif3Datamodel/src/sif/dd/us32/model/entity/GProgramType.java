
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for gProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gProgramType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_EntityType">
 *       &lt;sequence>
 *         &lt;element name="programIdentifier" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gProgramType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "programIdentifier",
    "programName"
})
@XmlSeeAlso({
    ProgramType.class
})
public class GProgramType
    extends GSIFEntityType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExternalIdType programIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String programName;

    /**
     * Gets the value of the programIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link GExternalIdType }
     *     
     */
    public GExternalIdType getProgramIdentifier() {
        return programIdentifier;
    }

    /**
     * Sets the value of the programIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExternalIdType }
     *     
     */
    public void setProgramIdentifier(GExternalIdType value) {
        this.programIdentifier = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

}
