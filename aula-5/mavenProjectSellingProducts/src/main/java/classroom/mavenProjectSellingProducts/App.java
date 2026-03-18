package classroom.mavenProjectSellingProducts;

public class App 
{
    public static void main( String[] args )
    {
        Produto oProdutoPerma = new Permanente(1, "Descrição 1", 2.90, 0.50, false);
        Produto oProdutoPere = new Perecivel(2, "Descrição 2", 8.00, "18/03/2026", "Salto");
        Pedido oPedido = new Pedido(10, "17/03/2026", 10, oProdutoPere);
        
        System.out.println("-- PEDIDO --");
        System.out.println("Código do pedido: " + oPedido.getCodigo());
        System.out.println("Data do pedido: " + oPedido.getData_pedido());
        System.out.println("Quantidade de itens: " + oPedido.getQuantidade());
        System.out.println("\n-- DETALHES DA COMPRA --");
        System.out.println("Código do item: " + oPedido.getProduto().getCodigo());
        System.out.println("Descrição do item: " + oPedido.getProduto().getDescricao());
        System.out.println("Valor unitário do item: R$" + oPedido.getProduto().getValor_unit());
        if (oPedido.getProduto() instanceof Permanente) {
        	Permanente oPermanente = (Permanente)oPedido.getProduto();
        	System.out.println("Desvalorização gradual: R$" + oPermanente.getPerc_desvalozicao());
        	System.out.println("Uso em escritório: " + ((oPermanente.isEscritorio() == true) ? "Sim" : "Não"));
        }
        else {
        	Perecivel oPerecivel = (Perecivel)oPedido.getProduto();
        	System.out.println("Data de validade: " + oPerecivel.getData_validade());
        	System.out.println("Cidade de origem: " + oPerecivel.getCidade_origem());
        }
        System.out.println("\nValor total da compra: R$" + oPedido.calcValorTotal());
    }
}