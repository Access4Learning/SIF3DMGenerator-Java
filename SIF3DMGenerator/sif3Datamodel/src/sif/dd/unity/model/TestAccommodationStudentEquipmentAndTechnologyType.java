
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationStudentEquipmentAndTechnologyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationStudentEquipmentAndTechnologyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S135"/>
 *     &lt;enumeration value="S136"/>
 *     &lt;enumeration value="S137"/>
 *     &lt;enumeration value="S138"/>
 *     &lt;enumeration value="S139"/>
 *     &lt;enumeration value="S140"/>
 *     &lt;enumeration value="S141"/>
 *     &lt;enumeration value="S142"/>
 *     &lt;enumeration value="S143"/>
 *     &lt;enumeration value="S144"/>
 *     &lt;enumeration value="S145"/>
 *     &lt;enumeration value="S146"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationStudentEquipmentAndTechnologyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationStudentEquipmentAndTechnologyType {

    @XmlEnumValue("S135")
    S_135("S135"),
    @XmlEnumValue("S136")
    S_136("S136"),
    @XmlEnumValue("S137")
    S_137("S137"),
    @XmlEnumValue("S138")
    S_138("S138"),
    @XmlEnumValue("S139")
    S_139("S139"),
    @XmlEnumValue("S140")
    S_140("S140"),
    @XmlEnumValue("S141")
    S_141("S141"),
    @XmlEnumValue("S142")
    S_142("S142"),
    @XmlEnumValue("S143")
    S_143("S143"),
    @XmlEnumValue("S144")
    S_144("S144"),
    @XmlEnumValue("S145")
    S_145("S145"),
    @XmlEnumValue("S146")
    S_146("S146");
    private final String value;

    TestAccommodationStudentEquipmentAndTechnologyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationStudentEquipmentAndTechnologyType fromValue(String v) {
        for (TestAccommodationStudentEquipmentAndTechnologyType c: TestAccommodationStudentEquipmentAndTechnologyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
