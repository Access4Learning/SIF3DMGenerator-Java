
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xRaceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xRaceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AmericanIndianOrAlaskaNative"/>
 *     &lt;enumeration value="Asian"/>
 *     &lt;enumeration value="BlackOrAfricanAmerican"/>
 *     &lt;enumeration value="NativeHawaiianOrOtherPacificIslander"/>
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="DemographicRaceTwoOrMoreRaces"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xRaceTypeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XRaceTypeType {

    @XmlEnumValue("AmericanIndianOrAlaskaNative")
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("AmericanIndianOrAlaskaNative"),
    @XmlEnumValue("Asian")
    ASIAN("Asian"),
    @XmlEnumValue("BlackOrAfricanAmerican")
    BLACK_OR_AFRICAN_AMERICAN("BlackOrAfricanAmerican"),
    @XmlEnumValue("NativeHawaiianOrOtherPacificIslander")
    NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("NativeHawaiianOrOtherPacificIslander"),
    @XmlEnumValue("White")
    WHITE("White"),
    @XmlEnumValue("DemographicRaceTwoOrMoreRaces")
    DEMOGRAPHIC_RACE_TWO_OR_MORE_RACES("DemographicRaceTwoOrMoreRaces");
    private final String value;

    XRaceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XRaceTypeType fromValue(String v) {
        for (XRaceTypeType c: XRaceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
