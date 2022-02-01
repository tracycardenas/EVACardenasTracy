package ec.ups.edu.EVACardenasTracySRV.service;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.ups.edu.EVACardenasTracySRV.business.LibroONLocal;
import ec.ups.edu.EVACardenasTracySRV.model.Libro;

@WebService
public class LibroServiceSOAP {
	@Inject
	private LibroONLocal libroON;
	
	@WebMethod
	public String crearLibro(Libro libro) {
		try {
			libroON.insertarLibro(libro);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "ERROR";
		}
	}
	
	@WebMethod
	public List<Libro> getLibros(){
		return libroON.getLibros();
	}

}
