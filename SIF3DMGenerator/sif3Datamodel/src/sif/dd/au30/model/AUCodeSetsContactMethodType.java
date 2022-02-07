
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsContactMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsContactMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Mailing"/>
 *     &lt;enumeration value="AltMailing"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="ParentPortal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsContactMethodType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsContactMethodType {

    @XmlEnumValue("Mailing")
    MAILING("Mailing"),
    @XmlEnumValue("AltMailing")
    ALT_MAILING("AltMailing"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("ParentPortal")
    PARENT_PORTAL("ParentPortal");
    private final String value;

    AUCodeSetsContactMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsContactMethodType fromValue(String v) {
        for (AUCodeSetsContactMethodType c: AUCodeSetsContactMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
