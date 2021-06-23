package myapp.produtos;

public class Pedidoitem {
		private Produto produto;
		private Integer id; 
		private Integer quantidade;
		private Double valorVenda;
		private Double valorTotal;
		
		Integer getId() {
			return id;
		}
		void setId(Integer id) {
			this.id = id;
		}
		public Integer getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}
		public Double getValorVenda() {
			return valorVenda;
		}
		public void setValorVenda(Double valorVenda) {
			this.valorVenda = valorVenda;
		}
		public Double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		
		
}
