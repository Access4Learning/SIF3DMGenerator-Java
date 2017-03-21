
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsSchoolLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsSchoolLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Camp"/>
 *     &lt;enumeration value="Commty"/>
 *     &lt;enumeration value="EarlyCh"/>
 *     &lt;enumeration value="JunPri"/>
 *     &lt;enumeration value="Kgarten"/>
 *     &lt;enumeration value="Kind"/>
 *     &lt;enumeration value="Lang"/>
 *     &lt;enumeration value="MCH"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PreSch"/>
 *     &lt;enumeration value="Pri/Sec"/>
 *     &lt;enumeration value="Spec/P-12"/>
 *     &lt;enumeration value="Spec/Pri"/>
 *     &lt;enumeration value="Spec/Sec"/>
 *     &lt;enumeration value="Prim"/>
 *     &lt;enumeration value="Sec"/>
 *     &lt;enumeration value="Senior"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Specif"/>
 *     &lt;enumeration value="Supp"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsSchoolLevelType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
@XmlEnum
public enum AUCodeSetsSchoolLevelType {

    @XmlEnumValue("Camp")
    CAMP("Camp"),
    @XmlEnumValue("Commty")
    COMMTY("Commty"),
    @XmlEnumValue("EarlyCh")
    EARLY_CH("EarlyCh"),
    @XmlEnumValue("JunPri")
    JUN_PRI("JunPri"),
    @XmlEnumValue("Kgarten")
    KGARTEN("Kgarten"),
    @XmlEnumValue("Kind")
    KIND("Kind"),
    @XmlEnumValue("Lang")
    LANG("Lang"),
    MCH("MCH"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PreSch")
    PRE_SCH("PreSch"),
    @XmlEnumValue("Pri/Sec")
    PRI_SEC("Pri/Sec"),
    @XmlEnumValue("Spec/P-12")
    SPEC_P_12("Spec/P-12"),
    @XmlEnumValue("Spec/Pri")
    SPEC_PRI("Spec/Pri"),
    @XmlEnumValue("Spec/Sec")
    SPEC_SEC("Spec/Sec"),
    @XmlEnumValue("Prim")
    PRIM("Prim"),
    @XmlEnumValue("Sec")
    SEC("Sec"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("Specif")
    SPECIF("Specif"),
    @XmlEnumValue("Supp")
    SUPP("Supp"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    ZZREDACTED("ZZREDACTED");
    private final String value;

    AUCodeSetsSchoolLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsSchoolLevelType fromValue(String v) {
        for (AUCodeSetsSchoolLevelType c: AUCodeSetsSchoolLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
