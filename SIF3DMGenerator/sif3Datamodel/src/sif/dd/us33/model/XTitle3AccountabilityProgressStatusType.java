
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xTitle3AccountabilityProgressStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xTitle3AccountabilityProgressStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PROGRESS"/>
 *     &lt;enumeration value="NOPROGRESS"/>
 *     &lt;enumeration value="PROFICIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xTitle3AccountabilityProgressStatusType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XTitle3AccountabilityProgressStatusType {

    PROGRESS,
    NOPROGRESS,
    PROFICIENT;

    public String value() {
        return name();
    }

    public static XTitle3AccountabilityProgressStatusType fromValue(String v) {
        return valueOf(v);
    }

}
