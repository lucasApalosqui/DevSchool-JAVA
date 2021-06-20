package myapp.metodos;

import myapp.Cadastro;

public class Cadastrar {
	
	public static Cadastro criarCadastro(String nome, String email, Long telefone, Long cnpjcpf) {
		if ((nome == null || email == null || telefone == null || cnpjcpf == null)) {
			System.out.println("Valor inválido");
			return null;
		}
		
		Cadastro cliente = new Cadastro();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		cliente.setCpfcnpj(cnpjcpf);
		
		return cliente;
	}
}