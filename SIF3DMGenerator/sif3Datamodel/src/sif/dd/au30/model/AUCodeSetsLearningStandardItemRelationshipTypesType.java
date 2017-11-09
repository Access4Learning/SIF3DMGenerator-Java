
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsLearningStandardItemRelationshipTypesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsLearningStandardItemRelationshipTypesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Content"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="State"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsLearningStandardItemRelationshipTypesType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsLearningStandardItemRelationshipTypesType {

    @XmlEnumValue("Content")
    CONTENT("Content"),
    PD("PD"),
    @XmlEnumValue("State")
    STATE("State");
    private final String value;

    AUCodeSetsLearningStandardItemRelationshipTypesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsLearningStandardItemRelationshipTypesType fromValue(String v) {
        for (AUCodeSetsLearningStandardItemRelationshipTypesType c: AUCodeSetsLearningStandardItemRelationshipTypesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
