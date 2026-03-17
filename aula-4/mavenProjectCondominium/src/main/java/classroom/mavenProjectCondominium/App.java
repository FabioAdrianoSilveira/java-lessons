package classroom.mavenProjectCondominium;

public class App 
{
    public static void main( String[] args )
    {
    	Condominio oCondominio = new Condominio();
    	Apartamento oApartamento = new Apartamento();
    	Morador oMorador = new Morador();
    	Bloco oBloco = new Bloco(1, "A", true, oApartamento);
    	
    	//Condominio
    	oCondominio.setEndereco("Rua dos Bobos");
    	oCondominio.setNumero(0);
    	
    	// Bloco
    	oCondominio.setBloco(oBloco);
    	oCondominio.getBloco().setNumero(1);
    	oCondominio.getBloco().setApelido("Bloco A");
    	oCondominio.getBloco().setConstrucao(true);
    	
    	// Apartamento
    	oCondominio.getBloco().setApartramento(oApartamento);
    	oCondominio.getBloco().getApartamento().setAndar(7);
    	oCondominio.getBloco().getApartamento().setNumero(304);
    	oCondominio.getBloco().setApelido("Bloco A");
    	oCondominio.getBloco().setConstrucao(true);
    	
    	// Morador
    	oCondominio.getBloco().getApartamento().setMorador(oMorador);
    	oCondominio.getBloco().getApartamento().getMorador().setNome("Aline");
    	oCondominio.getBloco().getApartamento().getMorador().setIdade(22);
    	oCondominio.getBloco().getApartamento().getMorador().setResp(false);
    	
        System.out.println("CONDOMÍNIO");
        System.out.println("Endereço: " + oCondominio.getEndereco() + " nº " + oCondominio.getNumero());
        System.out.println(" ");
        System.out.println("BLOCO");
        System.out.println("Número: " + oCondominio.getBloco().getNumero());
        System.out.println("Apelido: " + oCondominio.getBloco().getApelido());
        System.out.println(((oCondominio.getBloco().isConstrucao() == true) ? "Está em construção" : "Construção finalizada"));
        System.out.println("INFORMAÇÕES DO APARTAMENTO");
        System.out.println("Andar: " + oCondominio.getBloco().getApartamento().getAndar());
        System.out.println("Número: " + oCondominio.getBloco().getApartamento().getNumero());
        System.out.println(" ");
        System.out.println("MORADOR(A)");
        System.out.println("Nome do(a) Morador(a): " + oMorador.getNome());
        System.out.println("Idade do Morador(a): " + oMorador.getIdade());
        System.out.println(((oMorador.isResp() == true) ? "É respnsável" : "Não é responsável"));
        
        
        
        
        
        
        
    }
}
