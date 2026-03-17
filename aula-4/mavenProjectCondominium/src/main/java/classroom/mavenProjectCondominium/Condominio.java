package classroom.mavenProjectCondominium;

public class Condominio {
	private String endereco;
	private int numero;
	private Bloco bloco;
	
	// Construtores
	Condominio(){}

	public Condominio(String endereco, int numero, Bloco bloco) {
		super();
		this.endereco = endereco;
		this.numero = numero;
		this.bloco = bloco;
	}
	
	// Getters e Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}
}
