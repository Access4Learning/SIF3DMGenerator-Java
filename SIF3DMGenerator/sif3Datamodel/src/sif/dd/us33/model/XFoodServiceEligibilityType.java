
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xFoodServiceEligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xFoodServiceEligibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="FullPrice"/>
 *     &lt;enumeration value="ReducedPrice"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xFoodServiceEligibilityType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XFoodServiceEligibilityType {

    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("FullPrice")
    FULL_PRICE("FullPrice"),
    @XmlEnumValue("ReducedPrice")
    REDUCED_PRICE("ReducedPrice"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XFoodServiceEligibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XFoodServiceEligibilityType fromValue(String v) {
        for (XFoodServiceEligibilityType c: XFoodServiceEligibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
