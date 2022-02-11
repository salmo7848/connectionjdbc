package br.com.dadosSimples.connect;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connectors {
	
	public static final String USERNAME = " ";
	
	public static final String PASSWORD = " ";
	
	public static final String DATABASE_URL = "jdbc:mysql//localhost:3306/Nome_do_Banco";
	
	public static Connection CreatorConnectionToMysql()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, PASSWORD, USERNAME);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection cones = CreatorConnectionToMysql();
		
		if(cones != null) {
			System.out.println("Mensagem de ação concluida");
		}
		
	}

}
