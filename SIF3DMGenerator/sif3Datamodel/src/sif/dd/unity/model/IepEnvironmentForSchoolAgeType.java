
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepEnvironmentForSchoolAgeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepEnvironmentForSchoolAgeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RC80"/>
 *     &lt;enumeration value="RC79TO40"/>
 *     &lt;enumeration value="RC39"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="HH"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="PPPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepEnvironmentForSchoolAgeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepEnvironmentForSchoolAgeType {

    @XmlEnumValue("RC80")
    RC_80("RC80"),
    @XmlEnumValue("RC79TO40")
    RC_79_TO_40("RC79TO40"),
    @XmlEnumValue("RC39")
    RC_39("RC39"),
    SS("SS"),
    RF("RF"),
    HH("HH"),
    CF("CF"),
    PPPS("PPPS");
    private final String value;

    IepEnvironmentForSchoolAgeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepEnvironmentForSchoolAgeType fromValue(String v) {
        for (IepEnvironmentForSchoolAgeType c: IepEnvironmentForSchoolAgeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
