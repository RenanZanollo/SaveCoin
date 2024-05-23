package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoDAO {
    
	
	public static Connection faz_conexao() throws SQLException{
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 return DriverManager.getConnection("jdbc:mysql://localhost:3306/SaveCoin", "root", "Nanacuzao1@");
		
		}catch (ClassNotFoundException e) {
		
		throw new SQLException(e.getException());
		}
	}
}