
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsGroupCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsGroupCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PastoralGroup"/>
 *     &lt;enumeration value="MentorGroup"/>
 *     &lt;enumeration value="RollGroup"/>
 *     &lt;enumeration value="AfterSchoolGroup"/>
 *     &lt;enumeration value="OtherGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsGroupCategoryCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsGroupCategoryCodeType {

    @XmlEnumValue("PastoralGroup")
    PASTORAL_GROUP("PastoralGroup"),
    @XmlEnumValue("MentorGroup")
    MENTOR_GROUP("MentorGroup"),
    @XmlEnumValue("RollGroup")
    ROLL_GROUP("RollGroup"),
    @XmlEnumValue("AfterSchoolGroup")
    AFTER_SCHOOL_GROUP("AfterSchoolGroup"),
    @XmlEnumValue("OtherGroup")
    OTHER_GROUP("OtherGroup");
    private final String value;

    AUCodeSetsGroupCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsGroupCategoryCodeType fromValue(String v) {
        for (AUCodeSetsGroupCategoryCodeType c: AUCodeSetsGroupCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
