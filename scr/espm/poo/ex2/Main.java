package scr.espm.poo.ex2;
import java.util.Scanner;

public class Main {
    public static Banco banco = null;
    public static void main(String[] args) {

        banco = new Banco("ESPM Bank");


        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
        try{
            System.out.print("ESPM> ");
            String input = scan.nextLine().trim().toLowerCase();

            if ("exit".equals(input)){
            }else if("exit".equals(input)){
                exit = true;
            }else if("help".equals(input)){
                help();
            }else if ("list".equals(input)){
                listCostumers(banco);
            }else if("add".equals(input)){
                addCustumer(banco);
            }else if("del".equals(input)){
                throw new UnsupportedOperationException();
            }else if ("find".equals(input)){
                throw new UnsupportedOperationException();
            }else{
                System.err.println("Comando Inválido");
            }
        }
            catch (UnsupportedOperationException e){
                e.printStackTrace();
            }
        }
       System.out.println("Bye bye!");
    }

    private static void help(){
        System.out.println("ESPM Sistema de Clientes");
        System.out.println("---------------------");
        System.out.println("add -> Cadastro Cliente");
        System.out.println("list -> Lista Clientes");
        System.out.println("del -> Apaga Cliente");
        System.out.println("find -> Localiza Cliente");
        System.out.println();
        System.out.println("exit -> Sair do Sistema");
    }
    private static void listCostumers(Banco banco){
        //banco.getClientes().forEach(c -> System.out.println(c))
        banco.getClientes().forEach(c ->{
            if(c instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica) (c);
                System.out.println(pf);
            }
        });
        
    }
    private static void addCustumer(Banco banco){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.nextLine();

        TipoPessoa tipoPessoa = inputTipoCliente();

        //System.out.println("Tipo do cliente? [F|J]");
        //String tipoPessoa = scan.nextLine();

       Cliente c = null;

       switch(tipoPessoa){
           case Fisica:
            System.out.println("Pessoa Física");
            System.out.println("CPF: ");
             String cpf = scan.nextLine();

            PessoaFisica pf = new PessoaFisica();
            pf.setCpf(cpf);
           c = pf;

           break;

           case Juridica:
           System.out.println("Pessoa Júridica");
            System.out.println("CNPJ: ");
             String cnpj = scan.nextLine();

            PessoaJuridica pj = new PessoaJuridica();
            pj.setCnpj(cnpj);
           c = pj;

           break;
       }
       //if ("f" equals(tipoPessoa)){

       // System.out.println("CPF: ");
        //String cpf = scan.nextLine();

        //PessoaFisica pf = new PessoaFisica();
        //pf.setCpf(cpf);
        //c = pf;

       //}else{
          // System.out.println("CNPJ: ");
           //String cnpj = scan.nextLine();

           //PessoaJuridica pj = new PessoaJuridica();
            //pj.setCnpj(cnpj);
            //c = pj;
       //}
       //c.setNome(nome);
       //banco.addCliente(c);
        c.setNome(nome);
        banco.addCliente(c);
    }


private static TipoPessoa inputTipoCliente(){
    Scanner scan = new Scanner(System.in);
    String tp = "";
    while (!tp.equals("j") && !tp.equals("f")){
        System.out.println("Tipo Cliente? [F|J]");
        tp = scan.nextLine().toLowerCase();
        if (!tp.equals("j") && !tp.equals("f")){
            System.err.println("F: Física | J: Juridica");
         }
      }

     return tp.equals("f") ? TipoPessoa.Fisica : TipoPessoa.Juridica;
    }
}
