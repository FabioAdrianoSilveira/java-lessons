/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectsellingproductspolymorphism;

/**
 *
 * @author fabioas
 */
public class Permanente extends Produto {
    private double perc_desvalozicao;
	private boolean escritorio;
	
	// Construotres
	Permanente() {}

    public Permanente(double perc_desvalozicao, boolean escritorio, int codigo, String descricao, double valor_unit) {
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
    
        @Override
        public double calcValorTotal(int quantidade) {
            return this.valor_unit * quantidade * this.perc_desvalozicao;
        }
        
}
