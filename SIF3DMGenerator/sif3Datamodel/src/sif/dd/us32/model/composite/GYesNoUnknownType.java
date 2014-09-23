
package sif.dd.us32.model.composite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gYesNoUnknownType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gYesNoUnknownType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gYesNoUnknownType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlEnum
public enum GYesNoUnknownType {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    GYesNoUnknownType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GYesNoUnknownType fromValue(String v) {
        for (GYesNoUnknownType c: GYesNoUnknownType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
