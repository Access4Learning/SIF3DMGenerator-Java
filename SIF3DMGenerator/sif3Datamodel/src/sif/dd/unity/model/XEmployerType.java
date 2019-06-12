
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xEmployerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xEmployerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Government_1803"/>
 *     &lt;enumeration value="Military_1804"/>
 *     &lt;enumeration value="PrivateOrganization_1805"/>
 *     &lt;enumeration value="Self-employed_1806"/>
 *     &lt;enumeration value="MilitaryDepartmentOfDefense_1807"/>
 *     &lt;enumeration value="AgriculturalFisherySeasonal_1808"/>
 *     &lt;enumeration value="Other_9999"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xEmployerType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XEmployerType {

    @XmlEnumValue("Government_1803")
    GOVERNMENT_1803("Government_1803"),
    @XmlEnumValue("Military_1804")
    MILITARY_1804("Military_1804"),
    @XmlEnumValue("PrivateOrganization_1805")
    PRIVATE_ORGANIZATION_1805("PrivateOrganization_1805"),
    @XmlEnumValue("Self-employed_1806")
    SELF_EMPLOYED_1806("Self-employed_1806"),
    @XmlEnumValue("MilitaryDepartmentOfDefense_1807")
    MILITARY_DEPARTMENT_OF_DEFENSE_1807("MilitaryDepartmentOfDefense_1807"),
    @XmlEnumValue("AgriculturalFisherySeasonal_1808")
    AGRICULTURAL_FISHERY_SEASONAL_1808("AgriculturalFisherySeasonal_1808"),
    @XmlEnumValue("Other_9999")
    OTHER_9999("Other_9999");
    private final String value;

    XEmployerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XEmployerType fromValue(String v) {
        for (XEmployerType c: XEmployerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
