
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xPersonIdSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xPersonIdSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="USVisa"/>
 *     &lt;enumeration value="PIN"/>
 *     &lt;enumeration value="Federal"/>
 *     &lt;enumeration value="DriversLicense"/>
 *     &lt;enumeration value="Medicaid"/>
 *     &lt;enumeration value="Healthcare"/>
 *     &lt;enumeration value="ProfessionalCertificate"/>
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="District"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Institution"/>
 *     &lt;enumeration value="OtherFederal"/>
 *     &lt;enumeration value="SelectiveService"/>
 *     &lt;enumeration value="CanadianSIN"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xPersonIdSystemType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XPersonIdSystemType {

    @XmlEnumValue("Alias")
    ALIAS("Alias"),
    SSN("SSN"),
    @XmlEnumValue("USVisa")
    US_VISA("USVisa"),
    PIN("PIN"),
    @XmlEnumValue("Federal")
    FEDERAL("Federal"),
    @XmlEnumValue("DriversLicense")
    DRIVERS_LICENSE("DriversLicense"),
    @XmlEnumValue("Medicaid")
    MEDICAID("Medicaid"),
    @XmlEnumValue("Healthcare")
    HEALTHCARE("Healthcare"),
    @XmlEnumValue("ProfessionalCertificate")
    PROFESSIONAL_CERTIFICATE("ProfessionalCertificate"),
    @XmlEnumValue("School")
    SCHOOL("School"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Institution")
    INSTITUTION("Institution"),
    @XmlEnumValue("OtherFederal")
    OTHER_FEDERAL("OtherFederal"),
    @XmlEnumValue("SelectiveService")
    SELECTIVE_SERVICE("SelectiveService"),
    @XmlEnumValue("CanadianSIN")
    CANADIAN_SIN("CanadianSIN"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XPersonIdSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPersonIdSystemType fromValue(String v) {
        for (XPersonIdSystemType c: XPersonIdSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
