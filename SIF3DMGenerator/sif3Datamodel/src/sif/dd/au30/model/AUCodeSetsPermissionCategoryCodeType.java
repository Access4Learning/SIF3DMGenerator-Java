
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
 *     &lt;enumeration value="Jurisdiction Promotional"/>
 *     &lt;enumeration value="Jurisdiction Educational"/>
 *     &lt;enumeration value="OKPublishInfo"/>
 *     &lt;enumeration value="OKOnLineServices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsPermissionCategoryCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsPermissionCategoryCodeType {

    @XmlEnumValue("OKPrintedMaterial")
    OK_PRINTED_MATERIAL("OKPrintedMaterial"),
    @XmlEnumValue("OKOnlineMaterial")
    OK_ONLINE_MATERIAL("OKOnlineMaterial"),
    @XmlEnumValue("OKMediaRelease")
    OK_MEDIA_RELEASE("OKMediaRelease"),
    @XmlEnumValue("School/College Newsletter")
    SCHOOL_COLLEGE_NEWSLETTER("School/College Newsletter"),
    @XmlEnumValue("School/College Yearbook")
    SCHOOL_COLLEGE_YEARBOOK("School/College Yearbook"),
    @XmlEnumValue("Jurisdiction Promotional")
    JURISDICTION_PROMOTIONAL("Jurisdiction Promotional"),
    @XmlEnumValue("Jurisdiction Educational")
    JURISDICTION_EDUCATIONAL("Jurisdiction Educational"),
    @XmlEnumValue("OKPublishInfo")
    OK_PUBLISH_INFO("OKPublishInfo"),
    @XmlEnumValue("OKOnLineServices")
    OK_ON_LINE_SERVICES("OKOnLineServices");
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
