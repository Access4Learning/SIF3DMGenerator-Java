
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestItemMarkingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestItemMarkingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="AES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestItemMarkingTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
@XmlEnum
public enum AUCodeSetsNAPTestItemMarkingTypeType {

    AS,
    MM,
    AES;

    public String value() {
        return name();
    }

    public static AUCodeSetsNAPTestItemMarkingTypeType fromValue(String v) {
        return valueOf(v);
    }

}
