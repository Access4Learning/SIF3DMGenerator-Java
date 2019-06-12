
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xDisabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xDisabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="DB"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="EMN"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="OI"/>
 *     &lt;enumeration value="OHI"/>
 *     &lt;enumeration value="SLD"/>
 *     &lt;enumeration value="SLI"/>
 *     &lt;enumeration value="TBI"/>
 *     &lt;enumeration value="VI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xDisabilityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum XDisabilityType {

    AUT,
    DB,
    DD,
    EMN,
    HI,
    ID,
    MD,
    OI,
    OHI,
    SLD,
    SLI,
    TBI,
    VI;

    public String value() {
        return name();
    }

    public static XDisabilityType fromValue(String v) {
        return valueOf(v);
    }

}
