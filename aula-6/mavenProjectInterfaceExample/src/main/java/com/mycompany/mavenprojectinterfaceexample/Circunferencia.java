/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectinterfaceexample;

/**
 *
 * @author fabioas
 */
public class Circunferencia implements IForma {
    private double raio;
    
    public Circunferencia() {}

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
