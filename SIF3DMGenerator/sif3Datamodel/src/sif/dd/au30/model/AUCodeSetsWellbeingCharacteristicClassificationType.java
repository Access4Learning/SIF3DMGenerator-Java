
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingCharacteristicClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingCharacteristicClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingCharacteristicClassificationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingCharacteristicClassificationType {

    M,
    D,
    S,
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsWellbeingCharacteristicClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
