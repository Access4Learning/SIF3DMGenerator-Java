
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xTelephoneTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xTelephoneTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xTelephoneTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XTelephoneTypeType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    XTelephoneTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XTelephoneTypeType fromValue(String v) {
        for (XTelephoneTypeType c: XTelephoneTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
