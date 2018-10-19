package com.cjava.dbconnnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	
    public  static  Connection connectSQLSERVER(String ipaddressPort,String DatabaseName,String username,String password){
    	Connection conn=null;
    	try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
    	conn = DriverManager.getConnection("jdbc:sqlserver://"+ipaddressPort+";DatabaseName="+DatabaseName, username, password);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    		return conn;
    }
    
}
