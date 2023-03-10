
package sv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Guia", targetNamespace = "http://sv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Guia {


    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://sv/", className = "sv.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://sv/", className = "sv.LoginResponse")
    @Action(input = "http://sv/Guia/LoginRequest", output = "http://sv/Guia/LoginResponse")
    public boolean login(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param num1
     * @param operacion
     * @param num2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Operaciones")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Operaciones", targetNamespace = "http://sv/", className = "sv.Operaciones")
    @ResponseWrapper(localName = "OperacionesResponse", targetNamespace = "http://sv/", className = "sv.OperacionesResponse")
    @Action(input = "http://sv/Guia/OperacionesRequest", output = "http://sv/Guia/OperacionesResponse")
    public Double operaciones(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "operacion", targetNamespace = "")
        String operacion,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

    /**
     * 
     * @param total
     * @param retiro
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "ProcesarPago")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProcesarPago", targetNamespace = "http://sv/", className = "sv.ProcesarPago")
    @ResponseWrapper(localName = "ProcesarPagoResponse", targetNamespace = "http://sv/", className = "sv.ProcesarPagoResponse")
    @Action(input = "http://sv/Guia/ProcesarPagoRequest", output = "http://sv/Guia/ProcesarPagoResponse")
    public Double procesarPago(
        @WebParam(name = "total", targetNamespace = "")
        double total,
        @WebParam(name = "retiro", targetNamespace = "")
        double retiro);

    /**
     * 
     * @param caso
     * @param lado2
     * @param lado1
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Calculos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Calculos", targetNamespace = "http://sv/", className = "sv.Calculos")
    @ResponseWrapper(localName = "CalculosResponse", targetNamespace = "http://sv/", className = "sv.CalculosResponse")
    @Action(input = "http://sv/Guia/CalculosRequest", output = "http://sv/Guia/CalculosResponse")
    public String calculos(
        @WebParam(name = "lado1", targetNamespace = "")
        double lado1,
        @WebParam(name = "caso", targetNamespace = "")
        String caso,
        @WebParam(name = "lado2", targetNamespace = "")
        double lado2);

}
