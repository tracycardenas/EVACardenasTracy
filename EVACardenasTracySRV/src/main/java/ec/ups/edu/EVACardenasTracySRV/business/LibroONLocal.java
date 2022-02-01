package ec.ups.edu.EVACardenasTracySRV.business;

import java.util.List;

import javax.ejb.Local;

import ec.ups.edu.EVACardenasTracySRV.model.Libro;


@Local
public interface LibroONLocal {
	public void insertarLibro(Libro p) throws Exception;
	public List<Libro> getLibros();

}
