package com.spring.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.spring.model.MessageResource;
import com.spring.model.Product;


@Component
public class MessageDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(MessageResource resource) {
		em.persist(resource);
	}

	public List<MessageResource> findAll() {
		return em.createQuery("SELECT p FROM MessageResource p").getResultList();
	}

}