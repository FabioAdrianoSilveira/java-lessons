package classroom.mavenProjectCondominium;

public class Bloco {
	private int numero;
	private String apelido;
	private boolean construcao;
	private Apartamento apartamento;
	
	// Construtore
	public Bloco(int numero, String apelido, boolean construcao, Apartamento apartamento) {
		super();
		this.numero = numero;
		this.apelido = apelido;
		this.construcao = construcao;
		this.apartamento = apartamento;
	}
	
	// Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isConstrucao() {
		return construcao;
	}

	public void setConstrucao(boolean construcao) {
		this.construcao = construcao;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartramento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
}
