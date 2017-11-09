
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingEventLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingEventLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Ex"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Ov"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingEventLocationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingEventLocationType {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Ex")
    EX("Ex"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("Ov")
    OV("Ov"),
    P("P"),
    L("L"),
    C("C"),
    O("O");
    private final String value;

    AUCodeSetsWellbeingEventLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsWellbeingEventLocationType fromValue(String v) {
        for (AUCodeSetsWellbeingEventLocationType c: AUCodeSetsWellbeingEventLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
