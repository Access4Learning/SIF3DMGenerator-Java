
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xSessionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xSessionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FullSchoolYear"/>
 *     &lt;enumeration value="Intersession"/>
 *     &lt;enumeration value="LongSession"/>
 *     &lt;enumeration value="MiniTerm"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="Quinmester"/>
 *     &lt;enumeration value="Semester"/>
 *     &lt;enumeration value="SummerTerm"/>
 *     &lt;enumeration value="Trimester"/>
 *     &lt;enumeration value="TwelveMonth"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xSessionTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XSessionTypeType {

    @XmlEnumValue("FullSchoolYear")
    FULL_SCHOOL_YEAR("FullSchoolYear"),
    @XmlEnumValue("Intersession")
    INTERSESSION("Intersession"),
    @XmlEnumValue("LongSession")
    LONG_SESSION("LongSession"),
    @XmlEnumValue("MiniTerm")
    MINI_TERM("MiniTerm"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("Quinmester")
    QUINMESTER("Quinmester"),
    @XmlEnumValue("Semester")
    SEMESTER("Semester"),
    @XmlEnumValue("SummerTerm")
    SUMMER_TERM("SummerTerm"),
    @XmlEnumValue("Trimester")
    TRIMESTER("Trimester"),
    @XmlEnumValue("TwelveMonth")
    TWELVE_MONTH("TwelveMonth"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XSessionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XSessionTypeType fromValue(String v) {
        for (XSessionTypeType c: XSessionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
