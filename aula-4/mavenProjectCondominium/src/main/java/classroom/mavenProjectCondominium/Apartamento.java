package classroom.mavenProjectCondominium;

public class Apartamento {
	private int andar;
	private int numero;
	private Morador morador;
	
	// Construtores
	Apartamento() {}

	public Apartamento(int andar, int numero, Morador morador) {
		super();
		this.andar = andar;
		this.numero = numero;
		this.morador = morador;
	}
	
	// Getters e Setters
	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}
}
