
package com.cesi.recive.wcfService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_serviceResult" type="{http://schemas.datacontract.org/2004/07/WCF_Service}MSG" minOccurs="0"/>
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
    "mServiceResult"
})
@XmlRootElement(name = "m_serviceResponse")
public class MServiceResponse {

    @XmlElement(name = "m_serviceResult")
    protected MSG mServiceResult;

    /**
     * Obtient la valeur de la propriété mServiceResult.
     * 
     * @return
     *     possible object is
     *     {@link MSG }
     *     
     */
    public MSG getMServiceResult() {
        return mServiceResult;
    }

    /**
     * Définit la valeur de la propriété mServiceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link MSG }
     *     
     */
    public void setMServiceResult(MSG value) {
        this.mServiceResult = value;
    }

}
