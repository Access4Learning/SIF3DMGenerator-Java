
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
 *     &lt;enumeration value="BNB"/>
 *     &lt;enumeration value="BNG"/>
 *     &lt;enumeration value="BNL"/>
 *     &lt;enumeration value="BNW"/>
 *     &lt;enumeration value="BNY"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="ETA"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="ETC"/>
 *     &lt;enumeration value="OSS"/>
 *     &lt;enumeration value="RBK"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SUP"/>
 *     &lt;enumeration value="ETD"/>
 *     &lt;enumeration value="CAL"/>
 *     &lt;enumeration value="ENZ"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="LFS"/>
 *     &lt;enumeration value="RZL"/>
 *     &lt;enumeration value="ZOF"/>
 *     &lt;enumeration value="ZTFAO"/>
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
     * Not In Use 2019
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
     * Not in Use 2019
     * 
     */
    AAM,

    /**
     * Not in Use 2019
     * 
     */
    AVM,

    /**
     * Not in Use 2019
     * 
     */
    ALL,

    /**
     * Colour contrast Black with Blue background
     * 
     */
    BNB,

    /**
     * Colour contrast Black with Green background
     * 
     */
    BNG,

    /**
     * Colour contrast Black with Lilac background
     * 
     */
    BNL,

    /**
     * Colour contrast Black with White background
     * 
     */
    BNW,

    /**
     * Colour contrast Black with Yellow background
     * 
     */
    BNY,

    /**
     * Colour contrast modification
     * 
     */
    COL,

    /**
     * Braille, large print, black and white, electronic test format
     * 
     */
    OFF,

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
    SUP,

    /**
     * Extra Time - double total test time
     * 
     */
    ETD,

    /**
     * Calculator Fit to Screen
     * 
     */
    CAL,

    /**
     * Enable Zoom
     * 
     */
    ENZ,

    /**
     * Editor Sticky Toolbar
     * 
     */
    EST,

    /**
     * Larger Font Sizes
     * 
     */
    LFS,

    /**
     * Remember Zoom Level
     * 
     */
    RZL,

    /**
     * Zoomed Optimised Features
     * 
     */
    ZOF,

    /**
     * Zoom to Always On
     * 
     */
    ZTFAO;

    public String value() {
        return name();
    }

    public static AUCodeSetsPNPCodeType fromValue(String v) {
        return valueOf(v);
    }

}
