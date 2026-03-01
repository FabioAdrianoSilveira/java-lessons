package classroom.mavenProjectGeometry;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
    	// Construtor preenchido
    	Trapezio oTrapezio = new Trapezio(2, 3, 4);
    	
    	System.out.println("Á area do trapézio feito com construtor preenchido é: " + oTrapezio.getArea());
    	
    	// Construtor vazio
    	Trapezio oTrapezio2 = new Trapezio();
    	
    	System.out.println("Informe o lado menor");
    	oTrapezio2.setBMenor(scan.nextDouble());
    	System.out.println("Informe o lado maior");
    	oTrapezio2.setBMaior(scan.nextDouble());
    	System.out.println("Informe a altura do trapézio");
    	oTrapezio2.setAltura(scan.nextDouble());
    	
    	System.out.println("Á area do trapézio feito com construtor vazio é: " + oTrapezio2.getArea());
    }
}
