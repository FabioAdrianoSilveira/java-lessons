/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectinterfaceexample;

/**
 *
 * @author fabioas
 */

// Triângulo equilátero
public class Triangulo implements IForma {
    private double lado;
    
    public Triangulo() {}
    
    public Triangulo(double lado) {
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
        return lado * 3;
    }
    
    @Override
    public double getArea() {
        return (this.lado * Math.sqrt(3) / 4);
    }
}
