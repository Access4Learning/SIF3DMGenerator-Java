
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentPlacementTitleIServicesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentPlacementTitleIServicesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S001"/>
 *     &lt;enumeration value="S002"/>
 *     &lt;enumeration value="S003"/>
 *     &lt;enumeration value="S004"/>
 *     &lt;enumeration value="S005"/>
 *     &lt;enumeration value="S006"/>
 *     &lt;enumeration value="S007"/>
 *     &lt;enumeration value="S008"/>
 *     &lt;enumeration value="S009"/>
 *     &lt;enumeration value="S010"/>
 *     &lt;enumeration value="S011"/>
 *     &lt;enumeration value="S012"/>
 *     &lt;enumeration value="S013"/>
 *     &lt;enumeration value="S014"/>
 *     &lt;enumeration value="S015"/>
 *     &lt;enumeration value="S016"/>
 *     &lt;enumeration value="S017"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentPlacementTitleIServicesType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum StudentPlacementTitleIServicesType {

    @XmlEnumValue("S001")
    S_001("S001"),
    @XmlEnumValue("S002")
    S_002("S002"),
    @XmlEnumValue("S003")
    S_003("S003"),
    @XmlEnumValue("S004")
    S_004("S004"),
    @XmlEnumValue("S005")
    S_005("S005"),
    @XmlEnumValue("S006")
    S_006("S006"),
    @XmlEnumValue("S007")
    S_007("S007"),
    @XmlEnumValue("S008")
    S_008("S008"),
    @XmlEnumValue("S009")
    S_009("S009"),
    @XmlEnumValue("S010")
    S_010("S010"),
    @XmlEnumValue("S011")
    S_011("S011"),
    @XmlEnumValue("S012")
    S_012("S012"),
    @XmlEnumValue("S013")
    S_013("S013"),
    @XmlEnumValue("S014")
    S_014("S014"),
    @XmlEnumValue("S015")
    S_015("S015"),
    @XmlEnumValue("S016")
    S_016("S016"),
    @XmlEnumValue("S017")
    S_017("S017");
    private final String value;

    StudentPlacementTitleIServicesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StudentPlacementTitleIServicesType fromValue(String v) {
        for (StudentPlacementTitleIServicesType c: StudentPlacementTitleIServicesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
