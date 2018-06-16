package com.ayto.proyecto.daoimpl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;
import com.ayto.proyecto.dao.UsersDAO;
import com.ayto.proyecto.modelo.Roles;
import com.ayto.proyecto.modelo.Users;


@Service
public class UsersDAOImpl implements UsersDAO {

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
	public Users validar(String nombre, String password) {
		try {
			Query q = (Query) entityManager.createQuery("from Users where username=:nombre and password=:password");
			q.setParameter("nombre", nombre);
			q.setParameter("password", password);
			Users u = (Users) q.getSingleResult();
			return u;
		}catch(RuntimeException ex) {
			return null;
		}
	}

	@Override
	@Transactional
	public void insertarUsers(Users usr) {
		try {
			entityManager.persist(usr);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public void modificarUsers(Users usr) {
		try {
			entityManager.merge(usr);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public void borrarUsers(Users usr) {
		try {
			Users user=entityManager.find(Users.class, usr.getUsername());
			entityManager.remove(user);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public List<Users> getUsers() {
		try {
			Query q = (Query) entityManager.createQuery("from Users");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public Users detalleUsers(String Username) {
		try {
			Query q = (Query) entityManager.createQuery("from Users where username=:username");
			q.setParameter("username", Username);
			Users usr= (Users) q.getSingleResult();
			return usr;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public void insertarRoles(Roles rol) {
		try {
			entityManager.persist(rol);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion del rol del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public void modificarRoles(Roles rol) {
		try {
			entityManager.merge(rol);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificación del rol del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public void borrarRoles(Roles rol) {
		try {
			Users user=entityManager.find(Users.class, rol.getRolename());
			entityManager.remove(rol);
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado del rol del usuario del sistema" + ex.getMessage());
		}
	}

	@Override
	@Transactional
	public List<Roles> getRolename() {
		try {
			Query q = (Query) entityManager.createQuery("from Roles");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}


	@Override
	@Transactional
	public Roles detalleRoles(String Rolename) {
		try {
			Query q = (Query) entityManager.createQuery("from Roles where rolename=:rolename");
			q.setParameter("rolename", Rolename);
			Roles rol= (Roles) q.getSingleResult();
			return rol;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}