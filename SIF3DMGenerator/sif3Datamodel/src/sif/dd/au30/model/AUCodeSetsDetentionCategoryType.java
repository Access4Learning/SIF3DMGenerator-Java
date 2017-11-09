
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsDetentionCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsDetentionCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsDetentionCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsDetentionCategoryType {

    B,
    R,
    MR,
    AR,
    A,
    L,
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsDetentionCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
