
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPWritingRubricTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPWritingRubricTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Text Structure"/>
 *     &lt;enumeration value="Ideas"/>
 *     &lt;enumeration value="Ideas"/>
 *     &lt;enumeration value="Persuasive Devices"/>
 *     &lt;enumeration value="Character and Setting"/>
 *     &lt;enumeration value="Vocabulary"/>
 *     &lt;enumeration value="Cohesion"/>
 *     &lt;enumeration value="Paragraphing"/>
 *     &lt;enumeration value="Sentence Structure"/>
 *     &lt;enumeration value="Punctuation"/>
 *     &lt;enumeration value="Spelling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPWritingRubricTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPWritingRubricTypeType {

    @XmlEnumValue("Text Structure")
    TEXT_STRUCTURE("Text Structure"),
    @XmlEnumValue("Ideas")
    IDEAS("Ideas"),
    @XmlEnumValue("Persuasive Devices")
    PERSUASIVE_DEVICES("Persuasive Devices"),
    @XmlEnumValue("Character and Setting")
    CHARACTER_AND_SETTING("Character and Setting"),
    @XmlEnumValue("Vocabulary")
    VOCABULARY("Vocabulary"),
    @XmlEnumValue("Cohesion")
    COHESION("Cohesion"),
    @XmlEnumValue("Paragraphing")
    PARAGRAPHING("Paragraphing"),
    @XmlEnumValue("Sentence Structure")
    SENTENCE_STRUCTURE("Sentence Structure"),
    @XmlEnumValue("Punctuation")
    PUNCTUATION("Punctuation"),
    @XmlEnumValue("Spelling")
    SPELLING("Spelling");
    private final String value;

    AUCodeSetsNAPWritingRubricTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPWritingRubricTypeType fromValue(String v) {
        for (AUCodeSetsNAPWritingRubricTypeType c: AUCodeSetsNAPWritingRubricTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
