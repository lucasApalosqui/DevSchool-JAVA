package myapp;

import java.util.Date;
import java.util.List;

public class Pedido {
		private List<Pedidoitem> Itens;
		private Cadastro comprador;
		private Pedidoitem pedidoitem;
		private Integer id;
		private Date data;
		private Double valorTotal;
		private String ccf;
		private String coo;
		
		public Pedidoitem getPedidoitem() {
			return pedidoitem;
		}
		public void setPedidoitem(Pedidoitem pedidoitem) {
			this.pedidoitem = pedidoitem;
		}
		Integer getId() {
			return id;
		}
		void setId(Integer id) {
			this.id = id;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public Double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}
		public void setComprador(Cadastro comprador) {
			this.comprador = comprador;
		}
		public Cadastro getComprador() {
			return comprador;
		}
		public void setItens(List<Pedidoitem> itens) {
			Itens = itens;
		}
		public List<Pedidoitem> getItens() {
			return Itens;
		}
		public String getCcf() {
			return ccf;
		}
		public void setCcf(String ccf) {
			this.ccf = ccf;
		}
		public String getCoo() {
			return coo;
		}
		public void setCoo(String coo) {
			this.coo = coo;
		}
		
		
}