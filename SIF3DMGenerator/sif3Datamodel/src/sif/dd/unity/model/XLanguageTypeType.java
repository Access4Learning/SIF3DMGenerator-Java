
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xLanguageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xLanguageTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Correspondence"/>
 *     &lt;enumeration value="Dominant"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Native"/>
 *     &lt;enumeration value="OtherLanguageProficiency"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xLanguageTypeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XLanguageTypeType {

    @XmlEnumValue("Correspondence")
    CORRESPONDENCE("Correspondence"),
    @XmlEnumValue("Dominant")
    DOMINANT("Dominant"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Native")
    NATIVE("Native"),
    @XmlEnumValue("OtherLanguageProficiency")
    OTHER_LANGUAGE_PROFICIENCY("OtherLanguageProficiency"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XLanguageTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XLanguageTypeType fromValue(String v) {
        for (XLanguageTypeType c: XLanguageTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
