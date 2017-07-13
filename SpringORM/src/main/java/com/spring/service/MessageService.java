package com.spring.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MessageDao;
import com.spring.model.MessageResource;
import com.spring.model.Product;



@Component
public class MessageService {

	@Autowired
	private MessageDao messageDao;

	@Transactional
	public void add(MessageResource resource) {
		messageDao.persist(resource);
	}
	
	@Transactional
	public void addAll(Collection<MessageResource> resources) {
		for (MessageResource resource : resources) {
			messageDao.persist(resource);
		}
	}

	@Transactional(readOnly = true)
	public List<MessageResource> listAll() {
		return messageDao.findAll();

	}

}
