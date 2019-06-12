
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfessionalDevelopmentRegistrationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfessionalDevelopmentRegistrationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfessionalDevelopmentRegistration" type="{http://www.sifassociation.org/datamodel/na/4.x}ProfessionalDevelopmentRegistrationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfessionalDevelopmentRegistrationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "professionalDevelopmentRegistration"
})
public class ProfessionalDevelopmentRegistrationCollectionType {

    @XmlElement(name = "ProfessionalDevelopmentRegistration", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<ProfessionalDevelopmentRegistrationType> professionalDevelopmentRegistration;

    /**
     * Gets the value of the professionalDevelopmentRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalDevelopmentRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalDevelopmentRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalDevelopmentRegistrationType }
     * 
     * 
     */
    public List<ProfessionalDevelopmentRegistrationType> getProfessionalDevelopmentRegistration() {
        if (professionalDevelopmentRegistration == null) {
            professionalDevelopmentRegistration = new ArrayList<ProfessionalDevelopmentRegistrationType>();
        }
        return this.professionalDevelopmentRegistration;
    }

}
