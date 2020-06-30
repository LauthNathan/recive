
package com.cesi.recive.wcfService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MSG complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statut_Op" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tokenApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSG", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", propOrder = {
    "appVersion",
    "data",
    "info",
    "operationName",
    "operationVersion",
    "statutOp",
    "tokenApp",
    "tokenUser"
})
public class MSG {

    @XmlElementRef(name = "appVersion", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appVersion;
    @XmlElementRef(name = "data", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> data;
    @XmlElementRef(name = "info", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "operationName", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationName;
    @XmlElementRef(name = "operationVersion", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationVersion;
    @XmlElement(name = "statut_Op")
    protected Boolean statutOp;
    @XmlElementRef(name = "tokenApp", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenApp;
    @XmlElementRef(name = "tokenUser", namespace = "http://schemas.datacontract.org/2004/07/WCF_Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenUser;

    /**
     * Obtient la valeur de la propri�t� appVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppVersion() {
        return appVersion;
    }

    /**
     * D�finit la valeur de la propri�t� appVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppVersion(JAXBElement<String> value) {
        this.appVersion = value;
    }

    /**
     * Obtient la valeur de la propri�t� data.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getData() {
        return data;
    }

    /**
     * D�finit la valeur de la propri�t� data.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setData(JAXBElement<ArrayOfanyType> value) {
        this.data = value;
    }

    /**
     * Obtient la valeur de la propri�t� info.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * D�finit la valeur de la propri�t� info.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Obtient la valeur de la propri�t� operationName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationName() {
        return operationName;
    }

    /**
     * D�finit la valeur de la propri�t� operationName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationName(JAXBElement<String> value) {
        this.operationName = value;
    }

    /**
     * Obtient la valeur de la propri�t� operationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationVersion() {
        return operationVersion;
    }

    /**
     * D�finit la valeur de la propri�t� operationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationVersion(JAXBElement<String> value) {
        this.operationVersion = value;
    }

    /**
     * Obtient la valeur de la propri�t� statutOp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatutOp() {
        return statutOp;
    }

    /**
     * D�finit la valeur de la propri�t� statutOp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatutOp(Boolean value) {
        this.statutOp = value;
    }

    /**
     * Obtient la valeur de la propri�t� tokenApp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenApp() {
        return tokenApp;
    }

    /**
     * D�finit la valeur de la propri�t� tokenApp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenApp(JAXBElement<String> value) {
        this.tokenApp = value;
    }

    /**
     * Obtient la valeur de la propri�t� tokenUser.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenUser() {
        return tokenUser;
    }

    /**
     * D�finit la valeur de la propri�t� tokenUser.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenUser(JAXBElement<String> value) {
        this.tokenUser = value;
    }

}
