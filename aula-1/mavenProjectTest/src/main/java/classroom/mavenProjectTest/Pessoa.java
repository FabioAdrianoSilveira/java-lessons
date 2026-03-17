package classroom.mavenProjectTest;

public class Pessoa {
	private int codigo;
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa() {}
	
	
	public Pessoa(int pCodigo, String pNome, double pPeso, double pAltura) {
		this.codigo = pCodigo;
		this.nome = pNome;
		this.peso = pPeso;
		this.altura = pAltura;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int pCodigo) {
		this.codigo = pCodigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String pNome) {
		this.nome = pNome;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double pPeso) {
		this.peso = pPeso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double pAltura) {
		this.altura = pAltura;
	}
	
	// Método personalizado
	public double getIMC() {
		double imc = this.peso / (this.altura * this.altura);
		return imc;
	}
}

	
