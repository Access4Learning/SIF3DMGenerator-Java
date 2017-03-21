
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestItemTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestItemTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="IGA"/>
 *     &lt;enumeration value="IGGM"/>
 *     &lt;enumeration value="IGM"/>
 *     &lt;enumeration value="IGO"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MCS"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestItemTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
@XmlEnum
public enum AUCodeSetsNAPTestItemTypeType {

    CO,
    ET,
    HS,
    HT,
    IA,
    IC,
    IGA,
    IGGM,
    IGM,
    IGO,
    IM,
    IO,
    MC,
    MCS,
    PO,
    SL,
    SP,
    TE;

    public String value() {
        return name();
    }

    public static AUCodeSetsNAPTestItemTypeType fromValue(String v) {
        return valueOf(v);
    }

}
