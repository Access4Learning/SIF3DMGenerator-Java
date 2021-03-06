
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsTravelModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsTravelModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsTravelModeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsTravelModeType {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I;

    public String value() {
        return name();
    }

    public static AUCodeSetsTravelModeType fromValue(String v) {
        return valueOf(v);
    }

}
