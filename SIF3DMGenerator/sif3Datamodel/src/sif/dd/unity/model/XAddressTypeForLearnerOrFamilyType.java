
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAddressTypeForLearnerOrFamilyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xAddressTypeForLearnerOrFamilyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Mailing"/>
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="OnCampus"/>
 *     &lt;enumeration value="OffCampus"/>
 *     &lt;enumeration value="PermanentStudent"/>
 *     &lt;enumeration value="PermanentAdmission"/>
 *     &lt;enumeration value="FatherAddress"/>
 *     &lt;enumeration value="MotherAddress"/>
 *     &lt;enumeration value="GuardianAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xAddressTypeForLearnerOrFamilyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XAddressTypeForLearnerOrFamilyType {

    @XmlEnumValue("Mailing")
    MAILING("Mailing"),
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("OnCampus")
    ON_CAMPUS("OnCampus"),
    @XmlEnumValue("OffCampus")
    OFF_CAMPUS("OffCampus"),
    @XmlEnumValue("PermanentStudent")
    PERMANENT_STUDENT("PermanentStudent"),
    @XmlEnumValue("PermanentAdmission")
    PERMANENT_ADMISSION("PermanentAdmission"),
    @XmlEnumValue("FatherAddress")
    FATHER_ADDRESS("FatherAddress"),
    @XmlEnumValue("MotherAddress")
    MOTHER_ADDRESS("MotherAddress"),
    @XmlEnumValue("GuardianAddress")
    GUARDIAN_ADDRESS("GuardianAddress");
    private final String value;

    XAddressTypeForLearnerOrFamilyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XAddressTypeForLearnerOrFamilyType fromValue(String v) {
        for (XAddressTypeForLearnerOrFamilyType c: XAddressTypeForLearnerOrFamilyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
