
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xResponsibleSchoolTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xResponsibleSchoolTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Accountability"/>
 *     &lt;enumeration value="Attendance"/>
 *     &lt;enumeration value="Funding"/>
 *     &lt;enumeration value="Graduation"/>
 *     &lt;enumeration value="IEP"/>
 *     &lt;enumeration value="Transportation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xResponsibleSchoolTypeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XResponsibleSchoolTypeType {

    @XmlEnumValue("Accountability")
    ACCOUNTABILITY("Accountability"),
    @XmlEnumValue("Attendance")
    ATTENDANCE("Attendance"),
    @XmlEnumValue("Funding")
    FUNDING("Funding"),
    @XmlEnumValue("Graduation")
    GRADUATION("Graduation"),
    IEP("IEP"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation");
    private final String value;

    XResponsibleSchoolTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XResponsibleSchoolTypeType fromValue(String v) {
        for (XResponsibleSchoolTypeType c: XResponsibleSchoolTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
