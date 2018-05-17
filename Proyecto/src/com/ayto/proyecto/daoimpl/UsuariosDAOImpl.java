package com.ayto.proyecto.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.UsuariosDAO;
import com.ayto.proyecto.modelo.DepartamentosAyto;
import com.ayto.proyecto.modelo.Usuarios;

@Service
public class UsuariosDAOImpl implements UsuariosDAO {

	@PersistenceContext
	private EntityManager entityManager;

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void insertarUsuarios(Usuarios u) {
		try {

			entityManager.persist(u);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion usuarios" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarUsuarios(Usuarios u) {
		try {

			 Usuarios usuario=entityManager.find(Usuarios.class, u.getIdUsuario());
             entityManager.remove(usuario);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de usuarios" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarUsuarios(Usuarios u) {
		try {

			entityManager.merge(u);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de usuarios" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public Usuarios detalleUsuarios(int idUsuario) {
		try {

			Query q = (Query) entityManager.createQuery("from Usuarios where idusuario=:idusuario");
			q.setParameter("idUsuario", idUsuario);
			Usuarios u = (Usuarios) q.getSingleResult();
			return u;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public List<Usuarios> listarUsuarios() {
		try {

			Query q = (Query) entityManager.createQuery("from Usuarios");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public void insertarDepartamentosAyto(DepartamentosAyto da) {
		try {

			entityManager.persist(da);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de departamentos AYTO" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void borrarDepartamentosAyto(DepartamentosAyto da) {
		try {

			DepartamentosAyto departamento =entityManager.find(DepartamentosAyto.class, da.getIdDepAyto());
             entityManager.remove(departamento);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de departamentos AYTO" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public void modificarDepartamentosAyto(DepartamentosAyto da) {
		try {

			entityManager.merge(da);

		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de departamentos AYTO" + ex.getMessage());

		}

	}

	@Override
	@Transactional
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto) {
		try {

			Query q = (Query) entityManager.createQuery("from DepartamentosAyto where idDepAyto=:idDepAyto");
			q.setParameter("idDepAyto", idDepAyto);
			DepartamentosAyto da = (DepartamentosAyto) q.getSingleResult();
			return da;
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	@Transactional
	public List<DepartamentosAyto> listarDepartamentosAyto() {
		try {

			Query q = (Query) entityManager.createQuery("from DepartamentosAyto");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}
		return null;
	}

}
