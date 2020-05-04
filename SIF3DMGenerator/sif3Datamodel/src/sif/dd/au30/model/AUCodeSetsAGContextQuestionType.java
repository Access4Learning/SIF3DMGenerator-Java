
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
 *     &lt;enumeration value="NGSC001"/>
 *     &lt;enumeration value="NGSC002"/>
 *     &lt;enumeration value="NGSC003"/>
 *     &lt;enumeration value="NGSC004"/>
 *     &lt;enumeration value="NGSC005"/>
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
    AC_002("AC002"),
    @XmlEnumValue("NGSC001")
    NGSC_001("NGSC001"),
    @XmlEnumValue("NGSC002")
    NGSC_002("NGSC002"),
    @XmlEnumValue("NGSC003")
    NGSC_003("NGSC003"),
    @XmlEnumValue("NGSC004")
    NGSC_004("NGSC004"),
    @XmlEnumValue("NGSC005")
    NGSC_005("NGSC005");
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
