
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
 *     &lt;enumeration value="Numeracy"/>
 *     &lt;enumeration value="Spelling"/>
 *     &lt;enumeration value="Grammar and Punctuation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestDomainType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPTestDomainType {


    /**
     * Reading
     * 
     */
    @XmlEnumValue("Reading")
    READING("Reading"),

    /**
     * Writing
     * 
     */
    @XmlEnumValue("Writing")
    WRITING("Writing"),

    /**
     * Numeracy
     * 
     */
    @XmlEnumValue("Numeracy")
    NUMERACY("Numeracy"),

    /**
     * Spelling
     * 
     */
    @XmlEnumValue("Spelling")
    SPELLING("Spelling"),

    /**
     * Grammar and Punctuation
     * 
     */
    @XmlEnumValue("Grammar and Punctuation")
    GRAMMAR_AND_PUNCTUATION("Grammar and Punctuation");
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
