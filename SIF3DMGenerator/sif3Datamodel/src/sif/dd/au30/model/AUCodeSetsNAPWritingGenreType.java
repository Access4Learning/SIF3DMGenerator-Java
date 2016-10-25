
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPWritingGenreType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPWritingGenreType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Persuasive"/>
 *     &lt;enumeration value="Narrative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPWritingGenreType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPWritingGenreType {

    @XmlEnumValue("Persuasive")
    PERSUASIVE("Persuasive"),
    @XmlEnumValue("Narrative")
    NARRATIVE("Narrative");
    private final String value;

    AUCodeSetsNAPWritingGenreType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPWritingGenreType fromValue(String v) {
        for (AUCodeSetsNAPWritingGenreType c: AUCodeSetsNAPWritingGenreType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
