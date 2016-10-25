
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

    @XmlEnumValue("In-Lieu")
    IN_LIEU("In-Lieu"),
    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("Underload")
    UNDERLOAD("Underload"),
    @XmlEnumValue("Casual")
    CASUAL("Casual"),
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
