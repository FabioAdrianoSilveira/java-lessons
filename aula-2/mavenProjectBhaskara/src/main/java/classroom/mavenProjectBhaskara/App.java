package classroom.mavenProjectBhaskara;
// Importa utility scanner para receber inputs do usuário via terminal
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	// Instancia o objeto de scan
    	Scanner scan = new Scanner(System.in);
    	
    	// Instancia a classe Equacao com construtor vazio
        Equacao oEquacao = new Equacao();
        
        // Exibe uma linha no terminal
        System.out.println("Informe o valor de A");
        // Executa setA usando a função de scanner para receber o valor a ser atribuiído a variável
        oEquacao.setA(scan.nextDouble());
        // Exibe uma linha no terminal
        System.out.println("Informe o valor de B");
     // Executa setB usando a função de scanner para receber o valor a ser atribuiído a variável
        oEquacao.setB(scan.nextDouble());
        // Exibe uma linha no terminal
        System.out.println("Informe o valor de C");
     // Executa setC usando a função de scanner para receber o valor a ser atribuiído a variável
        oEquacao.setC(scan.nextDouble());
        
        // Faz o calculo da solução
        oEquacao.setSolucao();
        
        // Exibe a solução
        System.out.println("X1: " + oEquacao.getX1());
        System.out.println("X2: " + oEquacao.getX2());
        
        
    }
}
