
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LearningStandardItemOrganizationIdentificationSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LearningStandardItemOrganizationIdentificationSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="LEA"/>
 *     &lt;enumeration value="NCES"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherFederal"/>
 *     &lt;enumeration value="SEA"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="FEIN"/>
 *     &lt;enumeration value="DUNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LearningStandardItemOrganizationIdentificationSystemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum LearningStandardItemOrganizationIdentificationSystemType {

    @XmlEnumValue("School")
    SCHOOL("School"),
    LEA("LEA"),
    NCES("NCES"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherFederal")
    OTHER_FEDERAL("OtherFederal"),
    SEA("SEA"),
    ACT("ACT"),
    FEIN("FEIN"),
    DUNS("DUNS");
    private final String value;

    LearningStandardItemOrganizationIdentificationSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LearningStandardItemOrganizationIdentificationSystemType fromValue(String v) {
        for (LearningStandardItemOrganizationIdentificationSystemType c: LearningStandardItemOrganizationIdentificationSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
