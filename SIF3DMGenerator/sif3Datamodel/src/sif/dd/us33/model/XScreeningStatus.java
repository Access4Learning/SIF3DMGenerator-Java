
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xScreeningStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xScreeningStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Passed"/>
 *     &lt;enumeration value="FurtherEvaluation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xScreeningStatus", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XScreeningStatus {

    @XmlEnumValue("Passed")
    PASSED("Passed"),
    @XmlEnumValue("FurtherEvaluation")
    FURTHER_EVALUATION("FurtherEvaluation");
    private final String value;

    XScreeningStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XScreeningStatus fromValue(String v) {
        for (XScreeningStatus c: XScreeningStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
