package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import CapiiCupom.jdbc.connection.myConnection;
import modelos.Cadastro;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		myConnection mc = new myConnection();
		cnn = mc.criarConexao();
	}
	
	public void adicionar(Cadastro cadastro) {
		try {
			String sql = "INSERT INTO public.cad_cliente (nome, telefone, email, cpf) VALUES (?,?,?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			st.setString(3, cadastro.getEmail());
			st.setString(4, cadastro.getCpf());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterarString(String coluna, String dado, String novoDado) {
		try {
			String fmt = "UPDATE public.cad_cliente SET %s = '%s' WHERE %s = '%s';";
			String sql = String.format(fmt, coluna, novoDado, coluna, dado);
			Statement st = cnn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarInt(String coluna, Long dado, Long novoDado) {
		try {
			String fmt = "UPDATE public.cad_cliente SET %s = %d WHERE %s = %d;";
			String sql = String.format(fmt, coluna, novoDado, coluna, dado);
			Statement st = cnn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirPorCpf(String cpf) {
		try {
			String fmt = "DELETE FROM public.cad_cliente WHERE cpf = '%s';";
			String sql = String.format(fmt, cpf);
			Statement st = cnn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Cadastro> listarDados(String tabela){
		List<Cadastro> cadastros = new ArrayList<Cadastro>();
		String fmt = "SELECT * FROM %s;";
		String sql = String.format(fmt, tabela);
		try {
			Statement st = cnn.createStatement();
			ResultSet rset = st.executeQuery(sql);
			while(rset.next()) {
				Cadastro cadastro = new Cadastro();
				
				cadastro.setId(rset.getInt("id"));
				cadastro.setNome(rset.getString("nome"));
				cadastro.setTelefone(rset.getLong("telefone"));
				cadastro.setEmail(rset.getString("email"));
				cadastro.setCpf(rset.getString("cpf"));
				
				cadastros.add(cadastro);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cadastros;
	}
	
	
}