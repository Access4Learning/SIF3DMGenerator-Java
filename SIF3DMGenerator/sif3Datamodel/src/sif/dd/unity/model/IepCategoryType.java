
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="IndependentLiving"/>
 *     &lt;enumeration value="Post-secondary"/>
 *     &lt;enumeration value="WorkingEnvironment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepCategoryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepCategoryType {

    @XmlEnumValue("IndependentLiving")
    INDEPENDENT_LIVING("IndependentLiving"),
    @XmlEnumValue("Post-secondary")
    POST_SECONDARY("Post-secondary"),
    @XmlEnumValue("WorkingEnvironment")
    WORKING_ENVIRONMENT("WorkingEnvironment");
    private final String value;

    IepCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepCategoryType fromValue(String v) {
        for (IepCategoryType c: IepCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
