
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsPermissionCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsPermissionCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OKPrintedMaterial"/>
 *     &lt;enumeration value="OKOnlineMaterial"/>
 *     &lt;enumeration value="OKMediaRelease"/>
 *     &lt;enumeration value="School/College Newsletter"/>
 *     &lt;enumeration value="School/College Yearbook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsPermissionCategoryCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsPermissionCategoryCodeType {


    /**
     * OKPrintedMaterial
     * 
     */
    @XmlEnumValue("OKPrintedMaterial")
    OK_PRINTED_MATERIAL("OKPrintedMaterial"),

    /**
     * OKOnlineMaterial
     * 
     */
    @XmlEnumValue("OKOnlineMaterial")
    OK_ONLINE_MATERIAL("OKOnlineMaterial"),

    /**
     * OKMediaRelease
     * 
     */
    @XmlEnumValue("OKMediaRelease")
    OK_MEDIA_RELEASE("OKMediaRelease"),

    /**
     * School/College Newsletter
     * 
     */
    @XmlEnumValue("School/College Newsletter")
    SCHOOL_COLLEGE_NEWSLETTER("School/College Newsletter"),

    /**
     * School/College Yearbook
     * 
     */
    @XmlEnumValue("School/College Yearbook")
    SCHOOL_COLLEGE_YEARBOOK("School/College Yearbook");
    private final String value;

    AUCodeSetsPermissionCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsPermissionCategoryCodeType fromValue(String v) {
        for (AUCodeSetsPermissionCategoryCodeType c: AUCodeSetsPermissionCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
