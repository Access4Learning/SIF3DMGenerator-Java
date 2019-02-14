
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsImmunisationCertificateStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsImmunisationCertificateStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="IU"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsImmunisationCertificateStatusType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsImmunisationCertificateStatusType {

    C,
    I,
    IU,
    IN,
    IM,
    IO,
    N;

    public String value() {
        return name();
    }

    public static AUCodeSetsImmunisationCertificateStatusType fromValue(String v) {
        return valueOf(v);
    }

}
