package classroom.mavenProjectClass;

public class Aluno extends Pessoa {
	private int matricula;
	private boolean bolsista;
	private String curso;
	
	// Construtores
	Aluno() {}

	public Aluno(String nome, int idade, double peso, double altura, int matricula, boolean bolsista, String curso) {
		super(nome, idade, peso, altura);
		this.matricula = matricula;
		this.bolsista = bolsista;
		this.curso = curso;
	}

	// Getters e Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
