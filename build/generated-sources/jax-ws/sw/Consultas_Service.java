
package sw;

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
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Consultas", targetNamespace = "http://sw/", wsdlLocation = "http://localhost:8080/ServiciosSOAP/Consultas?WSDL")
public class Consultas_Service
    extends Service
{

    private final static URL CONSULTAS_WSDL_LOCATION;
    private final static WebServiceException CONSULTAS_EXCEPTION;
    private final static QName CONSULTAS_QNAME = new QName("http://sw/", "Consultas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServiciosSOAP/Consultas?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAS_WSDL_LOCATION = url;
        CONSULTAS_EXCEPTION = e;
    }

    public Consultas_Service() {
        super(__getWsdlLocation(), CONSULTAS_QNAME);
    }

    public Consultas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAS_QNAME, features);
    }

    public Consultas_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAS_QNAME);
    }

    public Consultas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAS_QNAME, features);
    }

    public Consultas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Consultas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Consultas
     */
    @WebEndpoint(name = "ConsultasPort")
    public Consultas getConsultasPort() {
        return super.getPort(new QName("http://sw/", "ConsultasPort"), Consultas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Consultas
     */
    @WebEndpoint(name = "ConsultasPort")
    public Consultas getConsultasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sw/", "ConsultasPort"), Consultas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAS_EXCEPTION!= null) {
            throw CONSULTAS_EXCEPTION;
        }
        return CONSULTAS_WSDL_LOCATION;
    }

}