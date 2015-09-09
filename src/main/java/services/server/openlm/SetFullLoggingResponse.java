
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="SetFullLoggingResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse" minOccurs="0"/>
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
    "setFullLoggingResult"
})
@XmlRootElement(name = "SetFullLoggingResponse")
public class SetFullLoggingResponse {

    @XmlElementRef(name = "SetFullLoggingResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> setFullLoggingResult;

    /**
     * Gets the value of the setFullLoggingResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getSetFullLoggingResult() {
        return setFullLoggingResult;
    }

    /**
     * Sets the value of the setFullLoggingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setSetFullLoggingResult(JAXBElement<BaseResponse> value) {
        this.setFullLoggingResult = value;
    }

}