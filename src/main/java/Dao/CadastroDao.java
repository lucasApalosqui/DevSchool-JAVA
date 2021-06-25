package Dao;

import java.sql.Connection;
import CapiiCupom.jdbc.connection.myConnection;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		myConnection mc = new myConnection();
		cnn = mc.criarConexao();
	}
}