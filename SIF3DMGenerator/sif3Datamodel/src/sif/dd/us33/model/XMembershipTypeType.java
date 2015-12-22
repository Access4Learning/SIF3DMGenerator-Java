
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xMembershipTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xMembershipTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Concurrent"/>
 *     &lt;enumeration value="Summer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xMembershipTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XMembershipTypeType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Concurrent")
    CONCURRENT("Concurrent"),
    @XmlEnumValue("Summer")
    SUMMER("Summer");
    private final String value;

    XMembershipTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XMembershipTypeType fromValue(String v) {
        for (XMembershipTypeType c: XMembershipTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
