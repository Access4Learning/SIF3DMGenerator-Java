
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsEnrollmentTimeFrameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsEnrollmentTimeFrameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsEnrollmentTimeFrameType", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
@XmlEnum
public enum AUCodeSetsEnrollmentTimeFrameType {


    /**
     * Current
     * 
     */
    C,

    /**
     * Future
     * 
     */
    F,

    /**
     * Historical
     * 
     */
    H,

    /**
     * REDACTED for privacy
     * 
     */
    ZZREDACTED;

    public String value() {
        return name();
    }

    public static AUCodeSetsEnrollmentTimeFrameType fromValue(String v) {
        return valueOf(v);
    }

}
