
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xEmailTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xEmailTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Organizational"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xEmailTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XEmailTypeType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Organizational")
    ORGANIZATIONAL("Organizational"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XEmailTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XEmailTypeType fromValue(String v) {
        for (XEmailTypeType c: XEmailTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
