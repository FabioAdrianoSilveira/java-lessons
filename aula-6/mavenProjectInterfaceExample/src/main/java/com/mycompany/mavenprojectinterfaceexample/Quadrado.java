/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectinterfaceexample;

/**
 *
 * @author fabioas
 */
public class Quadrado implements IForma {
    private double lado;
    
    public Quadrado() {};

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double getPerimetro() {
        return 4 * this.lado;
    }
    
    @Override
    public double getArea() {
        return Math.pow(this.lado, 2);
    }
}
