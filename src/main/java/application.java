import java.util.List;

import Dao.CadastroDao;
import Metodosfacilitadores.FacilitadorCadastro;
import modelos.Cadastro;

public class application {
	public static void main (String[] args) {
		CadastroDao dao = new CadastroDao();
		Cadastro cd = new Cadastro();
		cd = FacilitadorCadastro.cadastrarCliente("Paulo",1176543387l,"paulinho@gmail.com","2554327668");
		//dao.adicionar(cd);//
		//dao.alterarInt("telefone", 11988672997l, 1125218661l);//
		//dao.excluirPorCpf("2336547899");//
		for(Cadastro c : dao.listarDados("cad_cliente")) {
			System.out.println("Contato: "+c.getNome());
		}
		
	}
}
