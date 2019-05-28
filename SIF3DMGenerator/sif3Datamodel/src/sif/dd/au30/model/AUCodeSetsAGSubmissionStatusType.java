
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsAGSubmissionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsAGSubmissionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Not Started"/>
 *     &lt;enumeration value="In Progress"/>
 *     &lt;enumeration value="Declaration Pending"/>
 *     &lt;enumeration value="Declared"/>
 *     &lt;enumeration value="In Review"/>
 *     &lt;enumeration value="Exempt"/>
 *     &lt;enumeration value="Finalised"/>
 *     &lt;enumeration value="Reopened"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="In Error"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsAGSubmissionStatusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsAGSubmissionStatusType {

    @XmlEnumValue("Not Started")
    NOT_STARTED("Not Started"),
    @XmlEnumValue("In Progress")
    IN_PROGRESS("In Progress"),
    @XmlEnumValue("Declaration Pending")
    DECLARATION_PENDING("Declaration Pending"),
    @XmlEnumValue("Declared")
    DECLARED("Declared"),
    @XmlEnumValue("In Review")
    IN_REVIEW("In Review"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt"),
    @XmlEnumValue("Finalised")
    FINALISED("Finalised"),
    @XmlEnumValue("Reopened")
    REOPENED("Reopened"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("In Error")
    IN_ERROR("In Error"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    AUCodeSetsAGSubmissionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsAGSubmissionStatusType fromValue(String v) {
        for (AUCodeSetsAGSubmissionStatusType c: AUCodeSetsAGSubmissionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
