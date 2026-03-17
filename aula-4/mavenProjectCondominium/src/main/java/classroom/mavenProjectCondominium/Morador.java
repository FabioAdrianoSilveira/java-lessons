package classroom.mavenProjectCondominium;

public class Morador {
	private String nome;
	private int idade;
	private boolean resp;
	
	// Construtores
	Morador(){}

	public Morador(String nome, int idade, boolean resp) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.resp = resp;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isResp() {
		return resp;
	}

	public void setResp(boolean resp) {
		this.resp = resp;
	}
}
