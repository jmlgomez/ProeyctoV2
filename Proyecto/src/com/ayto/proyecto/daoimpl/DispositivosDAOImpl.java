package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.DispositivosDAO;
import com.ayto.proyecto.modelo.Dispositivos;
import com.ayto.proyecto.modelo.ModelosDispositivos;

@Service
public class DispositivosDAOImpl implements DispositivosDAO {
	
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
	public void insertarDispositivos(Dispositivos disp) {
		
	try{	
		enti.persist(disp);
		
	} catch (HibernateException ex) {
		System.out.println("Error al realizar la insercción Dispositivos "+ex.getMessage());
		
	}
}

	@Override
	@Transactional
	public void modificarDispositivos(Dispositivos disp) {
		try{	
			enti.persist(disp);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Dispositivos "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarDispositivos(Dispositivos disp) {
		try{	
			enti.remove(disp);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Dispositivos "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<Dispositivos> listadoDispositivos() {
try {
			
			Query q = (Query)enti.createQuery("from Dispositivos");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public Dispositivos detalleDispositivos(int idDispositivo) {
try {	
		Query q = (Query)enti.createQuery("from Dispositivos where idDispositivo=:idDispositivo");
		q.setParameter("idDispositivo", idDispositivo);
		Dispositivos disp = (Dispositivos) q.getSingleResult();
		return disp;
	} catch (RuntimeException ex) {
		ex.printStackTrace();
		
	}
		return null;
	}

	@Override
	@Transactional
	public void insertarModelosDisositivos(ModelosDispositivos mdisp) {
		try{	
			enti.persist(mdisp);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la insercción Modelos Dispositivos "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarModelosDisositivos(ModelosDispositivos mdisp) {
		try{	
			enti.persist(mdisp);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Modelos Dispositivos "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarModelosDisositivos(ModelosDispositivos mdisp) {
		try{	
			enti.remove(mdisp);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Modelos Dispositivos "+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<ModelosDispositivos> listadoModelosDispositivos() {
try {
			Query q = (Query)enti.createQuery("from ModelosDispositivos");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public ModelosDispositivos detalleModelosDispositivos(int idModeloDispositivo) {
		try {	
			Query q = (Query)enti.createQuery("from ModelosDispositivos  where idModeloDispositivo=:idModeloDispositivo");
			q.setParameter("idModeloDispositivo", idModeloDispositivo);
			ModelosDispositivos mdisp = (ModelosDispositivos) q.getSingleResult();
			return mdisp;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
	return null;
	
	}

}
