package classroom.mavenProjectBank;

public class Conta {
	private int numero;
	private double saldo;
	private Pessoa pessoa;
	
	// Construtor
	public Conta(int numero, double saldo, Pessoa pessoa) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.pessoa = pessoa;
	}

	// Getters, Setters e Outros
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public double getRendimento(Pessoa pessoa, double saldo) {
		double rendimento = 0;
		
		if (pessoa instanceof Pj) {
			rendimento = saldo * 0.1;
		}
		else if (pessoa instanceof Pf) {
			Pf pf = (Pf)pessoa;
			
			if (pf.isEspecial() == true) {
				rendimento = saldo * 0.2;
			} else {
				rendimento = saldo * 0.05;
			}
		}
		
		return rendimento;
	}
}
