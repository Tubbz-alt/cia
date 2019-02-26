//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:10 PM CET 
//


package com.hack23.cia.model.external.riksdagen.utskottsforslag.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for CommitteeDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeDocumentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hangar_id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dok_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beteckning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tempbeteckning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="slutnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="publicerad" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtitel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dokument_url_text" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="dokument_url_html" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="dokumentstatus_url_xml" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="dokumentstatus_url_www" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="utskottsforslag_url_xml" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeDocumentData", propOrder = {
    "rm",
    "hangarId",
    "id",
    "label",
    "subType",
    "tempLabel",
    "org",
    "endNumber",
    "createdDate",
    "publicDate",
    "title",
    "subTitle",
    "status",
    "documentUrlText",
    "documentUrlHtml",
    "documentStatusUrlXml",
    "documentStatusUrlWww",
    "committeeProposalUrlXml"
})
@Entity(name = "CommitteeDocumentData")
@Table(name = "COMMITTEE_DOCUMENT_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class CommitteeDocumentData
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String rm;
    @XmlElement(name = "hangar_id", required = true)
    protected BigInteger hangarId;
    @XmlElement(name = "dok_id", required = true)
    protected String id;
    @XmlElement(name = "beteckning", required = true)
    protected String label;
    @XmlElement(name = "subtyp", required = true)
    protected String subType;
    @XmlElement(name = "tempbeteckning", required = true)
    protected String tempLabel;
    @XmlElement(name = "organ", required = true)
    protected String org;
    @XmlElement(name = "slutnummer", required = true)
    protected BigInteger endNumber;
    @XmlElement(name = "datum", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date createdDate;
    @XmlElement(name = "publicerad", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date publicDate;
    @XmlElement(name = "titel", required = true)
    protected String title;
    @XmlElement(name = "subtitel", required = true)
    protected String subTitle;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "dokument_url_text", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlText;
    @XmlElement(name = "dokument_url_html", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlHtml;
    @XmlElement(name = "dokumentstatus_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlXml;
    @XmlElement(name = "dokumentstatus_url_www", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlWww;
    @XmlElement(name = "utskottsforslag_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String committeeProposalUrlXml;

    /**
     * Gets the value of the rm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RM", length = 255)
    public String getRm() {
        return rm;
    }

    /**
     * Sets the value of the rm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRm(String value) {
        this.rm = value;
    }

    /**
     * Gets the value of the hangarId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "HANGAR_ID", precision = 20, scale = 0)
    public BigInteger getHangarId() {
        return hangarId;
    }

    /**
     * Sets the value of the hangarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHangarId(BigInteger value) {
        this.hangarId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LABEL", length = 255)
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUB_TYPE", length = 255)
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the tempLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TEMP_LABEL", length = 255)
    public String getTempLabel() {
        return tempLabel;
    }

    /**
     * Sets the value of the tempLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempLabel(String value) {
        this.tempLabel = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORG", length = 255)
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the endNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "END_NUMBER", precision = 20, scale = 0)
    public BigInteger getEndNumber() {
        return endNumber;
    }

    /**
     * Sets the value of the endNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndNumber(BigInteger value) {
        this.endNumber = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.DATE)
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the publicDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PUBLIC_DATE")
    @Temporal(TemporalType.DATE)
    public Date getPublicDate() {
        return publicDate;
    }

    /**
     * Sets the value of the publicDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDate(Date value) {
        this.publicDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TITLE", length = 255)
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUB_TITLE", length = 255)
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATUS", length = 255)
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
     * Gets the value of the documentUrlText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_URL_TEXT")
    public String getDocumentUrlText() {
        return documentUrlText;
    }

    /**
     * Sets the value of the documentUrlText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUrlText(String value) {
        this.documentUrlText = value;
    }

    /**
     * Gets the value of the documentUrlHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_URL_HTML")
    public String getDocumentUrlHtml() {
        return documentUrlHtml;
    }

    /**
     * Sets the value of the documentUrlHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUrlHtml(String value) {
        this.documentUrlHtml = value;
    }

    /**
     * Gets the value of the documentStatusUrlXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_XML")
    public String getDocumentStatusUrlXml() {
        return documentStatusUrlXml;
    }

    /**
     * Sets the value of the documentStatusUrlXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatusUrlXml(String value) {
        this.documentStatusUrlXml = value;
    }

    /**
     * Gets the value of the documentStatusUrlWww property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_WWW")
    public String getDocumentStatusUrlWww() {
        return documentStatusUrlWww;
    }

    /**
     * Sets the value of the documentStatusUrlWww property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatusUrlWww(String value) {
        this.documentStatusUrlWww = value;
    }

    /**
     * Gets the value of the committeeProposalUrlXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COMMITTEE_PROPOSAL_URL_XML")
    public String getCommitteeProposalUrlXml() {
        return committeeProposalUrlXml;
    }

    /**
     * Sets the value of the committeeProposalUrlXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeProposalUrlXml(String value) {
        this.committeeProposalUrlXml = value;
    }

    public CommitteeDocumentData withRm(String value) {
        setRm(value);
        return this;
    }

    public CommitteeDocumentData withHangarId(BigInteger value) {
        setHangarId(value);
        return this;
    }

    public CommitteeDocumentData withId(String value) {
        setId(value);
        return this;
    }

    public CommitteeDocumentData withLabel(String value) {
        setLabel(value);
        return this;
    }

    public CommitteeDocumentData withSubType(String value) {
        setSubType(value);
        return this;
    }

    public CommitteeDocumentData withTempLabel(String value) {
        setTempLabel(value);
        return this;
    }

    public CommitteeDocumentData withOrg(String value) {
        setOrg(value);
        return this;
    }

    public CommitteeDocumentData withEndNumber(BigInteger value) {
        setEndNumber(value);
        return this;
    }

    public CommitteeDocumentData withCreatedDate(Date value) {
        setCreatedDate(value);
        return this;
    }

    public CommitteeDocumentData withPublicDate(Date value) {
        setPublicDate(value);
        return this;
    }

    public CommitteeDocumentData withTitle(String value) {
        setTitle(value);
        return this;
    }

    public CommitteeDocumentData withSubTitle(String value) {
        setSubTitle(value);
        return this;
    }

    public CommitteeDocumentData withStatus(String value) {
        setStatus(value);
        return this;
    }

    public CommitteeDocumentData withDocumentUrlText(String value) {
        setDocumentUrlText(value);
        return this;
    }

    public CommitteeDocumentData withDocumentUrlHtml(String value) {
        setDocumentUrlHtml(value);
        return this;
    }

    public CommitteeDocumentData withDocumentStatusUrlXml(String value) {
        setDocumentStatusUrlXml(value);
        return this;
    }

    public CommitteeDocumentData withDocumentStatusUrlWww(String value) {
        setDocumentStatusUrlWww(value);
        return this;
    }

    public CommitteeDocumentData withCommitteeProposalUrlXml(String value) {
        setCommitteeProposalUrlXml(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theRm;
            theRm = this.getRm();
            strategy.appendField(locator, this, "rm", buffer, theRm);
        }
        {
            BigInteger theHangarId;
            theHangarId = this.getHangarId();
            strategy.appendField(locator, this, "hangarId", buffer, theHangarId);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theSubType;
            theSubType = this.getSubType();
            strategy.appendField(locator, this, "subType", buffer, theSubType);
        }
        {
            String theTempLabel;
            theTempLabel = this.getTempLabel();
            strategy.appendField(locator, this, "tempLabel", buffer, theTempLabel);
        }
        {
            String theOrg;
            theOrg = this.getOrg();
            strategy.appendField(locator, this, "org", buffer, theOrg);
        }
        {
            BigInteger theEndNumber;
            theEndNumber = this.getEndNumber();
            strategy.appendField(locator, this, "endNumber", buffer, theEndNumber);
        }
        {
            Date theCreatedDate;
            theCreatedDate = this.getCreatedDate();
            strategy.appendField(locator, this, "createdDate", buffer, theCreatedDate);
        }
        {
            Date thePublicDate;
            thePublicDate = this.getPublicDate();
            strategy.appendField(locator, this, "publicDate", buffer, thePublicDate);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theSubTitle;
            theSubTitle = this.getSubTitle();
            strategy.appendField(locator, this, "subTitle", buffer, theSubTitle);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            String theDocumentUrlText;
            theDocumentUrlText = this.getDocumentUrlText();
            strategy.appendField(locator, this, "documentUrlText", buffer, theDocumentUrlText);
        }
        {
            String theDocumentUrlHtml;
            theDocumentUrlHtml = this.getDocumentUrlHtml();
            strategy.appendField(locator, this, "documentUrlHtml", buffer, theDocumentUrlHtml);
        }
        {
            String theDocumentStatusUrlXml;
            theDocumentStatusUrlXml = this.getDocumentStatusUrlXml();
            strategy.appendField(locator, this, "documentStatusUrlXml", buffer, theDocumentStatusUrlXml);
        }
        {
            String theDocumentStatusUrlWww;
            theDocumentStatusUrlWww = this.getDocumentStatusUrlWww();
            strategy.appendField(locator, this, "documentStatusUrlWww", buffer, theDocumentStatusUrlWww);
        }
        {
            String theCommitteeProposalUrlXml;
            theCommitteeProposalUrlXml = this.getCommitteeProposalUrlXml();
            strategy.appendField(locator, this, "committeeProposalUrlXml", buffer, theCommitteeProposalUrlXml);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommitteeDocumentData that = ((CommitteeDocumentData) object);
        {
            String lhsRm;
            lhsRm = this.getRm();
            String rhsRm;
            rhsRm = that.getRm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rm", lhsRm), LocatorUtils.property(thatLocator, "rm", rhsRm), lhsRm, rhsRm)) {
                return false;
            }
        }
        {
            BigInteger lhsHangarId;
            lhsHangarId = this.getHangarId();
            BigInteger rhsHangarId;
            rhsHangarId = that.getHangarId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hangarId", lhsHangarId), LocatorUtils.property(thatLocator, "hangarId", rhsHangarId), lhsHangarId, rhsHangarId)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsSubType;
            lhsSubType = this.getSubType();
            String rhsSubType;
            rhsSubType = that.getSubType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subType", lhsSubType), LocatorUtils.property(thatLocator, "subType", rhsSubType), lhsSubType, rhsSubType)) {
                return false;
            }
        }
        {
            String lhsTempLabel;
            lhsTempLabel = this.getTempLabel();
            String rhsTempLabel;
            rhsTempLabel = that.getTempLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempLabel", lhsTempLabel), LocatorUtils.property(thatLocator, "tempLabel", rhsTempLabel), lhsTempLabel, rhsTempLabel)) {
                return false;
            }
        }
        {
            String lhsOrg;
            lhsOrg = this.getOrg();
            String rhsOrg;
            rhsOrg = that.getOrg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "org", lhsOrg), LocatorUtils.property(thatLocator, "org", rhsOrg), lhsOrg, rhsOrg)) {
                return false;
            }
        }
        {
            BigInteger lhsEndNumber;
            lhsEndNumber = this.getEndNumber();
            BigInteger rhsEndNumber;
            rhsEndNumber = that.getEndNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endNumber", lhsEndNumber), LocatorUtils.property(thatLocator, "endNumber", rhsEndNumber), lhsEndNumber, rhsEndNumber)) {
                return false;
            }
        }
        {
            Date lhsCreatedDate;
            lhsCreatedDate = this.getCreatedDate();
            Date rhsCreatedDate;
            rhsCreatedDate = that.getCreatedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDate", lhsCreatedDate), LocatorUtils.property(thatLocator, "createdDate", rhsCreatedDate), lhsCreatedDate, rhsCreatedDate)) {
                return false;
            }
        }
        {
            Date lhsPublicDate;
            lhsPublicDate = this.getPublicDate();
            Date rhsPublicDate;
            rhsPublicDate = that.getPublicDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicDate", lhsPublicDate), LocatorUtils.property(thatLocator, "publicDate", rhsPublicDate), lhsPublicDate, rhsPublicDate)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsSubTitle;
            lhsSubTitle = this.getSubTitle();
            String rhsSubTitle;
            rhsSubTitle = that.getSubTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subTitle", lhsSubTitle), LocatorUtils.property(thatLocator, "subTitle", rhsSubTitle), lhsSubTitle, rhsSubTitle)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsDocumentUrlText;
            lhsDocumentUrlText = this.getDocumentUrlText();
            String rhsDocumentUrlText;
            rhsDocumentUrlText = that.getDocumentUrlText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentUrlText", lhsDocumentUrlText), LocatorUtils.property(thatLocator, "documentUrlText", rhsDocumentUrlText), lhsDocumentUrlText, rhsDocumentUrlText)) {
                return false;
            }
        }
        {
            String lhsDocumentUrlHtml;
            lhsDocumentUrlHtml = this.getDocumentUrlHtml();
            String rhsDocumentUrlHtml;
            rhsDocumentUrlHtml = that.getDocumentUrlHtml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentUrlHtml", lhsDocumentUrlHtml), LocatorUtils.property(thatLocator, "documentUrlHtml", rhsDocumentUrlHtml), lhsDocumentUrlHtml, rhsDocumentUrlHtml)) {
                return false;
            }
        }
        {
            String lhsDocumentStatusUrlXml;
            lhsDocumentStatusUrlXml = this.getDocumentStatusUrlXml();
            String rhsDocumentStatusUrlXml;
            rhsDocumentStatusUrlXml = that.getDocumentStatusUrlXml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusUrlXml", lhsDocumentStatusUrlXml), LocatorUtils.property(thatLocator, "documentStatusUrlXml", rhsDocumentStatusUrlXml), lhsDocumentStatusUrlXml, rhsDocumentStatusUrlXml)) {
                return false;
            }
        }
        {
            String lhsDocumentStatusUrlWww;
            lhsDocumentStatusUrlWww = this.getDocumentStatusUrlWww();
            String rhsDocumentStatusUrlWww;
            rhsDocumentStatusUrlWww = that.getDocumentStatusUrlWww();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusUrlWww", lhsDocumentStatusUrlWww), LocatorUtils.property(thatLocator, "documentStatusUrlWww", rhsDocumentStatusUrlWww), lhsDocumentStatusUrlWww, rhsDocumentStatusUrlWww)) {
                return false;
            }
        }
        {
            String lhsCommitteeProposalUrlXml;
            lhsCommitteeProposalUrlXml = this.getCommitteeProposalUrlXml();
            String rhsCommitteeProposalUrlXml;
            rhsCommitteeProposalUrlXml = that.getCommitteeProposalUrlXml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "committeeProposalUrlXml", lhsCommitteeProposalUrlXml), LocatorUtils.property(thatLocator, "committeeProposalUrlXml", rhsCommitteeProposalUrlXml), lhsCommitteeProposalUrlXml, rhsCommitteeProposalUrlXml)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theRm;
            theRm = this.getRm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rm", theRm), currentHashCode, theRm);
        }
        {
            BigInteger theHangarId;
            theHangarId = this.getHangarId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hangarId", theHangarId), currentHashCode, theHangarId);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theSubType;
            theSubType = this.getSubType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subType", theSubType), currentHashCode, theSubType);
        }
        {
            String theTempLabel;
            theTempLabel = this.getTempLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempLabel", theTempLabel), currentHashCode, theTempLabel);
        }
        {
            String theOrg;
            theOrg = this.getOrg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "org", theOrg), currentHashCode, theOrg);
        }
        {
            BigInteger theEndNumber;
            theEndNumber = this.getEndNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endNumber", theEndNumber), currentHashCode, theEndNumber);
        }
        {
            Date theCreatedDate;
            theCreatedDate = this.getCreatedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDate", theCreatedDate), currentHashCode, theCreatedDate);
        }
        {
            Date thePublicDate;
            thePublicDate = this.getPublicDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicDate", thePublicDate), currentHashCode, thePublicDate);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theSubTitle;
            theSubTitle = this.getSubTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subTitle", theSubTitle), currentHashCode, theSubTitle);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            String theDocumentUrlText;
            theDocumentUrlText = this.getDocumentUrlText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentUrlText", theDocumentUrlText), currentHashCode, theDocumentUrlText);
        }
        {
            String theDocumentUrlHtml;
            theDocumentUrlHtml = this.getDocumentUrlHtml();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentUrlHtml", theDocumentUrlHtml), currentHashCode, theDocumentUrlHtml);
        }
        {
            String theDocumentStatusUrlXml;
            theDocumentStatusUrlXml = this.getDocumentStatusUrlXml();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentStatusUrlXml", theDocumentStatusUrlXml), currentHashCode, theDocumentStatusUrlXml);
        }
        {
            String theDocumentStatusUrlWww;
            theDocumentStatusUrlWww = this.getDocumentStatusUrlWww();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentStatusUrlWww", theDocumentStatusUrlWww), currentHashCode, theDocumentStatusUrlWww);
        }
        {
            String theCommitteeProposalUrlXml;
            theCommitteeProposalUrlXml = this.getCommitteeProposalUrlXml();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "committeeProposalUrlXml", theCommitteeProposalUrlXml), currentHashCode, theCommitteeProposalUrlXml);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}