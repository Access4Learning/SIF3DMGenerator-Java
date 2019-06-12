
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationSettingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationSettingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S192"/>
 *     &lt;enumeration value="S193"/>
 *     &lt;enumeration value="S194"/>
 *     &lt;enumeration value="S195"/>
 *     &lt;enumeration value="S196"/>
 *     &lt;enumeration value="S197"/>
 *     &lt;enumeration value="S198"/>
 *     &lt;enumeration value="S199"/>
 *     &lt;enumeration value="S200"/>
 *     &lt;enumeration value="S201"/>
 *     &lt;enumeration value="S202"/>
 *     &lt;enumeration value="S203"/>
 *     &lt;enumeration value="S204"/>
 *     &lt;enumeration value="S205"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationSettingType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationSettingType {

    @XmlEnumValue("S192")
    S_192("S192"),
    @XmlEnumValue("S193")
    S_193("S193"),
    @XmlEnumValue("S194")
    S_194("S194"),
    @XmlEnumValue("S195")
    S_195("S195"),
    @XmlEnumValue("S196")
    S_196("S196"),
    @XmlEnumValue("S197")
    S_197("S197"),
    @XmlEnumValue("S198")
    S_198("S198"),
    @XmlEnumValue("S199")
    S_199("S199"),
    @XmlEnumValue("S200")
    S_200("S200"),
    @XmlEnumValue("S201")
    S_201("S201"),
    @XmlEnumValue("S202")
    S_202("S202"),
    @XmlEnumValue("S203")
    S_203("S203"),
    @XmlEnumValue("S204")
    S_204("S204"),
    @XmlEnumValue("S205")
    S_205("S205");
    private final String value;

    TestAccommodationSettingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationSettingType fromValue(String v) {
        for (TestAccommodationSettingType c: TestAccommodationSettingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
