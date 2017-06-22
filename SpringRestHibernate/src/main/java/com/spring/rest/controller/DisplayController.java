package com.spring.rest.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.rest.datasource.DataSourceConfiguration;

@Controller
public class DisplayController {
	
	@Autowired
	DataSourceConfiguration ds;
	
	@RequestMapping(value="/displaylist",method=RequestMethod.GET)
	public void displayList() throws Exception
	{
		System.out.println("Display List from another controller");
		this.dbCheck();
	}

	
    public void dbCheck() throws Exception
    {
    	//DataSource con=(DataSource)ds.dataSource().getConnection();
    	System.out.println("Raj--->DS: "+ds.dataSource().getConnection());
    	Connection co=ds.dataSource().getConnection();
    	
    	String query="select * from register";
    	Statement st=co.createStatement();
    	ResultSet rs=st.executeQuery(query);
 	
    	while(rs.next())
    	{
    		System.out.println(rs.getString(1));
    		System.out.println(rs.getInt(2));
    		System.out.println(rs.getString(3));
    	}
    }
}
