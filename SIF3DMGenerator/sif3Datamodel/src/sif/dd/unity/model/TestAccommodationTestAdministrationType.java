
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationTestAdministrationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationTestAdministrationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S105"/>
 *     &lt;enumeration value="S106"/>
 *     &lt;enumeration value="S107"/>
 *     &lt;enumeration value="S108"/>
 *     &lt;enumeration value="S109"/>
 *     &lt;enumeration value="S110"/>
 *     &lt;enumeration value="S111"/>
 *     &lt;enumeration value="S112"/>
 *     &lt;enumeration value="S113"/>
 *     &lt;enumeration value="S114"/>
 *     &lt;enumeration value="S115"/>
 *     &lt;enumeration value="S116"/>
 *     &lt;enumeration value="S117"/>
 *     &lt;enumeration value="S118"/>
 *     &lt;enumeration value="S119"/>
 *     &lt;enumeration value="S120"/>
 *     &lt;enumeration value="S121"/>
 *     &lt;enumeration value="S122"/>
 *     &lt;enumeration value="S123"/>
 *     &lt;enumeration value="S124"/>
 *     &lt;enumeration value="S125"/>
 *     &lt;enumeration value="S126"/>
 *     &lt;enumeration value="S127"/>
 *     &lt;enumeration value="S128"/>
 *     &lt;enumeration value="S129"/>
 *     &lt;enumeration value="S130"/>
 *     &lt;enumeration value="S131"/>
 *     &lt;enumeration value="S132"/>
 *     &lt;enumeration value="S133"/>
 *     &lt;enumeration value="S134"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationTestAdministrationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationTestAdministrationType {

    @XmlEnumValue("S105")
    S_105("S105"),
    @XmlEnumValue("S106")
    S_106("S106"),
    @XmlEnumValue("S107")
    S_107("S107"),
    @XmlEnumValue("S108")
    S_108("S108"),
    @XmlEnumValue("S109")
    S_109("S109"),
    @XmlEnumValue("S110")
    S_110("S110"),
    @XmlEnumValue("S111")
    S_111("S111"),
    @XmlEnumValue("S112")
    S_112("S112"),
    @XmlEnumValue("S113")
    S_113("S113"),
    @XmlEnumValue("S114")
    S_114("S114"),
    @XmlEnumValue("S115")
    S_115("S115"),
    @XmlEnumValue("S116")
    S_116("S116"),
    @XmlEnumValue("S117")
    S_117("S117"),
    @XmlEnumValue("S118")
    S_118("S118"),
    @XmlEnumValue("S119")
    S_119("S119"),
    @XmlEnumValue("S120")
    S_120("S120"),
    @XmlEnumValue("S121")
    S_121("S121"),
    @XmlEnumValue("S122")
    S_122("S122"),
    @XmlEnumValue("S123")
    S_123("S123"),
    @XmlEnumValue("S124")
    S_124("S124"),
    @XmlEnumValue("S125")
    S_125("S125"),
    @XmlEnumValue("S126")
    S_126("S126"),
    @XmlEnumValue("S127")
    S_127("S127"),
    @XmlEnumValue("S128")
    S_128("S128"),
    @XmlEnumValue("S129")
    S_129("S129"),
    @XmlEnumValue("S130")
    S_130("S130"),
    @XmlEnumValue("S131")
    S_131("S131"),
    @XmlEnumValue("S132")
    S_132("S132"),
    @XmlEnumValue("S133")
    S_133("S133"),
    @XmlEnumValue("S134")
    S_134("S134");
    private final String value;

    TestAccommodationTestAdministrationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationTestAdministrationType fromValue(String v) {
        for (TestAccommodationTestAdministrationType c: TestAccommodationTestAdministrationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
