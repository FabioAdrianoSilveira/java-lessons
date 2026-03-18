package classroom.mavenProjectSellingProducts;

public class Permanente extends Produto {
	private double perc_desvalozicao;
	private boolean escritorio;
	
	// Construotres
	Permanente() {}

	public Permanente(int codigo, String descricao, double valor_unit, double perc_desvalozicao, boolean escritorio) {
		super(codigo, descricao, valor_unit);
		this.perc_desvalozicao = perc_desvalozicao;
		this.escritorio = escritorio;
	}

	// Getters e Setters
	public double getPerc_desvalozicao() {
		return perc_desvalozicao;
	}

	public void setPerc_desvalozicao(double perc_desvalozicao) {
		this.perc_desvalozicao = perc_desvalozicao;
	}

	public boolean isEscritorio() {
		return escritorio;
	}

	public void setEscritorio(boolean escritorio) {
		this.escritorio = escritorio;
	}
	
	
}
