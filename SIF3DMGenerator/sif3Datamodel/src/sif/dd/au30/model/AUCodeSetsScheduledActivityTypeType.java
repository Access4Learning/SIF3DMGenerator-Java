
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsScheduledActivityTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsScheduledActivityTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Duty"/>
 *     &lt;enumeration value="TeachingClass"/>
 *     &lt;enumeration value="Study"/>
 *     &lt;enumeration value="RollClass"/>
 *     &lt;enumeration value="RosteredTimeOff"/>
 *     &lt;enumeration value="StaffMeeting"/>
 *     &lt;enumeration value="ExtraCurricular"/>
 *     &lt;enumeration value="Excursion"/>
 *     &lt;enumeration value="Incursion"/>
 *     &lt;enumeration value="Exam"/>
 *     &lt;enumeration value="Event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsScheduledActivityTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsScheduledActivityTypeType {

    @XmlEnumValue("Duty")
    DUTY("Duty"),
    @XmlEnumValue("TeachingClass")
    TEACHING_CLASS("TeachingClass"),
    @XmlEnumValue("Study")
    STUDY("Study"),
    @XmlEnumValue("RollClass")
    ROLL_CLASS("RollClass"),
    @XmlEnumValue("RosteredTimeOff")
    ROSTERED_TIME_OFF("RosteredTimeOff"),
    @XmlEnumValue("StaffMeeting")
    STAFF_MEETING("StaffMeeting"),
    @XmlEnumValue("ExtraCurricular")
    EXTRA_CURRICULAR("ExtraCurricular"),
    @XmlEnumValue("Excursion")
    EXCURSION("Excursion"),
    @XmlEnumValue("Incursion")
    INCURSION("Incursion"),
    @XmlEnumValue("Exam")
    EXAM("Exam"),
    @XmlEnumValue("Event")
    EVENT("Event");
    private final String value;

    AUCodeSetsScheduledActivityTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsScheduledActivityTypeType fromValue(String v) {
        for (AUCodeSetsScheduledActivityTypeType c: AUCodeSetsScheduledActivityTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
