package classroom.mavenProjectBank;

public class Pf extends Pessoa {
	private int cpf;
	private boolean especial;
	
	// Construtores
	Pf() {}

	public Pf(String nome, int idade, int cpf, boolean especial) {
		super(nome, idade);
		this.cpf = cpf;
		this.especial = especial;
	}

	// Getters e Setters
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
}
