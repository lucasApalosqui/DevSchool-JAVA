package Metodosfacilitadores;

import Dao.CadastroDao;
import modelos.Cadastro;

public class FacilitadorCadastro {
	public static Cadastro cadastrarCliente(String nome, Long telefone, String email, String cpf) {
		Cadastro cadC = new Cadastro();
		cadC.setNome(nome);
		cadC.setTelefone(telefone);
		cadC.setEmail(email);
		cadC.setCpf(cpf);
		return cadC;
	}
}
