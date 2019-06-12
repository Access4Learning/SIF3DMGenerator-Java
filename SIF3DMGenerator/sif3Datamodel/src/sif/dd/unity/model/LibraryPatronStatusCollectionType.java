
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibraryPatronStatusCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryPatronStatusCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LibraryPatronStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}LibraryPatronStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryPatronStatusCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "libraryPatronStatus"
})
public class LibraryPatronStatusCollectionType {

    @XmlElement(name = "LibraryPatronStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<LibraryPatronStatusType> libraryPatronStatus;

    /**
     * Gets the value of the libraryPatronStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryPatronStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryPatronStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryPatronStatusType }
     * 
     * 
     */
    public List<LibraryPatronStatusType> getLibraryPatronStatus() {
        if (libraryPatronStatus == null) {
            libraryPatronStatus = new ArrayList<LibraryPatronStatusType>();
        }
        return this.libraryPatronStatus;
    }

}
