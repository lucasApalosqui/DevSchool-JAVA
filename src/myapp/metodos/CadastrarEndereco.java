package myapp.metodos;

import myapp.cadastros.Endereco;



public class CadastrarEndereco {
	
	public static Endereco criarEndereco(String logradouro, Integer numero, String bairro, String cidade, String estado, String complemento) {
		if ((logradouro == null || numero == null || bairro == null || cidade == null || estado == null)) {
			System.out.println("Erro ao adicionar dados, verifique se todos os campos foram devidamente preenchidos");
			return null;
		}
		Endereco cliente = new Endereco();
		cliente.setLogradouro(logradouro);
		cliente.setNumero(numero);
		cliente.setBairro(bairro);
		cliente.setCidade(cidade);
		cliente.setEstado(estado);
		cliente.setComplemento(complemento);
		return cliente;
	}
	Endereco enderecoEmpresa = CadastrarEndereco.criarEndereco("R. matias de paula", 25, "Vila Matilde", "são paulo", "SP", "apt09 B03");
	
}
