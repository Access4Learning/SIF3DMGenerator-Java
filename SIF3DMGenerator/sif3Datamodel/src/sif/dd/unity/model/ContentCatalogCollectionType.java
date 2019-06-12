
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentCatalogCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentCatalogCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentCatalog" type="{http://www.sifassociation.org/datamodel/na/4.x}ContentCatalogType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentCatalogCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "contentCatalog"
})
public class ContentCatalogCollectionType {

    @XmlElement(name = "ContentCatalog", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<ContentCatalogType> contentCatalog;

    /**
     * Gets the value of the contentCatalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentCatalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentCatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentCatalogType }
     * 
     * 
     */
    public List<ContentCatalogType> getContentCatalog() {
        if (contentCatalog == null) {
            contentCatalog = new ArrayList<ContentCatalogType>();
        }
        return this.contentCatalog;
    }

}
