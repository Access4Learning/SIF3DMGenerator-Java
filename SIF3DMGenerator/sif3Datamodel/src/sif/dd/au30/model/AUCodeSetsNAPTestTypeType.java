
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Equating"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
@XmlEnum
public enum AUCodeSetsNAPTestTypeType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Equating")
    EQUATING("Equating");
    private final String value;

    AUCodeSetsNAPTestTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPTestTypeType fromValue(String v) {
        for (AUCodeSetsNAPTestTypeType c: AUCodeSetsNAPTestTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
