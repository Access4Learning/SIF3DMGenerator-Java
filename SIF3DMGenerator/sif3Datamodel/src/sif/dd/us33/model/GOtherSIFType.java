
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This category holds SIF objects that don't currently fit in the SIF taxonomy.
 * 
 * <p>Java class for gOtherSIFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gOtherSIFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_EntityType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gOtherSIFType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
@XmlSeeAlso({
    AssessmentAssetType.class,
    AssessmentFormType.class,
    AssessmentRegistrationType.class,
    AssessmentResponseSetType.class,
    AssessmentSubTestType.class,
    AssessmentItemType.class,
    AssessmentRubricType.class,
    AssessmentScoreTableType.class,
    AssessmentSectionType.class,
    AssessmentScoreSetType.class,
    AssessmentType.class
})
public class GOtherSIFType
    extends GSIFEntityType
{


}
