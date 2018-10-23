
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsAustralianTimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsAustralianTimeZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ACDT"/>
 *     &lt;enumeration value="ACST"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="ACWST"/>
 *     &lt;enumeration value="AEDT"/>
 *     &lt;enumeration value="AEST"/>
 *     &lt;enumeration value="AET"/>
 *     &lt;enumeration value="AWDT"/>
 *     &lt;enumeration value="AWST"/>
 *     &lt;enumeration value="ACDT"/>
 *     &lt;enumeration value="CXT"/>
 *     &lt;enumeration value="LHDT"/>
 *     &lt;enumeration value="LHST"/>
 *     &lt;enumeration value="NFT"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsAustralianTimeZoneType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsAustralianTimeZoneType {


    /**
     * Australian Central Daylight Time	UTC +10:30
     * 
     */
    ACDT("ACDT"),

    /**
     * Australian Central Standard Time	UTC +9:30
     * 
     */
    ACST("ACST"),

    /**
     * Australian Central Time	UTC +9:30 / +10:30
     * 
     */
    ACT("ACT"),

    /**
     * Australian Central Western Standard Time	UTC +8:45
     * 
     */
    ACWST("ACWST"),

    /**
     * Australian Eastern Daylight Time	UTC +11
     * 
     */
    AEDT("AEDT"),

    /**
     * Australian Eastern Standard Time	UTC +10
     * 
     */
    AEST("AEST"),

    /**
     * Australian Eastern Time	UTC +10:00 / +11:00
     * 
     */
    AET("AET"),

    /**
     * Australian Western Daylight Time	UTC +9
     * 
     */
    AWDT("AWDT"),

    /**
     * Australian Western Standard Time	UTC +8
     * 
     */
    AWST("AWST"),

    /**
     * Christmas Island Time	UTC +7
     * 
     */
    CXT("CXT"),

    /**
     * Lord Howe Daylight Time	UTC +11
     * 
     */
    LHDT("LHDT"),

    /**
     * Lord Howe Standard Time	UTC +10:30
     * 
     */
    LHST("LHST"),

    /**
     * Norfolk Time	UTC +11
     * 
     */
    NFT("NFT"),

    /**
     * Other Time Zone not defined
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AUCodeSetsAustralianTimeZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsAustralianTimeZoneType fromValue(String v) {
        for (AUCodeSetsAustralianTimeZoneType c: AUCodeSetsAustralianTimeZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
