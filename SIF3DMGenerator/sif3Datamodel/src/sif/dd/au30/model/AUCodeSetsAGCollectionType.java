
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsAGCollectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsAGCollectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SES"/>
 *     &lt;enumeration value="FQ"/>
 *     &lt;enumeration value="COI"/>
 *     &lt;enumeration value="STATS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsAGCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsAGCollectionType {

    SES,
    FQ,
    COI,
    STATS;

    public String value() {
        return name();
    }

    public static AUCodeSetsAGCollectionType fromValue(String v) {
        return valueOf(v);
    }

}
