
//=====================================================================
//
//  File:    connectDS.java      
//  Summary: This Microsoft JDBC Driver for SQL Server sample application
//	     demonstrates how to connect to a SQL Server database by 
//	     using a data source object. It also demonstrates how to 
//	     retrieve data from a SQL Server database by using a stored 
//	     procedure.
//
//---------------------------------------------------------------------
//
//  This file is part of the Microsoft JDBC Driver for SQL Server Code Samples.
//  Copyright (C) Microsoft Corporation.  All rights reserved.
//
//  This source code is intended only as a supplement to Microsoft
//  Development Tools and/or on-line documentation.  See these other
//  materials for detailed information regarding Microsoft code samples.
//
//  THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF 
//  ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO 
//  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//  PARTICULAR PURPOSE.
//
//===================================================================== 
package connections;
import java.sql.*;

import javax.xml.transform.Result;

import com.microsoft.sqlserver.jdbc.*;

public class connectDS {

	public static void main(String[] args) {
		
		// Declare the JDBC objects.
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;

		try {

			// Establish the connection. 
			SQLServerDataSource ds = new SQLServerDataSource();
//			ds.setIntegratedSecurity(true);
			ds.setServerName(Config.LOCAL);
//			ds.setPortNumber(1433); 
			ds.setUser(Config.USER);
			ds.setPassword(Config.PWD);
			ds.setDatabaseName(Config.DB_NAME);
			con = ds.getConnection();
			rs=  con.createStatement().executeQuery("select * from sys.tables;");
//	        	// Execute a stored procedure that returns some data.
//            		cstmt = con.prepareCall("{call dbo.uspGetEmployeeManagers(?)}");
//            		cstmt.setInt(1, 50);
//            		rs = cstmt.executeQuery();
//
//	        	// Iterate through the data in the result set and display it.
//			rs.first();
	        	while (rs.next()) {
//	            		System.out.println("EMPLOYEE: " + rs.getString("LastName") + 
//	            			", " + rs.getString("FirstName"));
//	            		System.out.println("MANAGER: " + rs.getString("ManagerLastName") + 
//	            			", " + rs.getString("ManagerFirstName"));
	        		final String tbName = rs.getObject(1).toString();
	        		System.out.println(tbName);
	        		final Statement statement2  = con.createStatement();
	        		ResultSet resultSet = statement2.executeQuery(String.format("select * from %s",tbName));
	        		ResultSetMetaData setMetaData = resultSet.getMetaData();
	        		int column = setMetaData.getColumnCount();
//	        		resultSet.next();
	        		
	        		for (int i = 1;i <= column ;i++) {
	        			System.out.print(setMetaData.getColumnName(i) +"  ");
					}
	        		System.out.println();
//	        		while(resultSet.next()){
	        		
//	        			for(int i = 1; i < column ;i++){
//	        			final Object tbC = resultSet.getObject(i);
//		        		System.out.print(tbC+"   ");
//	        			}
	        			
//	        		}
	        		System.out.println();
	        		if(resultSet!=null && !resultSet.isClosed()){
	        			resultSet.close();
	        		}
	        		
	        		if(statement2!=null && !statement2.isClosed()){
	        			statement2.close();
	        		}
	        		
	        	}
	        	
	        	
	        	
	        	
	        }
	        
		// Handle any errors that may have occurred.
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}

	   	finally {
	    		if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (cstmt != null) try { cstmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
	    	}
	}
}
