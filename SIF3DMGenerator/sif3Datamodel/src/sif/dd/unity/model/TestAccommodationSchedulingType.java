
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationSchedulingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationSchedulingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S182"/>
 *     &lt;enumeration value="S183"/>
 *     &lt;enumeration value="S184"/>
 *     &lt;enumeration value="S185"/>
 *     &lt;enumeration value="S186"/>
 *     &lt;enumeration value="S187"/>
 *     &lt;enumeration value="S188"/>
 *     &lt;enumeration value="S189"/>
 *     &lt;enumeration value="S190"/>
 *     &lt;enumeration value="S191"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationSchedulingType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationSchedulingType {

    @XmlEnumValue("S182")
    S_182("S182"),
    @XmlEnumValue("S183")
    S_183("S183"),
    @XmlEnumValue("S184")
    S_184("S184"),
    @XmlEnumValue("S185")
    S_185("S185"),
    @XmlEnumValue("S186")
    S_186("S186"),
    @XmlEnumValue("S187")
    S_187("S187"),
    @XmlEnumValue("S188")
    S_188("S188"),
    @XmlEnumValue("S189")
    S_189("S189"),
    @XmlEnumValue("S190")
    S_190("S190"),
    @XmlEnumValue("S191")
    S_191("S191");
    private final String value;

    TestAccommodationSchedulingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationSchedulingType fromValue(String v) {
        for (TestAccommodationSchedulingType c: TestAccommodationSchedulingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
