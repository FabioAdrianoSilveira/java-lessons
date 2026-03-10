package classroom.mavenProjectCourse;

public class App 
{
    public static void main( String[] args )
    {
        // Curso oCurso = new Curso(10, "ADS", "Exatas");
        // Disciplina oDisciplina = new Disciplina(100, "SLTLIF1", "Linguaguem de Programação 1", false, oCurso);
    	
    	Curso oCurso = new Curso();
    	Disciplina oDisciplina = new Disciplina();
    	
    	oDisciplina.setCurso(oCurso);
    	
    	oDisciplina.setCodigo(100);
    	oDisciplina.setNome("Linguagem de Programação 1");
    	oDisciplina.setSigla("SLTLIF1");
    	oDisciplina.setEletiva(false);
    	oDisciplina.getCurso().setCodigo(10);
    	oDisciplina.getCurso().setNome("ADS");
    	oDisciplina.getCurso().setArea("Exatas");
        
        System.out.println("DISCIPLINA");
        System.out.println("Código: " + oDisciplina.getCodigo());
        System.out.println("Sigla: " + oDisciplina.getSigla());
        System.out.println("Nome: " + oDisciplina.getNome());
        System.out.println("Eletiva: " + ((oDisciplina.isEletiva() == true) ? "Sim" : "Não"));
        
        System.out.println("");
        System.out.println("CURSO");
        System.out.println("Código: " + oDisciplina.getCurso().getCodigo());
        System.out.println("Nome: " + oDisciplina.getCurso().getNome());
        System.out.println("Área: " + oDisciplina.getCurso().getArea());
    }
}
