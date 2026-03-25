/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectsellingproductspolymorphism;

/**
 *
 * @author fabioas
 */
public class MavenProjectSellingProductsPolymorphism {

    public static void main(String[] args) {
       
        Produto oProdutoPerma = new Permanente(0.50, false, 1, "Descrição 1", 10);
        Produto oProdutoPere = new Perecivel(2, "Descrição 2", 8.00, "18/03/2026", "Salto");
        Pedido oPedido = new Pedido(10, "17/03/2026", 10, oProdutoPerma);
        
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
                System.out.println("Valor total da compra: R$" + oPermanente.calcValorTotal(oPedido.getQuantidade()));
        }
        else {
        	Perecivel oPerecivel = (Perecivel)oPedido.getProduto();
        	System.out.println("Data de validade: " + oPerecivel.getData_validade());
        	System.out.println("Cidade de origem: " + oPerecivel.getCidade_origem());
                System.out.println("Valor total da compra: R$" + oPerecivel.calcValorTotal(oPedido.getQuantidade()));
        }
    }
}
