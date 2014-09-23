
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A spreadsheet-like object that transmits aggregate or calculated assessment information
 * 
 * <p>Java class for assessmentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="summaryContext">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="assessmentName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="unitOfAnalysis" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;enumeration value="item"/>
 *                         &lt;enumeration value="subTest"/>
 *                         &lt;enumeration value="strand"/>
 *                         &lt;enumeration value="section"/>
 *                         &lt;enumeration value="learningStandard"/>
 *                         &lt;enumeration value="benchmark"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="LEA" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="School" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="columnList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="columnLetter" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="columnLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="metric" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="columnGroupName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="numberOfColumns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rowList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="rowLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;sequence>
 *                               &lt;element name="cellList">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="cell" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "assessmentSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "summaryContext",
    "columnList",
    "rowList"
})
public class AssessmentSummaryType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected AssessmentSummaryType.SummaryContext summaryContext;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected AssessmentSummaryType.ColumnList columnList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected AssessmentSummaryType.RowList rowList;

    /**
     * Gets the value of the summaryContext property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType.SummaryContext }
     *     
     */
    public AssessmentSummaryType.SummaryContext getSummaryContext() {
        return summaryContext;
    }

    /**
     * Sets the value of the summaryContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType.SummaryContext }
     *     
     */
    public void setSummaryContext(AssessmentSummaryType.SummaryContext value) {
        this.summaryContext = value;
    }

    /**
     * Gets the value of the columnList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType.ColumnList }
     *     
     */
    public AssessmentSummaryType.ColumnList getColumnList() {
        return columnList;
    }

    /**
     * Sets the value of the columnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType.ColumnList }
     *     
     */
    public void setColumnList(AssessmentSummaryType.ColumnList value) {
        this.columnList = value;
    }

    /**
     * Gets the value of the rowList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType.RowList }
     *     
     */
    public AssessmentSummaryType.RowList getRowList() {
        return rowList;
    }

    /**
     * Sets the value of the rowList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType.RowList }
     *     
     */
    public void setRowList(AssessmentSummaryType.RowList value) {
        this.rowList = value;
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
     *         &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="columnLetter" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="columnLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="metric" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="columnGroupName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="numberOfColumns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "column"
    })
    public static class ColumnList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentSummaryType.ColumnList.Column> column;
        @XmlAttribute(name = "numberOfColumns")
        @XmlSchemaType(name = "anySimpleType")
        protected String numberOfColumns;

        /**
         * Gets the value of the column property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the column property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColumn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSummaryType.ColumnList.Column }
         * 
         * 
         */
        public List<AssessmentSummaryType.ColumnList.Column> getColumn() {
            if (column == null) {
                column = new ArrayList<AssessmentSummaryType.ColumnList.Column>();
            }
            return this.column;
        }

        /**
         * Gets the value of the numberOfColumns property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfColumns() {
            return numberOfColumns;
        }

        /**
         * Sets the value of the numberOfColumns property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfColumns(String value) {
            this.numberOfColumns = value;
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
         *         &lt;element name="columnLetter" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="columnLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="metric" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="columnGroupName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
            "columnLetter",
            "columnLabel",
            "metric",
            "columnGroupName"
        })
        public static class Column {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected Object columnLetter;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected Object columnLabel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected Object metric;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected Object columnGroupName;

            /**
             * Gets the value of the columnLetter property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getColumnLetter() {
                return columnLetter;
            }

            /**
             * Sets the value of the columnLetter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setColumnLetter(Object value) {
                this.columnLetter = value;
            }

            /**
             * Gets the value of the columnLabel property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getColumnLabel() {
                return columnLabel;
            }

            /**
             * Sets the value of the columnLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setColumnLabel(Object value) {
                this.columnLabel = value;
            }

            /**
             * Gets the value of the metric property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMetric() {
                return metric;
            }

            /**
             * Sets the value of the metric property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMetric(Object value) {
                this.metric = value;
            }

            /**
             * Gets the value of the columnGroupName property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getColumnGroupName() {
                return columnGroupName;
            }

            /**
             * Sets the value of the columnGroupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setColumnGroupName(Object value) {
                this.columnGroupName = value;
            }

        }

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
     *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="rowLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;sequence>
     *                     &lt;element name="cellList">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="cell" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class RowList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentSummaryType.RowList.Row> row;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSummaryType.RowList.Row }
         * 
         * 
         */
        public List<AssessmentSummaryType.RowList.Row> getRow() {
            if (row == null) {
                row = new ArrayList<AssessmentSummaryType.RowList.Row>();
            }
            return this.row;
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
         *         &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="rowLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;sequence>
         *           &lt;element name="cellList">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="cell" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/sequence>
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
            "rowNumber",
            "rowLabel",
            "cellList"
        })
        public static class Row {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected Object rowNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected Object rowLabel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected AssessmentSummaryType.RowList.Row.CellList cellList;

            /**
             * Gets the value of the rowNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRowNumber() {
                return rowNumber;
            }

            /**
             * Sets the value of the rowNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRowNumber(Object value) {
                this.rowNumber = value;
            }

            /**
             * Gets the value of the rowLabel property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRowLabel() {
                return rowLabel;
            }

            /**
             * Sets the value of the rowLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRowLabel(Object value) {
                this.rowLabel = value;
            }

            /**
             * Gets the value of the cellList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentSummaryType.RowList.Row.CellList }
             *     
             */
            public AssessmentSummaryType.RowList.Row.CellList getCellList() {
                return cellList;
            }

            /**
             * Sets the value of the cellList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentSummaryType.RowList.Row.CellList }
             *     
             */
            public void setCellList(AssessmentSummaryType.RowList.Row.CellList value) {
                this.cellList = value;
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
             *         &lt;element name="cell" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            @XmlType(name = "", propOrder = {
                "cell"
            })
            public static class CellList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<AssessmentSummaryType.RowList.Row.CellList.Cell> cell;

                /**
                 * Gets the value of the cell property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cell property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCell().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AssessmentSummaryType.RowList.Row.CellList.Cell }
                 * 
                 * 
                 */
                public List<AssessmentSummaryType.RowList.Row.CellList.Cell> getCell() {
                    if (cell == null) {
                        cell = new ArrayList<AssessmentSummaryType.RowList.Row.CellList.Cell>();
                    }
                    return this.cell;
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Cell {


                }

            }

        }

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
     *         &lt;element name="assessmentId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="assessmentName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="unitOfAnalysis" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *               &lt;enumeration value="item"/>
     *               &lt;enumeration value="subTest"/>
     *               &lt;enumeration value="strand"/>
     *               &lt;enumeration value="section"/>
     *               &lt;enumeration value="learningStandard"/>
     *               &lt;enumeration value="benchmark"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="LEA" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="School" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "assessmentId",
        "assessmentName",
        "schoolYear",
        "unitOfAnalysis",
        "state",
        "lea",
        "school"
    })
    public static class SummaryContext {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected Object assessmentId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected Object assessmentName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected Object schoolYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String unitOfAnalysis;
        @XmlElement(name = "State", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected Object state;
        @XmlElement(name = "LEA", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected Object lea;
        @XmlElement(name = "School", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected Object school;

        /**
         * Gets the value of the assessmentId property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAssessmentId() {
            return assessmentId;
        }

        /**
         * Sets the value of the assessmentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAssessmentId(Object value) {
            this.assessmentId = value;
        }

        /**
         * Gets the value of the assessmentName property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAssessmentName() {
            return assessmentName;
        }

        /**
         * Sets the value of the assessmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAssessmentName(Object value) {
            this.assessmentName = value;
        }

        /**
         * Gets the value of the schoolYear property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSchoolYear() {
            return schoolYear;
        }

        /**
         * Sets the value of the schoolYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSchoolYear(Object value) {
            this.schoolYear = value;
        }

        /**
         * Gets the value of the unitOfAnalysis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfAnalysis() {
            return unitOfAnalysis;
        }

        /**
         * Sets the value of the unitOfAnalysis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfAnalysis(String value) {
            this.unitOfAnalysis = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setState(Object value) {
            this.state = value;
        }

        /**
         * Gets the value of the lea property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLEA() {
            return lea;
        }

        /**
         * Sets the value of the lea property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLEA(Object value) {
            this.lea = value;
        }

        /**
         * Gets the value of the school property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSchool() {
            return school;
        }

        /**
         * Sets the value of the school property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSchool(Object value) {
            this.school = value;
        }

    }

}
