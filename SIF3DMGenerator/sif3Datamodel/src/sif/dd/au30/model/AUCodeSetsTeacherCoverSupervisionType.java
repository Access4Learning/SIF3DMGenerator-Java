
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsTeacherCoverSupervisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsTeacherCoverSupervisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="MinimalSupervision"/>
 *     &lt;enumeration value="MergedClass"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsTeacherCoverSupervisionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsTeacherCoverSupervisionType {


    /**
     * Normal supervision
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * Minimal supervision
     * 
     */
    @XmlEnumValue("MinimalSupervision")
    MINIMAL_SUPERVISION("MinimalSupervision"),

    /**
     * The event is a merged class
     * 
     */
    @XmlEnumValue("MergedClass")
    MERGED_CLASS("MergedClass"),

    /**
     * Redacted for privacy
     * 
     */
    ZZREDACTED("ZZREDACTED");
    private final String value;

    AUCodeSetsTeacherCoverSupervisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsTeacherCoverSupervisionType fromValue(String v) {
        for (AUCodeSetsTeacherCoverSupervisionType c: AUCodeSetsTeacherCoverSupervisionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
