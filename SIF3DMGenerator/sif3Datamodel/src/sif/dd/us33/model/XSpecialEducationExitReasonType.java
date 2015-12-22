
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xSpecialEducationExitReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xSpecialEducationExitReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HighSchoolDiploma"/>
 *     &lt;enumeration value="ReceivedCertificate"/>
 *     &lt;enumeration value="ReachedMaximumAge"/>
 *     &lt;enumeration value="Died"/>
 *     &lt;enumeration value="MovedAndContinuing"/>
 *     &lt;enumeration value="DroppedOut"/>
 *     &lt;enumeration value="Transferred"/>
 *     &lt;enumeration value="PartCNoLongerEligible"/>
 *     &lt;enumeration value="PartBEligibleExitingPartC"/>
 *     &lt;enumeration value="PartBEligibleContinuingPartC"/>
 *     &lt;enumeration value="NotPartBElgibleExitingPartCWithReferrrals"/>
 *     &lt;enumeration value="NotPartBElgibleExitingPartCWithoutReferrrals"/>
 *     &lt;enumeration value="PartBEligibilityNotDeterminedExitingPartC"/>
 *     &lt;enumeration value="WithdrawalByParent"/>
 *     &lt;enumeration value="MovedOutOfState"/>
 *     &lt;enumeration value="Unreachable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xSpecialEducationExitReasonType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XSpecialEducationExitReasonType {

    @XmlEnumValue("HighSchoolDiploma")
    HIGH_SCHOOL_DIPLOMA("HighSchoolDiploma"),
    @XmlEnumValue("ReceivedCertificate")
    RECEIVED_CERTIFICATE("ReceivedCertificate"),
    @XmlEnumValue("ReachedMaximumAge")
    REACHED_MAXIMUM_AGE("ReachedMaximumAge"),
    @XmlEnumValue("Died")
    DIED("Died"),
    @XmlEnumValue("MovedAndContinuing")
    MOVED_AND_CONTINUING("MovedAndContinuing"),
    @XmlEnumValue("DroppedOut")
    DROPPED_OUT("DroppedOut"),
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred"),
    @XmlEnumValue("PartCNoLongerEligible")
    PART_C_NO_LONGER_ELIGIBLE("PartCNoLongerEligible"),
    @XmlEnumValue("PartBEligibleExitingPartC")
    PART_B_ELIGIBLE_EXITING_PART_C("PartBEligibleExitingPartC"),
    @XmlEnumValue("PartBEligibleContinuingPartC")
    PART_B_ELIGIBLE_CONTINUING_PART_C("PartBEligibleContinuingPartC"),
    @XmlEnumValue("NotPartBElgibleExitingPartCWithReferrrals")
    NOT_PART_B_ELGIBLE_EXITING_PART_C_WITH_REFERRRALS("NotPartBElgibleExitingPartCWithReferrrals"),
    @XmlEnumValue("NotPartBElgibleExitingPartCWithoutReferrrals")
    NOT_PART_B_ELGIBLE_EXITING_PART_C_WITHOUT_REFERRRALS("NotPartBElgibleExitingPartCWithoutReferrrals"),
    @XmlEnumValue("PartBEligibilityNotDeterminedExitingPartC")
    PART_B_ELIGIBILITY_NOT_DETERMINED_EXITING_PART_C("PartBEligibilityNotDeterminedExitingPartC"),
    @XmlEnumValue("WithdrawalByParent")
    WITHDRAWAL_BY_PARENT("WithdrawalByParent"),
    @XmlEnumValue("MovedOutOfState")
    MOVED_OUT_OF_STATE("MovedOutOfState"),
    @XmlEnumValue("Unreachable")
    UNREACHABLE("Unreachable");
    private final String value;

    XSpecialEducationExitReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XSpecialEducationExitReasonType fromValue(String v) {
        for (XSpecialEducationExitReasonType c: XSpecialEducationExitReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
