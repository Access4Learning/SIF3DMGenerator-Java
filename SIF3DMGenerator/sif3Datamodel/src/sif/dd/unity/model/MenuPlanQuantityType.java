
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MenuPlanQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MenuPlanQuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="FoodserviceItemPortionRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="MenuCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="MenuCategoryCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MenuPlanQuantityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "value"
})
public class MenuPlanQuantityType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "FoodserviceItemPortionRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String foodserviceItemPortionRefId;
    @XmlAttribute(name = "MenuCategory", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String menuCategory;
    @XmlAttribute(name = "MenuCategoryCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String menuCategoryCodeset;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the foodserviceItemPortionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodserviceItemPortionRefId() {
        return foodserviceItemPortionRefId;
    }

    /**
     * Sets the value of the foodserviceItemPortionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodserviceItemPortionRefId(String value) {
        this.foodserviceItemPortionRefId = value;
    }

    /**
     * Gets the value of the menuCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuCategory() {
        return menuCategory;
    }

    /**
     * Sets the value of the menuCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuCategory(String value) {
        this.menuCategory = value;
    }

    /**
     * Gets the value of the menuCategoryCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuCategoryCodeset() {
        return menuCategoryCodeset;
    }

    /**
     * Sets the value of the menuCategoryCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuCategoryCodeset(String value) {
        this.menuCategoryCodeset = value;
    }

}
