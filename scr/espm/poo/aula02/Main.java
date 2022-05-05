package scr.espm.poo.aula02;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(); //variável do tipo inteira que aponta p/ um objeto
        p1.Nome = "Humberto";
        p1.idade = 15;
        p1.salario = 800.12;

        Pessoa p2 = new Pessoa();
        p2.Nome = "Sandra";
        p2.idade = 22;
        p2.salario = 45000;

        Pessoa p3 = p1; 
        System.out.println(p3.Nome);
        p3.Nome = "Selmini";
        System.out.println(p1.Nome);

        p1.imprimir(); // nome . método
        p2.imprimir();
        p3.imprimir();

    }
}
