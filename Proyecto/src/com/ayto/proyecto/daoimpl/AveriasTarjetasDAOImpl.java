package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.AveriasTarjetasDAO;
import com.ayto.proyecto.modelo.AveriasTarjetas;
import com.ayto.proyecto.modelo.Dispositivos;

@Service
public class AveriasTarjetasDAOImpl implements AveriasTarjetasDAO {
	
	
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
	public void insertarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			
			enti.persist(avt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Averias Tarjetas"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			
			AveriasTarjetas averiatarjeta=enti.find(AveriasTarjetas.class, avt.getIdaveriaTarjeta());
		    enti.remove(averiatarjeta);
			
			
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Averias Trajetas"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			
			enti.merge(avt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la mododificación Averias Tarjetas"+ex.getMessage());
			
		}
		
	}
		
	

	@Override
	@Transactional
	public AveriasTarjetas detalleAveriasTarjetas(int idaveriaTarjeta) {
		try {
			
			@SuppressWarnings("unchecked")
			Query q = (Query)enti.createQuery("from AveriasTarjetas where idaveriaTarjeta=:idaveriaTarjeta");
			q.setParameter("idaveriaTarjeta",idaveriaTarjeta);
			AveriasTarjetas av = (AveriasTarjetas) q.getSingleResult();
			return av;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public List<AveriasTarjetas> listarAveriasTarjetas() {
		try {
			
			@SuppressWarnings("unchecked")
			Query q = (Query)enti.createQuery("from AveriasTarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

}
