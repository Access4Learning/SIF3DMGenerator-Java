
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains all the personal information related to the student.
 * 
 * <p>Java class for studentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gStudentType">
 *       &lt;sequence>
 *         &lt;element name="disability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="iDEAIndicator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="section504Status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="primaryDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
 *                   &lt;element name="awaitingInitialIDEAEvaluation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="iDEAEnvironment" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "disability"
})
public class StudentType
    extends GStudentType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected StudentType.Disability disability;

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link StudentType.Disability }
     *     
     */
    public StudentType.Disability getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentType.Disability }
     *     
     */
    public void setDisability(StudentType.Disability value) {
        this.disability = value;
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
     *         &lt;element name="iDEAIndicator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="section504Status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="primaryDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
     *         &lt;element name="awaitingInitialIDEAEvaluation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="iDEAEnvironment" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
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
        "ideaIndicator",
        "status",
        "section504Status",
        "primaryDisability",
        "awaitingInitialIDEAEvaluation",
        "ideaEnvironment"
    })
    public static class Disability {

        @XmlElement(name = "iDEAIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType ideaIndicator;
        @XmlElement(name = "Status", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String status;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String section504Status;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GCodedElementType primaryDisability;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType awaitingInitialIDEAEvaluation;
        @XmlElement(name = "iDEAEnvironment", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GCodedElementType ideaEnvironment;

        /**
         * Gets the value of the ideaIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getIDEAIndicator() {
            return ideaIndicator;
        }

        /**
         * Sets the value of the ideaIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setIDEAIndicator(GYesNoUnknownType value) {
            this.ideaIndicator = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the section504Status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSection504Status() {
            return section504Status;
        }

        /**
         * Sets the value of the section504Status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSection504Status(String value) {
            this.section504Status = value;
        }

        /**
         * Gets the value of the primaryDisability property.
         * 
         * @return
         *     possible object is
         *     {@link GCodedElementType }
         *     
         */
        public GCodedElementType getPrimaryDisability() {
            return primaryDisability;
        }

        /**
         * Sets the value of the primaryDisability property.
         * 
         * @param value
         *     allowed object is
         *     {@link GCodedElementType }
         *     
         */
        public void setPrimaryDisability(GCodedElementType value) {
            this.primaryDisability = value;
        }

        /**
         * Gets the value of the awaitingInitialIDEAEvaluation property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getAwaitingInitialIDEAEvaluation() {
            return awaitingInitialIDEAEvaluation;
        }

        /**
         * Sets the value of the awaitingInitialIDEAEvaluation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setAwaitingInitialIDEAEvaluation(GYesNoUnknownType value) {
            this.awaitingInitialIDEAEvaluation = value;
        }

        /**
         * Gets the value of the ideaEnvironment property.
         * 
         * @return
         *     possible object is
         *     {@link GCodedElementType }
         *     
         */
        public GCodedElementType getIDEAEnvironment() {
            return ideaEnvironment;
        }

        /**
         * Sets the value of the ideaEnvironment property.
         * 
         * @param value
         *     allowed object is
         *     {@link GCodedElementType }
         *     
         */
        public void setIDEAEnvironment(GCodedElementType value) {
            this.ideaEnvironment = value;
        }

    }

}
