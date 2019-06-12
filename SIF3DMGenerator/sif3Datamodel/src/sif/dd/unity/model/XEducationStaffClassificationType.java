
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xEducationStaffClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xEducationStaffClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Administrative Support Staff"/>
 *     &lt;enumeration value="Administrators"/>
 *     &lt;enumeration value="All Other Support Staff"/>
 *     &lt;enumeration value="Behavioral Specialists"/>
 *     &lt;enumeration value="Early Learning Assistant Teachers"/>
 *     &lt;enumeration value="Early Learning Teachers"/>
 *     &lt;enumeration value="Elementary Teachers"/>
 *     &lt;enumeration value="Family Service Workers"/>
 *     &lt;enumeration value="Health Specialists"/>
 *     &lt;enumeration value="Home Visitors"/>
 *     &lt;enumeration value="Instructional Coordinators"/>
 *     &lt;enumeration value="Kindergarten Teachers"/>
 *     &lt;enumeration value="Librarians/Media Specialists"/>
 *     &lt;enumeration value="Library/Media Support Staff"/>
 *     &lt;enumeration value="Mental Health Specialists"/>
 *     &lt;enumeration value="Nutrition Specialists"/>
 *     &lt;enumeration value="Paraprofessionals"/>
 *     &lt;enumeration value="Part C Early Interventionists"/>
 *     &lt;enumeration value="Part C Service Coordinators"/>
 *     &lt;enumeration value="School Counselors"/>
 *     &lt;enumeration value="Secondary Teachers"/>
 *     &lt;enumeration value="Social Workers"/>
 *     &lt;enumeration value="Special Education Teachers"/>
 *     &lt;enumeration value="Special Needs Specialists"/>
 *     &lt;enumeration value="Student Support Services Staff"/>
 *     &lt;enumeration value="Ungraded Teachers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xEducationStaffClassificationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XEducationStaffClassificationType {

    @XmlEnumValue("Administrative Support Staff")
    ADMINISTRATIVE_SUPPORT_STAFF("Administrative Support Staff"),
    @XmlEnumValue("Administrators")
    ADMINISTRATORS("Administrators"),
    @XmlEnumValue("All Other Support Staff")
    ALL_OTHER_SUPPORT_STAFF("All Other Support Staff"),
    @XmlEnumValue("Behavioral Specialists")
    BEHAVIORAL_SPECIALISTS("Behavioral Specialists"),
    @XmlEnumValue("Early Learning Assistant Teachers")
    EARLY_LEARNING_ASSISTANT_TEACHERS("Early Learning Assistant Teachers"),
    @XmlEnumValue("Early Learning Teachers")
    EARLY_LEARNING_TEACHERS("Early Learning Teachers"),
    @XmlEnumValue("Elementary Teachers")
    ELEMENTARY_TEACHERS("Elementary Teachers"),
    @XmlEnumValue("Family Service Workers")
    FAMILY_SERVICE_WORKERS("Family Service Workers"),
    @XmlEnumValue("Health Specialists")
    HEALTH_SPECIALISTS("Health Specialists"),
    @XmlEnumValue("Home Visitors")
    HOME_VISITORS("Home Visitors"),
    @XmlEnumValue("Instructional Coordinators")
    INSTRUCTIONAL_COORDINATORS("Instructional Coordinators"),
    @XmlEnumValue("Kindergarten Teachers")
    KINDERGARTEN_TEACHERS("Kindergarten Teachers"),
    @XmlEnumValue("Librarians/Media Specialists")
    LIBRARIANS_MEDIA_SPECIALISTS("Librarians/Media Specialists"),
    @XmlEnumValue("Library/Media Support Staff")
    LIBRARY_MEDIA_SUPPORT_STAFF("Library/Media Support Staff"),
    @XmlEnumValue("Mental Health Specialists")
    MENTAL_HEALTH_SPECIALISTS("Mental Health Specialists"),
    @XmlEnumValue("Nutrition Specialists")
    NUTRITION_SPECIALISTS("Nutrition Specialists"),
    @XmlEnumValue("Paraprofessionals")
    PARAPROFESSIONALS("Paraprofessionals"),
    @XmlEnumValue("Part C Early Interventionists")
    PART_C_EARLY_INTERVENTIONISTS("Part C Early Interventionists"),
    @XmlEnumValue("Part C Service Coordinators")
    PART_C_SERVICE_COORDINATORS("Part C Service Coordinators"),
    @XmlEnumValue("School Counselors")
    SCHOOL_COUNSELORS("School Counselors"),
    @XmlEnumValue("Secondary Teachers")
    SECONDARY_TEACHERS("Secondary Teachers"),
    @XmlEnumValue("Social Workers")
    SOCIAL_WORKERS("Social Workers"),
    @XmlEnumValue("Special Education Teachers")
    SPECIAL_EDUCATION_TEACHERS("Special Education Teachers"),
    @XmlEnumValue("Special Needs Specialists")
    SPECIAL_NEEDS_SPECIALISTS("Special Needs Specialists"),
    @XmlEnumValue("Student Support Services Staff")
    STUDENT_SUPPORT_SERVICES_STAFF("Student Support Services Staff"),
    @XmlEnumValue("Ungraded Teachers")
    UNGRADED_TEACHERS("Ungraded Teachers");
    private final String value;

    XEducationStaffClassificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XEducationStaffClassificationType fromValue(String v) {
        for (XEducationStaffClassificationType c: XEducationStaffClassificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
