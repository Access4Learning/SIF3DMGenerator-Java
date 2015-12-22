
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAttendanceStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xAttendanceStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Present"/>
 *     &lt;enumeration value="ExcusedAbsence"/>
 *     &lt;enumeration value="UnexcusedAbsence"/>
 *     &lt;enumeration value="Tardy"/>
 *     &lt;enumeration value="EarlyDeparture"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xAttendanceStatusType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XAttendanceStatusType {

    @XmlEnumValue("Present")
    PRESENT("Present"),
    @XmlEnumValue("ExcusedAbsence")
    EXCUSED_ABSENCE("ExcusedAbsence"),
    @XmlEnumValue("UnexcusedAbsence")
    UNEXCUSED_ABSENCE("UnexcusedAbsence"),
    @XmlEnumValue("Tardy")
    TARDY("Tardy"),
    @XmlEnumValue("EarlyDeparture")
    EARLY_DEPARTURE("EarlyDeparture");
    private final String value;

    XAttendanceStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XAttendanceStatusType fromValue(String v) {
        for (XAttendanceStatusType c: XAttendanceStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
