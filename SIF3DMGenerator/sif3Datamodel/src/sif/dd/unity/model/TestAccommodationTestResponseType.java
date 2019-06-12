
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestAccommodationTestResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestAccommodationTestResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S147"/>
 *     &lt;enumeration value="S148"/>
 *     &lt;enumeration value="S149"/>
 *     &lt;enumeration value="S150"/>
 *     &lt;enumeration value="S151"/>
 *     &lt;enumeration value="S152"/>
 *     &lt;enumeration value="S153"/>
 *     &lt;enumeration value="S154"/>
 *     &lt;enumeration value="S155"/>
 *     &lt;enumeration value="S156"/>
 *     &lt;enumeration value="S157"/>
 *     &lt;enumeration value="S158"/>
 *     &lt;enumeration value="S159"/>
 *     &lt;enumeration value="S160"/>
 *     &lt;enumeration value="S161"/>
 *     &lt;enumeration value="S162"/>
 *     &lt;enumeration value="S163"/>
 *     &lt;enumeration value="S164"/>
 *     &lt;enumeration value="S165"/>
 *     &lt;enumeration value="S166"/>
 *     &lt;enumeration value="S167"/>
 *     &lt;enumeration value="S168"/>
 *     &lt;enumeration value="S169"/>
 *     &lt;enumeration value="S170"/>
 *     &lt;enumeration value="S171"/>
 *     &lt;enumeration value="S172"/>
 *     &lt;enumeration value="S173"/>
 *     &lt;enumeration value="S174"/>
 *     &lt;enumeration value="S175"/>
 *     &lt;enumeration value="S176"/>
 *     &lt;enumeration value="S177"/>
 *     &lt;enumeration value="S178"/>
 *     &lt;enumeration value="S179"/>
 *     &lt;enumeration value="S180"/>
 *     &lt;enumeration value="S181"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestAccommodationTestResponseType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum TestAccommodationTestResponseType {

    @XmlEnumValue("S147")
    S_147("S147"),
    @XmlEnumValue("S148")
    S_148("S148"),
    @XmlEnumValue("S149")
    S_149("S149"),
    @XmlEnumValue("S150")
    S_150("S150"),
    @XmlEnumValue("S151")
    S_151("S151"),
    @XmlEnumValue("S152")
    S_152("S152"),
    @XmlEnumValue("S153")
    S_153("S153"),
    @XmlEnumValue("S154")
    S_154("S154"),
    @XmlEnumValue("S155")
    S_155("S155"),
    @XmlEnumValue("S156")
    S_156("S156"),
    @XmlEnumValue("S157")
    S_157("S157"),
    @XmlEnumValue("S158")
    S_158("S158"),
    @XmlEnumValue("S159")
    S_159("S159"),
    @XmlEnumValue("S160")
    S_160("S160"),
    @XmlEnumValue("S161")
    S_161("S161"),
    @XmlEnumValue("S162")
    S_162("S162"),
    @XmlEnumValue("S163")
    S_163("S163"),
    @XmlEnumValue("S164")
    S_164("S164"),
    @XmlEnumValue("S165")
    S_165("S165"),
    @XmlEnumValue("S166")
    S_166("S166"),
    @XmlEnumValue("S167")
    S_167("S167"),
    @XmlEnumValue("S168")
    S_168("S168"),
    @XmlEnumValue("S169")
    S_169("S169"),
    @XmlEnumValue("S170")
    S_170("S170"),
    @XmlEnumValue("S171")
    S_171("S171"),
    @XmlEnumValue("S172")
    S_172("S172"),
    @XmlEnumValue("S173")
    S_173("S173"),
    @XmlEnumValue("S174")
    S_174("S174"),
    @XmlEnumValue("S175")
    S_175("S175"),
    @XmlEnumValue("S176")
    S_176("S176"),
    @XmlEnumValue("S177")
    S_177("S177"),
    @XmlEnumValue("S178")
    S_178("S178"),
    @XmlEnumValue("S179")
    S_179("S179"),
    @XmlEnumValue("S180")
    S_180("S180"),
    @XmlEnumValue("S181")
    S_181("S181");
    private final String value;

    TestAccommodationTestResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestAccommodationTestResponseType fromValue(String v) {
        for (TestAccommodationTestResponseType c: TestAccommodationTestResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
