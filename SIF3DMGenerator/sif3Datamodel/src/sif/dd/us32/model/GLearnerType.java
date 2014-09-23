
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gLearnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLearnerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gClientType">
 *       &lt;sequence>
 *         &lt;element name="otherIdList" type="{http://www.sifassociation.org/datamodel/na/3.2}gOtherIdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLearnerType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "otherIdList"
})
@XmlSeeAlso({
    GStudentType.class
})
public class GLearnerType
    extends GClientType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GOtherIdList otherIdList;

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link GOtherIdList }
     *     
     */
    public GOtherIdList getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOtherIdList }
     *     
     */
    public void setOtherIdList(GOtherIdList value) {
        this.otherIdList = value;
    }

}
