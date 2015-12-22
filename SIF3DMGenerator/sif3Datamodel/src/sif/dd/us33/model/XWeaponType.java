
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xWeaponType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xWeaponType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Firearm"/>
 *     &lt;enumeration value="Handgun"/>
 *     &lt;enumeration value="Shotgun"/>
 *     &lt;enumeration value="Rifle"/>
 *     &lt;enumeration value="OtherFirearm"/>
 *     &lt;enumeration value="Knife"/>
 *     &lt;enumeration value="KnifeLessThanTwoPointFiveInches"/>
 *     &lt;enumeration value="KnifeLessThanThreeInches"/>
 *     &lt;enumeration value="KnifeGreaterThanThreeInches"/>
 *     &lt;enumeration value="OtherSharpObject"/>
 *     &lt;enumeration value="OtherObject"/>
 *     &lt;enumeration value="Substance"/>
 *     &lt;enumeration value="OtherWeapon"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xWeaponType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XWeaponType {

    @XmlEnumValue("Firearm")
    FIREARM("Firearm"),
    @XmlEnumValue("Handgun")
    HANDGUN("Handgun"),
    @XmlEnumValue("Shotgun")
    SHOTGUN("Shotgun"),
    @XmlEnumValue("Rifle")
    RIFLE("Rifle"),
    @XmlEnumValue("OtherFirearm")
    OTHER_FIREARM("OtherFirearm"),
    @XmlEnumValue("Knife")
    KNIFE("Knife"),
    @XmlEnumValue("KnifeLessThanTwoPointFiveInches")
    KNIFE_LESS_THAN_TWO_POINT_FIVE_INCHES("KnifeLessThanTwoPointFiveInches"),
    @XmlEnumValue("KnifeLessThanThreeInches")
    KNIFE_LESS_THAN_THREE_INCHES("KnifeLessThanThreeInches"),
    @XmlEnumValue("KnifeGreaterThanThreeInches")
    KNIFE_GREATER_THAN_THREE_INCHES("KnifeGreaterThanThreeInches"),
    @XmlEnumValue("OtherSharpObject")
    OTHER_SHARP_OBJECT("OtherSharpObject"),
    @XmlEnumValue("OtherObject")
    OTHER_OBJECT("OtherObject"),
    @XmlEnumValue("Substance")
    SUBSTANCE("Substance"),
    @XmlEnumValue("OtherWeapon")
    OTHER_WEAPON("OtherWeapon"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    XWeaponType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XWeaponType fromValue(String v) {
        for (XWeaponType c: XWeaponType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
