package com.ayto.proyecto.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 



@Repository
@Transactional
public abstract class GenericoJpaDAO<T> {
	
	private Class<T> persistentClass;
	@PersistenceContext
	private EntityManager entityManager;
	public GenericoJpaDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}
}
