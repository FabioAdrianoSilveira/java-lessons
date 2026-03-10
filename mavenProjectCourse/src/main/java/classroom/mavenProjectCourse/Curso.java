package classroom.mavenProjectCourse;

public class Curso {
	private int codigo;
	private String nome;
	private String area;
	
	// Construtores
	public Curso() {}

	public Curso(int codigo, String nome, String area) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.area = area;
	}

	// Getters Setters e outros
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}	
}
