package classroom.mavenProjectStudent;

public class App 
{
    public static void main( String[] args )
    {
        Endereco oEndereco = new Endereco(133, "9 de julho", 276, "Centro", "Salto", "SP");
        Aluno oAluno = new Aluno(305050, "Victor Roque", true, oEndereco);
        
        System.out.println("Nome: " + oAluno.getNome());
        System.out.println("Matricula: " + oAluno.getMatricula());
        System.out.println("Bolsista: " + ((oAluno.isBolsista() == true) ? "Sim" : "Não"));
        System.out.println("Endereço: Rua " + oAluno.getEndereco().getRua() + " nº" + oAluno.getEndereco().getNumero() + " - " + oAluno.getEndereco().getBairro() + ", " + oAluno.getEndereco().getCidade() + " (" + oAluno.getEndereco().getEstado() + ")");
    }
}