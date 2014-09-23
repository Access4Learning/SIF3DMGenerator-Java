
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gSexusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gSexusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gSexusType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@XmlEnum
public enum GSexusType {

    M,
    F,
    U;

    public String value() {
        return name();
    }

    public static GSexusType fromValue(String v) {
        return valueOf(v);
    }

}
