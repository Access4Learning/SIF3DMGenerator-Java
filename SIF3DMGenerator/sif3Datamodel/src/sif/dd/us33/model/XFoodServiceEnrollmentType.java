
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xFoodServiceEnrollmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xFoodServiceEnrollmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FreeBreakfast"/>
 *     &lt;enumeration value="FreeLunch"/>
 *     &lt;enumeration value="FreeMilk"/>
 *     &lt;enumeration value="FreeSnack"/>
 *     &lt;enumeration value="FreeSupper"/>
 *     &lt;enumeration value="FullPriceBreakfast"/>
 *     &lt;enumeration value="FullPriceLunch"/>
 *     &lt;enumeration value="FullPriceMilk"/>
 *     &lt;enumeration value="FullPriceSnack"/>
 *     &lt;enumeration value="FullPriceSupper"/>
 *     &lt;enumeration value="ReducedPriceBreakfast"/>
 *     &lt;enumeration value="ReducedPriceLunch"/>
 *     &lt;enumeration value="ReducedPriceSnack"/>
 *     &lt;enumeration value="ReducedPriceSupper"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xFoodServiceEnrollmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XFoodServiceEnrollmentType {

    @XmlEnumValue("FreeBreakfast")
    FREE_BREAKFAST("FreeBreakfast"),
    @XmlEnumValue("FreeLunch")
    FREE_LUNCH("FreeLunch"),
    @XmlEnumValue("FreeMilk")
    FREE_MILK("FreeMilk"),
    @XmlEnumValue("FreeSnack")
    FREE_SNACK("FreeSnack"),
    @XmlEnumValue("FreeSupper")
    FREE_SUPPER("FreeSupper"),
    @XmlEnumValue("FullPriceBreakfast")
    FULL_PRICE_BREAKFAST("FullPriceBreakfast"),
    @XmlEnumValue("FullPriceLunch")
    FULL_PRICE_LUNCH("FullPriceLunch"),
    @XmlEnumValue("FullPriceMilk")
    FULL_PRICE_MILK("FullPriceMilk"),
    @XmlEnumValue("FullPriceSnack")
    FULL_PRICE_SNACK("FullPriceSnack"),
    @XmlEnumValue("FullPriceSupper")
    FULL_PRICE_SUPPER("FullPriceSupper"),
    @XmlEnumValue("ReducedPriceBreakfast")
    REDUCED_PRICE_BREAKFAST("ReducedPriceBreakfast"),
    @XmlEnumValue("ReducedPriceLunch")
    REDUCED_PRICE_LUNCH("ReducedPriceLunch"),
    @XmlEnumValue("ReducedPriceSnack")
    REDUCED_PRICE_SNACK("ReducedPriceSnack"),
    @XmlEnumValue("ReducedPriceSupper")
    REDUCED_PRICE_SUPPER("ReducedPriceSupper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    XFoodServiceEnrollmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XFoodServiceEnrollmentType fromValue(String v) {
        for (XFoodServiceEnrollmentType c: XFoodServiceEnrollmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
