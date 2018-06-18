package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.EntregasDAO;

import com.ayto.proyecto.modelo.Entregas;
import com.ayto.proyecto.modelo.Operadores;
import com.ayto.proyecto.modelo.Tarjetas;

@Service
public class EntregasDAOImpl  implements EntregasDAO {
	
	@PersistenceContext
	private EntityManager enti;
	protected EntityManager getEntityManager() {
		return enti;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.enti = entityManager;
	}
	
	
	@Override
	@Transactional
	public void insertarEntregas(Entregas e) {
		try {
			if (e.getTerminales().getIdTerminal() != null)
				e.getTerminales().setDisponible(false);
			if (e.getTarjetas().getIdTarjeta() != null)
				e.getTarjetas().setDisponible(false);
			enti.persist(e);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserción Entregas "+ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	@Override
	@Transactional
	public void borrarEntregas(Entregas e) {
		try {
			Entregas entrega=enti.find(Entregas.class, e.getIdEntrega());
			entrega.getTerminales().setDisponible(true);
			entrega.getTarjetas().setDisponible(true);
			enti.remove(entrega);	
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Entregas"+ex.getMessage());
		}
	}
	
	@Override
	@Transactional
	public void modificarEntregas(Entregas e) {
		try {
			enti.merge(e);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la actualización Entregas"+ex.getMessage());
		}
	}
	
	@Override
	@Transactional
	public Entregas detalleEntregas(int idEntrega) {
		try {
			Query q = (Query)enti.createQuery("from Entregas where idEntrega=:idEntrega");
			q.setParameter("idEntrega", idEntrega);
			Entregas e = (Entregas) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	@Override
	@Transactional
	public List<Entregas> listarEntregas() {
		try {
			Query q = (Query)enti.createQuery("from Entregas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	@Override
	@Transactional
	public void insertarOperadores(Operadores o) {
		try {
			enti.persist(o);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la insercion Operadores "+ex.getMessage());			
		}		
	}
	
	@Override
	@Transactional
	public void modificarOperadores(Operadores o) {
		try {
			enti.merge(o);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la actualizaciÃƒÂ³n Operadores "+ex.getMessage());	
		}	
	}
	
	@Override
	@Transactional
	public void borrarOperadores(Operadores o) {
		try {	
			Operadores operador=enti.find(Operadores.class, o.getIdOperador());
			enti.remove(operador);	
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Operadores "+ex.getMessage());			
		}		
	}
	
	@Override
	@Transactional
	public List<Operadores> listadoOperadores() {
		try {			
			Query q = (Query)enti.createQuery("from Operadores");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();			
		}
		return null;
	}
	
	@Override
	@Transactional
	public Operadores detalleOperadores(int idOperador) {
		try {
			Query q = (Query)enti.createQuery("from Operadores where idOperador=:idOperador");
			q.setParameter("idOperador", idOperador);
			Operadores o = (Operadores) q.getSingleResult();
			return o;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}	
	
}