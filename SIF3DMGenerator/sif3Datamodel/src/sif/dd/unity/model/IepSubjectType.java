
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepSubjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepSubjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Reading"/>
 *     &lt;enumeration value="Math"/>
 *     &lt;enumeration value="Sciences"/>
 *     &lt;enumeration value="SocialStudies"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepSubjectType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepSubjectType {

    @XmlEnumValue("Reading")
    READING("Reading"),
    @XmlEnumValue("Math")
    MATH("Math"),
    @XmlEnumValue("Sciences")
    SCIENCES("Sciences"),
    @XmlEnumValue("SocialStudies")
    SOCIAL_STUDIES("SocialStudies");
    private final String value;

    IepSubjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepSubjectType fromValue(String v) {
        for (IepSubjectType c: IepSubjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
