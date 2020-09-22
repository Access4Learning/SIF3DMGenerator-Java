
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsAGContextQuestionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsAGContextQuestionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC001"/>
 *     &lt;enumeration value="AC002"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsAGContextQuestionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsAGContextQuestionType {

    @XmlEnumValue("AC001")
    AC_001("AC001"),
    @XmlEnumValue("AC002")
    AC_002("AC002");
    private final String value;

    AUCodeSetsAGContextQuestionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsAGContextQuestionType fromValue(String v) {
        for (AUCodeSetsAGContextQuestionType c: AUCodeSetsAGContextQuestionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
