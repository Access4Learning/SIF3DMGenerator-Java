
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestletTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestletTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Override"/>
 *     &lt;enumeration value="Equating"/>
 *     &lt;enumeration value="Adjustment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestletTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPTestletTypeType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Override")
    OVERRIDE("Override"),
    @XmlEnumValue("Equating")
    EQUATING("Equating"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment");
    private final String value;

    AUCodeSetsNAPTestletTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPTestletTypeType fromValue(String v) {
        for (AUCodeSetsNAPTestletTypeType c: AUCodeSetsNAPTestletTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
