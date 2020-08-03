
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsCohortYearLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsCohortYearLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CohortYearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="StatsCohortList" type="{http://www.sifassociation.org/datamodel/au/3.4}StatsCohortListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsCohortYearLevelType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "cohortYearLevel",
    "statsCohortList"
})
public class StatsCohortYearLevelType {

    @XmlElement(name = "CohortYearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected YearLevelType cohortYearLevel;
    @XmlElement(name = "StatsCohortList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected StatsCohortListType statsCohortList;

    /**
     * Gets the value of the cohortYearLevel property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getCohortYearLevel() {
        return cohortYearLevel;
    }

    /**
     * Sets the value of the cohortYearLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setCohortYearLevel(YearLevelType value) {
        this.cohortYearLevel = value;
    }

    /**
     * Gets the value of the statsCohortList property.
     * 
     * @return
     *     possible object is
     *     {@link StatsCohortListType }
     *     
     */
    public StatsCohortListType getStatsCohortList() {
        return statsCohortList;
    }

    /**
     * Sets the value of the statsCohortList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsCohortListType }
     *     
     */
    public void setStatsCohortList(StatsCohortListType value) {
        this.statsCohortList = value;
    }

}
