package ec.ups.edu.evacardenastracycli;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T11:37:08.047-05:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "LibroServiceSOAPService",
                  wsdlLocation = "http://localhost:8080/EVACardenasTracySRV/LibroServiceSOAP?wsdl",
                  targetNamespace = "http://service.EVACardenasTracySRV.edu.ups.ec/")
public class LibroServiceSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.EVACardenasTracySRV.edu.ups.ec/", "LibroServiceSOAPService");
    public final static QName LibroServiceSOAPPort = new QName("http://service.EVACardenasTracySRV.edu.ups.ec/", "LibroServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EVACardenasTracySRV/LibroServiceSOAP?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LibroServiceSOAPService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/EVACardenasTracySRV/LibroServiceSOAP?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LibroServiceSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LibroServiceSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibroServiceSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LibroServiceSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LibroServiceSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LibroServiceSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LibroServiceSOAP
     */
    @WebEndpoint(name = "LibroServiceSOAPPort")
    public LibroServiceSOAP getLibroServiceSOAPPort() {
        return super.getPort(LibroServiceSOAPPort, LibroServiceSOAP.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibroServiceSOAP
     */
    @WebEndpoint(name = "LibroServiceSOAPPort")
    public LibroServiceSOAP getLibroServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(LibroServiceSOAPPort, LibroServiceSOAP.class, features);
    }

}
