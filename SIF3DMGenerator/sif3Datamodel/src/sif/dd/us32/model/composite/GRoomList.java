
package sif.dd.us32.model.composite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for gRoomList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gRoomList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="room" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                   &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gRoomList", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "room"
})
public class GRoomList {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<GRoomList.Room> room;

    /**
     * Gets the value of the room property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the room property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRoomList.Room }
     * 
     * 
     */
    public List<GRoomList.Room> getRoom() {
        if (room == null) {
            room = new ArrayList<GRoomList.Room>();
        }
        return this.room;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomRefId",
        "roomNumber",
        "any"
    })
    public static class Room {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String roomRefId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String roomNumber;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the roomRefId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomRefId() {
            return roomRefId;
        }

        /**
         * Sets the value of the roomRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomRefId(String value) {
            this.roomRefId = value;
        }

        /**
         * Gets the value of the roomNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomNumber() {
            return roomNumber;
        }

        /**
         * Sets the value of the roomNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomNumber(String value) {
            this.roomNumber = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
