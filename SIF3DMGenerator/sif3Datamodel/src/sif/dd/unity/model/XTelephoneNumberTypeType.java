
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xTelephoneNumberTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xTelephoneNumberTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xTelephoneNumberTypeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XTelephoneNumberTypeType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XTelephoneNumberTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XTelephoneNumberTypeType fromValue(String v) {
        for (XTelephoneNumberTypeType c: XTelephoneNumberTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
