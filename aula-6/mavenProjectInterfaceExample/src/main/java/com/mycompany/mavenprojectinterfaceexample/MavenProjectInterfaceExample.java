/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectinterfaceexample;

/**
 *
 * @author fabioas
 */
public class MavenProjectInterfaceExample {

    public static void main(String[] args) {
        Quadrado oQuadrado = new Quadrado(3);
        Triangulo oTriangulo = new Triangulo(4);
        Circunferencia oCircunferencia = new Circunferencia(5);
        Trapezio oTrapezio = new Trapezio(5,5,5);
        
        System.out.println("-- QUADRADO --");
        System.out.println("Perimetro: " + oQuadrado.getPerimetro());
        System.out.println("Área: " + oQuadrado.getArea());
        System.out.println("\n-- TRIANGULO --");
        System.out.println("Perimetro: " + oTriangulo.getPerimetro());
        System.out.println("Área: " + oTriangulo.getArea());
        System.out.println("\n-- CIRCUNFERENCIA --");
        System.out.println("Perimetro: " + oCircunferencia.getPerimetro());
        System.out.println("Área: " + oCircunferencia.getArea());
        System.out.println("\n-- TRAPÉZIO --");
        System.out.println("Perimetro: " +oTrapezio.getPerimetro());
        System.out.println("Área: " + oTrapezio.getArea());
    }
}