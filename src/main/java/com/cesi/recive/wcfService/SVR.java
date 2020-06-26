
package com.cesi.recive.wcfService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SVR", targetNamespace = "http://192.168.1.19", wsdlLocation = "http://192.168.1.19:4000/WCF_Server?singleWsdl")
public class SVR
    extends Service
{

    private final static URL SVR_WSDL_LOCATION;
    private final static WebServiceException SVR_EXCEPTION;
    private final static QName SVR_QNAME = new QName("http://192.168.1.19", "SVR");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.19:4000/WCF_Server?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SVR_WSDL_LOCATION = url;
        SVR_EXCEPTION = e;
    }

    public SVR() {
        super(__getWsdlLocation(), SVR_QNAME);
    }

    public SVR(WebServiceFeature... features) {
        super(__getWsdlLocation(), SVR_QNAME, features);
    }

    public SVR(URL wsdlLocation) {
        super(wsdlLocation, SVR_QNAME);
    }

    public SVR(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SVR_QNAME, features);
    }

    public SVR(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SVR(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IComposantService
     */
    @WebEndpoint(name = "BasicHttpBinding_IComposantService")
    public IComposantService getBasicHttpBindingIComposantService() {
        return super.getPort(new QName("http://192.168.1.19", "BasicHttpBinding_IComposantService"), IComposantService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IComposantService
     */
    @WebEndpoint(name = "BasicHttpBinding_IComposantService")
    public IComposantService getBasicHttpBindingIComposantService(WebServiceFeature... features) {
        return super.getPort(new QName("http://192.168.1.19", "BasicHttpBinding_IComposantService"), IComposantService.class, features);
    }

    /**
     * 
     * @return
     *     returns IComposantService
     */
    @WebEndpoint(name = "serviceWCF")
    public IComposantService getServiceWCF() {
        return super.getPort(new QName("http://192.168.1.19", "serviceWCF"), IComposantService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IComposantService
     */
    @WebEndpoint(name = "serviceWCF")
    public IComposantService getServiceWCF(WebServiceFeature... features) {
        return super.getPort(new QName("http://192.168.1.19", "serviceWCF"), IComposantService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SVR_EXCEPTION!= null) {
            throw SVR_EXCEPTION;
        }
        return SVR_WSDL_LOCATION;
    }

}
