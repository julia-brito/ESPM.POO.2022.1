package scr.espm.poo.aula04;

public class Main {
    public static void main(String[] args){
        // na industria, para delcarar um númeor que não é N inteiro (usando long) teria que colocar 10l "L" minusculo
        Aluno a1 = new Aluno(10,"hert");
        System.out.println(a1);
        Aluno a2 = new Aluno(89,"kyp");
        System.out.println(a2); //to.string só funciona com objeto

        if(a1.equals(a2)){
            System.out.println("São iguais");    
        }else{
            System.out.println("Não são iguais");
        }
    }
}
