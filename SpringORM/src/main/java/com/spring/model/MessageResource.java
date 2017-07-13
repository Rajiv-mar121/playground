package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_message_resource")
public class MessageResource {

	@Id
	@Column(name = "id")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Column(name = "message_key")
	private String messageKey;
	
	@Column(name = "message_text")
	private String messageText;
	
	@Column(name = "locale")
	private String locale;
	
	MessageResource()
	{}
	
	public MessageResource(Integer id,String messageKey,String messageText,String locale)
	{
		this.id=id;
		this.messageKey=messageKey;
		this.messageText=messageText;
		this.locale=locale;
	}
	
	@Override
	public String toString() {
		return "MessageResource [id=" + id + ", messageKey=" + messageKey + "messageText "+messageText+" locale "+locale+"]";
	}
}
