package CapiiCupom.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myConnection {
	public Connection criarConexao() {
		String url = "jdbc:postgresql://localhost/mjv_bd";
		String user = "postgres";
		String password = "lukas2521";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Conectado ao postgreSQL com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
