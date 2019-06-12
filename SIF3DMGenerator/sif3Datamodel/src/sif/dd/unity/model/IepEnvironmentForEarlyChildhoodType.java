
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepEnvironmentForEarlyChildhoodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepEnvironmentForEarlyChildhoodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="REC09YOTHLOC"/>
 *     &lt;enumeration value="REC10YOTHLOC"/>
 *     &lt;enumeration value="REC09YSVCS"/>
 *     &lt;enumeration value="REC10YSVCS"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="SPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepEnvironmentForEarlyChildhoodType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepEnvironmentForEarlyChildhoodType {

    @XmlEnumValue("REC09YOTHLOC")
    REC_09_YOTHLOC("REC09YOTHLOC"),
    @XmlEnumValue("REC10YOTHLOC")
    REC_10_YOTHLOC("REC10YOTHLOC"),
    @XmlEnumValue("REC09YSVCS")
    REC_09_YSVCS("REC09YSVCS"),
    @XmlEnumValue("REC10YSVCS")
    REC_10_YSVCS("REC10YSVCS"),
    SC("SC"),
    SS("SS"),
    RF("RF"),
    H("H"),
    SPL("SPL");
    private final String value;

    IepEnvironmentForEarlyChildhoodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepEnvironmentForEarlyChildhoodType fromValue(String v) {
        for (IepEnvironmentForEarlyChildhoodType c: IepEnvironmentForEarlyChildhoodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
