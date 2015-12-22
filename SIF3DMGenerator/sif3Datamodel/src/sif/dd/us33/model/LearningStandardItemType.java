
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object contains information related to curriculum standards statements "standards" or "benchmarks" or the like within the document. Each LearningStandardItem reflects an individual standard statement and may occur at several levels within a hierarchially structured document.
 * 
 * <p>Java class for learningStandardItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gLearningStandardItemType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningStandardItemType", namespace = "http://www.sifassociation.org/datamodel/na/3.3")
public class LearningStandardItemType
    extends GLearningStandardItemType
{


}
