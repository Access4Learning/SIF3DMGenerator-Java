
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsSourceCodeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsSourceCodeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsSourceCodeTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsSourceCodeTypeType {

    C,
    O,
    P,
    S,
    T;

    public String value() {
        return name();
    }

    public static AUCodeSetsSourceCodeTypeType fromValue(String v) {
        return valueOf(v);
    }

}
