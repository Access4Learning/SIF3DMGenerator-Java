
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An identifier meant to be read and processed by electronic equipment. This includes Barcode, Magstripe, PIN, RFID, etc.
 * 
 * <p>Java class for gElectronicIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gElectronicIdType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gElectronicIdType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class GElectronicIdType
    extends GLocalIdType
{


}
