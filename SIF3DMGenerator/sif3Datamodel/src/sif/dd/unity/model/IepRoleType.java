
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iepRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PSYCH"/>
 *     &lt;enumeration value="SOCIALWORK"/>
 *     &lt;enumeration value="OCCTHERAP"/>
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="PEANDREC"/>
 *     &lt;enumeration value="PHYSTHERAP"/>
 *     &lt;enumeration value="SPEECHPATH"/>
 *     &lt;enumeration value="INTERPRET"/>
 *     &lt;enumeration value="COUNSELOR"/>
 *     &lt;enumeration value="ORIENTMOBIL"/>
 *     &lt;enumeration value="MEDNURSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iepRoleType", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
@XmlEnum
public enum IepRoleType {

    PSYCH,
    SOCIALWORK,
    OCCTHERAP,
    AUDIO,
    PEANDREC,
    PHYSTHERAP,
    SPEECHPATH,
    INTERPRET,
    COUNSELOR,
    ORIENTMOBIL,
    MEDNURSE;

    public String value() {
        return name();
    }

    public static IepRoleType fromValue(String v) {
        return valueOf(v);
    }

}
