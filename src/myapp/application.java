package myapp;

import java.util.ArrayList;
import myapp.metodos.CadastrarEndereco;
import java.util.Date;
import java.util.List;

import myapp.metodos.Cadastrar;

public class application{
	public static void main(String[] args) {
		Cadastro cliente = new Cadastro();
		cliente.setNome("Lucas Apalosqui");
		cliente.setEmail("Lucas@gmail.com");
		cliente.setTelefone(11988765435l);
		
		
		/* Adicionando dados do pedido */
		Cadastro artista = new Cadastro();
		artista.setNome("System of a Down");
		
		Cd p1 = new Cd();
		p1.setCodigoBarras("125625gst5");
		p1.setTitulo("Toxicity");
		p1.setValorVenda(99.90);
		p1.setFaixas(11);
		p1.setArtista(artista);
		p1.setId(2);
		
		artista = new Cadastro();
		artista.setNome("Asian Kung fu generation");
		
		Cd p2 = new Cd();
		p2.setCodigoBarras("ahuhsyg5453");
		p2.setTitulo("A Girl Named You");
		p2.setValorVenda(55.80);
		p2.setFaixas(8);
		p2.setArtista(artista);
		p2.setId(2);
		
		
		Pedido pedido = new Pedido();
		Cadastro comprador = Cadastrar.criarCadastro("Lucas Apalosqui", "Lucas@gmail.com", 11988672997L,2779876544L);
		pedido.setComprador(comprador);
		pedido.setData(new Date(2021,06,17));
		pedido.setCcf("000034");
		pedido.setCoo("000327");
		
		
		List<Pedidoitem> itens = new ArrayList<>();
		Pedidoitem item = new Pedidoitem();
		item.setProduto(p1);
		item.setQuantidade(2.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		item = new Pedidoitem();
		item.setProduto(p2);
		item.setQuantidade(3.0);
		item.setValorVenda(p2.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		pedido.setItens(itens);
		
		
		/* Adicionando dados da empresa */
		Cadastro empresa = Cadastrar.criarCadastro("Panini", "panini@distribuidora.com", 11976543356L, 125436753000L);
		empresa.setEndereco(CadastrarEndereco.criarEndereco("R. matias de paula", 25, "Vila Matilde", "são paulo", "SP", "apt09 B03"));
		Empresa empresaDado = new Empresa();
		empresaDado.setIe(543676589L);
		empresaDado.setIm(45327685L);
		
		
		
		
		/*Endereco enderecoEmpresa = CadastrarEndereco.criarEndereco("R. matias de paula", 25, "Vila Matilde", "são paulo", "SP", "apt09 B03");*/
		
		System.out.println(empresa.getEndereco().getCidade() + empresa.getEndereco().getNumero());
		}
	}