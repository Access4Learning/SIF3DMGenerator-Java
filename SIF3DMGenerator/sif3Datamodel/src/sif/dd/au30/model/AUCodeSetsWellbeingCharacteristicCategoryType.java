
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


    /**
     * Allergies - other
     * 
     */
    MAO("MAO"),

    /**
     * Auto-immune/Immune Disorders
     * 
     */
    MAIM("MAIM"),

    /**
     * Respiratory Disorder
     * 
     */
    MRD("MRD"),

    /**
     * Blood disorder
     * 
     */
    MB("MB"),

    /**
     * Heart Disease/ Disorder
     * 
     */
    MMD("MMD"),

    /**
     * Musculo - skeletal conditions
     * 
     */
    MMS("MMS"),

    /**
     * Endocrine and Metabolic Disorders
     * 
     */
    MEM("MEM"),

    /**
     * Childhood cancer
     * 
     */
    MC("MC"),

    /**
     * Allergy - Anaphylaxis
     * 
     */
    MAA("MAA"),

    /**
     * Mental and behavioural disorders
     * 
     */
    MH("MH"),

    /**
     * Diseases/conditions of the nervous system
     * 
     */
    MN("MN"),

    /**
     * Seizure disorders
     * 
     */
    MS("MS"),

    /**
     * Congenital malformations, deformations and chromosomal abnormalities
     * 
     */
    MCM("MCM"),

    /**
     * Infectious Diseases
     * 
     */
    MI("MI"),

    /**
     * Gastro Intestinal/Urinary conditions
     * 
     */
    MGI("MGI"),

    /**
     * Neuro/Developmental Disorders
     * 
     */
    MND("MND"),

    /**
     * Oral/Phalangeal Disorders
     * 
     */
    MO("MO"),

    /**
     * Deaf and Hard of Hearing
     * 
     */
    MD("MD"),

    /**
     * Optical/ Vision Disorder
     * 
     */
    MOP("MOP"),

    /**
     * Medical Other
     * 
     */
    @XmlEnumValue("M-Other")
    M_OTHER("M-Other"),

    /**
     * Disability Other
     * 
     */
    @XmlEnumValue("D-Other")
    D_OTHER("D-Other"),

    /**
     * Special Needs Other
     * 
     */
    @XmlEnumValue("S-Other")
    S_OTHER("S-Other"),

    /**
     * Other
     * 
     */
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
