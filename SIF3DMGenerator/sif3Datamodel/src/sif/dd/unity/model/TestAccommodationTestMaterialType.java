
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationTestMaterialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationTestMaterialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S101"/>
 *     &lt;enumeration value="S102"/>
 *     &lt;enumeration value="S103"/>
 *     &lt;enumeration value="S104"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationTestMaterialType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationTestMaterialType {

    @XmlEnumValue("S101")
    S_101("S101"),
    @XmlEnumValue("S102")
    S_102("S102"),
    @XmlEnumValue("S103")
    S_103("S103"),
    @XmlEnumValue("S104")
    S_104("S104");
    private final String value;

    TestAccommodationTestMaterialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationTestMaterialType fromValue(String v) {
        for (TestAccommodationTestMaterialType c: TestAccommodationTestMaterialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
