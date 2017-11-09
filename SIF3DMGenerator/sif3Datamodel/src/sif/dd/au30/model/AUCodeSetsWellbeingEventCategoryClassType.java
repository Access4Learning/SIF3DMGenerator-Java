
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsWellbeingEventCategoryClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsWellbeingEventCategoryClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsWellbeingEventCategoryClassType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsWellbeingEventCategoryClassType {

    P,
    N,
    D,
    O;

    public String value() {
        return name();
    }

    public static AUCodeSetsWellbeingEventCategoryClassType fromValue(String v) {
        return valueOf(v);
    }

}
