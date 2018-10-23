
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingResponseCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingResponseCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingResponseCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingResponseCategoryType {


    /**
     * Suspension
     * 
     */
    S,

    /**
     * Detention
     * 
     */
    D,

    /**
     * Award
     * 
     */
    A,

    /**
     * PlanRequired
     * 
     */
    P,

    /**
     * MultipleResponse
     * 
     */
    M,

    /**
     * Other
     * 
     */
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsWellbeingResponseCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
