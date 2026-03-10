package classroom.mavenProjectStudent;

public class Aluno {
	private int matricula;
	private String nome;
	private boolean bolsista;
	Endereco endereco;
	
	// Construtores
	Aluno() {}

	public Aluno(int matricula, String nome, boolean bolsista, Endereco endereco) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.bolsista = bolsista;
		this.endereco = endereco;
	}
	
	// Getters e Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
