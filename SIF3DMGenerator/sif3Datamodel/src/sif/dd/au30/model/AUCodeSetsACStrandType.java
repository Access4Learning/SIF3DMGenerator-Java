
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
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
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsACStrandType", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
@XmlEnum
public enum AUCodeSetsACStrandType {


    /**
     * The arts
     * 
     */
    A,

    /**
     * Economics and business
     * 
     */
    B,

    /**
     * Civics and citizenship
     * 
     */
    C,

    /**
     * Design and technologies
     * 
     */
    D,

    /**
     * English
     * 
     */
    E,

    /**
     * Geography
     * 
     */
    G,

    /**
     * History
     * 
     */
    H,

    /**
     * Digital technologies
     * 
     */
    I,

    /**
     * Languages
     * 
     */
    L,

    /**
     * Mathematics
     * 
     */
    M,

    /**
     * Health and physical education
     * 
     */
    P,

    /**
     * Science
     * 
     */
    S,

    /**
     * Humanities and social sciences
     * 
     */
    U,

    /**
     * Technology
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static AUCodeSetsACStrandType fromValue(String v) {
        return valueOf(v);
    }

}
