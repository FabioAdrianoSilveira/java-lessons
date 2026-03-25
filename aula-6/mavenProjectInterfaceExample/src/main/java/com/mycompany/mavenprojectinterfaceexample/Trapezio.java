/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectinterfaceexample;

/**
 *
 * @author fabioas
 */

//Trapézio retângulo
public class Trapezio implements IForma {
    private double baseMaior;
    private double baseMenor;
    private double altura;
    
    
    Trapezio() {}

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double getPerimetro() {
        double lado = Math.sqrt(Math.pow(altura, 2) + Math.pow((baseMaior - baseMenor), 2));
        return baseMaior + baseMenor + altura + lado;
    }
    
    @Override
    public double getArea() {
       return ((baseMenor + baseMaior) * altura) / 2;
    }
}
