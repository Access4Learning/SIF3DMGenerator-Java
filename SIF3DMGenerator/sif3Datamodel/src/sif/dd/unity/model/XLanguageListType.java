
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xLanguageListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLanguageListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/4.x}xLanguageType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.sifassociation.org/datamodel/na/4.x}xLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLanguageListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "language"
})
public class XLanguageListType
    extends XLanguageType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<XLanguageType> language;

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XLanguageType }
     * 
     * 
     */
    public List<XLanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<XLanguageType>();
        }
        return this.language;
    }

}
