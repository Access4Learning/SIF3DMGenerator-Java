
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xPersonRelationshipToLearnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xPersonRelationshipToLearnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Aunt"/>
 *     &lt;enumeration value="Brother"/>
 *     &lt;enumeration value="BrotherInlaw"/>
 *     &lt;enumeration value="CourtAppointedGuardian"/>
 *     &lt;enumeration value="Daughter"/>
 *     &lt;enumeration value="DaughterInLaw"/>
 *     &lt;enumeration value="Employer"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="FathersSignificantOther"/>
 *     &lt;enumeration value="FathersCivilPartner"/>
 *     &lt;enumeration value="FatherInLaw"/>
 *     &lt;enumeration value="Fiance"/>
 *     &lt;enumeration value="Fiancee"/>
 *     &lt;enumeration value="Friend"/>
 *     &lt;enumeration value="Grandfather"/>
 *     &lt;enumeration value="Grandmother"/>
 *     &lt;enumeration value="Husband"/>
 *     &lt;enumeration value="MothersSignificantOther"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="MothersCivilPartner"/>
 *     &lt;enumeration value="Nephew"/>
 *     &lt;enumeration value="Niece"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SignificantOther"/>
 *     &lt;enumeration value="Sister"/>
 *     &lt;enumeration value="Son"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Uncle"/>
 *     &lt;enumeration value="Ward"/>
 *     &lt;enumeration value="Wife"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xPersonRelationshipToLearnerType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XPersonRelationshipToLearnerType {

    @XmlEnumValue("Aunt")
    AUNT("Aunt"),
    @XmlEnumValue("Brother")
    BROTHER("Brother"),
    @XmlEnumValue("BrotherInlaw")
    BROTHER_INLAW("BrotherInlaw"),
    @XmlEnumValue("CourtAppointedGuardian")
    COURT_APPOINTED_GUARDIAN("CourtAppointedGuardian"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("DaughterInLaw")
    DAUGHTER_IN_LAW("DaughterInLaw"),
    @XmlEnumValue("Employer")
    EMPLOYER("Employer"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("FathersSignificantOther")
    FATHERS_SIGNIFICANT_OTHER("FathersSignificantOther"),
    @XmlEnumValue("FathersCivilPartner")
    FATHERS_CIVIL_PARTNER("FathersCivilPartner"),
    @XmlEnumValue("FatherInLaw")
    FATHER_IN_LAW("FatherInLaw"),
    @XmlEnumValue("Fiance")
    FIANCE("Fiance"),
    @XmlEnumValue("Fiancee")
    FIANCEE("Fiancee"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("Grandfather")
    GRANDFATHER("Grandfather"),
    @XmlEnumValue("Grandmother")
    GRANDMOTHER("Grandmother"),
    @XmlEnumValue("Husband")
    HUSBAND("Husband"),
    @XmlEnumValue("MothersSignificantOther")
    MOTHERS_SIGNIFICANT_OTHER("MothersSignificantOther"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("MothersCivilPartner")
    MOTHERS_CIVIL_PARTNER("MothersCivilPartner"),
    @XmlEnumValue("Nephew")
    NEPHEW("Nephew"),
    @XmlEnumValue("Niece")
    NIECE("Niece"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SignificantOther")
    SIGNIFICANT_OTHER("SignificantOther"),
    @XmlEnumValue("Sister")
    SISTER("Sister"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Uncle")
    UNCLE("Uncle"),
    @XmlEnumValue("Ward")
    WARD("Ward"),
    @XmlEnumValue("Wife")
    WIFE("Wife");
    private final String value;

    XPersonRelationshipToLearnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPersonRelationshipToLearnerType fromValue(String v) {
        for (XPersonRelationshipToLearnerType c: XPersonRelationshipToLearnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
