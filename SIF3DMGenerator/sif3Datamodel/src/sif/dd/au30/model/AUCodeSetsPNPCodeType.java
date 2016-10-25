
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsPNPCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsPNPCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="AIM"/>
 *     &lt;enumeration value="AIV"/>
 *     &lt;enumeration value="AST"/>
 *     &lt;enumeration value="AAM"/>
 *     &lt;enumeration value="AVM"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="ETA"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="ETC"/>
 *     &lt;enumeration value="OSS"/>
 *     &lt;enumeration value="RBK"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsPNPCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsPNPCodeType {

    AIA,
    AIM,
    AIV,
    AST,
    AAM,
    AVM,
    ALL,
    COL,
    BRA,
    ETA,
    ETB,
    ETC,
    OSS,
    RBK,
    SCR,
    SUP;

    public String value() {
        return name();
    }

    public static AUCodeSetsPNPCodeType fromValue(String v) {
        return valueOf(v);
    }

}
