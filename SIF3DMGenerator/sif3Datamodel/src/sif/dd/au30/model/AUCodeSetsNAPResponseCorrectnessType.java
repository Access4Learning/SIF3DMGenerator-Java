
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPResponseCorrectnessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPResponseCorrectnessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Correct"/>
 *     &lt;enumeration value="Incorrect"/>
 *     &lt;enumeration value="NotInPath"/>
 *     &lt;enumeration value="NotAttempted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPResponseCorrectnessType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPResponseCorrectnessType {


    /**
     * Correct
     * 
     */
    @XmlEnumValue("Correct")
    CORRECT("Correct"),

    /**
     * Incorrect
     * 
     */
    @XmlEnumValue("Incorrect")
    INCORRECT("Incorrect"),

    /**
     * NotInPath
     * 
     */
    @XmlEnumValue("NotInPath")
    NOT_IN_PATH("NotInPath"),

    /**
     * NotAttempted
     * 
     */
    @XmlEnumValue("NotAttempted")
    NOT_ATTEMPTED("NotAttempted");
    private final String value;

    AUCodeSetsNAPResponseCorrectnessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPResponseCorrectnessType fromValue(String v) {
        for (AUCodeSetsNAPResponseCorrectnessType c: AUCodeSetsNAPResponseCorrectnessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
