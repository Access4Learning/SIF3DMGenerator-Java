
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentPlacementOtherServicesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentPlacementOtherServicesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S200"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentPlacementOtherServicesType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum StudentPlacementOtherServicesType {

    @XmlEnumValue("S200")
    S_200("S200");
    private final String value;

    StudentPlacementOtherServicesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StudentPlacementOtherServicesType fromValue(String v) {
        for (StudentPlacementOtherServicesType c: StudentPlacementOtherServicesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
