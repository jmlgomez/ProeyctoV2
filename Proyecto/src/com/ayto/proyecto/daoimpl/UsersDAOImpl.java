package com.ayto.proyecto.daoimpl;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import com.ayto.proyecto.dao.UsersDAO;
import com.ayto.proyecto.modelo.Roles;
import com.ayto.proyecto.modelo.Users;
import com.ayto.proyecto.modelo.Usuarios;

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

}
