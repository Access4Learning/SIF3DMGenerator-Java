
package sif.dd.us32.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object defines information related to a staff member's assignment(s); commonly, this will be a school assignment. 
 * 
 * <p>Java class for staffPersonAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staffPersonAssignmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gStaffPersonAssignmentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staffPersonAssignmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class StaffPersonAssignmentType
    extends GStaffPersonAssignmentType
{


}
