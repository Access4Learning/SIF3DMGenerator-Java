
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepLifecyclePurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepLifecyclePurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="Reevaluation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepLifecyclePurposeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepLifecyclePurposeType {

    @XmlEnumValue("Initial")
    INITIAL("Initial"),
    @XmlEnumValue("Reevaluation")
    REEVALUATION("Reevaluation");
    private final String value;

    IepLifecyclePurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepLifecyclePurposeType fromValue(String v) {
        for (IepLifecyclePurposeType c: IepLifecyclePurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
