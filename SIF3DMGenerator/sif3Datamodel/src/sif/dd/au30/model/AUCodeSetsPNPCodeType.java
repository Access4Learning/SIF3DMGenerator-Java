
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsPNPCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsPNPCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="AIM"/>
 *     &lt;enumeration value="AIV"/>
 *     &lt;enumeration value="AST"/>
 *     &lt;enumeration value="AAM"/>
 *     &lt;enumeration value="AVM"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="ETA"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="ETC"/>
 *     &lt;enumeration value="OSS"/>
 *     &lt;enumeration value="RBK"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsPNPCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsPNPCodeType {


    /**
     * Alternative items - audio
     * 
     */
    AIA,

    /**
     * Alternative items - motor assistive
     * 
     */
    AIM,

    /**
     * Alternative items - visual
     * 
     */
    AIV,

    /**
     * Assistive technology
     * 
     */
    AST,

    /**
     * Alternative Items: both audio and motor assistive
     * 
     */
    AAM,

    /**
     * Alternative Items: both video and motor assistive
     * 
     */
    AVM,

    /**
     * Alternative Items: audio, visual and motor assistive
     * 
     */
    ALL,

    /**
     * Colour contrast modification
     * 
     */
    COL,

    /**
     * Braille hardcopy
     * 
     */
    BRA,

    /**
     * Extra Time - 5 mins per 30 min or part thereof
     * 
     */
    ETA,

    /**
     * Extra Time - 10 mins per 30 min or part thereof
     * 
     */
    ETB,

    /**
     * Extra Time - 15 mins per 30 min or part thereof
     * 
     */
    ETC,

    /**
     * Oral sign/support
     * 
     */
    OSS,

    /**
     * Rest break
     * 
     */
    RBK,

    /**
     * Scribe
     * 
     */
    SCR,

    /**
     * NAPLAN Support person
     * 
     */
    SUP;

    public String value() {
        return name();
    }

    public static AUCodeSetsPNPCodeType fromValue(String v) {
        return valueOf(v);
    }

}
