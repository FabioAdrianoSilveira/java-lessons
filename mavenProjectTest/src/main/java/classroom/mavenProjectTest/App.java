package classroom.mavenProjectTest;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        // Pessoa oPessoa = new Pessoa(1, "José", 80.8, 1.79);
    	Pessoa oPessoa = new Pessoa();
    	
    	System.out.println("Informe o código da pessoa: ");
    	oPessoa.setCodigo(scan.nextInt());
    	System.out.println("Informe o nome da pessoa: ");
    	oPessoa.setNome(scan.nextLine());
    	scan.nextLine();
    	System.out.println("Informe o peso da pessoa: ");
    	oPessoa.setPeso(scan.nextDouble());
    	System.out.println("Informe a altura da pessoa: ");
    	oPessoa.setAltura(scan.nextDouble());
        
    	System.out.println(" ");
        System.out.println("Código: " + oPessoa.getCodigo());
        System.out.println("Nome: " + oPessoa.getNome());
        System.out.println("Peso: " + oPessoa.getPeso());
        System.out.println("Altura: " + oPessoa.getAltura());
        System.out.println("IMC: " + oPessoa.getIMC());
    }
}
