
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MealType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MealType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FirstMeal"/>
 *     &lt;enumeration value="SecondMeal"/>
 *     &lt;enumeration value="StaffMeal"/>
 *     &lt;enumeration value="AdultMeal"/>
 *     &lt;enumeration value="AlaCarte"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MealType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum MealType {

    @XmlEnumValue("FirstMeal")
    FIRST_MEAL("FirstMeal"),
    @XmlEnumValue("SecondMeal")
    SECOND_MEAL("SecondMeal"),
    @XmlEnumValue("StaffMeal")
    STAFF_MEAL("StaffMeal"),
    @XmlEnumValue("AdultMeal")
    ADULT_MEAL("AdultMeal"),
    @XmlEnumValue("AlaCarte")
    ALA_CARTE("AlaCarte");
    private final String value;

    MealType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MealType fromValue(String v) {
        for (MealType c: MealType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
