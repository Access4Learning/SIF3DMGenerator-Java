
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepInclusiveSettingIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepInclusiveSettingIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepInclusiveSettingIndicatorType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepInclusiveSettingIndicatorType {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    IepInclusiveSettingIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepInclusiveSettingIndicatorType fromValue(String v) {
        for (IepInclusiveSettingIndicatorType c: IepInclusiveSettingIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
