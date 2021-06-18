package myapp.metodos;

import myapp.Cadastro;

public class Cadastrar {
	
	public static Cadastro criarCadastro(String nome, String email, Long telefone) {
		if ((nome == null || email == null || telefone == null)) {
			System.out.println("Valor inválido");
			return null;
		}
		
		Cadastro cliente = new Cadastro();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		return cliente;
	}
}