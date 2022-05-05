package scr.espm.poo.ex2;

public class Exemplo {
    public static void main(String[] args){
        
        PessoaJuridica pj1 = new PessoaJuridica();
        Cliente pj2 = new PessoaJuridica();
        
        Banco ehBank = new Banco("EhBank");

        ehBank.addCliente(pj1);
        ehBank.addCliente(pj2);

        pj1.setNome("Humberto");
        pj1.setCnpj("12");

        pj2.setNome("nome_pessoa");

        System.out.println("\n" + pj1.toString());
        System.out.println(pj2.toString());

        
    }
}
