package com.spring.rest.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.spring.rest.model.Login;


@Component
public class LoginDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(Login login) {
		em.persist(login);
	}

	public List<Login> findAll() {
		return em.createQuery("SELECT p FROM Product p").getResultList();
	}

}