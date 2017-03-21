
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PasswordListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Password" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="Algorithm" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="MD5"/>
 *                       &lt;enumeration value="SHA1"/>
 *                       &lt;enumeration value="DES"/>
 *                       &lt;enumeration value="TripleDES"/>
 *                       &lt;enumeration value="RC2"/>
 *                       &lt;enumeration value="AES"/>
 *                       &lt;enumeration value="RSA"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="KeyName" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "PasswordListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "password"
})
public class PasswordListType {

    @XmlElement(name = "Password", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<PasswordListType.Password> password;

    /**
     * Gets the value of the password property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the password property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PasswordListType.Password }
     * 
     * 
     */
    public List<PasswordListType.Password> getPassword() {
        if (password == null) {
            password = new ArrayList<PasswordListType.Password>();
        }
        return this.password;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="Algorithm" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="MD5"/>
     *             &lt;enumeration value="SHA1"/>
     *             &lt;enumeration value="DES"/>
     *             &lt;enumeration value="TripleDES"/>
     *             &lt;enumeration value="RC2"/>
     *             &lt;enumeration value="AES"/>
     *             &lt;enumeration value="RSA"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="KeyName" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Password {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "Algorithm", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String algorithm;
        @XmlAttribute(name = "KeyName", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String keyName;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the algorithm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlgorithm() {
            return algorithm;
        }

        /**
         * Sets the value of the algorithm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlgorithm(String value) {
            this.algorithm = value;
        }

        /**
         * Gets the value of the keyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyName() {
            return keyName;
        }

        /**
         * Sets the value of the keyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyName(String value) {
            this.keyName = value;
        }

    }

}
