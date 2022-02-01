package ec.ups.edu.EVACardenasTracySRV.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.EVACardenasTracySRV.dao.LibroDAO;
import ec.ups.edu.EVACardenasTracySRV.model.Libro;


@Stateless
public class LibroON implements LibroONLocal{
	@Inject
	private LibroDAO libroDao;
	
	public void insertarLibro(Libro p) throws Exception {
		libroDao.insert(p);	
	}
	
	public List<Libro> getLibros(){
		return libroDao.getList();
	}
	

}
