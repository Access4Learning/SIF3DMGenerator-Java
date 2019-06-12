
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAddressTypeForOrganizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xAddressTypeForOrganizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Mailing"/>
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Shipping"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xAddressTypeForOrganizationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XAddressTypeForOrganizationType {

    @XmlEnumValue("Mailing")
    MAILING("Mailing"),
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping");
    private final String value;

    XAddressTypeForOrganizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XAddressTypeForOrganizationType fromValue(String v) {
        for (XAddressTypeForOrganizationType c: XAddressTypeForOrganizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
