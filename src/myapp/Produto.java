package myapp;

public abstract class Produto {
		private Integer id;
		private String codigoBarras;
		private String titulo;
		private Double valorVenda;
		
		Integer getId() {
			return id;
		}
		void setId(Integer id) {
			this.id = id;
		}
		public String getCodigoBarras() {
			return codigoBarras;
		}
		public void setCodigoBarras(String codigoBarras) {
			this.codigoBarras = codigoBarras;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public Double getValorVenda() {
			return valorVenda;
		}
		public void setValorVenda(Double valorVenda) {
			this.valorVenda = valorVenda;
		}
}