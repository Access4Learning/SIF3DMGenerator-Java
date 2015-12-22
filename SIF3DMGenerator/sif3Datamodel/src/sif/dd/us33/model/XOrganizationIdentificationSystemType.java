
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xOrganizationIdentificationSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xOrganizationIdentificationSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="LEA"/>
 *     &lt;enumeration value="SEA"/>
 *     &lt;enumeration value="NCES"/>
 *     &lt;enumeration value="Federal"/>
 *     &lt;enumeration value="DUNS"/>
 *     &lt;enumeration value="OtherFederal"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="Vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xOrganizationIdentificationSystemType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XOrganizationIdentificationSystemType {

    @XmlEnumValue("School")
    SCHOOL("School"),
    ACT("ACT"),
    LEA("LEA"),
    SEA("SEA"),
    NCES("NCES"),
    @XmlEnumValue("Federal")
    FEDERAL("Federal"),
    DUNS("DUNS"),
    @XmlEnumValue("OtherFederal")
    OTHER_FEDERAL("OtherFederal"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    SSN("SSN"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    XOrganizationIdentificationSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XOrganizationIdentificationSystemType fromValue(String v) {
        for (XOrganizationIdentificationSystemType c: XOrganizationIdentificationSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
