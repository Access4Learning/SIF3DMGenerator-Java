
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsVisaStudyEntitlementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsVisaStudyEntitlementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Nil"/>
 *     &lt;enumeration value="Unlimited"/>
 *     &lt;enumeration value="Limited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsVisaStudyEntitlementType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsVisaStudyEntitlementType {

    @XmlEnumValue("Nil")
    NIL("Nil"),
    @XmlEnumValue("Unlimited")
    UNLIMITED("Unlimited"),
    @XmlEnumValue("Limited")
    LIMITED("Limited");
    private final String value;

    AUCodeSetsVisaStudyEntitlementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsVisaStudyEntitlementType fromValue(String v) {
        for (AUCodeSetsVisaStudyEntitlementType c: AUCodeSetsVisaStudyEntitlementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
