
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftedTalentedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GiftedTalentedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GiftedTalentedType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum GiftedTalentedType {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    GiftedTalentedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GiftedTalentedType fromValue(String v) {
        for (GiftedTalentedType c: GiftedTalentedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
