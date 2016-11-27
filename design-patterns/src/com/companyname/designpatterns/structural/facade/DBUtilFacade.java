package com.companyname.designpatterns.structural.facade;

import javafx.geometry.Pos;

import java.sql.Connection;

/**
 * Created by davitpetrosyan on 11/28/16.
 */
public class DBUtilFacade {

	static String getData(String url, String dbType, String dataTypeAs) {

		Connection connection = null;
		String dataAs = "";
		switch (dbType) {
			case "mysql" :

				connection = MySQLDBUtil.getConnection(url);
				MySQLDBUtil mySQLDBUtil = new MySQLDBUtil();
				switch(dataTypeAs) {
					case "JSON":
						dataAs = mySQLDBUtil.getDataAsJSON(connection);
						break;
					case "String":
						dataAs = mySQLDBUtil.getDataAsString(connection);
						break;
				}

				break;
			case "postgre" :
				connection = PostgreDBUtil.getConnection(url);
				PostgreDBUtil postgreDBUtil = new PostgreDBUtil();
				switch(dataTypeAs) {
					case "JSON":
						dataAs = postgreDBUtil.getDataAsJSON(connection);
						break;
					case "String":
						dataAs = postgreDBUtil.getDataAsString(connection);
						break;
				}
				break;

		}
		return dataAs;

	}


	public static void main(String[] args) {

		Connection mySqlDBConnection = MySQLDBUtil.getConnection("url");
		MySQLDBUtil mySQLDBUtil = new MySQLDBUtil();
		mySQLDBUtil.getDataAsJSON(mySqlDBConnection);

		Connection postgreDBConnection = PostgreDBUtil.getConnection("url");
		PostgreDBUtil postgreDBUtil = new PostgreDBUtil();
		postgreDBUtil.getDataAsString(postgreDBConnection);



		//facade
		DBUtilFacade.getData("url", "mysql", "JSON");
		DBUtilFacade.getData("url", "postgre", "String");
	}
}
