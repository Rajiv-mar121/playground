package com.spring.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	private Integer emaiId;
	private String name;
	private String password;
	
	public Integer getEmaiId() {
		return emaiId;
	}

	public void setEmaiId(Integer emaiId) {
		this.emaiId = emaiId;
	}

	

	public Login() {
	}

	public Login(Integer emaiId, String name,String password) {
		this.emaiId = emaiId;
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + emaiId + ", name=" + name + "]";
	}

}
