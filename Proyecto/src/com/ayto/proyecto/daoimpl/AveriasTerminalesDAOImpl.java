package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.AveriasTerminalesDAO;
import com.ayto.proyecto.modelo.AveriasTerminales;
import com.ayto.proyecto.modelo.Tarjetas;

@Service
public class AveriasTerminalesDAOImpl implements AveriasTerminalesDAO {

	
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
	public void insertarAveriasTerminales(AveriasTerminales at) {
try {
			
			enti.persist(at);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Averiasterminales "+ex.getMessage());
			
		}
	}
		
	
	@Override
	@Transactional
	public void borrarAveriasTerminales(AveriasTerminales at) {
			try {
			
				AveriasTerminales averiasterminal=enti.find(AveriasTerminales.class, at.getIdaveriasTerminal());
			    enti.remove(averiasterminal);
				
			} catch (HibernateException ex) {
				System.out.println("Error al realizar el borrado Averiasterminales "+ex.getMessage());
				
			}
		
	}

	@Override
	@Transactional
	public void modificarAveriasTerminales(AveriasTerminales at) {
try {
			
			enti.merge(at);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Averiasterminales "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public AveriasTerminales detalleAveriasTerminales(int idaveriasTerminal) {
		try {
			
			Query q = (Query)enti.createQuery("from Averiasterminales where idaveriasTerminal=:idaveriasTerminal");
			q.setParameter("idaveriasterminal", idaveriasTerminal);
			AveriasTerminales dav = (AveriasTerminales) q.getSingleResult();
			return dav;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public List<AveriasTerminales> listarAveriasTerminales() {
try {
			
			Query q = (Query)enti.createQuery("from AveriasTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

}
