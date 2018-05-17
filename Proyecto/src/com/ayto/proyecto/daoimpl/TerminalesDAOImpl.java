package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.TerminalesDAO;
import com.ayto.proyecto.modelo.CompaniasTerminales;
import com.ayto.proyecto.modelo.EstadosTerminales;
import com.ayto.proyecto.modelo.HistEstados;
import com.ayto.proyecto.modelo.LotesTerminales;
import com.ayto.proyecto.modelo.Marcas;
import com.ayto.proyecto.modelo.ModelosTerminales;
import com.ayto.proyecto.modelo.Terminales;
import com.ayto.proyecto.modelo.TiposTerminales;

@Service
public class TerminalesDAOImpl implements TerminalesDAO{
	
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
	public void insertarTerminales(Terminales t) {
try {
			
			enti.persist(t);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Terminales"+ex.getMessage());
			
		}
		
	}
		
	

	@Override
	@Transactional
	public void borrarTerminales(Terminales t) {
try {
	Terminales terminal=enti.find(Terminales.class, t.getIdTerminal());
    enti.remove(terminal);
			
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Terminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarTerminales(Terminales t) {

	try {
		
		enti.merge(t);
		
	} catch (HibernateException ex) {
		System.out.println("Error al realizar la modificacion Terminales"+ex.getMessage());
		
	}
}
	

	@Override
	@Transactional
	public Terminales detalleTerminales(int idTerminal) {
try {
			
			Query q = (Query) enti.createQuery("from Terminales where idTerminal=:idTerminal");
			q.setParameter("idTerminall", idTerminal);
			Terminales e = (Terminales) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}


	@Override
	@Transactional
	public List<Terminales> listarTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from Terminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarMarca(Marcas m) {
try {
			enti.persist(m);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de Marcas"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarMarca(Marcas m) {
try {
		enti.merge(m);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de Marcas"+ex.getMessage());
			
		}
		
		
	}

	@Override
	@Transactional
	public void borrarMarca(Marcas m) {
try {
	Marcas marca=enti.find(Marcas.class, m.getIdMarca());
    enti.remove(marca);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Marcas"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<Marcas> listadoMarcas() {
try {
			
			Query q = (Query) enti.createQuery("from Marcas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public Marcas detalleMarca(int idMarca) {
try {
			
			Query q = (Query) enti.createQuery("from Marcas where idMarca=:idMarca");
			q.setParameter("idMarca", idMarca);
			Marcas e = (Marcas) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarModelosTerminales(ModelosTerminales mt) {
try {
			
			enti.persist(mt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de modelo de terminal"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarModelosTerminales(ModelosTerminales mt) {
try {
			
			enti.merge(mt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de modelo de terminal"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarModelosTerminales(ModelosTerminales mt) {
try {
		ModelosTerminales modeloterminal=enti.find(ModelosTerminales.class, mt.getIdModeloTerminal());
		enti.remove(modeloterminal);
	
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de modelo de terminal"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<ModelosTerminales> listadoModelosTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from ModelosTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public ModelosTerminales detalleModelosTerminales(int idModeloTerminal) {
	try{	
		Query q = (Query) enti.createQuery("from ModelosTerminales where idModeloTerminal=:idModeloTerminal");
		q.setParameter("idModeloTerminal", idModeloTerminal);
		ModelosTerminales mt = (ModelosTerminales) q.getSingleResult();
		return mt;
	} catch (RuntimeException ex) {
		ex.printStackTrace();
		
	}
		return null;
	}

	@Override
	@Transactional
	public void insertarEstados(EstadosTerminales et) {
try {
			
			enti.persist(et);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de estados terminales"+ex.getMessage());
			
		}
		
	}
	@Override
	@Transactional
	public void modificarEstados(EstadosTerminales et) {
		
			try {
						
						enti.merge(et);
						
					} catch (HibernateException ex) {
						System.out.println("Error al realizar la modificacion de estados terminales"+ex.getMessage());
						
					}
					
		
	}

	@Override
	@Transactional
	public void borrarEstados(EstadosTerminales et) {
		
			try {
				EstadosTerminales estadosterminales=enti.find(EstadosTerminales.class, et.getIdEstadoTerminal());
			    enti.remove(estadosterminales);
				
					} catch (HibernateException ex) {
						System.out.println("Error al realizar el borrado de estados terminales"+ex.getMessage());
						
					}
					
		
	}

	@Override
	@Transactional
	public List<EstadosTerminales> listadoEstadosTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from EstadosTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public EstadosTerminales detalleEstados(int idEstadoTerminal) {
try {
			
			Query q = (Query) enti.createQuery("from EstadosTerminales where idEstadoTerminal=:idEstadoTerminal");
			q.setParameter("idEstadoTerminal", idEstadoTerminal);
			EstadosTerminales et = (EstadosTerminales) q.getSingleResult();
			return et;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarHistEstados(HistEstados he) {
try {
			
			enti.persist(he);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de HistEstados"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarHistEstados(HistEstados he) {
try {
			
			enti.merge(he);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de HistEstados"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarHistEstados(HistEstados he) {
try {
			
	HistEstados histestado=enti.find(HistEstados.class, he.getIdHistEstado());
    enti.remove(histestado);
	
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de HistEstados"+ex.getMessage());
			
		}
	}

	@Override
	@Transactional
	public List<HistEstados> listadoHistEstados() {
		try {
			
			Query q = (Query) enti.createQuery("from HistEstados");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public HistEstados detalleHistEstados(int idHistEstado) {
try {
			
			Query q = (Query) enti.createQuery("from HistEstados where idHistEstado=:idHistEstado");
			q.setParameter("idHistEstado", idHistEstado);
			HistEstados e = (HistEstados) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarLotesTerminales(LotesTerminales lotterm) {
		
			try {
						
						enti.persist(lotterm);
						
					} catch (HibernateException ex) {
						System.out.println("Error al realizar la modificacion de LotesTerminales"+ex.getMessage());
						
					}
		
	}

	@Override
	@Transactional
	public void modificarLotesTerminales(LotesTerminales lotterm) {
		try {
			
			enti.merge(lotterm);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de LotesTerminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarLotesTerminales(LotesTerminales lotterm) {
		try {
					
			LotesTerminales loteterminal=enti.find(LotesTerminales.class, lotterm.getIdLoteTerminal());
		    enti.remove(loteterminal);
			
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de LotesTerminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<LotesTerminales> listadoLotesTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from LotesTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public LotesTerminales detalleLotesTerminales(int idLoteTerminal) {
try {
			
			Query q = (Query) enti.createQuery("from LotesTerminales where idLoteTerminal=:idLoteTerminal");
			q.setParameter("idLoteTerminal", idLoteTerminal);
			LotesTerminales lotterm= (LotesTerminales) q.getSingleResult();
			return lotterm;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarTiposTerminales(TiposTerminales tt) {
try {
			
			enti.persist(tt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de tipos de terminal"+ex.getMessage());
			
		}
		
		
	}

	@Override
	@Transactional
	public void modificarTiposTerminales(TiposTerminales tt) {
try {
			
			enti.merge(tt);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de tipos de terminal"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarTiposTerminales (TiposTerminales tt) {
try {
	
	TiposTerminales tipoterminal=enti.find(TiposTerminales.class, tt.getIdTipoTerminal());
    enti.remove(tipoterminal);
	
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de tipos de terminal"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<TiposTerminales> listadoTiposTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from TiposTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public TiposTerminales detalleTiposTerminales(int idTipoTerminal) {
try {
			
			Query q = (Query) enti.createQuery("from TiposTerminales where idTipoTerminal=:idTipoTerminal");
			q.setParameter("idTipoTerminal", idTipoTerminal);
			TiposTerminales tt = (TiposTerminales) q.getSingleResult();
			return tt;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarCompaniasTerminales(CompaniasTerminales comterm) {
try {
			
			enti.persist(comterm);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de Compañias Terminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void modificarCompaniasTerminales(CompaniasTerminales comterm) {
try {
			
			enti.merge(comterm);
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de Compañias Terminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public void borrarCompaniasTerminales(CompaniasTerminales comterm) {
try {
			
	CompaniasTerminales companiaterminal=enti.find(CompaniasTerminales.class, comterm.getIdCompaniaTerminal());
    enti.remove(companiaterminal);
	
			
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Compañias Terminales"+ex.getMessage());
			
		}
		
	}

	@Override
	@Transactional
	public List<CompaniasTerminales> listadoCompaniasTerminales() {
try {
			
			Query q = (Query) enti.createQuery("from CompaniasTerminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		return null;
	}

	@Override
	@Transactional
	public CompaniasTerminales detalleCompaniasTerminales(int idCompaniaTerminal) {
try {
			
			Query q = (Query) enti.createQuery("from CompaniasTerminales where idCompaniaTerminal=:idCompaniaTerminal");
			q.setParameter("idCompaniaTerminal", idCompaniaTerminal);
			CompaniasTerminales e = (CompaniasTerminales) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
