
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsACStrandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsACStrandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="ReligousStudies"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsACStrandType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsACStrandType {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    G("G"),
    H("H"),
    I("I"),
    L("L"),
    M("M"),
    P("P"),
    S("S"),
    U("U"),
    T("T"),
    W("W"),
    @XmlEnumValue("ReligousStudies")
    RELIGOUS_STUDIES("ReligousStudies"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AUCodeSetsACStrandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsACStrandType fromValue(String v) {
        for (AUCodeSetsACStrandType c: AUCodeSetsACStrandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
