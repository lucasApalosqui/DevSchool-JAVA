package myapp.cadastros;

public class Cadastro{
		private Integer id;
		private String nome;
		private Long telefone;
		private String email;
		private Long cpfcnpj;
		private Endereco endereco;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Long getTelefone() {
			return telefone;
		}
		public void setTelefone(Long telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getCpfcnpj() {
			return cpfcnpj;
		}
		public void setCpfcnpj(Long cpfcnpj) {
			this.cpfcnpj = cpfcnpj;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
}