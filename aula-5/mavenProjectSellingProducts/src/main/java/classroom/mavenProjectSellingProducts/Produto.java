package classroom.mavenProjectSellingProducts;

public class Produto {
	protected int codigo;
	protected String descricao;
	protected double valor_unit;
	
	// Construtores
	public Produto() {}

	public Produto(int codigo, String descricao, double valor_unit) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor_unit = valor_unit;
	}

	// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor_unit() {
		return valor_unit;
	}

	public void setValor_unit(double valor_unit) {
		this.valor_unit = valor_unit;
	}
	
	
}
