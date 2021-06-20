package myapp.metodos;
import java.text.SimpleDateFormat;
import myapp.Empresa;
import myapp.Pedido;

public class GeraCupom {
	public static void gerarCupom(Pedido pedido) {
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		
		/* imprimir dados da empresa no cupom */
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(String.format("%s, %d, %s - %s - %s\n", empresa.getCadastro().getEndereco().getLogradouro(), empresa.getCadastro().getEndereco().getNumero(), empresa.getCadastro().getEndereco().getBairro(), empresa.getCadastro().getEndereco().getCidade(), empresa.getCadastro().getEndereco().getEstado()));
		sb.append(String.format("CNPJ: %d\nIE: %s\nIM: %s\n", empresa.getCadastro().getCpfcnpj(), empresa.getIe(), empresa.getIm()));
		sb.append("---------------------------------------------------------\n");
		
		/* imprimir descri��o do pedido no cupom */
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("%sV %20s   %s\n", dataFormatada, pedido.getCcf(), pedido.getCoo()));
		sb.append("     CUPOM FISCAL\nitem c�digo descri��o qtd.un.vl unit( R$) st vl item( R$)\n");
		sb.append("---------------------------------------------------------\n");
		
		/* imprimir dados dos pedidos no cupom */
		Integer itens = pedido.getItens().size();
		Double totalzao = 1.0;
		for (int contador = 1; contador < itens + 1; ++contador) {
			if (contador == 1) {
				totalzao = pedido.getItens().get(contador - 1).getValorTotal();
			}
			else {
				totalzao = totalzao + pedido.getItens().get(contador - 1).getValorTotal();
			}
			sb.append(String.format("%d    2    %s   %d UN   %.2f    T%d     %12.2fG\n",contador ,pedido.getItens().get(contador - 1).getProduto().getTitulo(), pedido.getItens().get(contador - 1).getQuantidade(), pedido.getItens().get(contador - 1).getValorVenda(),contador ,pedido.getItens().get(contador - 1).getValorTotal()));
		}
		
		/* imprimir total dos produtos */
		sb.append(String.format("%57s\nTOTAL  R$ %46.2f\ndinheiro %47.2f\n\n VOLTE SEMPRE !!!!!!!!\n---------------------------------------------------------\n", "---------------", totalzao, totalzao));
		
		
		
		
		
		System.out.println(sb.toString());
	}
}