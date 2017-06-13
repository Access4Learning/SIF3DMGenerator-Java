
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsTeacherCoverCreditType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsTeacherCoverCreditType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="In-Lieu"/>
 *     &lt;enumeration value="Extra"/>
 *     &lt;enumeration value="Underload"/>
 *     &lt;enumeration value="Casual"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsTeacherCoverCreditType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsTeacherCoverCreditType {


    /**
     * The cover is taken as replacement for a cancelled class
     * 
     */
    @XmlEnumValue("In-Lieu")
    IN_LIEU("In-Lieu"),

    /**
     * The cover counts towards the teacher's extras quota
     * 
     */
    @XmlEnumValue("Extra")
    EXTRA("Extra"),

    /**
     * The cover is not counted as an extra because the teacher is underloaded on the cyclical timetable
     * 
     */
    @XmlEnumValue("Underload")
    UNDERLOAD("Underload"),

    /**
     * The event is supervised by a casual teacher
     * 
     */
    @XmlEnumValue("Casual")
    CASUAL("Casual"),

    /**
     * Redacted for privacy
     * 
     */
    ZZREDACTED("ZZREDACTED");
    private final String value;

    AUCodeSetsTeacherCoverCreditType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsTeacherCoverCreditType fromValue(String v) {
        for (AUCodeSetsTeacherCoverCreditType c: AUCodeSetsTeacherCoverCreditType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
