
package sw;

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
@WebService(name = "Consultas", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Consultas {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Nombre")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Nombre", targetNamespace = "http://sw/", className = "sw.Nombre")
    @ResponseWrapper(localName = "NombreResponse", targetNamespace = "http://sw/", className = "sw.NombreResponse")
    @Action(input = "http://sw/Consultas/NombreRequest", output = "http://sw/Consultas/NombreResponse")
    public String nombre(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param palabra
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Diccionario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Diccionario", targetNamespace = "http://sw/", className = "sw.Diccionario")
    @ResponseWrapper(localName = "DiccionarioResponse", targetNamespace = "http://sw/", className = "sw.DiccionarioResponse")
    @Action(input = "http://sw/Consultas/DiccionarioRequest", output = "http://sw/Consultas/DiccionarioResponse")
    public String diccionario(
        @WebParam(name = "Palabra", targetNamespace = "")
        String palabra);

    /**
     * 
     * @param entrada
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Dibujo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Dibujo", targetNamespace = "http://sw/", className = "sw.Dibujo")
    @ResponseWrapper(localName = "DibujoResponse", targetNamespace = "http://sw/", className = "sw.DibujoResponse")
    @Action(input = "http://sw/Consultas/DibujoRequest", output = "http://sw/Consultas/DibujoResponse")
    public String dibujo(
        @WebParam(name = "entrada", targetNamespace = "")
        String entrada);

}
