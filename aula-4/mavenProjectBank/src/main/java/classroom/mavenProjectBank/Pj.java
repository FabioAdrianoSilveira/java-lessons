package classroom.mavenProjectBank;

public class Pj extends Pessoa {
	private int cnpj;
	private String razao;
	
	// Construtores
	Pj() {}

	public Pj(String nome, int idade, int cnpj, String razao) {
		super(nome, idade);
		this.cnpj = cnpj;
		this.razao = razao;
	}

	// Getters e Setters
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
}
