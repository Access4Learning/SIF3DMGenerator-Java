
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAttendanceEventTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xAttendanceEventTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DailyAttendance"/>
 *     &lt;enumeration value="ClassSectionAttendance"/>
 *     &lt;enumeration value="ProgramAttendance"/>
 *     &lt;enumeration value="ExtracurricularAttendance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xAttendanceEventTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XAttendanceEventTypeType {

    @XmlEnumValue("DailyAttendance")
    DAILY_ATTENDANCE("DailyAttendance"),
    @XmlEnumValue("ClassSectionAttendance")
    CLASS_SECTION_ATTENDANCE("ClassSectionAttendance"),
    @XmlEnumValue("ProgramAttendance")
    PROGRAM_ATTENDANCE("ProgramAttendance"),
    @XmlEnumValue("ExtracurricularAttendance")
    EXTRACURRICULAR_ATTENDANCE("ExtracurricularAttendance");
    private final String value;

    XAttendanceEventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XAttendanceEventTypeType fromValue(String v) {
        for (XAttendanceEventTypeType c: XAttendanceEventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
