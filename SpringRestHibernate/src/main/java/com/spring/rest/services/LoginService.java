package com.spring.rest.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.dao.LoginDao;
import com.spring.rest.model.Login;



@Component
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	@Transactional
	public void add(Login login) {
		loginDao.persist(login);
	}
	
	@Transactional
	public void addAll(Collection<Login> logins) {
		for (Login login : logins) {
			loginDao.persist(login);
		}
	}

	@Transactional(readOnly = true)
	public List<Login> listAll() {
		return loginDao.findAll();

	}

}
