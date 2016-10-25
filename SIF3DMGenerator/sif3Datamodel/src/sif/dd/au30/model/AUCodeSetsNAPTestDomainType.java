
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestDomainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestDomainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Reading"/>
 *     &lt;enumeration value="Writing"/>
 *     &lt;enumeration value="Writing"/>
 *     &lt;enumeration value="Numeracy"/>
 *     &lt;enumeration value="Language Conventions Spelling"/>
 *     &lt;enumeration value="Language Conventions Grammar and Punctuation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestDomainType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPTestDomainType {

    @XmlEnumValue("Reading")
    READING("Reading"),
    @XmlEnumValue("Writing")
    WRITING("Writing"),
    @XmlEnumValue("Numeracy")
    NUMERACY("Numeracy"),
    @XmlEnumValue("Language Conventions Spelling")
    LANGUAGE_CONVENTIONS_SPELLING("Language Conventions Spelling"),
    @XmlEnumValue("Language Conventions Grammar and Punctuation")
    LANGUAGE_CONVENTIONS_GRAMMAR_AND_PUNCTUATION("Language Conventions Grammar and Punctuation");
    private final String value;

    AUCodeSetsNAPTestDomainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPTestDomainType fromValue(String v) {
        for (AUCodeSetsNAPTestDomainType c: AUCodeSetsNAPTestDomainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
