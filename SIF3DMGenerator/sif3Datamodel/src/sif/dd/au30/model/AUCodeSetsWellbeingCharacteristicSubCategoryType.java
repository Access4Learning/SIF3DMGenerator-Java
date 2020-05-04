
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingCharacteristicSubCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingCharacteristicSubCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MH-1"/>
 *     &lt;enumeration value="MH-2"/>
 *     &lt;enumeration value="MH-3"/>
 *     &lt;enumeration value="MH-4"/>
 *     &lt;enumeration value="MH-5"/>
 *     &lt;enumeration value="MH-6"/>
 *     &lt;enumeration value="MH-7"/>
 *     &lt;enumeration value="MH-8"/>
 *     &lt;enumeration value="MH-9"/>
 *     &lt;enumeration value="MH-10"/>
 *     &lt;enumeration value="MH-11"/>
 *     &lt;enumeration value="MH-12"/>
 *     &lt;enumeration value="MH-13"/>
 *     &lt;enumeration value="MH-14"/>
 *     &lt;enumeration value="MH-15"/>
 *     &lt;enumeration value="MH-16"/>
 *     &lt;enumeration value="MH-17"/>
 *     &lt;enumeration value="MH-18"/>
 *     &lt;enumeration value="MS-1"/>
 *     &lt;enumeration value="MS-2"/>
 *     &lt;enumeration value="MS-3"/>
 *     &lt;enumeration value="MS-4"/>
 *     &lt;enumeration value="MAA-1"/>
 *     &lt;enumeration value="MAA-2"/>
 *     &lt;enumeration value="MAA-3"/>
 *     &lt;enumeration value="MAA-4"/>
 *     &lt;enumeration value="MAA-5"/>
 *     &lt;enumeration value="MAA-6"/>
 *     &lt;enumeration value="MAA-7"/>
 *     &lt;enumeration value="MAA-8"/>
 *     &lt;enumeration value="MAA-9"/>
 *     &lt;enumeration value="MAA-10"/>
 *     &lt;enumeration value="MAA-11"/>
 *     &lt;enumeration value="MAA-12"/>
 *     &lt;enumeration value="MAA-13"/>
 *     &lt;enumeration value="MAA-14"/>
 *     &lt;enumeration value="MAIM-1"/>
 *     &lt;enumeration value="MAIM-2"/>
 *     &lt;enumeration value="MAIM-3"/>
 *     &lt;enumeration value="MB-1"/>
 *     &lt;enumeration value="MB-2"/>
 *     &lt;enumeration value="MB-3"/>
 *     &lt;enumeration value="MB-4"/>
 *     &lt;enumeration value="MB-5"/>
 *     &lt;enumeration value="MMS-1"/>
 *     &lt;enumeration value="MMS-2"/>
 *     &lt;enumeration value="MMS-3"/>
 *     &lt;enumeration value="MMS-4"/>
 *     &lt;enumeration value="MMS-5"/>
 *     &lt;enumeration value="MMS-6"/>
 *     &lt;enumeration value="MMS-7"/>
 *     &lt;enumeration value="MMS-8"/>
 *     &lt;enumeration value="MMS-9"/>
 *     &lt;enumeration value="MMS-10"/>
 *     &lt;enumeration value="MMS-11"/>
 *     &lt;enumeration value="MMS-12"/>
 *     &lt;enumeration value="MMS-13"/>
 *     &lt;enumeration value="MMS-14"/>
 *     &lt;enumeration value="MMS-15"/>
 *     &lt;enumeration value="MCM-1"/>
 *     &lt;enumeration value="MCM-2"/>
 *     &lt;enumeration value="MCM-3"/>
 *     &lt;enumeration value="MCM-4"/>
 *     &lt;enumeration value="MCM-5"/>
 *     &lt;enumeration value="MCM-6"/>
 *     &lt;enumeration value="MCM-7"/>
 *     &lt;enumeration value="MCM-8"/>
 *     &lt;enumeration value="MCM-9"/>
 *     &lt;enumeration value="MCM-10"/>
 *     &lt;enumeration value="MCM-11"/>
 *     &lt;enumeration value="MCM-12"/>
 *     &lt;enumeration value="MCM-13"/>
 *     &lt;enumeration value="MCM-14"/>
 *     &lt;enumeration value="MCM-15"/>
 *     &lt;enumeration value="MCM-16"/>
 *     &lt;enumeration value="MCM-17"/>
 *     &lt;enumeration value="MCM-18"/>
 *     &lt;enumeration value="MCM-19"/>
 *     &lt;enumeration value="MCM-20"/>
 *     &lt;enumeration value="MCM-21"/>
 *     &lt;enumeration value="MCM-22"/>
 *     &lt;enumeration value="MCM-23"/>
 *     &lt;enumeration value="MCM-24"/>
 *     &lt;enumeration value="MCM-25"/>
 *     &lt;enumeration value="MCM-26"/>
 *     &lt;enumeration value="MAIM-4"/>
 *     &lt;enumeration value="MAO-1"/>
 *     &lt;enumeration value="MAO-2"/>
 *     &lt;enumeration value="MAO-3"/>
 *     &lt;enumeration value="MAO-4"/>
 *     &lt;enumeration value="MAO-5"/>
 *     &lt;enumeration value="MAO-6"/>
 *     &lt;enumeration value="MC-1"/>
 *     &lt;enumeration value="MC-2"/>
 *     &lt;enumeration value="MC-3"/>
 *     &lt;enumeration value="MC-4"/>
 *     &lt;enumeration value="MC-5"/>
 *     &lt;enumeration value="MD-01"/>
 *     &lt;enumeration value="MD-02"/>
 *     &lt;enumeration value="MD-03"/>
 *     &lt;enumeration value="MD-04"/>
 *     &lt;enumeration value="MEM-1"/>
 *     &lt;enumeration value="MEM-2"/>
 *     &lt;enumeration value="MEM-3"/>
 *     &lt;enumeration value="MEM-4"/>
 *     &lt;enumeration value="MEM-5"/>
 *     &lt;enumeration value="MEM-6"/>
 *     &lt;enumeration value="MEM-7"/>
 *     &lt;enumeration value="MGI-1"/>
 *     &lt;enumeration value="MGI-2"/>
 *     &lt;enumeration value="MGI-3"/>
 *     &lt;enumeration value="MGI-4"/>
 *     &lt;enumeration value="MGI-5"/>
 *     &lt;enumeration value="MGI-6"/>
 *     &lt;enumeration value="MGI-7"/>
 *     &lt;enumeration value="MGI-8"/>
 *     &lt;enumeration value="MGI-9"/>
 *     &lt;enumeration value="MGI-10"/>
 *     &lt;enumeration value="MGI-11"/>
 *     &lt;enumeration value="MGI-12"/>
 *     &lt;enumeration value="MGI-13"/>
 *     &lt;enumeration value="MGI-14"/>
 *     &lt;enumeration value="MGI-15"/>
 *     &lt;enumeration value="MGI-16"/>
 *     &lt;enumeration value="MGI-17"/>
 *     &lt;enumeration value="MGI-18"/>
 *     &lt;enumeration value="MGI-19"/>
 *     &lt;enumeration value="MGI-20"/>
 *     &lt;enumeration value="MH-19"/>
 *     &lt;enumeration value="MH-20"/>
 *     &lt;enumeration value="MMD-01"/>
 *     &lt;enumeration value="MMD-02"/>
 *     &lt;enumeration value="MMD-03"/>
 *     &lt;enumeration value="MMD-04"/>
 *     &lt;enumeration value="MMD-05"/>
 *     &lt;enumeration value="MMD-06"/>
 *     &lt;enumeration value="MMD-07"/>
 *     &lt;enumeration value="MI-01"/>
 *     &lt;enumeration value="MI-02"/>
 *     &lt;enumeration value="MI-03"/>
 *     &lt;enumeration value="MI-04"/>
 *     &lt;enumeration value="MI-05"/>
 *     &lt;enumeration value="MI-06"/>
 *     &lt;enumeration value="MMS-16"/>
 *     &lt;enumeration value="MMS-17"/>
 *     &lt;enumeration value="MND-1"/>
 *     &lt;enumeration value="MND-2"/>
 *     &lt;enumeration value="MND-3"/>
 *     &lt;enumeration value="MND-4"/>
 *     &lt;enumeration value="MND-5"/>
 *     &lt;enumeration value="MND-6"/>
 *     &lt;enumeration value="MND-7"/>
 *     &lt;enumeration value="MND-8"/>
 *     &lt;enumeration value="MND-9"/>
 *     &lt;enumeration value="MND-10"/>
 *     &lt;enumeration value="MND-11"/>
 *     &lt;enumeration value="MND-12"/>
 *     &lt;enumeration value="MND-13"/>
 *     &lt;enumeration value="MND-14"/>
 *     &lt;enumeration value="MND-15"/>
 *     &lt;enumeration value="MND-16"/>
 *     &lt;enumeration value="MND-17"/>
 *     &lt;enumeration value="MND-18"/>
 *     &lt;enumeration value="MND-19"/>
 *     &lt;enumeration value="MND-20"/>
 *     &lt;enumeration value="MND-21"/>
 *     &lt;enumeration value="MND-22"/>
 *     &lt;enumeration value="MOP-1"/>
 *     &lt;enumeration value="MOP-2"/>
 *     &lt;enumeration value="MO-1"/>
 *     &lt;enumeration value="MO-2"/>
 *     &lt;enumeration value="MO-3"/>
 *     &lt;enumeration value="MO-4"/>
 *     &lt;enumeration value="MO-5"/>
 *     &lt;enumeration value="MO-6"/>
 *     &lt;enumeration value="MRD-1"/>
 *     &lt;enumeration value="MRD-2"/>
 *     &lt;enumeration value="MRD-3"/>
 *     &lt;enumeration value="MRD-4"/>
 *     &lt;enumeration value="MRD-5"/>
 *     &lt;enumeration value="Other-1"/>
 *     &lt;enumeration value="Other-2"/>
 *     &lt;enumeration value="Other-3"/>
 *     &lt;enumeration value="Other-4"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="MN-1"/>
 *     &lt;enumeration value="MN-2"/>
 *     &lt;enumeration value="MN-3"/>
 *     &lt;enumeration value="MN-4"/>
 *     &lt;enumeration value="MN-5"/>
 *     &lt;enumeration value="MN-6"/>
 *     &lt;enumeration value="MN-7"/>
 *     &lt;enumeration value="MN-8"/>
 *     &lt;enumeration value="MN-9"/>
 *     &lt;enumeration value="MN-10"/>
 *     &lt;enumeration value="MN-11"/>
 *     &lt;enumeration value="MN-12"/>
 *     &lt;enumeration value="MN-13"/>
 *     &lt;enumeration value="MN-14"/>
 *     &lt;enumeration value="MN-15"/>
 *     &lt;enumeration value="MN-16"/>
 *     &lt;enumeration value="DP-1"/>
 *     &lt;enumeration value="DP-2"/>
 *     &lt;enumeration value="DP-3"/>
 *     &lt;enumeration value="DP-4"/>
 *     &lt;enumeration value="DP-5"/>
 *     &lt;enumeration value="DP-6"/>
 *     &lt;enumeration value="DP-7"/>
 *     &lt;enumeration value="DP-8"/>
 *     &lt;enumeration value="DP-9"/>
 *     &lt;enumeration value="DP-10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingCharacteristicSubCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingCharacteristicSubCategoryType {

    @XmlEnumValue("MH-1")
    MH_1("MH-1"),
    @XmlEnumValue("MH-2")
    MH_2("MH-2"),
    @XmlEnumValue("MH-3")
    MH_3("MH-3"),
    @XmlEnumValue("MH-4")
    MH_4("MH-4"),
    @XmlEnumValue("MH-5")
    MH_5("MH-5"),
    @XmlEnumValue("MH-6")
    MH_6("MH-6"),
    @XmlEnumValue("MH-7")
    MH_7("MH-7"),
    @XmlEnumValue("MH-8")
    MH_8("MH-8"),
    @XmlEnumValue("MH-9")
    MH_9("MH-9"),
    @XmlEnumValue("MH-10")
    MH_10("MH-10"),
    @XmlEnumValue("MH-11")
    MH_11("MH-11"),
    @XmlEnumValue("MH-12")
    MH_12("MH-12"),
    @XmlEnumValue("MH-13")
    MH_13("MH-13"),
    @XmlEnumValue("MH-14")
    MH_14("MH-14"),
    @XmlEnumValue("MH-15")
    MH_15("MH-15"),
    @XmlEnumValue("MH-16")
    MH_16("MH-16"),
    @XmlEnumValue("MH-17")
    MH_17("MH-17"),
    @XmlEnumValue("MH-18")
    MH_18("MH-18"),
    @XmlEnumValue("MS-1")
    MS_1("MS-1"),
    @XmlEnumValue("MS-2")
    MS_2("MS-2"),
    @XmlEnumValue("MS-3")
    MS_3("MS-3"),
    @XmlEnumValue("MS-4")
    MS_4("MS-4"),
    @XmlEnumValue("MAA-1")
    MAA_1("MAA-1"),
    @XmlEnumValue("MAA-2")
    MAA_2("MAA-2"),
    @XmlEnumValue("MAA-3")
    MAA_3("MAA-3"),
    @XmlEnumValue("MAA-4")
    MAA_4("MAA-4"),
    @XmlEnumValue("MAA-5")
    MAA_5("MAA-5"),
    @XmlEnumValue("MAA-6")
    MAA_6("MAA-6"),
    @XmlEnumValue("MAA-7")
    MAA_7("MAA-7"),
    @XmlEnumValue("MAA-8")
    MAA_8("MAA-8"),
    @XmlEnumValue("MAA-9")
    MAA_9("MAA-9"),
    @XmlEnumValue("MAA-10")
    MAA_10("MAA-10"),
    @XmlEnumValue("MAA-11")
    MAA_11("MAA-11"),
    @XmlEnumValue("MAA-12")
    MAA_12("MAA-12"),
    @XmlEnumValue("MAA-13")
    MAA_13("MAA-13"),
    @XmlEnumValue("MAA-14")
    MAA_14("MAA-14"),
    @XmlEnumValue("MAIM-1")
    MAIM_1("MAIM-1"),
    @XmlEnumValue("MAIM-2")
    MAIM_2("MAIM-2"),
    @XmlEnumValue("MAIM-3")
    MAIM_3("MAIM-3"),
    @XmlEnumValue("MB-1")
    MB_1("MB-1"),
    @XmlEnumValue("MB-2")
    MB_2("MB-2"),
    @XmlEnumValue("MB-3")
    MB_3("MB-3"),
    @XmlEnumValue("MB-4")
    MB_4("MB-4"),
    @XmlEnumValue("MB-5")
    MB_5("MB-5"),
    @XmlEnumValue("MMS-1")
    MMS_1("MMS-1"),
    @XmlEnumValue("MMS-2")
    MMS_2("MMS-2"),
    @XmlEnumValue("MMS-3")
    MMS_3("MMS-3"),
    @XmlEnumValue("MMS-4")
    MMS_4("MMS-4"),
    @XmlEnumValue("MMS-5")
    MMS_5("MMS-5"),
    @XmlEnumValue("MMS-6")
    MMS_6("MMS-6"),
    @XmlEnumValue("MMS-7")
    MMS_7("MMS-7"),
    @XmlEnumValue("MMS-8")
    MMS_8("MMS-8"),
    @XmlEnumValue("MMS-9")
    MMS_9("MMS-9"),
    @XmlEnumValue("MMS-10")
    MMS_10("MMS-10"),
    @XmlEnumValue("MMS-11")
    MMS_11("MMS-11"),
    @XmlEnumValue("MMS-12")
    MMS_12("MMS-12"),
    @XmlEnumValue("MMS-13")
    MMS_13("MMS-13"),
    @XmlEnumValue("MMS-14")
    MMS_14("MMS-14"),
    @XmlEnumValue("MMS-15")
    MMS_15("MMS-15"),
    @XmlEnumValue("MCM-1")
    MCM_1("MCM-1"),
    @XmlEnumValue("MCM-2")
    MCM_2("MCM-2"),
    @XmlEnumValue("MCM-3")
    MCM_3("MCM-3"),
    @XmlEnumValue("MCM-4")
    MCM_4("MCM-4"),
    @XmlEnumValue("MCM-5")
    MCM_5("MCM-5"),
    @XmlEnumValue("MCM-6")
    MCM_6("MCM-6"),
    @XmlEnumValue("MCM-7")
    MCM_7("MCM-7"),
    @XmlEnumValue("MCM-8")
    MCM_8("MCM-8"),
    @XmlEnumValue("MCM-9")
    MCM_9("MCM-9"),
    @XmlEnumValue("MCM-10")
    MCM_10("MCM-10"),
    @XmlEnumValue("MCM-11")
    MCM_11("MCM-11"),
    @XmlEnumValue("MCM-12")
    MCM_12("MCM-12"),
    @XmlEnumValue("MCM-13")
    MCM_13("MCM-13"),
    @XmlEnumValue("MCM-14")
    MCM_14("MCM-14"),
    @XmlEnumValue("MCM-15")
    MCM_15("MCM-15"),
    @XmlEnumValue("MCM-16")
    MCM_16("MCM-16"),
    @XmlEnumValue("MCM-17")
    MCM_17("MCM-17"),
    @XmlEnumValue("MCM-18")
    MCM_18("MCM-18"),
    @XmlEnumValue("MCM-19")
    MCM_19("MCM-19"),
    @XmlEnumValue("MCM-20")
    MCM_20("MCM-20"),
    @XmlEnumValue("MCM-21")
    MCM_21("MCM-21"),
    @XmlEnumValue("MCM-22")
    MCM_22("MCM-22"),
    @XmlEnumValue("MCM-23")
    MCM_23("MCM-23"),
    @XmlEnumValue("MCM-24")
    MCM_24("MCM-24"),
    @XmlEnumValue("MCM-25")
    MCM_25("MCM-25"),
    @XmlEnumValue("MCM-26")
    MCM_26("MCM-26"),
    @XmlEnumValue("MAIM-4")
    MAIM_4("MAIM-4"),
    @XmlEnumValue("MAO-1")
    MAO_1("MAO-1"),
    @XmlEnumValue("MAO-2")
    MAO_2("MAO-2"),
    @XmlEnumValue("MAO-3")
    MAO_3("MAO-3"),
    @XmlEnumValue("MAO-4")
    MAO_4("MAO-4"),
    @XmlEnumValue("MAO-5")
    MAO_5("MAO-5"),
    @XmlEnumValue("MAO-6")
    MAO_6("MAO-6"),
    @XmlEnumValue("MC-1")
    MC_1("MC-1"),
    @XmlEnumValue("MC-2")
    MC_2("MC-2"),
    @XmlEnumValue("MC-3")
    MC_3("MC-3"),
    @XmlEnumValue("MC-4")
    MC_4("MC-4"),
    @XmlEnumValue("MC-5")
    MC_5("MC-5"),
    @XmlEnumValue("MD-01")
    MD_01("MD-01"),
    @XmlEnumValue("MD-02")
    MD_02("MD-02"),
    @XmlEnumValue("MD-03")
    MD_03("MD-03"),
    @XmlEnumValue("MD-04")
    MD_04("MD-04"),
    @XmlEnumValue("MEM-1")
    MEM_1("MEM-1"),
    @XmlEnumValue("MEM-2")
    MEM_2("MEM-2"),
    @XmlEnumValue("MEM-3")
    MEM_3("MEM-3"),
    @XmlEnumValue("MEM-4")
    MEM_4("MEM-4"),
    @XmlEnumValue("MEM-5")
    MEM_5("MEM-5"),
    @XmlEnumValue("MEM-6")
    MEM_6("MEM-6"),
    @XmlEnumValue("MEM-7")
    MEM_7("MEM-7"),
    @XmlEnumValue("MGI-1")
    MGI_1("MGI-1"),
    @XmlEnumValue("MGI-2")
    MGI_2("MGI-2"),
    @XmlEnumValue("MGI-3")
    MGI_3("MGI-3"),
    @XmlEnumValue("MGI-4")
    MGI_4("MGI-4"),
    @XmlEnumValue("MGI-5")
    MGI_5("MGI-5"),
    @XmlEnumValue("MGI-6")
    MGI_6("MGI-6"),
    @XmlEnumValue("MGI-7")
    MGI_7("MGI-7"),
    @XmlEnumValue("MGI-8")
    MGI_8("MGI-8"),
    @XmlEnumValue("MGI-9")
    MGI_9("MGI-9"),
    @XmlEnumValue("MGI-10")
    MGI_10("MGI-10"),
    @XmlEnumValue("MGI-11")
    MGI_11("MGI-11"),
    @XmlEnumValue("MGI-12")
    MGI_12("MGI-12"),
    @XmlEnumValue("MGI-13")
    MGI_13("MGI-13"),
    @XmlEnumValue("MGI-14")
    MGI_14("MGI-14"),
    @XmlEnumValue("MGI-15")
    MGI_15("MGI-15"),
    @XmlEnumValue("MGI-16")
    MGI_16("MGI-16"),
    @XmlEnumValue("MGI-17")
    MGI_17("MGI-17"),
    @XmlEnumValue("MGI-18")
    MGI_18("MGI-18"),
    @XmlEnumValue("MGI-19")
    MGI_19("MGI-19"),
    @XmlEnumValue("MGI-20")
    MGI_20("MGI-20"),
    @XmlEnumValue("MH-19")
    MH_19("MH-19"),
    @XmlEnumValue("MH-20")
    MH_20("MH-20"),
    @XmlEnumValue("MMD-01")
    MMD_01("MMD-01"),
    @XmlEnumValue("MMD-02")
    MMD_02("MMD-02"),
    @XmlEnumValue("MMD-03")
    MMD_03("MMD-03"),
    @XmlEnumValue("MMD-04")
    MMD_04("MMD-04"),
    @XmlEnumValue("MMD-05")
    MMD_05("MMD-05"),
    @XmlEnumValue("MMD-06")
    MMD_06("MMD-06"),
    @XmlEnumValue("MMD-07")
    MMD_07("MMD-07"),
    @XmlEnumValue("MI-01")
    MI_01("MI-01"),
    @XmlEnumValue("MI-02")
    MI_02("MI-02"),
    @XmlEnumValue("MI-03")
    MI_03("MI-03"),
    @XmlEnumValue("MI-04")
    MI_04("MI-04"),
    @XmlEnumValue("MI-05")
    MI_05("MI-05"),
    @XmlEnumValue("MI-06")
    MI_06("MI-06"),
    @XmlEnumValue("MMS-16")
    MMS_16("MMS-16"),
    @XmlEnumValue("MMS-17")
    MMS_17("MMS-17"),
    @XmlEnumValue("MND-1")
    MND_1("MND-1"),
    @XmlEnumValue("MND-2")
    MND_2("MND-2"),
    @XmlEnumValue("MND-3")
    MND_3("MND-3"),
    @XmlEnumValue("MND-4")
    MND_4("MND-4"),
    @XmlEnumValue("MND-5")
    MND_5("MND-5"),
    @XmlEnumValue("MND-6")
    MND_6("MND-6"),
    @XmlEnumValue("MND-7")
    MND_7("MND-7"),
    @XmlEnumValue("MND-8")
    MND_8("MND-8"),
    @XmlEnumValue("MND-9")
    MND_9("MND-9"),
    @XmlEnumValue("MND-10")
    MND_10("MND-10"),
    @XmlEnumValue("MND-11")
    MND_11("MND-11"),
    @XmlEnumValue("MND-12")
    MND_12("MND-12"),
    @XmlEnumValue("MND-13")
    MND_13("MND-13"),
    @XmlEnumValue("MND-14")
    MND_14("MND-14"),
    @XmlEnumValue("MND-15")
    MND_15("MND-15"),
    @XmlEnumValue("MND-16")
    MND_16("MND-16"),
    @XmlEnumValue("MND-17")
    MND_17("MND-17"),
    @XmlEnumValue("MND-18")
    MND_18("MND-18"),
    @XmlEnumValue("MND-19")
    MND_19("MND-19"),
    @XmlEnumValue("MND-20")
    MND_20("MND-20"),
    @XmlEnumValue("MND-21")
    MND_21("MND-21"),
    @XmlEnumValue("MND-22")
    MND_22("MND-22"),
    @XmlEnumValue("MOP-1")
    MOP_1("MOP-1"),
    @XmlEnumValue("MOP-2")
    MOP_2("MOP-2"),
    @XmlEnumValue("MO-1")
    MO_1("MO-1"),
    @XmlEnumValue("MO-2")
    MO_2("MO-2"),
    @XmlEnumValue("MO-3")
    MO_3("MO-3"),
    @XmlEnumValue("MO-4")
    MO_4("MO-4"),
    @XmlEnumValue("MO-5")
    MO_5("MO-5"),
    @XmlEnumValue("MO-6")
    MO_6("MO-6"),
    @XmlEnumValue("MRD-1")
    MRD_1("MRD-1"),
    @XmlEnumValue("MRD-2")
    MRD_2("MRD-2"),
    @XmlEnumValue("MRD-3")
    MRD_3("MRD-3"),
    @XmlEnumValue("MRD-4")
    MRD_4("MRD-4"),
    @XmlEnumValue("MRD-5")
    MRD_5("MRD-5"),
    @XmlEnumValue("Other-1")
    OTHER_1("Other-1"),
    @XmlEnumValue("Other-2")
    OTHER_2("Other-2"),
    @XmlEnumValue("Other-3")
    OTHER_3("Other-3"),
    @XmlEnumValue("Other-4")
    OTHER_4("Other-4"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("MN-1")
    MN_1("MN-1"),
    @XmlEnumValue("MN-2")
    MN_2("MN-2"),
    @XmlEnumValue("MN-3")
    MN_3("MN-3"),
    @XmlEnumValue("MN-4")
    MN_4("MN-4"),
    @XmlEnumValue("MN-5")
    MN_5("MN-5"),
    @XmlEnumValue("MN-6")
    MN_6("MN-6"),
    @XmlEnumValue("MN-7")
    MN_7("MN-7"),
    @XmlEnumValue("MN-8")
    MN_8("MN-8"),
    @XmlEnumValue("MN-9")
    MN_9("MN-9"),
    @XmlEnumValue("MN-10")
    MN_10("MN-10"),
    @XmlEnumValue("MN-11")
    MN_11("MN-11"),
    @XmlEnumValue("MN-12")
    MN_12("MN-12"),
    @XmlEnumValue("MN-13")
    MN_13("MN-13"),
    @XmlEnumValue("MN-14")
    MN_14("MN-14"),
    @XmlEnumValue("MN-15")
    MN_15("MN-15"),
    @XmlEnumValue("MN-16")
    MN_16("MN-16"),
    @XmlEnumValue("DP-1")
    DP_1("DP-1"),
    @XmlEnumValue("DP-2")
    DP_2("DP-2"),
    @XmlEnumValue("DP-3")
    DP_3("DP-3"),
    @XmlEnumValue("DP-4")
    DP_4("DP-4"),
    @XmlEnumValue("DP-5")
    DP_5("DP-5"),
    @XmlEnumValue("DP-6")
    DP_6("DP-6"),
    @XmlEnumValue("DP-7")
    DP_7("DP-7"),
    @XmlEnumValue("DP-8")
    DP_8("DP-8"),
    @XmlEnumValue("DP-9")
    DP_9("DP-9"),
    @XmlEnumValue("DP-10")
    DP_10("DP-10");
    private final String value;

    AUCodeSetsWellbeingCharacteristicSubCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsWellbeingCharacteristicSubCategoryType fromValue(String v) {
        for (AUCodeSetsWellbeingCharacteristicSubCategoryType c: AUCodeSetsWellbeingCharacteristicSubCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
