
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xPersonNameTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xPersonNameTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="Nickname"/>
 *     &lt;enumeration value="OtherName"/>
 *     &lt;enumeration value="PreviousLegalName"/>
 *     &lt;enumeration value="PreferredFamilyName"/>
 *     &lt;enumeration value="PreferredGivenName"/>
 *     &lt;enumeration value="FullName"/>
 *     &lt;enumeration value="LegalName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xPersonNameTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XPersonNameTypeType {

    @XmlEnumValue("Alias")
    ALIAS("Alias"),
    @XmlEnumValue("Nickname")
    NICKNAME("Nickname"),
    @XmlEnumValue("OtherName")
    OTHER_NAME("OtherName"),
    @XmlEnumValue("PreviousLegalName")
    PREVIOUS_LEGAL_NAME("PreviousLegalName"),
    @XmlEnumValue("PreferredFamilyName")
    PREFERRED_FAMILY_NAME("PreferredFamilyName"),
    @XmlEnumValue("PreferredGivenName")
    PREFERRED_GIVEN_NAME("PreferredGivenName"),
    @XmlEnumValue("FullName")
    FULL_NAME("FullName"),
    @XmlEnumValue("LegalName")
    LEGAL_NAME("LegalName");
    private final String value;

    XPersonNameTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPersonNameTypeType fromValue(String v) {
        for (XPersonNameTypeType c: XPersonNameTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
