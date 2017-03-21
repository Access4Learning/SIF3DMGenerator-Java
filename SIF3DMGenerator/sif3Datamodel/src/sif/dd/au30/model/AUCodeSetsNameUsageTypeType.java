
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNameUsageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNameUsageTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AKA"/>
 *     &lt;enumeration value="BTH"/>
 *     &lt;enumeration value="LGL"/>
 *     &lt;enumeration value="MDN"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="PRV"/>
 *     &lt;enumeration value="STG"/>
 *     &lt;enumeration value="TRB"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNameUsageTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
@XmlEnum
public enum AUCodeSetsNameUsageTypeType {

    AKA,
    BTH,
    LGL,
    MDN,
    NEW,
    OTH,
    PRF,
    PRV,
    STG,
    TRB,
    ZZREDACTED;

    public String value() {
        return name();
    }

    public static AUCodeSetsNameUsageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
