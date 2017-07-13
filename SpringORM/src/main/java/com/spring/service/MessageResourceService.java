package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.MessageResource;

//import com.spring.model.MessageResource;

public class MessageResourceService {
	
	String english;
	String french;
	MessageResourceService(){}
	MessageResourceService(String english,String french)
	{
		this.english=english;
		this.english=french;
	}
	public List<MessageResource> loadAllMessages()
	{
		 List<MessageResource> li=new ArrayList();
		 li.add(new MessageResource(1,"Greeting","Hello Rajiv","us"));
		 li.add(new MessageResource(2,"Greeting","Hello Rajiv2","fr"));
		 
		 return li;
	}

}
