package classroom.mavenProjectSellingProducts;

public class Pedido {
	private int codigo;
	private String data_pedido;
	private int quantidade;
	private Produto produto;
	
	// Construtor
	public Pedido() {}
	
	public Pedido(int codigo, String data_pedido, int quantidade, Produto produto) {
		super();
		this.codigo = codigo;
		this.data_pedido = data_pedido;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	// Getters, Setters e Outros
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(String data_pedido) {
		this.data_pedido = data_pedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double calcValorTotal() {
		if (this.produto instanceof Permanente) {
			Permanente perProduto = (Permanente)this.produto;
			return this.produto.getValor_unit() * this.quantidade * perProduto.getPerc_desvalozicao();
		} else {
			return this.produto.getValor_unit() * this.quantidade;
		}
	}
}
