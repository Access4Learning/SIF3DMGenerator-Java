
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsSuspensionCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsSuspensionCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="WE"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsSuspensionCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsSuspensionCategoryType {

    E,
    WE,
    P,
    I,
    W,
    S,
    R,
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsSuspensionCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
