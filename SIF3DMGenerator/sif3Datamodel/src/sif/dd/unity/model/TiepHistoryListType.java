
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiepHistoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiepHistoryListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/4.x}tiepHistoryListItemType">
 *       &lt;sequence>
 *         &lt;element name="historyItem" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepHistoryListItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiepHistoryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "historyItem"
})
public class TiepHistoryListType
    extends TiepHistoryListItemType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<TiepHistoryListItemType> historyItem;

    /**
     * Gets the value of the historyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiepHistoryListItemType }
     * 
     * 
     */
    public List<TiepHistoryListItemType> getHistoryItem() {
        if (historyItem == null) {
            historyItem = new ArrayList<TiepHistoryListItemType>();
        }
        return this.historyItem;
    }

}
