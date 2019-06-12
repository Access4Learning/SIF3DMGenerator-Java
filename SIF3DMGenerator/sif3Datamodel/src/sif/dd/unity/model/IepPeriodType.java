
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepPeriodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="week"/>
 *     &lt;enumeration value="month"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="term"/>
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="school year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepPeriodType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepPeriodType {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("week")
    WEEK("week"),
    @XmlEnumValue("month")
    MONTH("month"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("term")
    TERM("term"),
    @XmlEnumValue("year")
    YEAR("year"),
    @XmlEnumValue("school year")
    SCHOOL_YEAR("school year");
    private final String value;

    IepPeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepPeriodType fromValue(String v) {
        for (IepPeriodType c: IepPeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
