
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xImmunizationTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xImmunizationTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HaemophilusInfluenzae"/>
 *     &lt;enumeration value="HepatitisA"/>
 *     &lt;enumeration value="HepatitisB"/>
 *     &lt;enumeration value="InactivatedPoliovirus"/>
 *     &lt;enumeration value="Influenza"/>
 *     &lt;enumeration value="Meningococcal"/>
 *     &lt;enumeration value="Mumps"/>
 *     &lt;enumeration value="Pertussis"/>
 *     &lt;enumeration value="Pneumococcal"/>
 *     &lt;enumeration value="RhImmuneGlobulin"/>
 *     &lt;enumeration value="Rotavirus"/>
 *     &lt;enumeration value="Rubella"/>
 *     &lt;enumeration value="Rubeola"/>
 *     &lt;enumeration value="Smallpox"/>
 *     &lt;enumeration value="Tetanus"/>
 *     &lt;enumeration value="Tuberculosis"/>
 *     &lt;enumeration value="Varicella"/>
 *     &lt;enumeration value="ParentOptOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xImmunizationTypeType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XImmunizationTypeType {

    @XmlEnumValue("HaemophilusInfluenzae")
    HAEMOPHILUS_INFLUENZAE("HaemophilusInfluenzae"),
    @XmlEnumValue("HepatitisA")
    HEPATITIS_A("HepatitisA"),
    @XmlEnumValue("HepatitisB")
    HEPATITIS_B("HepatitisB"),
    @XmlEnumValue("InactivatedPoliovirus")
    INACTIVATED_POLIOVIRUS("InactivatedPoliovirus"),
    @XmlEnumValue("Influenza")
    INFLUENZA("Influenza"),
    @XmlEnumValue("Meningococcal")
    MENINGOCOCCAL("Meningococcal"),
    @XmlEnumValue("Mumps")
    MUMPS("Mumps"),
    @XmlEnumValue("Pertussis")
    PERTUSSIS("Pertussis"),
    @XmlEnumValue("Pneumococcal")
    PNEUMOCOCCAL("Pneumococcal"),
    @XmlEnumValue("RhImmuneGlobulin")
    RH_IMMUNE_GLOBULIN("RhImmuneGlobulin"),
    @XmlEnumValue("Rotavirus")
    ROTAVIRUS("Rotavirus"),
    @XmlEnumValue("Rubella")
    RUBELLA("Rubella"),
    @XmlEnumValue("Rubeola")
    RUBEOLA("Rubeola"),
    @XmlEnumValue("Smallpox")
    SMALLPOX("Smallpox"),
    @XmlEnumValue("Tetanus")
    TETANUS("Tetanus"),
    @XmlEnumValue("Tuberculosis")
    TUBERCULOSIS("Tuberculosis"),
    @XmlEnumValue("Varicella")
    VARICELLA("Varicella"),
    @XmlEnumValue("ParentOptOut")
    PARENT_OPT_OUT("ParentOptOut");
    private final String value;

    XImmunizationTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XImmunizationTypeType fromValue(String v) {
        for (XImmunizationTypeType c: XImmunizationTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
