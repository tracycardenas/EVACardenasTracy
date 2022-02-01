package ec.ups.edu.EVACardenasTracySRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.EVACardenasTracySRV.model.Libro;

@Stateless
public class LibroDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Libro op) {
		em.persist(op);
	}
	
	
	
	
	public List<Libro> getList(){
		List<Libro> listado = new ArrayList<Libro>();
		
		//JPQL  -> SQL
		String jpql = "SELECT op FROM Libro op";
	
		
		Query query = em.createQuery(jpql,Libro.class);

		listado = query.getResultList();
		
		return listado;
		
	}

}
