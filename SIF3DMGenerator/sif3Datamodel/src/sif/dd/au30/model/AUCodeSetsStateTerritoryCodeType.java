
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsStateTerritoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsStateTerritoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AAT"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="NSW"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="QLD"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TAS"/>
 *     &lt;enumeration value="VIC"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="OTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsStateTerritoryCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsStateTerritoryCodeType {

    AAT,
    ACT,
    NSW,
    NT,
    QLD,
    SA,
    TAS,
    VIC,
    WA,
    XXX,
    OTH;

    public String value() {
        return name();
    }

    public static AUCodeSetsStateTerritoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
