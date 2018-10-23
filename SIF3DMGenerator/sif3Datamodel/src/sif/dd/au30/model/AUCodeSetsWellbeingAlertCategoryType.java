
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingAlertCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingAlertCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingAlertCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingAlertCategoryType {


    /**
     * Medical
     * 
     */
    M,

    /**
     * Legal
     * 
     */
    L,

    /**
     * Discipline
     * 
     */
    D,

    /**
     * Educational
     * 
     */
    E,

    /**
     * SpecialNeeds/Disability
     * 
     */
    S,

    /**
     * Plan Review
     * 
     */
    P,

    /**
     * Other
     * 
     */
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsWellbeingAlertCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
