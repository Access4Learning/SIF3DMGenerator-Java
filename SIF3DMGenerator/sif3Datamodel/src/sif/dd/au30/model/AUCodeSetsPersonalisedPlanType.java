
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsPersonalisedPlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsPersonalisedPlanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="At"/>
 *     &lt;enumeration value="Ac"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsPersonalisedPlanType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsPersonalisedPlanType {

    M("M"),
    @XmlEnumValue("At")
    AT("At"),
    @XmlEnumValue("Ac")
    AC("Ac"),
    B("B"),
    S("S"),
    L("L"),
    O("O"),
    W("W"),
    R("R");
    private final String value;

    AUCodeSetsPersonalisedPlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsPersonalisedPlanType fromValue(String v) {
        for (AUCodeSetsPersonalisedPlanType c: AUCodeSetsPersonalisedPlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
