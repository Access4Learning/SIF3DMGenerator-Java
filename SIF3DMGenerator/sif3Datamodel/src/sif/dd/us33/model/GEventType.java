
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A temporal event.
 * 
 * <p>Java class for gEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_EntityType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gEventType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlSeeAlso({
    DisciplineIncidentType.class,
    AssessmentAdministrationType.class,
    AssessmentSessionType.class,
    CrisisIncidentType.class,
    GDiscreteEventType.class,
    GIntervalEventType.class
})
public class GEventType
    extends GSIFEntityType
{


}
