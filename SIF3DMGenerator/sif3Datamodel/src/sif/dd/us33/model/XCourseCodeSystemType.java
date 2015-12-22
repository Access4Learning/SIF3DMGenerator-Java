
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xCourseCodeSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xCourseCodeSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Intermediate"/>
 *     &lt;enumeration value="LEA"/>
 *     &lt;enumeration value="NCES"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SCED"/>
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="University"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xCourseCodeSystemType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XCourseCodeSystemType {

    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    LEA("LEA"),
    NCES("NCES"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    SCED("SCED"),
    @XmlEnumValue("School")
    SCHOOL("School"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("University")
    UNIVERSITY("University");
    private final String value;

    XCourseCodeSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XCourseCodeSystemType fromValue(String v) {
        for (XCourseCodeSystemType c: XCourseCodeSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
