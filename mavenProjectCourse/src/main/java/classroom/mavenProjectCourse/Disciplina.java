package classroom.mavenProjectCourse;

public class Disciplina {
	private int codigo;
	private String sigla;
	private String nome;
	private boolean eletiva;
	// Associação da classe Curso com a classe Disciplina
	private Curso curso;
	
	// Construtores
	public Disciplina() {}

	public Disciplina(int codigo, String sigla, String nome, boolean eletiva, Curso curso) {
		super();
		this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
		this.eletiva = eletiva;
		this.curso = curso;
	}
	
	// Getters, Setters e outros
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isEletiva() {
		return eletiva;
	}

	public void setEletiva(boolean eletiva) {
		this.eletiva = eletiva;
	}

	// Ponte de comunicação entre Disciplina e Curso
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
