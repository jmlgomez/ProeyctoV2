package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.TarjetasDAO;
import com.ayto.proyecto.modelo.EstadosTarjetas;
import com.ayto.proyecto.modelo.Tarjetas;
import com.ayto.proyecto.modelo.TiposContratos;
import com.ayto.proyecto.modelo.TiposTarifas;
import com.ayto.proyecto.modelo.TiposTarjetas;

@Service
public class TarjetasDAOImpl implements TarjetasDAO {

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
	public void insertarTarjetas(Tarjetas tarj) {
		try {
			enti.persist(tarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Tarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarTarjetas(Tarjetas tarj) {
		try {
			enti.remove(tarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Tarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarTarjetas(Tarjetas tarj) {
		try {
			enti.persist(tarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacioon Tarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public Tarjetas detalleTarjetas(int idTarjeta) {
		try {
			Query q = (Query) enti.createQuery("from Tarjetas where idTarjeta=:idTarjeta");
			q.setParameter("idTarjeta", idTarjeta);
			Tarjetas tarj = (Tarjetas) q.getSingleResult();
			return tarj;

		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public List<Tarjetas> listarTarjetas() {
		try {

			Query q = (Query) enti.createQuery("from Tarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public void insertarEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			enti.persist(esttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion EsatdosTarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificaEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			enti.persist(esttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion EsatdosTarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			enti.remove(esttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado EsatdosTarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public List<EstadosTarjetas> listadoEstadosTarjetas() {
		try {
			Query q = (Query) enti.createQuery("from EstadosTarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public EstadosTarjetas detalleEstadosTarjetas(int idEstadoTarjeta) {
		try {

			Query q = (Query) enti.createQuery("from EstadosTarjetas where idEstadoTarjeta=:idEstadoTarjeta");
			q.setParameter("idEstadoTarjeta", idEstadoTarjeta);
			EstadosTarjetas esttarj = (EstadosTarjetas) q.getSingleResult();
			return esttarj;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public void insertarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			enti.persist(ttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Tipo_Tarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			enti.persist(ttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificación Tipo_Tarjeta" + ex.getMessage());

		}
	}

	@Override
	@Transactional
	public void borrarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			enti.remove(ttarj);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Tipo_Tarjeta" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public List<TiposTarjetas> listadoTiposTarjetas() {
		try {
			Query q = (Query) enti.createQuery("from TiposTarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public TiposTarjetas detalleTiposTarjetas(int idTipoTarjeta) {
		try {
			Query q = (Query) enti.createQuery("from TiposTarjetas where idTipoTarjeta=:idTipoTarjeta");
			q.setParameter("idTipoTarjeta", idTipoTarjeta);
			TiposTarjetas ttarj = (TiposTarjetas) q.getSingleResult();
			return ttarj;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public void insertarTiposContratos(TiposContratos tcontrato) {
		try {
			enti.persist(tcontrato);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion TiposContratos" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarTiposContratos(TiposContratos tcontrato) {
		try {
			enti.persist(tcontrato);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion TiposContratos" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarTiposContratos(TiposContratos tcontrato) {
		try {
			enti.remove(tcontrato);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado TiposContratos" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public List<TiposContratos> listadoTiposContratos() {
		try {
			Query q = (Query) enti.createQuery("from TiposContratos");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public TiposContratos detalleTiposContratos(int idTipoContrato) {
		try {

			Query q = (Query) enti.createQuery("from TiposContratos where idTipoContrato=:idTipoContrato");
			q.setParameter("idTipoContrato", idTipoContrato);
			TiposContratos tcontrato = (TiposContratos) q.getSingleResult();
			return tcontrato;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public void insertarTiposTarifas(TiposTarifas ttarf) {
		try {
			enti.persist(ttarf);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion TiposTarifas" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarTipoTarifas(TiposTarifas ttarf) {
		try {
			enti.persist(ttarf);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion TiposTarifas" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarTipoTarifa(TiposTarifas ttarf) {
		try {
			enti.remove(ttarf);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado TiposTarifas" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public List<TiposTarifas> listadoTipoTarifa() {
		try {
			Query q = (Query) enti.createQuery("from TiposTarifas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public TiposTarifas detalletipotarifa(int idTipoTarifa) {
		try {

			Query q = (Query) enti.createQuery("from TiposTarifas  where idTipoTarifa=:idTipoTarifa");
			q.setParameter("idTipoTarifa", idTipoTarifa);
			TiposTarifas ttarf = (TiposTarifas) q.getSingleResult();
			return ttarf;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

			return null;
		}

	}
}
