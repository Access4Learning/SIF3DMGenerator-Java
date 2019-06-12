
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Academic Achievement"/>
 *     &lt;enumeration value="Developmental"/>
 *     &lt;enumeration value="Motor"/>
 *     &lt;enumeration value="Functional Behavior"/>
 *     &lt;enumeration value="Adaptive Behavior"/>
 *     &lt;enumeration value="Transition"/>
 *     &lt;enumeration value="Vocational"/>
 *     &lt;enumeration value="Communication"/>
 *     &lt;enumeration value="Hearing"/>
 *     &lt;enumeration value="Vision"/>
 *     &lt;enumeration value="Orientation and Mobility"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="Speech"/>
 *     &lt;enumeration value="Cognitive"/>
 *     &lt;enumeration value="Social/Emotional"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepTypeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepTypeType {

    @XmlEnumValue("Academic Achievement")
    ACADEMIC_ACHIEVEMENT("Academic Achievement"),
    @XmlEnumValue("Developmental")
    DEVELOPMENTAL("Developmental"),
    @XmlEnumValue("Motor")
    MOTOR("Motor"),
    @XmlEnumValue("Functional Behavior")
    FUNCTIONAL_BEHAVIOR("Functional Behavior"),
    @XmlEnumValue("Adaptive Behavior")
    ADAPTIVE_BEHAVIOR("Adaptive Behavior"),
    @XmlEnumValue("Transition")
    TRANSITION("Transition"),
    @XmlEnumValue("Vocational")
    VOCATIONAL("Vocational"),
    @XmlEnumValue("Communication")
    COMMUNICATION("Communication"),
    @XmlEnumValue("Hearing")
    HEARING("Hearing"),
    @XmlEnumValue("Vision")
    VISION("Vision"),
    @XmlEnumValue("Orientation and Mobility")
    ORIENTATION_AND_MOBILITY("Orientation and Mobility"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("Speech")
    SPEECH("Speech"),
    @XmlEnumValue("Cognitive")
    COGNITIVE("Cognitive"),
    @XmlEnumValue("Social/Emotional")
    SOCIAL_EMOTIONAL("Social/Emotional"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IepTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepTypeType fromValue(String v) {
        for (IepTypeType c: IepTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
