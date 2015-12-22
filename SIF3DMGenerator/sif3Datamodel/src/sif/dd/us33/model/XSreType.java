
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Record Exchange object is a relatively de-normalized data structure meant to be used to transfer student information from one system to another. 
 * 
 * <p>Java class for xSreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}xStudentType">
 *       &lt;sequence>
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="reportingLea" type="{http://www.sifassociation.org/datamodel/na/3.3}xLeaType" minOccurs="0"/>
 *         &lt;element name="assessments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessment" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="summaries" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="summary" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="events" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="event" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceEventType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="disciplineIncidents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="disciplineIncident" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisciplineIncidentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transcriptTerm" type="{http://www.sifassociation.org/datamodel/na/3.3}xTranscriptTermType" minOccurs="0"/>
 *         &lt;element name="otherTranscriptTerms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transcriptTerm" type="{http://www.sifassociation.org/datamodel/na/3.3}xTranscriptTermType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="competencies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="competency" type="{http://www.sifassociation.org/datamodel/na/3.3}xCompetencyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="health" type="{http://www.sifassociation.org/datamodel/na/3.3}xHealthType" minOccurs="0"/>
 *         &lt;element name="programs" type="{http://www.sifassociation.org/datamodel/na/3.3}xProgramSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSreType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "reportDate",
    "reportingLea",
    "assessments",
    "attendance",
    "disciplineIncidents",
    "transcriptTerm",
    "otherTranscriptTerms",
    "competencies",
    "health",
    "programs"
})
public class XSreType
    extends XStudentType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XLeaType reportingLea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreType.Assessments assessments;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreType.Attendance attendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreType.DisciplineIncidents disciplineIncidents;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTranscriptTermType transcriptTerm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreType.OtherTranscriptTerms otherTranscriptTerms;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreType.Competencies competencies;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XHealthType health;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XProgramSummaryType programs;

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

    /**
     * Gets the value of the reportingLea property.
     * 
     * @return
     *     possible object is
     *     {@link XLeaType }
     *     
     */
    public XLeaType getReportingLea() {
        return reportingLea;
    }

    /**
     * Sets the value of the reportingLea property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLeaType }
     *     
     */
    public void setReportingLea(XLeaType value) {
        this.reportingLea = value;
    }

    /**
     * Gets the value of the assessments property.
     * 
     * @return
     *     possible object is
     *     {@link XSreType.Assessments }
     *     
     */
    public XSreType.Assessments getAssessments() {
        return assessments;
    }

    /**
     * Sets the value of the assessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreType.Assessments }
     *     
     */
    public void setAssessments(XSreType.Assessments value) {
        this.assessments = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link XSreType.Attendance }
     *     
     */
    public XSreType.Attendance getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreType.Attendance }
     *     
     */
    public void setAttendance(XSreType.Attendance value) {
        this.attendance = value;
    }

    /**
     * Gets the value of the disciplineIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link XSreType.DisciplineIncidents }
     *     
     */
    public XSreType.DisciplineIncidents getDisciplineIncidents() {
        return disciplineIncidents;
    }

    /**
     * Sets the value of the disciplineIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreType.DisciplineIncidents }
     *     
     */
    public void setDisciplineIncidents(XSreType.DisciplineIncidents value) {
        this.disciplineIncidents = value;
    }

    /**
     * Gets the value of the transcriptTerm property.
     * 
     * @return
     *     possible object is
     *     {@link XTranscriptTermType }
     *     
     */
    public XTranscriptTermType getTranscriptTerm() {
        return transcriptTerm;
    }

    /**
     * Sets the value of the transcriptTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTranscriptTermType }
     *     
     */
    public void setTranscriptTerm(XTranscriptTermType value) {
        this.transcriptTerm = value;
    }

    /**
     * Gets the value of the otherTranscriptTerms property.
     * 
     * @return
     *     possible object is
     *     {@link XSreType.OtherTranscriptTerms }
     *     
     */
    public XSreType.OtherTranscriptTerms getOtherTranscriptTerms() {
        return otherTranscriptTerms;
    }

    /**
     * Sets the value of the otherTranscriptTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreType.OtherTranscriptTerms }
     *     
     */
    public void setOtherTranscriptTerms(XSreType.OtherTranscriptTerms value) {
        this.otherTranscriptTerms = value;
    }

    /**
     * Gets the value of the competencies property.
     * 
     * @return
     *     possible object is
     *     {@link XSreType.Competencies }
     *     
     */
    public XSreType.Competencies getCompetencies() {
        return competencies;
    }

    /**
     * Sets the value of the competencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreType.Competencies }
     *     
     */
    public void setCompetencies(XSreType.Competencies value) {
        this.competencies = value;
    }

    /**
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link XHealthType }
     *     
     */
    public XHealthType getHealth() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHealthType }
     *     
     */
    public void setHealth(XHealthType value) {
        this.health = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link XProgramSummaryType }
     *     
     */
    public XProgramSummaryType getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XProgramSummaryType }
     *     
     */
    public void setPrograms(XProgramSummaryType value) {
        this.programs = value;
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
     *         &lt;element name="assessment" type="{http://www.sifassociation.org/datamodel/na/3.3}xAssessmentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessment"
    })
    public static class Assessments {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XAssessmentType> assessment;

        /**
         * Gets the value of the assessment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAssessmentType }
         * 
         * 
         */
        public List<XAssessmentType> getAssessment() {
            if (assessment == null) {
                assessment = new ArrayList<XAssessmentType>();
            }
            return this.assessment;
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
     *         &lt;element name="summaries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="summary" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceSummaryType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="events" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="event" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceEventType" maxOccurs="unbounded" minOccurs="0"/>
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
        "summaries",
        "events"
    })
    public static class Attendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected XSreType.Attendance.Summaries summaries;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected XSreType.Attendance.Events events;

        /**
         * Gets the value of the summaries property.
         * 
         * @return
         *     possible object is
         *     {@link XSreType.Attendance.Summaries }
         *     
         */
        public XSreType.Attendance.Summaries getSummaries() {
            return summaries;
        }

        /**
         * Sets the value of the summaries property.
         * 
         * @param value
         *     allowed object is
         *     {@link XSreType.Attendance.Summaries }
         *     
         */
        public void setSummaries(XSreType.Attendance.Summaries value) {
            this.summaries = value;
        }

        /**
         * Gets the value of the events property.
         * 
         * @return
         *     possible object is
         *     {@link XSreType.Attendance.Events }
         *     
         */
        public XSreType.Attendance.Events getEvents() {
            return events;
        }

        /**
         * Sets the value of the events property.
         * 
         * @param value
         *     allowed object is
         *     {@link XSreType.Attendance.Events }
         *     
         */
        public void setEvents(XSreType.Attendance.Events value) {
            this.events = value;
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
         *         &lt;element name="event" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceEventType" maxOccurs="unbounded" minOccurs="0"/>
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
            "event"
        })
        public static class Events {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected List<XAttendanceEventType> event;

            /**
             * Gets the value of the event property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the event property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEvent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XAttendanceEventType }
             * 
             * 
             */
            public List<XAttendanceEventType> getEvent() {
                if (event == null) {
                    event = new ArrayList<XAttendanceEventType>();
                }
                return this.event;
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
         *         &lt;element name="summary" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceSummaryType" maxOccurs="unbounded" minOccurs="0"/>
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
            "summary"
        })
        public static class Summaries {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected List<XAttendanceSummaryType> summary;

            /**
             * Gets the value of the summary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the summary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSummary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XAttendanceSummaryType }
             * 
             * 
             */
            public List<XAttendanceSummaryType> getSummary() {
                if (summary == null) {
                    summary = new ArrayList<XAttendanceSummaryType>();
                }
                return this.summary;
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
     *         &lt;element name="competency" type="{http://www.sifassociation.org/datamodel/na/3.3}xCompetencyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "competency"
    })
    public static class Competencies {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XCompetencyType> competency;

        /**
         * Gets the value of the competency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the competency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompetency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCompetencyType }
         * 
         * 
         */
        public List<XCompetencyType> getCompetency() {
            if (competency == null) {
                competency = new ArrayList<XCompetencyType>();
            }
            return this.competency;
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
     *         &lt;element name="disciplineIncident" type="{http://www.sifassociation.org/datamodel/na/3.3}xDisciplineIncidentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "disciplineIncident"
    })
    public static class DisciplineIncidents {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XDisciplineIncidentType> disciplineIncident;

        /**
         * Gets the value of the disciplineIncident property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disciplineIncident property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisciplineIncident().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDisciplineIncidentType }
         * 
         * 
         */
        public List<XDisciplineIncidentType> getDisciplineIncident() {
            if (disciplineIncident == null) {
                disciplineIncident = new ArrayList<XDisciplineIncidentType>();
            }
            return this.disciplineIncident;
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
     *         &lt;element name="transcriptTerm" type="{http://www.sifassociation.org/datamodel/na/3.3}xTranscriptTermType" maxOccurs="unbounded" minOccurs="0"/>
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
        "transcriptTerm"
    })
    public static class OtherTranscriptTerms {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XTranscriptTermType> transcriptTerm;

        /**
         * Gets the value of the transcriptTerm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transcriptTerm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranscriptTerm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XTranscriptTermType }
         * 
         * 
         */
        public List<XTranscriptTermType> getTranscriptTerm() {
            if (transcriptTerm == null) {
                transcriptTerm = new ArrayList<XTranscriptTermType>();
            }
            return this.transcriptTerm;
        }

    }

}
