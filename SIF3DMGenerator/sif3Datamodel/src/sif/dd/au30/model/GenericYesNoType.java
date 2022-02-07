
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericYesNoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericYesNoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenericYesNoType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum GenericYesNoType {

    Y,
    N,
    U;

    public String value() {
        return name();
    }

    public static GenericYesNoType fromValue(String v) {
        return valueOf(v);
    }

}
