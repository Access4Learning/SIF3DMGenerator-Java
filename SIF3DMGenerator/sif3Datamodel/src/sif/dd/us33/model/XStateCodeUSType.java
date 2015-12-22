
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xStateCodeUSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xStateCodeUSType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="NJ"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="NY"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VT"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="WV"/>
 *     &lt;enumeration value="WY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xStateCodeUSType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlEnum
public enum XStateCodeUSType {

    AK,
    AL,
    AR,
    AS,
    AZ,
    CA,
    CO,
    CT,
    DC,
    DE,
    FL,
    FM,
    GA,
    GU,
    HI,
    IA,
    ID,
    IL,
    IN,
    KS,
    KY,
    LA,
    MA,
    MD,
    ME,
    MH,
    MI,
    MN,
    MO,
    MP,
    MS,
    MT,
    NC,
    ND,
    NE,
    NH,
    NJ,
    NM,
    NV,
    NY,
    OH,
    OK,
    OR,
    PA,
    PR,
    PW,
    RI,
    SC,
    SD,
    TN,
    TX,
    UT,
    VA,
    VI,
    VT,
    WA,
    WI,
    WV,
    WY;

    public String value() {
        return name();
    }

    public static XStateCodeUSType fromValue(String v) {
        return valueOf(v);
    }

}
