
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingEventTimePeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingEventTimePeriodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="Ex"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingEventTimePeriodType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingEventTimePeriodType {


    /**
     * AM
     * 
     */
    AM("AM"),

    /**
     * PM
     * 
     */
    PM("PM"),

    /**
     * Recess
     * 
     */
    R("R"),

    /**
     * Before School
     * 
     */
    B("B"),

    /**
     * After School
     * 
     */
    A("A"),

    /**
     * Excursion
     * 
     */
    @XmlEnumValue("Ex")
    EX("Ex"),

    /**
     * Weekend
     * 
     */
    W("W"),

    /**
     * Other
     * 
     */
    O("O");
    private final String value;

    AUCodeSetsWellbeingEventTimePeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsWellbeingEventTimePeriodType fromValue(String v) {
        for (AUCodeSetsWellbeingEventTimePeriodType c: AUCodeSetsWellbeingEventTimePeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
