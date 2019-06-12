
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LearningStandardItemCourseCodeSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LearningStandardItemCourseCodeSystemType">
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
@XmlType(name = "LearningStandardItemCourseCodeSystemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum LearningStandardItemCourseCodeSystemType {

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

    LearningStandardItemCourseCodeSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LearningStandardItemCourseCodeSystemType fromValue(String v) {
        for (LearningStandardItemCourseCodeSystemType c: LearningStandardItemCourseCodeSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
