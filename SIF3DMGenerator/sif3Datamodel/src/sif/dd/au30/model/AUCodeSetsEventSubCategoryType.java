
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsEventSubCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsEventSubCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="B1a"/>
 *     &lt;enumeration value="B1b"/>
 *     &lt;enumeration value="B1c"/>
 *     &lt;enumeration value="B1d"/>
 *     &lt;enumeration value="B1e"/>
 *     &lt;enumeration value="B1f"/>
 *     &lt;enumeration value="B1g"/>
 *     &lt;enumeration value="B1h"/>
 *     &lt;enumeration value="B1i"/>
 *     &lt;enumeration value="B2a"/>
 *     &lt;enumeration value="B2b"/>
 *     &lt;enumeration value="B2c"/>
 *     &lt;enumeration value="B2d"/>
 *     &lt;enumeration value="B2e"/>
 *     &lt;enumeration value="B3a"/>
 *     &lt;enumeration value="B3b"/>
 *     &lt;enumeration value="B3c"/>
 *     &lt;enumeration value="B3d"/>
 *     &lt;enumeration value="B3e"/>
 *     &lt;enumeration value="B3f"/>
 *     &lt;enumeration value="B3g"/>
 *     &lt;enumeration value="B3h"/>
 *     &lt;enumeration value="B3i"/>
 *     &lt;enumeration value="B3j"/>
 *     &lt;enumeration value="B4a"/>
 *     &lt;enumeration value="B4b"/>
 *     &lt;enumeration value="B4c"/>
 *     &lt;enumeration value="B4d"/>
 *     &lt;enumeration value="B4e"/>
 *     &lt;enumeration value="B4f"/>
 *     &lt;enumeration value="B4g"/>
 *     &lt;enumeration value="B4h"/>
 *     &lt;enumeration value="B4i"/>
 *     &lt;enumeration value="B4j"/>
 *     &lt;enumeration value="B5a"/>
 *     &lt;enumeration value="B5b"/>
 *     &lt;enumeration value="B5c"/>
 *     &lt;enumeration value="B5d"/>
 *     &lt;enumeration value="B5e"/>
 *     &lt;enumeration value="B5f"/>
 *     &lt;enumeration value="B5g"/>
 *     &lt;enumeration value="B5h"/>
 *     &lt;enumeration value="B5i"/>
 *     &lt;enumeration value="B5j"/>
 *     &lt;enumeration value="B5k"/>
 *     &lt;enumeration value="B5l"/>
 *     &lt;enumeration value="B5m"/>
 *     &lt;enumeration value="B5n"/>
 *     &lt;enumeration value="B5o"/>
 *     &lt;enumeration value="B6a"/>
 *     &lt;enumeration value="B6b"/>
 *     &lt;enumeration value="B6c"/>
 *     &lt;enumeration value="B6d"/>
 *     &lt;enumeration value="B6e"/>
 *     &lt;enumeration value="B6f"/>
 *     &lt;enumeration value="B6g"/>
 *     &lt;enumeration value="B6h"/>
 *     &lt;enumeration value="B6i"/>
 *     &lt;enumeration value="B7a"/>
 *     &lt;enumeration value="B7b"/>
 *     &lt;enumeration value="B7c"/>
 *     &lt;enumeration value="B7d"/>
 *     &lt;enumeration value="B7e"/>
 *     &lt;enumeration value="B7f"/>
 *     &lt;enumeration value="B7g"/>
 *     &lt;enumeration value="B7h"/>
 *     &lt;enumeration value="B7i"/>
 *     &lt;enumeration value="B7j"/>
 *     &lt;enumeration value="B7k"/>
 *     &lt;enumeration value="B7l"/>
 *     &lt;enumeration value="B7m"/>
 *     &lt;enumeration value="B7n"/>
 *     &lt;enumeration value="B8a"/>
 *     &lt;enumeration value="B8b"/>
 *     &lt;enumeration value="B8c"/>
 *     &lt;enumeration value="B8d"/>
 *     &lt;enumeration value="B8e"/>
 *     &lt;enumeration value="B8f"/>
 *     &lt;enumeration value="B8g"/>
 *     &lt;enumeration value="B8h"/>
 *     &lt;enumeration value="B9a"/>
 *     &lt;enumeration value="B9b"/>
 *     &lt;enumeration value="B9c"/>
 *     &lt;enumeration value="B9d"/>
 *     &lt;enumeration value="B9e"/>
 *     &lt;enumeration value="B9f"/>
 *     &lt;enumeration value="B9g"/>
 *     &lt;enumeration value="B9h"/>
 *     &lt;enumeration value="B9i"/>
 *     &lt;enumeration value="B9j"/>
 *     &lt;enumeration value="M1a"/>
 *     &lt;enumeration value="M1b"/>
 *     &lt;enumeration value="M1c"/>
 *     &lt;enumeration value="M1d"/>
 *     &lt;enumeration value="M1e"/>
 *     &lt;enumeration value="M1f"/>
 *     &lt;enumeration value="M2a"/>
 *     &lt;enumeration value="M2b"/>
 *     &lt;enumeration value="M2c"/>
 *     &lt;enumeration value="M2d"/>
 *     &lt;enumeration value="M2e"/>
 *     &lt;enumeration value="M2f"/>
 *     &lt;enumeration value="M2g"/>
 *     &lt;enumeration value="M3a"/>
 *     &lt;enumeration value="M3b"/>
 *     &lt;enumeration value="M3c"/>
 *     &lt;enumeration value="M3d"/>
 *     &lt;enumeration value="M3e"/>
 *     &lt;enumeration value="M3f"/>
 *     &lt;enumeration value="M4a"/>
 *     &lt;enumeration value="M4b"/>
 *     &lt;enumeration value="M4c"/>
 *     &lt;enumeration value="M4d"/>
 *     &lt;enumeration value="M4e"/>
 *     &lt;enumeration value="M4f"/>
 *     &lt;enumeration value="M4g"/>
 *     &lt;enumeration value="M4h"/>
 *     &lt;enumeration value="M4i"/>
 *     &lt;enumeration value="M5a"/>
 *     &lt;enumeration value="M5b"/>
 *     &lt;enumeration value="M5c"/>
 *     &lt;enumeration value="M5d"/>
 *     &lt;enumeration value="M5e"/>
 *     &lt;enumeration value="M5f"/>
 *     &lt;enumeration value="M5g"/>
 *     &lt;enumeration value="M5h"/>
 *     &lt;enumeration value="M5i"/>
 *     &lt;enumeration value="M5j"/>
 *     &lt;enumeration value="M5k"/>
 *     &lt;enumeration value="M6a"/>
 *     &lt;enumeration value="M6b"/>
 *     &lt;enumeration value="M6c"/>
 *     &lt;enumeration value="M6d"/>
 *     &lt;enumeration value="M6e"/>
 *     &lt;enumeration value="M6f"/>
 *     &lt;enumeration value="M6g"/>
 *     &lt;enumeration value="M6h"/>
 *     &lt;enumeration value="M6i"/>
 *     &lt;enumeration value="M6j"/>
 *     &lt;enumeration value="M6k"/>
 *     &lt;enumeration value="M6l"/>
 *     &lt;enumeration value="M6n"/>
 *     &lt;enumeration value="M6o"/>
 *     &lt;enumeration value="M6p"/>
 *     &lt;enumeration value="M6q"/>
 *     &lt;enumeration value="M6r"/>
 *     &lt;enumeration value="M6s"/>
 *     &lt;enumeration value="M6t"/>
 *     &lt;enumeration value="M6u"/>
 *     &lt;enumeration value="M6v"/>
 *     &lt;enumeration value="M6w"/>
 *     &lt;enumeration value="M6x"/>
 *     &lt;enumeration value="M6y"/>
 *     &lt;enumeration value="M6z"/>
 *     &lt;enumeration value="M7a"/>
 *     &lt;enumeration value="M7b"/>
 *     &lt;enumeration value="M7c"/>
 *     &lt;enumeration value="M7d"/>
 *     &lt;enumeration value="M7e"/>
 *     &lt;enumeration value="M7f"/>
 *     &lt;enumeration value="M7g"/>
 *     &lt;enumeration value="M7h"/>
 *     &lt;enumeration value="M8a"/>
 *     &lt;enumeration value="M8b"/>
 *     &lt;enumeration value="M8c"/>
 *     &lt;enumeration value="M8d"/>
 *     &lt;enumeration value="M8e"/>
 *     &lt;enumeration value="M8f"/>
 *     &lt;enumeration value="M8g"/>
 *     &lt;enumeration value="M9a"/>
 *     &lt;enumeration value="M9b"/>
 *     &lt;enumeration value="M9c"/>
 *     &lt;enumeration value="M9d"/>
 *     &lt;enumeration value="M9e"/>
 *     &lt;enumeration value="M9f"/>
 *     &lt;enumeration value="M9g"/>
 *     &lt;enumeration value="M9h"/>
 *     &lt;enumeration value="M9i"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsEventSubCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsEventSubCategoryType {

    @XmlEnumValue("B1a")
    B_1_A("B1a"),
    @XmlEnumValue("B1b")
    B_1_B("B1b"),
    @XmlEnumValue("B1c")
    B_1_C("B1c"),
    @XmlEnumValue("B1d")
    B_1_D("B1d"),
    @XmlEnumValue("B1e")
    B_1_E("B1e"),
    @XmlEnumValue("B1f")
    B_1_F("B1f"),
    @XmlEnumValue("B1g")
    B_1_G("B1g"),
    @XmlEnumValue("B1h")
    B_1_H("B1h"),
    @XmlEnumValue("B1i")
    B_1_I("B1i"),
    @XmlEnumValue("B2a")
    B_2_A("B2a"),
    @XmlEnumValue("B2b")
    B_2_B("B2b"),
    @XmlEnumValue("B2c")
    B_2_C("B2c"),
    @XmlEnumValue("B2d")
    B_2_D("B2d"),
    @XmlEnumValue("B2e")
    B_2_E("B2e"),
    @XmlEnumValue("B3a")
    B_3_A("B3a"),
    @XmlEnumValue("B3b")
    B_3_B("B3b"),
    @XmlEnumValue("B3c")
    B_3_C("B3c"),
    @XmlEnumValue("B3d")
    B_3_D("B3d"),
    @XmlEnumValue("B3e")
    B_3_E("B3e"),
    @XmlEnumValue("B3f")
    B_3_F("B3f"),
    @XmlEnumValue("B3g")
    B_3_G("B3g"),
    @XmlEnumValue("B3h")
    B_3_H("B3h"),
    @XmlEnumValue("B3i")
    B_3_I("B3i"),
    @XmlEnumValue("B3j")
    B_3_J("B3j"),
    @XmlEnumValue("B4a")
    B_4_A("B4a"),
    @XmlEnumValue("B4b")
    B_4_B("B4b"),
    @XmlEnumValue("B4c")
    B_4_C("B4c"),
    @XmlEnumValue("B4d")
    B_4_D("B4d"),
    @XmlEnumValue("B4e")
    B_4_E("B4e"),
    @XmlEnumValue("B4f")
    B_4_F("B4f"),
    @XmlEnumValue("B4g")
    B_4_G("B4g"),
    @XmlEnumValue("B4h")
    B_4_H("B4h"),
    @XmlEnumValue("B4i")
    B_4_I("B4i"),
    @XmlEnumValue("B4j")
    B_4_J("B4j"),
    @XmlEnumValue("B5a")
    B_5_A("B5a"),
    @XmlEnumValue("B5b")
    B_5_B("B5b"),
    @XmlEnumValue("B5c")
    B_5_C("B5c"),
    @XmlEnumValue("B5d")
    B_5_D("B5d"),
    @XmlEnumValue("B5e")
    B_5_E("B5e"),
    @XmlEnumValue("B5f")
    B_5_F("B5f"),
    @XmlEnumValue("B5g")
    B_5_G("B5g"),
    @XmlEnumValue("B5h")
    B_5_H("B5h"),
    @XmlEnumValue("B5i")
    B_5_I("B5i"),
    @XmlEnumValue("B5j")
    B_5_J("B5j"),
    @XmlEnumValue("B5k")
    B_5_K("B5k"),
    @XmlEnumValue("B5l")
    B_5_L("B5l"),
    @XmlEnumValue("B5m")
    B_5_M("B5m"),
    @XmlEnumValue("B5n")
    B_5_N("B5n"),
    @XmlEnumValue("B5o")
    B_5_O("B5o"),
    @XmlEnumValue("B6a")
    B_6_A("B6a"),
    @XmlEnumValue("B6b")
    B_6_B("B6b"),
    @XmlEnumValue("B6c")
    B_6_C("B6c"),
    @XmlEnumValue("B6d")
    B_6_D("B6d"),
    @XmlEnumValue("B6e")
    B_6_E("B6e"),
    @XmlEnumValue("B6f")
    B_6_F("B6f"),
    @XmlEnumValue("B6g")
    B_6_G("B6g"),
    @XmlEnumValue("B6h")
    B_6_H("B6h"),
    @XmlEnumValue("B6i")
    B_6_I("B6i"),
    @XmlEnumValue("B7a")
    B_7_A("B7a"),
    @XmlEnumValue("B7b")
    B_7_B("B7b"),
    @XmlEnumValue("B7c")
    B_7_C("B7c"),
    @XmlEnumValue("B7d")
    B_7_D("B7d"),
    @XmlEnumValue("B7e")
    B_7_E("B7e"),
    @XmlEnumValue("B7f")
    B_7_F("B7f"),
    @XmlEnumValue("B7g")
    B_7_G("B7g"),
    @XmlEnumValue("B7h")
    B_7_H("B7h"),
    @XmlEnumValue("B7i")
    B_7_I("B7i"),
    @XmlEnumValue("B7j")
    B_7_J("B7j"),
    @XmlEnumValue("B7k")
    B_7_K("B7k"),
    @XmlEnumValue("B7l")
    B_7_L("B7l"),
    @XmlEnumValue("B7m")
    B_7_M("B7m"),
    @XmlEnumValue("B7n")
    B_7_N("B7n"),
    @XmlEnumValue("B8a")
    B_8_A("B8a"),
    @XmlEnumValue("B8b")
    B_8_B("B8b"),
    @XmlEnumValue("B8c")
    B_8_C("B8c"),
    @XmlEnumValue("B8d")
    B_8_D("B8d"),
    @XmlEnumValue("B8e")
    B_8_E("B8e"),
    @XmlEnumValue("B8f")
    B_8_F("B8f"),
    @XmlEnumValue("B8g")
    B_8_G("B8g"),
    @XmlEnumValue("B8h")
    B_8_H("B8h"),
    @XmlEnumValue("B9a")
    B_9_A("B9a"),
    @XmlEnumValue("B9b")
    B_9_B("B9b"),
    @XmlEnumValue("B9c")
    B_9_C("B9c"),
    @XmlEnumValue("B9d")
    B_9_D("B9d"),
    @XmlEnumValue("B9e")
    B_9_E("B9e"),
    @XmlEnumValue("B9f")
    B_9_F("B9f"),
    @XmlEnumValue("B9g")
    B_9_G("B9g"),
    @XmlEnumValue("B9h")
    B_9_H("B9h"),
    @XmlEnumValue("B9i")
    B_9_I("B9i"),
    @XmlEnumValue("B9j")
    B_9_J("B9j"),
    @XmlEnumValue("M1a")
    M_1_A("M1a"),
    @XmlEnumValue("M1b")
    M_1_B("M1b"),
    @XmlEnumValue("M1c")
    M_1_C("M1c"),
    @XmlEnumValue("M1d")
    M_1_D("M1d"),
    @XmlEnumValue("M1e")
    M_1_E("M1e"),
    @XmlEnumValue("M1f")
    M_1_F("M1f"),
    @XmlEnumValue("M2a")
    M_2_A("M2a"),
    @XmlEnumValue("M2b")
    M_2_B("M2b"),
    @XmlEnumValue("M2c")
    M_2_C("M2c"),
    @XmlEnumValue("M2d")
    M_2_D("M2d"),
    @XmlEnumValue("M2e")
    M_2_E("M2e"),
    @XmlEnumValue("M2f")
    M_2_F("M2f"),
    @XmlEnumValue("M2g")
    M_2_G("M2g"),
    @XmlEnumValue("M3a")
    M_3_A("M3a"),
    @XmlEnumValue("M3b")
    M_3_B("M3b"),
    @XmlEnumValue("M3c")
    M_3_C("M3c"),
    @XmlEnumValue("M3d")
    M_3_D("M3d"),
    @XmlEnumValue("M3e")
    M_3_E("M3e"),
    @XmlEnumValue("M3f")
    M_3_F("M3f"),
    @XmlEnumValue("M4a")
    M_4_A("M4a"),
    @XmlEnumValue("M4b")
    M_4_B("M4b"),
    @XmlEnumValue("M4c")
    M_4_C("M4c"),
    @XmlEnumValue("M4d")
    M_4_D("M4d"),
    @XmlEnumValue("M4e")
    M_4_E("M4e"),
    @XmlEnumValue("M4f")
    M_4_F("M4f"),
    @XmlEnumValue("M4g")
    M_4_G("M4g"),
    @XmlEnumValue("M4h")
    M_4_H("M4h"),
    @XmlEnumValue("M4i")
    M_4_I("M4i"),
    @XmlEnumValue("M5a")
    M_5_A("M5a"),
    @XmlEnumValue("M5b")
    M_5_B("M5b"),
    @XmlEnumValue("M5c")
    M_5_C("M5c"),
    @XmlEnumValue("M5d")
    M_5_D("M5d"),
    @XmlEnumValue("M5e")
    M_5_E("M5e"),
    @XmlEnumValue("M5f")
    M_5_F("M5f"),
    @XmlEnumValue("M5g")
    M_5_G("M5g"),
    @XmlEnumValue("M5h")
    M_5_H("M5h"),
    @XmlEnumValue("M5i")
    M_5_I("M5i"),
    @XmlEnumValue("M5j")
    M_5_J("M5j"),
    @XmlEnumValue("M5k")
    M_5_K("M5k"),
    @XmlEnumValue("M6a")
    M_6_A("M6a"),
    @XmlEnumValue("M6b")
    M_6_B("M6b"),
    @XmlEnumValue("M6c")
    M_6_C("M6c"),
    @XmlEnumValue("M6d")
    M_6_D("M6d"),
    @XmlEnumValue("M6e")
    M_6_E("M6e"),
    @XmlEnumValue("M6f")
    M_6_F("M6f"),
    @XmlEnumValue("M6g")
    M_6_G("M6g"),
    @XmlEnumValue("M6h")
    M_6_H("M6h"),
    @XmlEnumValue("M6i")
    M_6_I("M6i"),
    @XmlEnumValue("M6j")
    M_6_J("M6j"),
    @XmlEnumValue("M6k")
    M_6_K("M6k"),
    @XmlEnumValue("M6l")
    M_6_L("M6l"),
    @XmlEnumValue("M6n")
    M_6_N("M6n"),
    @XmlEnumValue("M6o")
    M_6_O("M6o"),
    @XmlEnumValue("M6p")
    M_6_P("M6p"),
    @XmlEnumValue("M6q")
    M_6_Q("M6q"),
    @XmlEnumValue("M6r")
    M_6_R("M6r"),
    @XmlEnumValue("M6s")
    M_6_S("M6s"),
    @XmlEnumValue("M6t")
    M_6_T("M6t"),
    @XmlEnumValue("M6u")
    M_6_U("M6u"),
    @XmlEnumValue("M6v")
    M_6_V("M6v"),
    @XmlEnumValue("M6w")
    M_6_W("M6w"),
    @XmlEnumValue("M6x")
    M_6_X("M6x"),
    @XmlEnumValue("M6y")
    M_6_Y("M6y"),
    @XmlEnumValue("M6z")
    M_6_Z("M6z"),
    @XmlEnumValue("M7a")
    M_7_A("M7a"),
    @XmlEnumValue("M7b")
    M_7_B("M7b"),
    @XmlEnumValue("M7c")
    M_7_C("M7c"),
    @XmlEnumValue("M7d")
    M_7_D("M7d"),
    @XmlEnumValue("M7e")
    M_7_E("M7e"),
    @XmlEnumValue("M7f")
    M_7_F("M7f"),
    @XmlEnumValue("M7g")
    M_7_G("M7g"),
    @XmlEnumValue("M7h")
    M_7_H("M7h"),
    @XmlEnumValue("M8a")
    M_8_A("M8a"),
    @XmlEnumValue("M8b")
    M_8_B("M8b"),
    @XmlEnumValue("M8c")
    M_8_C("M8c"),
    @XmlEnumValue("M8d")
    M_8_D("M8d"),
    @XmlEnumValue("M8e")
    M_8_E("M8e"),
    @XmlEnumValue("M8f")
    M_8_F("M8f"),
    @XmlEnumValue("M8g")
    M_8_G("M8g"),
    @XmlEnumValue("M9a")
    M_9_A("M9a"),
    @XmlEnumValue("M9b")
    M_9_B("M9b"),
    @XmlEnumValue("M9c")
    M_9_C("M9c"),
    @XmlEnumValue("M9d")
    M_9_D("M9d"),
    @XmlEnumValue("M9e")
    M_9_E("M9e"),
    @XmlEnumValue("M9f")
    M_9_F("M9f"),
    @XmlEnumValue("M9g")
    M_9_G("M9g"),
    @XmlEnumValue("M9h")
    M_9_H("M9h"),
    @XmlEnumValue("M9i")
    M_9_I("M9i");
    private final String value;

    AUCodeSetsEventSubCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsEventSubCategoryType fromValue(String v) {
        for (AUCodeSetsEventSubCategoryType c: AUCodeSetsEventSubCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
