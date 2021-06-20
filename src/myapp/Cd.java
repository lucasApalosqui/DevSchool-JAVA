package myapp;

public class Cd extends Produto{
	private Cadastro artista;
	
	private Integer faixas;

	public Integer getFaixas() {
		return faixas;
	}

	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}

	public Cadastro getArtista() {
		return artista;
	}

	public void setArtista(Cadastro artista) {
		this.artista = artista;
	}
	
	
}