
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepStandardPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepStandardPurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="report"/>
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="transfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepStandardPurposeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepStandardPurposeType {

    @XmlEnumValue("report")
    REPORT("report"),
    @XmlEnumValue("service")
    SERVICE("service"),
    @XmlEnumValue("transfer")
    TRANSFER("transfer");
    private final String value;

    IepStandardPurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepStandardPurposeType fromValue(String v) {
        for (IepStandardPurposeType c: IepStandardPurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
