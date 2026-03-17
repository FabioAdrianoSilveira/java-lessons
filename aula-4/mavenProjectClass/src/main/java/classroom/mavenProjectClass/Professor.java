package classroom.mavenProjectClass;

public class Professor extends Pessoa {
	
	private double salario;
	private String area;
	private String formacao;
	
	// Construtores
	Professor() {}

	public Professor(String nome, int idade, double peso, double altura, double salario, String area, String formacao) {
		super(nome, idade, peso, altura);
		this.salario = salario;
		this.area = area;
		this.formacao = formacao;
	}
	
	// Getters e Setters
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
