package classroom.mavenProjectClass;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa oPessoa = new Aluno("João", 20, 70, 1.75, 10, true, "ADS");
        
        if(oPessoa instanceof Aluno) {
        	System.out.println("Aluno");
        	System.out.println("Matricula: " + ((Aluno) oPessoa).getMatricula());
        } else {
        	System.out.println("Professor");
        }
    }
}
