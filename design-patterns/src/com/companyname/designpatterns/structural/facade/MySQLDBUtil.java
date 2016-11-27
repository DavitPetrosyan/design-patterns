package com.companyname.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * Created by davitpetrosyan on 11/28/16.
 */
public class MySQLDBUtil {

	static Connection getConnection(String url) {
		System.out.println("should be mysql db connection");
		return null;
	}

	String getDataAsJSON(Connection connection){
		//get data from table as JSON
		//return type should be JSON
		return "";
	}


	String getDataAsString(Connection connection){
		//get data from table as STRING
		return "";
	}
}
