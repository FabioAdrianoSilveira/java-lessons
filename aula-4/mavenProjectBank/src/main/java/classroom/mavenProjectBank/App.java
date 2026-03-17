package classroom.mavenProjectBank;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa oPj = new Pj("Roque", 23, 1234, "Tigrinho");
        Conta oContaPj = new Conta(1, 10000, oPj);
        Pessoa oPf = new Pf("Flaco", 22, 4321, false);
        Conta oContaPf = new Conta(2, 20000, oPf);
        Pessoa oPfe = new Pf("Alan", 19, 5678, true);
        Conta oContaPfe = new Conta(3, 5000, oPfe);
        
        System.out.println("-- PJ --");
        System.out.println("Nome do Títular: " + oContaPj.getPessoa().getNome());
        System.out.println("Idade do Títular: " + oContaPj.getPessoa().getIdade());
        Pj ofPj = (Pj)oContaPj.getPessoa();
        System.out.println("CNPJ: " + ofPj.getCnpj());
        System.out.println("Razão: " + ofPj.getRazao());
        System.out.println("-- CONTA --");
        System.out.println("Número: " + oContaPj.getNumero());
        System.out.println("Saldo: " + oContaPj.getSaldo());
        System.out.println("Rendimento: " + oContaPj.getRendimento(ofPj, oContaPj.getSaldo()));
        System.out.println(" ");
        System.out.println("-- PF --");
        System.out.println("Nome: " + oContaPf.getPessoa().getNome());
        System.out.println("Idade: " + oContaPf.getPessoa().getIdade());
        Pf ofPf = (Pf)oContaPf.getPessoa();
        System.out.println("CPF: " + ofPf.getCpf());
        System.out.println("Especial: " + ((ofPf.isEspecial() == true) ? "Sim" : "Não"));
        System.out.println("-- CONTA --");
        System.out.println("Número: " + oContaPf.getNumero());
        System.out.println("Saldo: " + oContaPf.getSaldo());
        System.out.println("Rendimento: " + oContaPf.getRendimento(ofPf, oContaPf.getSaldo()));
        System.out.println(" ");
        System.out.println("-- PF ESPECIAL --");
        System.out.println("Nome: " + oContaPfe.getPessoa().getNome());
        System.out.println("Idade: " + oContaPfe.getPessoa().getIdade());
        Pf ofPfe = (Pf)oContaPfe.getPessoa();
        System.out.println("CPF: " + ofPfe.getCpf());
        System.out.println("Especial: " + ((ofPfe.isEspecial() == true) ? "Sim" : "Não"));
        System.out.println("-- CONTA --");
        System.out.println("Número: " + oContaPfe.getNumero());
        System.out.println("Saldo: " + oContaPfe.getSaldo());
        System.out.println("Rendimento: " + oContaPfe.getRendimento(ofPfe, oContaPfe.getSaldo()));
    }
}
