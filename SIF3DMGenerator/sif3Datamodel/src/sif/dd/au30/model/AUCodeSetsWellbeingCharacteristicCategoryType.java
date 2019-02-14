
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingCharacteristicCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingCharacteristicCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MAO"/>
 *     &lt;enumeration value="MAIM"/>
 *     &lt;enumeration value="MRD"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="MMD"/>
 *     &lt;enumeration value="MMS"/>
 *     &lt;enumeration value="MEM"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MAA"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MCM"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MGI"/>
 *     &lt;enumeration value="MND"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="M-Other"/>
 *     &lt;enumeration value="D-Other"/>
 *     &lt;enumeration value="S-Other"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingCharacteristicCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingCharacteristicCategoryType {

    MAO("MAO"),
    MAIM("MAIM"),
    MRD("MRD"),
    MB("MB"),
    MMD("MMD"),
    MMS("MMS"),
    MEM("MEM"),
    MC("MC"),
    MAA("MAA"),
    MH("MH"),
    MN("MN"),
    MS("MS"),
    MCM("MCM"),
    MI("MI"),
    MGI("MGI"),
    MND("MND"),
    MO("MO"),
    MD("MD"),
    MOP("MOP"),
    @XmlEnumValue("M-Other")
    M_OTHER("M-Other"),
    @XmlEnumValue("D-Other")
    D_OTHER("D-Other"),
    @XmlEnumValue("S-Other")
    S_OTHER("S-Other"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AUCodeSetsWellbeingCharacteristicCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsWellbeingCharacteristicCategoryType fromValue(String v) {
        for (AUCodeSetsWellbeingCharacteristicCategoryType c: AUCodeSetsWellbeingCharacteristicCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
