
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SatisfactoryProgress"/>
 *     &lt;enumeration value="UnsatisfactoryProgress"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepStatusType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepStatusType {

    @XmlEnumValue("SatisfactoryProgress")
    SATISFACTORY_PROGRESS("SatisfactoryProgress"),
    @XmlEnumValue("UnsatisfactoryProgress")
    UNSATISFACTORY_PROGRESS("UnsatisfactoryProgress"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IepStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IepStatusType fromValue(String v) {
        for (IepStatusType c: IepStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
