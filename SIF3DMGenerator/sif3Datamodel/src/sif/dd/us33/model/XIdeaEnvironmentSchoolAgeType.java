
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xIdeaEnvironmentSchoolAgeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xIdeaEnvironmentSchoolAgeType">
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
@XmlType(name = "xIdeaEnvironmentSchoolAgeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XIdeaEnvironmentSchoolAgeType {

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

    XIdeaEnvironmentSchoolAgeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XIdeaEnvironmentSchoolAgeType fromValue(String v) {
        for (XIdeaEnvironmentSchoolAgeType c: XIdeaEnvironmentSchoolAgeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
