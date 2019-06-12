
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentPlacementOtherTypesOfTransportationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentPlacementOtherTypesOfTransportationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S101"/>
 *     &lt;enumeration value="S102"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentPlacementOtherTypesOfTransportationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum StudentPlacementOtherTypesOfTransportationType {

    @XmlEnumValue("S101")
    S_101("S101"),
    @XmlEnumValue("S102")
    S_102("S102");
    private final String value;

    StudentPlacementOtherTypesOfTransportationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StudentPlacementOtherTypesOfTransportationType fromValue(String v) {
        for (StudentPlacementOtherTypesOfTransportationType c: StudentPlacementOtherTypesOfTransportationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
