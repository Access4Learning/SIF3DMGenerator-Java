
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingAppealStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingAppealStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="N/S"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="SU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingAppealStatusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingAppealStatusType {


    /**
     * In Progress
     * 
     */
    N("N"),

    /**
     * Not Specified
     * 
     */
    @XmlEnumValue("N/S")
    N_S("N/S"),

    /**
     * Rejected
     * 
     */
    RE("RE"),

    /**
     * Successful
     * 
     */
    SU("SU");
    private final String value;

    AUCodeSetsWellbeingAppealStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsWellbeingAppealStatusType fromValue(String v) {
        for (AUCodeSetsWellbeingAppealStatusType c: AUCodeSetsWellbeingAppealStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
