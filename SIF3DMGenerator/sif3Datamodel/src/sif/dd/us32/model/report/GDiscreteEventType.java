
package sif.dd.us32.model.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A discrete event that occurs at a particular point in time.
 * 
 * <p>Java class for gDiscreteEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gDiscreteEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEventType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gDiscreteEventType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlSeeAlso({
    GSchoolCalendarItemType.class
})
public class GDiscreteEventType
    extends GEventType
{


}
